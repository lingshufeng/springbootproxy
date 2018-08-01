//package microservice.sc.util;
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import org.springframework.util.StringUtils;
//
///**
// * 农地rest接口所用数据
// * @author Administrator
// *
// */
//public class NdRestFulTools {
//
//
//	public static synchronized Map<String, Object> getResultMap(List list,int counts,String msg){
//		Map<String, Object> map = new HashMap<String, Object>();
//		if(list == null || list.size() == 0){
//			map.put("count", 0);
//			map.put("data", new ArrayList());
//			map.put("success", false);
//			map.put("msg", "获取"+msg+"失败");
//		}else{
//			map.put("count", counts);
//			map.put("data", list);
//			map.put("success", true);
//			map.put("msg", "获取"+msg+"成功");
//		}
//		return map;
//	}
//	/**
//	 * 根据时间字符串转换为date
//	 * @param dateString
//	 * @return
//	 */
//	public static synchronized Date parseDate(String dateString){
//		if(StringUtils.isEmpty(dateString)){
//			return null;
//		}
//		dateString = dateString.replaceAll("[^0-9]", "");
//		if(StringUtils.isEmpty(dateString) || dateString.length()<8){
//			return null;
//		}
//		dateString = dateString.substring(0, 8);
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
//		Date parse=null;
//		try {
//			parse = dateFormat.parse(dateString);
//		} catch (ParseException e) {
//		}
//		return parse;
//	}
//}
