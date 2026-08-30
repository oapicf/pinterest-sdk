# BrandAccountUpdate

Resource create or update operation model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**about** | **str** | Brand Account about information | [optional] 
**country** | [**Country**](Country.md) |  | [optional] 
**name** | **str** | Brand Account name | [optional] 
**profile_image** | [**BrandAccountProfileImageUpdate**](BrandAccountProfileImageUpdate.md) |  | [optional] 
**username** | **str** | Brand Account username | [optional] 
**website** | **str** | Brand Account website | [optional] 

## Example

```python
from pinterestsdk.models.brand_account_update import BrandAccountUpdate

# TODO update the JSON string below
json = "{}"
# create an instance of BrandAccountUpdate from a JSON string
brand_account_update_instance = BrandAccountUpdate.from_json(json)
# print the JSON string representation of the object
print(BrandAccountUpdate.to_json())

# convert the object into a dict
brand_account_update_dict = brand_account_update_instance.to_dict()
# create an instance of BrandAccountUpdate from a dict
brand_account_update_from_dict = BrandAccountUpdate.from_dict(brand_account_update_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


