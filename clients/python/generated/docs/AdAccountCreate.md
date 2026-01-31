# AdAccountCreate

Resource create operation model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | [**Country**](Country.md) |  | [optional] 
**currency** | [**Currency**](Currency.md) |  | [optional] 
**name** | **str** | Ad account name. | [optional] 
**owner_user_id** | **str** | Advertiser&#39;s owning user ID. | [optional] 

## Example

```python
from pinterestsdk.models.ad_account_create import AdAccountCreate

# TODO update the JSON string below
json = "{}"
# create an instance of AdAccountCreate from a JSON string
ad_account_create_instance = AdAccountCreate.from_json(json)
# print the JSON string representation of the object
print(AdAccountCreate.to_json())

# convert the object into a dict
ad_account_create_dict = ad_account_create_instance.to_dict()
# create an instance of AdAccountCreate from a dict
ad_account_create_from_dict = AdAccountCreate.from_dict(ad_account_create_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


