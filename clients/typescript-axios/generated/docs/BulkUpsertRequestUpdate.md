# BulkUpsertRequestUpdate

Request for creation of entities in bulk.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_groups** | [**Array&lt;AdGroupUpdateRequest&gt;**](AdGroupUpdateRequest.md) |  | [optional] [default to undefined]
**ads** | [**Array&lt;AdUpdateRequest&gt;**](AdUpdateRequest.md) |  | [optional] [default to undefined]
**campaigns** | [**Array&lt;CampaignUpdateRequest&gt;**](CampaignUpdateRequest.md) |  | [optional] [default to undefined]
**catalog_product_groups** | [**Array&lt;CatalogsProductGroupsUpdateRequest&gt;**](CatalogsProductGroupsUpdateRequest.md) |  | [optional] [default to undefined]
**keywords** | [**Array&lt;KeywordUpdate&gt;**](KeywordUpdate.md) |  | [optional] [default to undefined]
**labels** | [**Array&lt;LabelBulkUpdateRequest&gt;**](LabelBulkUpdateRequest.md) |  | [optional] [default to undefined]
**product_groups** | [**Array&lt;ProductGroupPromotionUpdateRequest&gt;**](ProductGroupPromotionUpdateRequest.md) |  | [optional] [default to undefined]

## Example

```typescript
import { BulkUpsertRequestUpdate } from './api';

const instance: BulkUpsertRequestUpdate = {
    ad_groups,
    ads,
    campaigns,
    catalog_product_groups,
    keywords,
    labels,
    product_groups,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
