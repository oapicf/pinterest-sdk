# CampaignAdPreviewCreate200ResponseInnerData

Created/updated resource on success or error details on failure

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **string** | Advertiser ID for this preview. | [readonly] [default to undefined]
**ad_group_id** | **string** | Ad group ID to create a preview record for. | [default to undefined]
**client_id** | **number** | Client ID that created preview. | [optional] [readonly] [default to undefined]
**expires_at** | **number** | Unix timestamp in milliseconds for preview expiration. | [readonly] [default to undefined]
**is_active** | **boolean** | Whether preview link is active. | [readonly] [default to undefined]
**pin_id** | **number** | Pin ID for pin promotion preview. | [optional] [readonly] [default to undefined]
**pin_promotion_id** | **number** | Pin promotion ID for this preview. | [optional] [readonly] [default to undefined]
**promoted_product_group_id** | **number** | Promoted product group ID for catalog previews. | [optional] [readonly] [default to undefined]
**url** | **string** | Campaign ad preview URL. | [readonly] [default to undefined]
**user_id** | **number** | User ID that created preview. | [readonly] [default to undefined]
**uuid** | **string** | Pin promotion preview key. | [readonly] [default to undefined]
**exceptions** | [**PinterestLibError**](PinterestLibError.md) |  | [default to undefined]

## Example

```typescript
import { CampaignAdPreviewCreate200ResponseInnerData } from './api';

const instance: CampaignAdPreviewCreate200ResponseInnerData = {
    ad_account_id,
    ad_group_id,
    client_id,
    expires_at,
    is_active,
    pin_id,
    pin_promotion_id,
    promoted_product_group_id,
    url,
    user_id,
    uuid,
    exceptions,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
