
# Table `CampaignAdPreview`
(mapped from: CampaignAdPreview)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**adAccountId** | ad_account_id | text NOT NULL |  | **kotlin.String** | Advertiser ID for this preview. |  [readonly]
**adGroupId** | ad_group_id | text NOT NULL |  | **kotlin.String** | Ad group ID to create a preview record for. | 
**expiresAt** | expires_at | int NOT NULL |  | **kotlin.Int** | Unix timestamp in milliseconds for preview expiration. |  [readonly]
**isActive** | is_active | boolean NOT NULL |  | **kotlin.Boolean** | Whether preview link is active. |  [readonly]
**url** | url | text NOT NULL |  | **kotlin.String** | Campaign ad preview URL. |  [readonly]
**userId** | user_id | int NOT NULL |  | **kotlin.Int** | User ID that created preview. |  [readonly]
**uuid** | uuid | text NOT NULL |  | **kotlin.String** | Pin promotion preview key. |  [readonly]
**clientId** | client_id | int |  | **kotlin.Int** | Client ID that created preview. |  [optional] [readonly]
**pinId** | pin_id | int |  | **kotlin.Int** | Pin ID for pin promotion preview. |  [optional] [readonly]
**pinPromotionId** | pin_promotion_id | int |  | **kotlin.Int** | Pin promotion ID for this preview. |  [optional] [readonly]
**promotedProductGroupId** | promoted_product_group_id | int |  | **kotlin.Int** | Promoted product group ID for catalog previews. |  [optional] [readonly]













