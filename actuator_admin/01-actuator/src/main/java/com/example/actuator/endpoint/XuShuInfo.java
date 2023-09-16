package com.example.actuator.endpoint;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 */
@Component
public class XuShuInfo implements InfoContributor {
    @Override
    public void contribute(Info.Builder builder) {
        // 查询数据库
        builder.withDetail("topInfo","T桖");
    }
}
