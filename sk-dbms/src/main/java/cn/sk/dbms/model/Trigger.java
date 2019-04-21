package cn.sk.dbms.model;

import lombok.Getter;
import lombok.Setter;

/**
 * 触发器
 * @author Louis
 * @date Nov 10, 2018
 */
@Getter
@Setter
public class Trigger {
    
    /** 触发器名称 */
    private String name;
    
    /** 触发器类型 */
    private String triggerType;
    
    /** 触发器事件类型 */
    private String eventType;
    
    /** 触发器事件描述 */
    private String description;
    
    /** 触发器事件内容定义 */
    private String definition;

}
