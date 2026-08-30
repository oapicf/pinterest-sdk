# AppsflyerAudienceSyncCreate

Resource create operation model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**container_id** | **str** | The container ID of the audience | 
**url_adid_sha256** | **str** | The pre-signed URL for SHA256 hashed GAID/IDFA file | [optional] 
**url_email_sha256** | **str** | The pre-signed URL for SHA256 hashed email file | [optional] 

## Example

```python
from pinterestsdk.models.appsflyer_audience_sync_create import AppsflyerAudienceSyncCreate

# TODO update the JSON string below
json = "{}"
# create an instance of AppsflyerAudienceSyncCreate from a JSON string
appsflyer_audience_sync_create_instance = AppsflyerAudienceSyncCreate.from_json(json)
# print the JSON string representation of the object
print(AppsflyerAudienceSyncCreate.to_json())

# convert the object into a dict
appsflyer_audience_sync_create_dict = appsflyer_audience_sync_create_instance.to_dict()
# create an instance of AppsflyerAudienceSyncCreate from a dict
appsflyer_audience_sync_create_from_dict = AppsflyerAudienceSyncCreate.from_dict(appsflyer_audience_sync_create_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


