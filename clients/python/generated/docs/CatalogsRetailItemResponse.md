# CatalogsRetailItemResponse

Object describing a retail item record

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**ItemAttributes**](ItemAttributes.md) |  | [optional] 
**catalog_type** | [**CatalogsType**](CatalogsType.md) |  | 
**item_id** | **str** | The catalog retail item id in the merchant namespace | [optional] 
**pins** | [**List[Pin]**](Pin.md) | The pins mapped to the item | [optional] 

## Example

```python
from pinterestsdk.models.catalogs_retail_item_response import CatalogsRetailItemResponse

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsRetailItemResponse from a JSON string
catalogs_retail_item_response_instance = CatalogsRetailItemResponse.from_json(json)
# print the JSON string representation of the object
print(CatalogsRetailItemResponse.to_json())

# convert the object into a dict
catalogs_retail_item_response_dict = catalogs_retail_item_response_instance.to_dict()
# create an instance of CatalogsRetailItemResponse from a dict
catalogs_retail_item_response_from_dict = CatalogsRetailItemResponse.from_dict(catalogs_retail_item_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


