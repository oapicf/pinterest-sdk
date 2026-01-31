# BulkUpsertRequestUpdate

Request for creation of entities in bulk.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaigns** | [**Array&lt;CampaignUpdateRequest&gt;**](CampaignUpdateRequest.md) |  | [optional] [default to undefined]
**ad_groups** | [**Array&lt;AdGroupUpdateRequest&gt;**](AdGroupUpdateRequest.md) |  | [optional] [default to undefined]
**ads** | [**Array&lt;AdUpdateRequest&gt;**](AdUpdateRequest.md) |  | [optional] [default to undefined]
**product_groups** | [**Array&lt;ProductGroupPromotionUpdateRequest&gt;**](ProductGroupPromotionUpdateRequest.md) |  | [optional] [default to undefined]
**keywords** | [**Array&lt;KeywordUpdate&gt;**](KeywordUpdate.md) |  | [optional] [default to undefined]

## Example

```typescript
import { BulkUpsertRequestUpdate } from './api';

const instance: BulkUpsertRequestUpdate = {
    campaigns,
    ad_groups,
    ads,
    product_groups,
    keywords,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
