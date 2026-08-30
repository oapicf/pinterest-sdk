# ConversionApiResponseEventsItems

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error_message** | **swagger::Nullable<String>** | Error message containing more information about why the event failed to be processed. | [optional] [default to None]
**status** | [***models::EventProcessingStatus**](EventProcessingStatus.md) | Whether the event was processed successfully. | 
**warning_message** | **swagger::Nullable<String>** | Warning messages about any fields in the event which are not standard. These are not critical to event processing. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


