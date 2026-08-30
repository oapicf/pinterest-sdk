# AdsAnalyticsGetAsyncResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**report_status** | [**BulkReportingJobStatus**](BulkReportingJobStatus.md) |  | [optional] 
**size** | **float** |  | [optional] 
**url** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.ads_analytics_get_async_response import AdsAnalyticsGetAsyncResponse

# TODO update the JSON string below
json = "{}"
# create an instance of AdsAnalyticsGetAsyncResponse from a JSON string
ads_analytics_get_async_response_instance = AdsAnalyticsGetAsyncResponse.from_json(json)
# print the JSON string representation of the object
print AdsAnalyticsGetAsyncResponse.to_json()

# convert the object into a dict
ads_analytics_get_async_response_dict = ads_analytics_get_async_response_instance.to_dict()
# create an instance of AdsAnalyticsGetAsyncResponse from a dict
ads_analytics_get_async_response_from_dict = AdsAnalyticsGetAsyncResponse.from_dict(ads_analytics_get_async_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


