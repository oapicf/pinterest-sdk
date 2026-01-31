# CatalogsProductGroupMultipleMediaTypesCriteria


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**negated** | **bool** |  | [optional] [default to False]
**values** | [**List[MediaType]**](MediaType.md) |  | 

## Example

```python
from pinterestsdk.models.catalogs_product_group_multiple_media_types_criteria import CatalogsProductGroupMultipleMediaTypesCriteria

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsProductGroupMultipleMediaTypesCriteria from a JSON string
catalogs_product_group_multiple_media_types_criteria_instance = CatalogsProductGroupMultipleMediaTypesCriteria.from_json(json)
# print the JSON string representation of the object
print(CatalogsProductGroupMultipleMediaTypesCriteria.to_json())

# convert the object into a dict
catalogs_product_group_multiple_media_types_criteria_dict = catalogs_product_group_multiple_media_types_criteria_instance.to_dict()
# create an instance of CatalogsProductGroupMultipleMediaTypesCriteria from a dict
catalogs_product_group_multiple_media_types_criteria_from_dict = CatalogsProductGroupMultipleMediaTypesCriteria.from_dict(catalogs_product_group_multiple_media_types_criteria_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


