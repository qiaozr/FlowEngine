package com.allinpay.test.flow.vo;

/**
 * 流程执行参数
 * 
 * @author Q
 * 
 */
public class FlowSession
{
    /** 流程引擎Id */
    private String engineId;

    /** 执行任务Id */
    private String taskId;

    /** 下一步任务Id */
    private String nextId;

    /** 决策结果 */
    private String descisionResult;

    /** 业务处理上下文 */
    private Context context;

    /**
     * 工厂方法 实例化FlowSession
     * 
     * @param context
     * @return
     */
    public static FlowSession newInstance(Context context)
    {
        return new FlowSession(context);
    }

    public FlowSession(Context context)
    {
        this.context = context;
    }

    public String getEngineId()
    {
        return engineId;
    }

    public void setEngineId(String engineId)
    {
        this.engineId = engineId;
    }

    public String getTaskId()
    {
        return taskId;
    }

    public void setTaskId(String taskId)
    {
        this.taskId = taskId;
    }

    public String getNextId()
    {
        return nextId;
    }

    public void setNextId(String nextId)
    {
        this.nextId = nextId;
    }

    public String getDescisionResult()
    {
        return descisionResult;
    }

    public void setDescisionResult(String descisionResult)
    {
        this.descisionResult = descisionResult;
    }

    public Context getContext()
    {
        return context;
    }

    public void setContext(Context context)
    {
        this.context = context;
    }
}
