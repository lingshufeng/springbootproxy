package microservice.sc.util;
/**
 * 接口请求参数
 * @author Administrator
 *
 */
public class ReqConfigObject {
	
	/**
	 * 当前页数，必选
	 */
	private int pageNo;
	/**
	 * 每页数据量，必选
	 */
	private int pageSize;
	/**
	 * 行政区划代码
	 */
	private String xzcode;
	/**
	 * 多条件之间关系，and|or，可选，默认是and
	 */
	private String conditionrel;
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public String getConditionrel() {
		return conditionrel;
	}
	public void setConditionrel(String conditionrel) {
		this.conditionrel = conditionrel;
	}
	public String getXzcode() {
		return xzcode;
	}
	public void setXzcode(String xzcode) {
		this.xzcode = xzcode;
	}
	
}
