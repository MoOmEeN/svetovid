/*
 * This code was generated by AWS Flow Framework Annotation Processor.
 * Refer to Amazon Simple Workflow Service documentation at http://aws.amazon.com/documentation/swf 
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
 package com.keendly.svetovid;

import com.amazonaws.services.simpleworkflow.flow.core.AndPromise;
import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.core.Task;
import com.amazonaws.services.simpleworkflow.flow.DataConverter;
import com.amazonaws.services.simpleworkflow.flow.StartWorkflowOptions;
import com.amazonaws.services.simpleworkflow.flow.WorkflowSelfClientBase;
import com.amazonaws.services.simpleworkflow.flow.generic.ContinueAsNewWorkflowExecutionParameters;
import com.amazonaws.services.simpleworkflow.flow.generic.GenericWorkflowClient;

public class DeliveryWorkflowSelfClientImpl extends WorkflowSelfClientBase implements DeliveryWorkflowSelfClient {

    public DeliveryWorkflowSelfClientImpl() {
        this(null, new com.amazonaws.services.simpleworkflow.flow.JsonDataConverter(), null);
    }

    public DeliveryWorkflowSelfClientImpl(GenericWorkflowClient genericClient) {
        this(genericClient, new com.amazonaws.services.simpleworkflow.flow.JsonDataConverter(), null);
    }

    public DeliveryWorkflowSelfClientImpl(GenericWorkflowClient genericClient, 
            DataConverter dataConverter, StartWorkflowOptions schedulingOptions) {
            
        super(genericClient, dataConverter, schedulingOptions);
    }

    @Override
    public final void deliver(String deliveryRequest) { 
        deliverImpl(Promise.asPromise(deliveryRequest), (StartWorkflowOptions)null);
    }

    @Override
    public final void deliver(String deliveryRequest, Promise<?>... waitFor) { 
        deliverImpl(Promise.asPromise(deliveryRequest), (StartWorkflowOptions)null, waitFor);
    }
    
    @Override
    public final void deliver(String deliveryRequest, StartWorkflowOptions optionsOverride, Promise<?>... waitFor) {
        deliverImpl(Promise.asPromise(deliveryRequest), optionsOverride, waitFor);
    }
    
    @Override
    public final void deliver(Promise<String> deliveryRequest) {
        deliverImpl(deliveryRequest, (StartWorkflowOptions)null);
    }

    @Override
    public final void deliver(Promise<String> deliveryRequest, Promise<?>... waitFor) {
        deliverImpl(deliveryRequest, (StartWorkflowOptions)null, waitFor);
    }

    @Override
    public final void deliver(Promise<String> deliveryRequest, StartWorkflowOptions optionsOverride, Promise<?>... waitFor) {
        deliverImpl(deliveryRequest, optionsOverride, waitFor);
    }
    
    protected void deliverImpl(final Promise<String> deliveryRequest, final StartWorkflowOptions schedulingOptionsOverride, Promise<?>... waitFor) {
        new Task(new Promise[] { deliveryRequest, new AndPromise(waitFor) }) {
    		@Override
			protected void doExecute() throws Throwable {
                ContinueAsNewWorkflowExecutionParameters _parameters_ = new ContinueAsNewWorkflowExecutionParameters();
                Object[] _input_ = new Object[1];
                _input_[0] = deliveryRequest.get();
                String _stringInput_ = dataConverter.toData(_input_);
				_parameters_.setInput(_stringInput_);
				_parameters_ = _parameters_.createContinueAsNewParametersFromOptions(schedulingOptions, schedulingOptionsOverride);
                
                if (genericClient == null) {
                    genericClient = decisionContextProvider.getDecisionContext().getWorkflowClient();
                }
                genericClient.continueAsNewOnCompletion(_parameters_);
			}
		};
    }
}