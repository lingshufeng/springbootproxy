package microservice.sc.base.page;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/**
 * 支持泛型的分页数据对象的默认实现类
 */
@SuppressWarnings("unchecked")
public class GenericDefaultPage<T> implements IGenericPage<T>,Serializable {

	/** 当前页数据列表 */
	private List<T> elements;

	/** 页大小（每页数据个数） */
	private int pageSize;

	/** 当前页号 */
	private int pageNo;

	/** 数据总个数 */
	private int totalCount = 0;
	
	/**是否最后一页**/
	private boolean isLast ;
	
	/**是否第一页**/
	private boolean isFirst ;
	
	/**总页数**/
	private int totalPage = 0;
	
	
	
	public int getTotalPage() {
		return totalPage;
	}


	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}


	public List<T> getElements() {
		return elements;
	}


	public void setElements(List<T> elements) {
		this.elements = elements;
	}


	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}


	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}


	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	
	

	public boolean getIsLast() {
		return isLast;
	}


	public void setLast(boolean isLast) {
		this.isLast = isLast;
	}


	public boolean getIsFirst() {
		return isFirst;
	}


	public void setFirst(boolean isFirst) {
		this.isFirst = isFirst;
	}



	/**
	 * 根据当前页号、页大小（每页数据个数）、当前页数据列表、数据总个数构造分页数据对象的实例。
	 * 
	 * @param pageNo
	 *            当前页号
	 * @param pageSize
	 *            页大小（每页数据个数）
	 * @param elements
	 *            当前页数据列表
	 * @param totalCount
	 *            数据总个数
	 */
	public GenericDefaultPage(int pageNo, int pageSize, List<T> elements,
			int totalCount) {
		this.pageNo = pageNo;
		this.pageSize = pageSize;
		this.elements = elements;
		this.totalCount = totalCount;
		this.isLast = isLastPage();
		this.isFirst = isFirstPage();
		this.totalPage = getTotalPageNum();
	}

	public int getTotalPageNum() {
		if(pageSize!=0){
			if(pageSize - totalCount > 0){
				return 1 ;
			}
			if(totalCount%pageSize==0){
				return totalCount/pageSize ;
			}else{
				return totalCount/pageSize +1;
			}
		}else{
			return 0 ;
		}
		
	}

	/**
	 * 定义一空页
	 * 
	 * @see #emptyPage()
	 */
	@SuppressWarnings("rawtypes")
	public static final GenericDefaultPage EMPTY_PAGE = new GenericDefaultPage(
			0, 0, Collections.emptyList(), 0);

	/**
	 * 获取一空页
	 */
	public static <E> GenericDefaultPage<E> emptyPage() {
		return (GenericDefaultPage<E>) EMPTY_PAGE;
	}

	 
	public boolean isFirstPage() {
		return getPageNo() == 1;
	}

	 
	public boolean isLastPage() {
		return getPageNo() >= getLastPageNo();
	}
 
	
	public boolean hasNextPage() {
		return elements == null ? false : elements.size() > getPageSize();
	}

	 
	public boolean hasPreviousPage() {
		return getPageNo() > 1;
	}

	 
	public int getLastPageNo() {
		double totalResults = new Integer(getTotalCount()).doubleValue();
		return (totalResults % getPageSize() == 0) ? new Double(
				Math.floor(totalResults / getPageSize())).intValue()
				: (new Double(Math.floor(totalResults / getPageSize()))
						.intValue() + 1);
	}

	 
	public List<T> getThisPageElements() {
		return hasNextPage() ? elements.subList(0, getPageSize()) : elements;
	}

	 
	public int getTotalCount() {
		return totalCount;
	}

	 
	public int getThisPageFirstElementNumber() {
		return getPageNo() * getPageSize() + 1;
	}

	 
	public int getThisPageLastElementNumber() {
		int fullPage = getThisPageFirstElementNumber() + getPageSize() - 1;
		return getTotalCount() < fullPage ? getTotalCount() : fullPage;
	}

	 
	public int getNextPageNo() {
		return getPageNo() + 1;
	}

	 
	public int getPreviousPageNo() {
		return getPageNo() - 1;
	}

	 
	public int getPageSize() {
		return pageSize;
	}

	 
	public int getPageNo() {
		return pageNo;
	}

	/**
	 * 根据页大小（每页数据个数）获取给定页号的第一条数据在总数据中的位置（从1开始）
	 * 
	 * @param pageNo
	 *            给定的页号
	 * @param pageSize
	 *            页大小（每页数据个数）
	 * @return 给定页号的第一条数据在总数据中的位置（从1开始）
	 */
	public static int getStartOfPage(int pageNo, int pageSize) {
		int startIndex = (pageNo - 1) * pageSize + 1;
		if (startIndex < 1)
			startIndex = 1;
		return startIndex;
	}

}
