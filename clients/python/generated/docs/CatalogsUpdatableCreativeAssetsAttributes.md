# CatalogsUpdatableCreativeAssetsAttributes


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**android_deep_link** | **str** | Link to the creative assets page. | [optional] 
**custom_label_0** | **str** | Custom grouping of creative assets. | [optional] 
**custom_label_1** | **str** | Custom grouping of creative assets. | [optional] 
**custom_label_2** | **str** | Custom grouping of creative assets. | [optional] 
**custom_label_3** | **str** | Custom grouping of creative assets. | [optional] 
**custom_label_4** | **str** | Custom grouping of creative assets. | [optional] 
**description** | **str** | Brief description of the creative assets. | [optional] 
**google_product_category** | **str** | The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted. | [optional] 
**ios_deep_link** | **str** | IOS deep link to the creative assets page. | [optional] 
**link** | **str** | Link to the creative assets page. | [optional] 
**title** | **str** | The name of the creative assets. | [optional] 
**visibility** | **str** | Visibility of the creative assets. Must be one of the following values (upper or lowercase): ‘visible’, ‘hidden’. | [optional] 

## Example

```python
from pinterestsdk.models.catalogs_updatable_creative_assets_attributes import CatalogsUpdatableCreativeAssetsAttributes

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsUpdatableCreativeAssetsAttributes from a JSON string
catalogs_updatable_creative_assets_attributes_instance = CatalogsUpdatableCreativeAssetsAttributes.from_json(json)
# print the JSON string representation of the object
print(CatalogsUpdatableCreativeAssetsAttributes.to_json())

# convert the object into a dict
catalogs_updatable_creative_assets_attributes_dict = catalogs_updatable_creative_assets_attributes_instance.to_dict()
# create an instance of CatalogsUpdatableCreativeAssetsAttributes from a dict
catalogs_updatable_creative_assets_attributes_from_dict = CatalogsUpdatableCreativeAssetsAttributes.from_dict(catalogs_updatable_creative_assets_attributes_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


