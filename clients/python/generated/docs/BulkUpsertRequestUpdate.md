# BulkUpsertRequestUpdate

Request for creation of entities in bulk.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_groups** | [**List[AdGroupUpdateRequest]**](AdGroupUpdateRequest.md) |  | [optional] 
**ads** | [**List[AdUpdateRequest]**](AdUpdateRequest.md) |  | [optional] 
**campaigns** | [**List[CampaignUpdateRequest]**](CampaignUpdateRequest.md) |  | [optional] 
**catalog_product_groups** | [**List[BulkUpsertRequestUpdateCatalogProductGroupsItems]**](BulkUpsertRequestUpdateCatalogProductGroupsItems.md) |  | [optional] 
**keywords** | [**List[KeywordUpdateGenerated]**](KeywordUpdateGenerated.md) |  | [optional] 
**labels** | [**List[LabelBulkUpdateRequest]**](LabelBulkUpdateRequest.md) |  | [optional] 
**product_groups** | [**List[ProductGroupPromotionUpdateRequest]**](ProductGroupPromotionUpdateRequest.md) |  | [optional] 
**schedules** | [**List[ScheduleUpdateRequest]**](ScheduleUpdateRequest.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.bulk_upsert_request_update import BulkUpsertRequestUpdate

# TODO update the JSON string below
json = "{}"
# create an instance of BulkUpsertRequestUpdate from a JSON string
bulk_upsert_request_update_instance = BulkUpsertRequestUpdate.from_json(json)
# print the JSON string representation of the object
print(BulkUpsertRequestUpdate.to_json())

# convert the object into a dict
bulk_upsert_request_update_dict = bulk_upsert_request_update_instance.to_dict()
# create an instance of BulkUpsertRequestUpdate from a dict
bulk_upsert_request_update_from_dict = BulkUpsertRequestUpdate.from_dict(bulk_upsert_request_update_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


