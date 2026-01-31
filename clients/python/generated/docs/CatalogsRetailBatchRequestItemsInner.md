# CatalogsRetailBatchRequestItemsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**ItemAttributesRequest**](ItemAttributesRequest.md) |  | 
**item_id** | **str** | The catalog item id in the merchant namespace | 
**operation** | **str** |  | 
**update_mask** | [**List[UpdateMaskFieldType]**](UpdateMaskFieldType.md) | The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item. | [optional] 
**last_updated_time** | **int** | The millisecond timestamp when the item was lastly modified by the merchant. | [optional] 

## Example

```python
from pinterestsdk.models.catalogs_retail_batch_request_items_inner import CatalogsRetailBatchRequestItemsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsRetailBatchRequestItemsInner from a JSON string
catalogs_retail_batch_request_items_inner_instance = CatalogsRetailBatchRequestItemsInner.from_json(json)
# print the JSON string representation of the object
print(CatalogsRetailBatchRequestItemsInner.to_json())

# convert the object into a dict
catalogs_retail_batch_request_items_inner_dict = catalogs_retail_batch_request_items_inner_instance.to_dict()
# create an instance of CatalogsRetailBatchRequestItemsInner from a dict
catalogs_retail_batch_request_items_inner_from_dict = CatalogsRetailBatchRequestItemsInner.from_dict(catalogs_retail_batch_request_items_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


