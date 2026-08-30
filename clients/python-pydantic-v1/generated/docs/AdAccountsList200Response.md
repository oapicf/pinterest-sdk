# AdAccountsList200Response


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookmark** | **str** |  | [optional] 
**items** | [**List[AdAccount]**](AdAccount.md) |  | 

## Example

```python
from openapi_client.models.ad_accounts_list200_response import AdAccountsList200Response

# TODO update the JSON string below
json = "{}"
# create an instance of AdAccountsList200Response from a JSON string
ad_accounts_list200_response_instance = AdAccountsList200Response.from_json(json)
# print the JSON string representation of the object
print AdAccountsList200Response.to_json()

# convert the object into a dict
ad_accounts_list200_response_dict = ad_accounts_list200_response_instance.to_dict()
# create an instance of AdAccountsList200Response from a dict
ad_accounts_list200_response_from_dict = AdAccountsList200Response.from_dict(ad_accounts_list200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


