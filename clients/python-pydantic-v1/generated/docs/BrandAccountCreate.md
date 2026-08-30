# BrandAccountCreate

Resource create operation model.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**about** | **str** | Brand Account about information | [optional] 
**country** | [**Country**](Country.md) |  | 
**name** | **str** | Brand Account name | 
**profile_image** | [**BrandAccountProfileImage**](BrandAccountProfileImage.md) |  | [optional] 
**username** | **str** | Brand Account username | 
**website** | **str** | Brand Account website | [optional] 

## Example

```python
from openapi_client.models.brand_account_create import BrandAccountCreate

# TODO update the JSON string below
json = "{}"
# create an instance of BrandAccountCreate from a JSON string
brand_account_create_instance = BrandAccountCreate.from_json(json)
# print the JSON string representation of the object
print BrandAccountCreate.to_json()

# convert the object into a dict
brand_account_create_dict = brand_account_create_instance.to_dict()
# create an instance of BrandAccountCreate from a dict
brand_account_create_from_dict = BrandAccountCreate.from_dict(brand_account_create_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


