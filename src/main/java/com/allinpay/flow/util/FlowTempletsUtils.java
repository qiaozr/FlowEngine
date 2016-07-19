package com.allinpay.flow.util;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.allinpay.flow.demo.FlowEngine;

public class FlowTempletsUtils
{
    static Logger LOG = LoggerFactory.getLogger(FlowTempletsUtils.class);

    public static final Map<String, FlowEngine> FLOW_TEMPLET_MAP = new HashMap<String, FlowEngine>();

    public static void initFlowEngineToMap(File file)
    {
        LOG.info("FlowEngineUtils.initFlowEngineToMap end");
        try
        {
            JAXBContext ctx = JAXBContext.newInstance(FlowEngine.class);
            Unmarshaller unmarshaller = ctx.createUnmarshaller();
            FlowEngine flowEngine = (FlowEngine) unmarshaller.unmarshal(file);
            FLOW_TEMPLET_MAP.put(flowEngine.getValue(), flowEngine);
            LOG.info("FlowEngineUtils.initFlowEngineToMap end");
        }
        catch (Exception e)
        {
            LOG.error("initFlowEngineToMap occurs error", e);
        }
    }

}
