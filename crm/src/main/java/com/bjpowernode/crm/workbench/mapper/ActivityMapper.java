package com.bjpowernode.crm.workbench.mapper;

import com.bjpowernode.crm.workbench.domain.Activity;

import java.util.List;
import java.util.Map;

public interface ActivityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity
     *
     * @mbggenerated Thu Apr 28 14:31:20 CST 2022
     */
    int deleteByPrimaryKey(String id);


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity
     *
     * @mbggenerated Thu Apr 28 14:31:20 CST 2022
     */
    int insertSelective(Activity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity
     *
     * @mbggenerated Thu Apr 28 14:31:20 CST 2022
     */
    Activity selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity
     *
     * @mbggenerated Thu Apr 28 14:31:20 CST 2022
     */
    int updateByPrimaryKeySelective(Activity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity
     *
     * @mbggenerated Thu Apr 28 14:31:20 CST 2022
     */

    int updateByPrimaryKey(Activity record);
    /**
     *保存创建h的市场活动
     */
    int insertActivity(Activity record);

    //根据调节查询市场活动
    List<Activity> selectActivityByConditionForPage(Map<String,Object> map);

    //根据条件查询市场活动的总条数
    int selectCountOfActivityByCondition(Map<String,Object> map);

    //根据id数组删数据
    int deleteActivityById(String[] ids);

    //根据id查询
    Activity selectActivityById(String id);

    //更新市场活动
    int updateActivity(Activity activity);

    //查询所有
    List<Activity> selectAllActivitys();

    //根据Id查询多个市场活动
    List<Activity> selectActivitysById(String[] ids);

    //批量保存市场的
    int insertAvctivityByList(List<Activity> activityList);

    //根据ID查一条市场活动明细
    Activity selectActivityForDetailById(String id);

    //根据clueid查询市场活动
    List<Activity> selectActivityForDetailByClueId(String id);

    //根据name模糊查询市场活动，并排除关联过的
    List<Activity> selectActivityForDetailByNameClueId(Map<String,Object> map);

    //根据Id查询市场活动明细
    List<Activity> selectActivityForDetailByIds(String[] ids);

    //根据name模糊查询关联过的市场活动
    List<Activity> selectActivityForConvertByNameClueId(Map<String,Object> map);

}