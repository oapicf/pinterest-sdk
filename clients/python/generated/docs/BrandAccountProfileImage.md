# BrandAccountProfileImage

Base64-encoded image media source

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content_type** | **str** |  | 
**data** | **str** |  | 

## Example

```python
from pinterestsdk.models.brand_account_profile_image import BrandAccountProfileImage

# TODO update the JSON string below
json = "{}"
# create an instance of BrandAccountProfileImage from a JSON string
brand_account_profile_image_instance = BrandAccountProfileImage.from_json(json)
# print the JSON string representation of the object
print(BrandAccountProfileImage.to_json())

# convert the object into a dict
brand_account_profile_image_dict = brand_account_profile_image_instance.to_dict()
# create an instance of BrandAccountProfileImage from a dict
brand_account_profile_image_from_dict = BrandAccountProfileImage.from_dict(brand_account_profile_image_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


