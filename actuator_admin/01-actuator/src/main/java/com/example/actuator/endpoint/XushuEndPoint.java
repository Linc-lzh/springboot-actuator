package com.example.actuator.endpoint;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 */
@Component
@Endpoint(id="xushu")
public class XushuEndPoint {

    public Map<String,Object> xushuInfo=new HashMap<String,Object>();

    public XushuEndPoint(){
        xushuInfo.put("old",18);
        xushuInfo.put("like","吴彦祖");
    }
    @ReadOperation
    public Map show(){
        return xushuInfo;
    }

    @WriteOperation
    public void write(String key,String value){
        xushuInfo.put(key,value);
    }

}
