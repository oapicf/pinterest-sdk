# openapi::ConversionApiResponseEventsInner


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **character** | Whether the event was processed successfully. | [Enum: [failed, processed]] 
**error_message** | **character** | Error message containing more information about why the event failed to be processed. | [optional] 
**warning_message** | **character** | Warning messages about any fields in the event which are not standard. These are not critical to event processing. | [optional] 


