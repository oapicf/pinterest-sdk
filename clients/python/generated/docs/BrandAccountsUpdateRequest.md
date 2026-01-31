# BrandAccountsUpdateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | Brand Account name | [optional] 
**username** | **str** | Brand Account username | [optional] 
**country** | [**Country**](Country.md) |  | [optional] 
**about** | **str** | Brand Account about information | [optional] 
**website** | **str** | Brand Account website | [optional] 
**profile_image** | [**ImageBase64**](ImageBase64.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.brand_accounts_update_request import BrandAccountsUpdateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of BrandAccountsUpdateRequest from a JSON string
brand_accounts_update_request_instance = BrandAccountsUpdateRequest.from_json(json)
# print the JSON string representation of the object
print(BrandAccountsUpdateRequest.to_json())

# convert the object into a dict
brand_accounts_update_request_dict = brand_accounts_update_request_instance.to_dict()
# create an instance of BrandAccountsUpdateRequest from a dict
brand_accounts_update_request_from_dict = BrandAccountsUpdateRequest.from_dict(brand_accounts_update_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


