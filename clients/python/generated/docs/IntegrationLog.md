# IntegrationLog

Schema for log sent from an integration application.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advertiser_id** | **str** |  | [optional] 
**app_version_number** | **str** | Version number of the integration application. | [optional] 
**client_timestamp** | **int** | Timestamp in milliseconds of when the log was executed at the client. | 
**error** | [**IntegrationLogClientError**](IntegrationLogClientError.md) |  | [optional] 
**event_type** | [**IntegrationLogEventType**](IntegrationLogEventType.md) | Log event type | 
**external_business_id** | **str** |  | [optional] 
**feed_profile_id** | **str** |  | [optional] 
**log_level** | [**IntegrationLogLevel**](IntegrationLogLevel.md) | Log level type | 
**merchant_id** | **str** |  | [optional] 
**message** | **str** | Explanation of the event that occured. | [optional] 
**platform_version_number** | **str** | Version number of the platform the integration application is running on. | [optional] 
**request** | [**IntegrationLogClientRequest**](IntegrationLogClientRequest.md) |  | [optional] 
**tag_id** | **str** |  | [optional] 

## Example

```python
from pinterestsdk.models.integration_log import IntegrationLog

# TODO update the JSON string below
json = "{}"
# create an instance of IntegrationLog from a JSON string
integration_log_instance = IntegrationLog.from_json(json)
# print the JSON string representation of the object
print(IntegrationLog.to_json())

# convert the object into a dict
integration_log_dict = integration_log_instance.to_dict()
# create an instance of IntegrationLog from a dict
integration_log_from_dict = IntegrationLog.from_dict(integration_log_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


