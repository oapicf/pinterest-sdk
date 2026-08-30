# BulkUpsertRequestCreate

Request for creation of entities in bulk.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_groups** | [**List[AdGroupCreateRequest]**](AdGroupCreateRequest.md) |  | [optional] 
**ads** | [**List[AdCreateRequest]**](AdCreateRequest.md) |  | [optional] 
**campaigns** | [**List[CampaignCreateRequest]**](CampaignCreateRequest.md) |  | [optional] 
**catalog_product_groups** | [**List[BulkUpsertRequestCreateCatalogProductGroupsItems]**](BulkUpsertRequestCreateCatalogProductGroupsItems.md) |  | [optional] 
**keywords** | [**List[KeywordsRequest]**](KeywordsRequest.md) |  | [optional] 
**labels** | [**List[LabelBulkCreateRequest]**](LabelBulkCreateRequest.md) |  | [optional] 
**product_groups** | [**List[ProductGroupPromotionCreateRequest]**](ProductGroupPromotionCreateRequest.md) |  | [optional] 
**schedules** | [**List[ScheduleCreateRequest]**](ScheduleCreateRequest.md) |  | [optional] 

## Example

```python
from openapi_client.models.bulk_upsert_request_create import BulkUpsertRequestCreate

# TODO update the JSON string below
json = "{}"
# create an instance of BulkUpsertRequestCreate from a JSON string
bulk_upsert_request_create_instance = BulkUpsertRequestCreate.from_json(json)
# print the JSON string representation of the object
print BulkUpsertRequestCreate.to_json()

# convert the object into a dict
bulk_upsert_request_create_dict = bulk_upsert_request_create_instance.to_dict()
# create an instance of BulkUpsertRequestCreate from a dict
bulk_upsert_request_create_from_dict = BulkUpsertRequestCreate.from_dict(bulk_upsert_request_create_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


