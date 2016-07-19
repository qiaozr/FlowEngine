package com.allinpay.flow.demo;

import java.util.Map;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

public class Task
{

    private String id;

    private String beanName;

    private String nextId;

    /** 当前节点 0 同步 1 异步 */
    private String sync;

    private Map<String, Descision> beanMap;

    public String getSync()
    {
        return sync;
    }

    public void setSync(String sync)
    {
        this.sync = sync;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getBeanName()
    {
        return beanName;
    }

    public void setBeanName(String beanName)
    {
        this.beanName = beanName;
    }

    public String getNextId()
    {
        return nextId;
    }

    public void setNextId(String nextId)
    {
        this.nextId = nextId;
    }

    @XmlElement(name = "a")
    @XmlJavaTypeAdapter(MapAdapter_d.class)
    public Map<String, Descision> getBeanMap()
    {
        return beanMap;
    }

    public void setBeanMap(Map<String, Descision> beanMap)
    {
        this.beanMap = beanMap;
    }

}
