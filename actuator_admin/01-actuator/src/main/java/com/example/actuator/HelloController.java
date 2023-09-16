package com.example.actuator;

import io.micrometer.core.annotation.Timed;
import io.micrometer.core.instrument.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 */
@RestController
public class HelloController {
    @GetMapping("/sayHi")
    public String sayHi(String username) throws InterruptedException {
        // 线程长请求
        //Thread.sleep(5000);
        // 定制基于Metrics的计数器
        Metrics.counter("xushu.counter","username",username).increment();

        // 定制基于Metrics的定时器
        Timer timer = Metrics.timer("xushu.timer");

        timer.record(()->{
            System.out.println("success");
        });

        // 定制基于Metrics的仪表  记录单个值  一般集合数量
        Metrics.gauge("xushu.gauge",1);

        // 定制基于Metrics的摘要 一般用来记录 百分比数值（缓存命中率)
        DistributionSummary summary = Metrics.summary("test.summary");
        summary.record(1.5);
        return "success";
    }
}
