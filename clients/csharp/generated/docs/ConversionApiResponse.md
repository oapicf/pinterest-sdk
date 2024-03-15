# Org.OpenAPITools.Model.ConversionApiResponse
Schema describing the object in the response, which contains information about the events that were received and processed.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**NumEventsReceived** | **int** | Total number of events received in the request. | 
**NumEventsProcessed** | **int** | Number of events that were successfully processed from the events. | 
**Events** | [**List&lt;ConversionApiResponseEventsInner&gt;**](ConversionApiResponseEventsInner.md) | Specific messages for each event received. The order will match the order in which the events were received in the request. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

