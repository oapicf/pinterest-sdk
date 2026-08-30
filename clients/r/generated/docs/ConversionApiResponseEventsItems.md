# openapi::ConversionApiResponseEventsItems


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error_message** | **character** | Error message containing more information about why the event failed to be processed. | [optional] 
**status** | [**EventProcessingStatus**](EventProcessingStatus.md) | Whether the event was processed successfully. | [Enum: ] 
**warning_message** | **character** | Warning messages about any fields in the event which are not standard. These are not critical to event processing. | [optional] 


