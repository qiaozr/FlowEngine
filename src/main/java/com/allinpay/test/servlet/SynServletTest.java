package com.allinpay.test.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.allinpay.test.flow.execute.FlowDriver;
import com.allinpay.test.flow.vo.Context;
import com.allinpay.test.flow.vo.FlowSession;

public class SynServletTest extends HttpServlet
{
    private static ApplicationContext applicationContext;

    private FlowDriver flowDriver;;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    {
        resp.setContentType("text/html;charset=utf-8");
        resp.setCharacterEncoding("utf-8");
        try
        {
            System.out.println("同步流程开始执行：");
            Context context = new Context();
            context.setSync("0");
            context.setTxTypeId("1087");
            context.setStsTraceNo("sts1087");
            FlowSession flowSession = FlowSession.newInstance(context);
            flowSession.setEngineId("1087");
            flowSession = flowDriver.processTask(flowSession);
            if (StringUtils.isNotBlank(flowSession.getContext().getMessage()))
            {
                resp.getWriter().write(flowSession.getContext().getMessage());
                resp.getWriter().flush();
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        System.out.println("i'm post method");
        super.doPost(req, resp);
    }

    @Override
    public void init() throws ServletException
    {
        // TODO Auto-generated method stub
        super.init();
        WebApplicationContext wac = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
        flowDriver = (FlowDriver) wac.getBean("flowDriver");
    }

}
