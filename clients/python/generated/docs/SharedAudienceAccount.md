# SharedAudienceAccount


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_id** | **str** | Account ID (ad account or business ID). | 
**account_name** | **str** | Account name. | 
**account_type** | **str** | account type | 
**shared_on_timestamp** | **int** | Epoch timestamp in seconds for the shared audience event | 

## Example

```python
from pinterestsdk.models.shared_audience_account import SharedAudienceAccount

# TODO update the JSON string below
json = "{}"
# create an instance of SharedAudienceAccount from a JSON string
shared_audience_account_instance = SharedAudienceAccount.from_json(json)
# print the JSON string representation of the object
print(SharedAudienceAccount.to_json())

# convert the object into a dict
shared_audience_account_dict = shared_audience_account_instance.to_dict()
# create an instance of SharedAudienceAccount from a dict
shared_audience_account_from_dict = SharedAudienceAccount.from_dict(shared_audience_account_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


