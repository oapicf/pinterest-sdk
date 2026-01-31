# AdAccount


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | [**Country**](Country.md) |  | [optional] 
**created_time** | **int** |  Creation time. Unix timestamp in seconds. | [optional] [readonly] 
**currency** | [**Currency**](Currency.md) |  | [optional] 
**id** | **str** |  | 
**name** | **str** | Ad account name. | [optional] 
**owner** | [**AdAccountOwner**](AdAccountOwner.md) | Ad account owner | [optional] [readonly] 
**permissions** | [**List[BusinessAccessRole]**](BusinessAccessRole.md) |  | [optional] [readonly] 
**updated_time** | **int** |  | [optional] [readonly] 

## Example

```python
from pinterestsdk.models.ad_account import AdAccount

# TODO update the JSON string below
json = "{}"
# create an instance of AdAccount from a JSON string
ad_account_instance = AdAccount.from_json(json)
# print the JSON string representation of the object
print(AdAccount.to_json())

# convert the object into a dict
ad_account_dict = ad_account_instance.to_dict()
# create an instance of AdAccount from a dict
ad_account_from_dict = AdAccount.from_dict(ad_account_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


