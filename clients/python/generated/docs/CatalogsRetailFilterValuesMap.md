# CatalogsRetailFilterValuesMap

A map of filter attributes to their available values.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_image_tags** | **List[str]** |  | [optional] 
**ad_video_tags** | **List[str]** |  | [optional] 
**availability** | **List[str]** |  | [optional] 
**brand** | **List[str]** |  | [optional] 
**condition** | **List[str]** |  | [optional] 
**custom_label_0** | **List[str]** |  | [optional] 
**custom_label_1** | **List[str]** |  | [optional] 
**custom_label_2** | **List[str]** |  | [optional] 
**custom_label_3** | **List[str]** |  | [optional] 
**custom_label_4** | **List[str]** |  | [optional] 
**gender** | **List[str]** |  | [optional] 
**google_product_category_0** | **List[str]** |  | [optional] 
**google_product_category_1** | **List[str]** |  | [optional] 
**google_product_category_2** | **List[str]** |  | [optional] 
**google_product_category_3** | **List[str]** |  | [optional] 
**google_product_category_4** | **List[str]** |  | [optional] 
**google_product_category_5** | **List[str]** |  | [optional] 
**google_product_category_6** | **List[str]** |  | [optional] 
**media_type** | **List[str]** |  | [optional] 
**product_type_0** | **List[str]** |  | [optional] 
**product_type_1** | **List[str]** |  | [optional] 
**product_type_2** | **List[str]** |  | [optional] 
**product_type_3** | **List[str]** |  | [optional] 
**product_type_4** | **List[str]** |  | [optional] 

## Example

```python
from pinterestsdk.models.catalogs_retail_filter_values_map import CatalogsRetailFilterValuesMap

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsRetailFilterValuesMap from a JSON string
catalogs_retail_filter_values_map_instance = CatalogsRetailFilterValuesMap.from_json(json)
# print the JSON string representation of the object
print(CatalogsRetailFilterValuesMap.to_json())

# convert the object into a dict
catalogs_retail_filter_values_map_dict = catalogs_retail_filter_values_map_instance.to_dict()
# create an instance of CatalogsRetailFilterValuesMap from a dict
catalogs_retail_filter_values_map_from_dict = CatalogsRetailFilterValuesMap.from_dict(catalogs_retail_filter_values_map_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


