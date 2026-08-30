# BulkUpsertRequestCreate

Request for creation of entities in bulk.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_groups** | [**Array&lt;AdGroupCreateRequest&gt;**](AdGroupCreateRequest.md) |  | [optional] [default to undefined]
**ads** | [**Array&lt;AdCreateRequest&gt;**](AdCreateRequest.md) |  | [optional] [default to undefined]
**campaigns** | [**Array&lt;CampaignCreateRequest&gt;**](CampaignCreateRequest.md) |  | [optional] [default to undefined]
**catalog_product_groups** | [**Array&lt;BulkUpsertRequestCreateCatalogProductGroupsItems&gt;**](BulkUpsertRequestCreateCatalogProductGroupsItems.md) |  | [optional] [default to undefined]
**keywords** | [**Array&lt;KeywordsRequest&gt;**](KeywordsRequest.md) |  | [optional] [default to undefined]
**labels** | [**Array&lt;LabelBulkCreateRequest&gt;**](LabelBulkCreateRequest.md) |  | [optional] [default to undefined]
**product_groups** | [**Array&lt;ProductGroupPromotionCreateRequest&gt;**](ProductGroupPromotionCreateRequest.md) |  | [optional] [default to undefined]
**schedules** | [**Array&lt;ScheduleCreateRequest&gt;**](ScheduleCreateRequest.md) |  | [optional] [default to undefined]

## Example

```typescript
import { BulkUpsertRequestCreate } from './api';

const instance: BulkUpsertRequestCreate = {
    ad_groups,
    ads,
    campaigns,
    catalog_product_groups,
    keywords,
    labels,
    product_groups,
    schedules,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
