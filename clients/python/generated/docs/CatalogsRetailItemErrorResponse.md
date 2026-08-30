# CatalogsRetailItemErrorResponse

Object describing a retail item error

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **str** |  | 
**errors** | [**List[ItemValidationEvent]**](ItemValidationEvent.md) | Array with the errors for the item id requested | 
**item_id** | **str** | The catalog item id in the merchant namespace | [optional] 
**item_response_kind** | **str** | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. | 

## Example

```python
from pinterestsdk.models.catalogs_retail_item_error_response import CatalogsRetailItemErrorResponse

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsRetailItemErrorResponse from a JSON string
catalogs_retail_item_error_response_instance = CatalogsRetailItemErrorResponse.from_json(json)
# print the JSON string representation of the object
print(CatalogsRetailItemErrorResponse.to_json())

# convert the object into a dict
catalogs_retail_item_error_response_dict = catalogs_retail_item_error_response_instance.to_dict()
# create an instance of CatalogsRetailItemErrorResponse from a dict
catalogs_retail_item_error_response_from_dict = CatalogsRetailItemErrorResponse.from_dict(catalogs_retail_item_error_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


