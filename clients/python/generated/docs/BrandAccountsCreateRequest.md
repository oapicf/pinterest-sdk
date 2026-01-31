# BrandAccountsCreateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | Brand Account name | 
**username** | **str** | Brand Account username | 
**country** | [**Country**](Country.md) |  | 
**about** | **str** | Brand Account about information | [optional] 
**website** | **str** | Brand Account website | [optional] 
**profile_image** | [**ImageBase64**](ImageBase64.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.brand_accounts_create_request import BrandAccountsCreateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of BrandAccountsCreateRequest from a JSON string
brand_accounts_create_request_instance = BrandAccountsCreateRequest.from_json(json)
# print the JSON string representation of the object
print(BrandAccountsCreateRequest.to_json())

# convert the object into a dict
brand_accounts_create_request_dict = brand_accounts_create_request_instance.to_dict()
# create an instance of BrandAccountsCreateRequest from a dict
brand_accounts_create_request_from_dict = BrandAccountsCreateRequest.from_dict(brand_accounts_create_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


