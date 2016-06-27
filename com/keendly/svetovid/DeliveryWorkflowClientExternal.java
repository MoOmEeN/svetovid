/*
 * This code was generated by AWS Flow Framework Annotation Processor.
 * Refer to Amazon Simple Workflow Service documentation at http://aws.amazon.com/documentation/swf 
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
 package com.keendly.svetovid;

import com.amazonaws.services.simpleworkflow.flow.StartWorkflowOptions;
import com.amazonaws.services.simpleworkflow.flow.WorkflowClientExternal;

/**
 * Generated from {@link com.keendly.svetovid.DeliveryWorkflow}. 
 * Used to start workflow executions or send signals from outside of the scope of a workflow.
 * Created through {@link DeliveryWorkflowClientExternalFactory#getClient}.
 * <p>
 * When starting child workflow from a parent workflow use {@link DeliveryWorkflowClient} instead.
 */
public interface DeliveryWorkflowClientExternal extends WorkflowClientExternal
{

    /**
     * Generated from {@link com.keendly.svetovid.DeliveryWorkflow#deliver}
     */
    void deliver(String deliveryRequest);

    /**
     * Generated from {@link com.keendly.svetovid.DeliveryWorkflow#deliver}
     */
    void deliver(String deliveryRequest, StartWorkflowOptions optionsOverride);

    /**
     * Generated from {@link com.keendly.svetovid.DeliveryWorkflow#ebookGenerated}
     */
    void ebookGenerated(String ebookPath);

    /**
     * Generated from {@link com.keendly.svetovid.DeliveryWorkflow#getState}
     */
    String getState() ;
}