package com.allinpay.flow.init;

import java.io.File;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.allinpay.flow.util.FlowTempletsUtils;

/**
 * 流程引擎初始化监听器
 * 
 * @author Q
 * @since 2016-07-07
 */
public class FlowTempletsInitialization implements ServletContextListener
{
    Logger LOG = LoggerFactory.getLogger(FlowTempletsInitialization.class);

    public void contextInitialized(ServletContextEvent sce)
    {
        LOG.info("FlowEnginesInitialization.contextInitialized start");
        try
        {
            ServletContext servletContext = sce.getServletContext();
            String realPath = servletContext.getRealPath("/");
            LOG.info("====================================realPath:" + realPath + "============");
            String allFiles = servletContext.getInitParameter("flowEngineXmlLoactions");
            String[] locations = allFiles.split("\\,");
            for (int i = 0; i < locations.length; i++)
            {
                LOG.info("Xml dir:" + (realPath + locations[i]));
                File tempfile = new File(realPath + locations[i]);
                FlowTempletsUtils.initFlowEngineToMap(tempfile);
                LOG.info("engineMapSize is [{}]", FlowTempletsUtils.FLOW_TEMPLET_MAP.size());
            }
        }
        catch (Exception e)
        {
            LOG.error("FlowEnginesInitialization.contextInitialized error :[{}]", e);
        }
        LOG.info("FlowEnginesInitialization.contextInitialized end");
    }

    public void contextDestroyed(ServletContextEvent sce)
    {

    }

}
