package com.springai.ai.tools;

import com.springai.ai.service.ICourseReservationService;
import com.springai.ai.service.ICourseService;
import com.springai.ai.service.ISchoolService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @Author: wengrunyang
 * @Description: 课程工具类
 * @DateTime: 2026/4/6 17:17
 **/
@RequiredArgsConstructor
@Component
public class CourseTools {

    private final ICourseService courseService;
    private final ISchoolService schoolService;
    private final ICourseReservationService reservationService;

}
