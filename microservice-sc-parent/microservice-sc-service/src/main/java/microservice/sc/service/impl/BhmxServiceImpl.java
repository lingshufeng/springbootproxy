package microservice.sc.service.impl;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import microservice.sc.base.page.GenericDefaultPage;
import microservice.sc.base.page.IGenericPage;
import microservice.sc.mapper.BhmxMapper;
import microservice.sc.model.Bhmx;
import microservice.sc.model.BhmxExample;
import microservice.sc.model.BhmxExample.Criteria;
import microservice.sc.service.BhmxService;
@Service
public class BhmxServiceImpl implements BhmxService {
	private static Logger logger = LoggerFactory.getLogger(BhmxServiceImpl.class);
	@Autowired
	BhmxMapper bhmxMapper;
	@Override
	public IGenericPage<Bhmx> findPage(Integer pageNo, Integer pageSize, Bhmx param, Map<String, Object> map) {
//		BhmxExample bhmxExample = new BhmxExample();
//		Criteria criteria = bhmxExample.createCriteria();
//		criteria.andPlantbhEqualTo(param.getPlantbh());
//		int records = bhmxMapper.countByExample(bhmxExample);
//		PageHelper.startPage(pageNo, pageSize);
//		/**
//		 * 查询条件为所属小类
//		 */
//		List<Bhmx> elements = bhmxMapper.selectByExample(bhmxExample);
//		if(elements== null){
//			logger.warn("the Bhmxs that you want to select are empty");
//			return null;
//		}
//		GenericDefaultPage<Bhmx> emptyPage = new GenericDefaultPage<Bhmx>(pageNo, pageSize, elements, records);
//		return emptyPage;
		return null;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
	public Integer add(Bhmx t) {
		String bh = UUID.randomUUID().toString().replaceAll("-","");
		t.setBh(bh);
		int count =0;
		try{
			count = bhmxMapper.insert(t);
		}catch (Exception e) {
			logger.error(e.getMessage());
		}
		return count;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
	public Integer update(Bhmx t) {
		BhmxExample BhmxExample = new BhmxExample();
		Criteria criteria = BhmxExample.createCriteria();
		criteria.andBhEqualTo(t.getBh());
		int count =0;
		try{
			count = bhmxMapper.updateByExample(t, BhmxExample);
		}catch (Exception e) {
			logger.error(e.getMessage());
		}
		return count;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
	public Integer delete(Bhmx t) {
		BhmxExample bhmxExample = new BhmxExample();
		Criteria criteria = bhmxExample.createCriteria();
		criteria.andBhEqualTo(t.getBh());
		int count =0;
		try{
			count = bhmxMapper.deleteByExample(bhmxExample);		
		}catch (Exception e) {
			logger.error(e.getMessage());
		}
		return count;
	}

	@Override
	public String test() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * 根据植物编号查询病害模型
	 * @param 
	 * @return
	 */
	@Override
	public List<Bhmx> selectByObject(Bhmx object) {
		BhmxExample bhmxExample = new BhmxExample();
		Criteria criteria = bhmxExample.createCriteria();
		criteria.andPlantbhEqualTo(object.getPlantbh());
		List<Bhmx> selectByExample = null;
		try{
			selectByExample = bhmxMapper.selectByExample(bhmxExample);			
		}catch (Exception e) {
			logger.error(e.getMessage());
		}
		return selectByExample;
	}

}
