package com.allinpay.flow.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class MapAdapter extends XmlAdapter<Task[], Map<String, Task>>
{
    @Override
    public Task[] marshal(Map<String, Task> map) throws Exception
    {
        System.out.println("map to xml");
        Task[] Beans = new Task[map.size()];
        int i = 0;
        Iterator<Entry<String, Task>> it = map.entrySet().iterator();
        while (it.hasNext())
        {
            Beans[i] = new Task();
            Entry<String, Task> entry = it.next();
            Beans[i].setId(entry.getKey());
            Beans[i].setBeanName(entry.getValue().getClass().toString());
            i++;
        }
        return Beans;
    }

    @Override
    public Map<String, Task> unmarshal(Task[] arg0) throws Exception
    {
        System.out.println("xml to map");
        Map<String, Task> map = new HashMap<String, Task>();
        for (Task bean : arg0)
        {
            Task newBean = new Task();
            if (bean.getId() != null && bean.getId() != "")
            {
                newBean.setId(bean.getId());
                newBean.setBeanName(bean.getBeanName());
                newBean.setNextId(bean.getNextId());
                newBean.setBeanMap(bean.getBeanMap());
                newBean.setSync(bean.getSync());
                map.put(bean.getId(), newBean);
            }
        }
        return map;
    }
}
