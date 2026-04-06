package com.springai.ai.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.springai.ai.entity.po.Course;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 学科表 Mapper 接口
 * </p>
 *
 * @author huge
 * @since 2025-03-08
 */
@Mapper
public interface CourseMapper extends BaseMapper<Course> {

}
