package microservice.sc.mapper;

import java.util.List;
import microservice.sc.model.Bhmx;
import microservice.sc.model.BhmxExample;
import org.apache.ibatis.annotations.Param;

public interface BhmxMapper {
    int countByExample(BhmxExample example);

    int deleteByExample(BhmxExample example);

    int insert(Bhmx record);

    int insertSelective(Bhmx record);

    List<Bhmx> selectByExample(BhmxExample example);

    int updateByExampleSelective(@Param("record") Bhmx record, @Param("example") BhmxExample example);

    int updateByExample(@Param("record") Bhmx record, @Param("example") BhmxExample example);
}