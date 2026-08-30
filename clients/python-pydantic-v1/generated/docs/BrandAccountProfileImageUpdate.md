# BrandAccountProfileImageUpdate

Base64-encoded image media source

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content_type** | **str** |  | [optional] 
**data** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.brand_account_profile_image_update import BrandAccountProfileImageUpdate

# TODO update the JSON string below
json = "{}"
# create an instance of BrandAccountProfileImageUpdate from a JSON string
brand_account_profile_image_update_instance = BrandAccountProfileImageUpdate.from_json(json)
# print the JSON string representation of the object
print BrandAccountProfileImageUpdate.to_json()

# convert the object into a dict
brand_account_profile_image_update_dict = brand_account_profile_image_update_instance.to_dict()
# create an instance of BrandAccountProfileImageUpdate from a dict
brand_account_profile_image_update_from_dict = BrandAccountProfileImageUpdate.from_dict(brand_account_profile_image_update_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


