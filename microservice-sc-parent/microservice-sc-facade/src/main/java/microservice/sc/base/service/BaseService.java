package microservice.sc.base.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import microservice.sc.base.page.IGenericPage;
 /**
  * 不能在该接口方法上加事务的注解，因为dubbo发布的接口,如果带有
  * 事务注解将发布不成功，只能在实现类（不是发布接口的实现类）上添加
  * @author Administrator
  * @param <T>
  */
public interface BaseService<T> {
	public IGenericPage<T> findPage(Integer pageNo, Integer pageSize,T param , Map<String,Object> map);	
	public Integer add(T t);	
	public Integer update(T t);	
	public Integer delete(T t);	
	public String test();
	public List<T> selectByObject(T object);
}
