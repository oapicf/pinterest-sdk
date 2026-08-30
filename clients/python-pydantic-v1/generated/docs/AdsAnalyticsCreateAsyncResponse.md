# AdsAnalyticsCreateAsyncResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** |  | [optional] 
**report_status** | [**BulkReportingJobStatus**](BulkReportingJobStatus.md) |  | [optional] 
**token** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.ads_analytics_create_async_response import AdsAnalyticsCreateAsyncResponse

# TODO update the JSON string below
json = "{}"
# create an instance of AdsAnalyticsCreateAsyncResponse from a JSON string
ads_analytics_create_async_response_instance = AdsAnalyticsCreateAsyncResponse.from_json(json)
# print the JSON string representation of the object
print AdsAnalyticsCreateAsyncResponse.to_json()

# convert the object into a dict
ads_analytics_create_async_response_dict = ads_analytics_create_async_response_instance.to_dict()
# create an instance of AdsAnalyticsCreateAsyncResponse from a dict
ads_analytics_create_async_response_from_dict = AdsAnalyticsCreateAsyncResponse.from_dict(ads_analytics_create_async_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


