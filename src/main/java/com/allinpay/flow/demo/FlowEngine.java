package com.allinpay.flow.demo;

import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement(name = "tasks", namespace = "http://www.example.org/studyframework_0.1")
@XmlAccessorType(XmlAccessType.NONE)
public class FlowEngine
{
    @XmlAttribute(name = "value")
    private String value;
    @XmlElement(name = "start")
    private Task start;
    @XmlElement(name = "end")
    private Task end;

    private Map<String, Task> beanMap;

    @XmlElement(name = "task")
    @XmlJavaTypeAdapter(MapAdapter.class)
    public Map<String, Task> getBeanMap()
    {
        return beanMap;
    }

    public void setBeanMap(Map<String, Task> beanMap)
    {
        this.beanMap = beanMap;
    }

    public String getValue()
    {
        return value;
    }

    public void setValue(String value)
    {
        this.value = value;
    }

    public Task getStart()
    {
        return start;
    }

    public void setStart(Task start)
    {
        this.start = start;
    }

    public Task getEnd()
    {
        return end;
    }

    public void setEnd(Task end)
    {
        this.end = end;
    }

}