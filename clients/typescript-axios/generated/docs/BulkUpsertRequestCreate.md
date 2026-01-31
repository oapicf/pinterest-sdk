# BulkUpsertRequestCreate

Request for creation of entities in bulk.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaigns** | [**Array&lt;CampaignCreateRequest&gt;**](CampaignCreateRequest.md) |  | [optional] [default to undefined]
**ad_groups** | [**Array&lt;AdGroupCreateRequest&gt;**](AdGroupCreateRequest.md) |  | [optional] [default to undefined]
**ads** | [**Array&lt;AdCreateRequest&gt;**](AdCreateRequest.md) |  | [optional] [default to undefined]
**product_groups** | [**Array&lt;ProductGroupPromotionCreateRequest&gt;**](ProductGroupPromotionCreateRequest.md) |  | [optional] [default to undefined]
**keywords** | [**Array&lt;KeywordsRequest&gt;**](KeywordsRequest.md) |  | [optional] [default to undefined]

## Example

```typescript
import { BulkUpsertRequestCreate } from './api';

const instance: BulkUpsertRequestCreate = {
    campaigns,
    ad_groups,
    ads,
    product_groups,
    keywords,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
