package com.allinpay.flow.demo;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class MapAdapter_d extends XmlAdapter<Descision[], Map<String, Descision>>
{

    @Override
    public Map<String, Descision> unmarshal(Descision[] arg0) throws Exception
    {
        System.out.println("xml to map descision");
        Map<String, Descision> map = new HashMap<String, Descision>();
        for (Descision bean : arg0)
        {
            Descision newBean = new Descision();
            newBean.setValue(bean.getValue());
            newBean.setNextId(bean.getNextId());
            map.put(bean.getValue(), newBean);
        }
        return map;
    }

    /*
     * (non-Javadoc)
     * 
     * @author admin
     * 
     * @see
     * javax.xml.bind.annotation.adapters.XmlAdapter#marshal(java.lang.Object)
     */
    @Override
    public Descision[] marshal(Map<String, Descision> arg0) throws Exception
    {
        return null;
    }
}
