package com.sevilinma.jwebfileman.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(5)
@Component
public class JWebFileManLogAspect {
    @Pointcut("execution(public * com.sevilinma.jwebfileman.controller..*.*(..))")
    public void servicesLog() {
    }
    /**
     * 在切入点前后切入内容，并自己控制何时执行切入点自身的内容
     * 可以结合自定义注解
     */
    @Around("servicesLog()")
    public Object contorllerAround(ProceedingJoinPoint point) throws Throwable {
        long beginTime = System.currentTimeMillis();
        Object result = point.proceed();
        long time = System.currentTimeMillis() - beginTime;
        saveServicesSysLog(point, time);
        return result;
    }

    /**
     * 保存系统服务日志记录
     * @param joinPoint 日志分析切入点
     * @param time 运行时长（毫秒）
     */
    private void saveServicesSysLog(ProceedingJoinPoint joinPoint, long time) {

    }
}
