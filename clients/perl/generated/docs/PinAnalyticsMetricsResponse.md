# WWW::OpenAPIClient::Object::PinAnalyticsMetricsResponse

## Load the model package
```perl
use WWW::OpenAPIClient::Object::PinAnalyticsMetricsResponse;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lifetime_metrics** | **HASH[string,int]** | The lifetime metric name and value. | [optional] 
**daily_metrics** | [**ARRAY[PinAnalyticsMetricsResponseDailyMetricsInner]**](PinAnalyticsMetricsResponseDailyMetricsInner.md) | Array with the requested daily metric records | [optional] 
**summary_metrics** | **HASH[string,double]** | The metric name and value over the requested period for each requested metric | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


