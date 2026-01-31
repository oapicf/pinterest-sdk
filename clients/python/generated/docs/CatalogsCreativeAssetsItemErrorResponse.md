# CatalogsCreativeAssetsItemErrorResponse

Object describing a creative assets item error

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | [**CatalogsType**](CatalogsType.md) |  | 
**creative_assets_id** | **str** | The catalog creative assets id in the merchant namespace | [optional] 
**errors** | [**List[ItemValidationEvent]**](ItemValidationEvent.md) | Array with the errors for the item id requested | 

## Example

```python
from pinterestsdk.models.catalogs_creative_assets_item_error_response import CatalogsCreativeAssetsItemErrorResponse

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsCreativeAssetsItemErrorResponse from a JSON string
catalogs_creative_assets_item_error_response_instance = CatalogsCreativeAssetsItemErrorResponse.from_json(json)
# print the JSON string representation of the object
print(CatalogsCreativeAssetsItemErrorResponse.to_json())

# convert the object into a dict
catalogs_creative_assets_item_error_response_dict = catalogs_creative_assets_item_error_response_instance.to_dict()
# create an instance of CatalogsCreativeAssetsItemErrorResponse from a dict
catalogs_creative_assets_item_error_response_from_dict = CatalogsCreativeAssetsItemErrorResponse.from_dict(catalogs_creative_assets_item_error_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


