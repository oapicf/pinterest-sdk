# AdAccountOwner


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The owning account&#39;s user ID. | [optional] 
**username** | **str** | Public username for the user account | [optional] 

## Example

```python
from openapi_client.models.ad_account_owner import AdAccountOwner

# TODO update the JSON string below
json = "{}"
# create an instance of AdAccountOwner from a JSON string
ad_account_owner_instance = AdAccountOwner.from_json(json)
# print the JSON string representation of the object
print AdAccountOwner.to_json()

# convert the object into a dict
ad_account_owner_dict = ad_account_owner_instance.to_dict()
# create an instance of AdAccountOwner from a dict
ad_account_owner_from_dict = AdAccountOwner.from_dict(ad_account_owner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


