# openapi::CampaignAdPreviewCreate200ResponseInnerData

Created/updated resource on success or error details on failure

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **character** | Advertiser ID for this preview. | [readonly] [Pattern: ^\\d+$] 
**ad_group_id** | **character** | Ad group ID to create a preview record for. | [Pattern: ^\\d+$] [Max. length: 18] 
**client_id** | **integer** | Client ID that created preview. | [optional] [readonly] 
**expires_at** | **integer** | Unix timestamp in milliseconds for preview expiration. | [readonly] 
**is_active** | **character** | Whether preview link is active. | [readonly] 
**pin_id** | **integer** | Pin ID for pin promotion preview. | [optional] [readonly] 
**pin_promotion_id** | **integer** | Pin promotion ID for this preview. | [optional] [readonly] 
**promoted_product_group_id** | **integer** | Promoted product group ID for catalog previews. | [optional] [readonly] 
**url** | **character** | Campaign ad preview URL. | [readonly] 
**user_id** | **integer** | User ID that created preview. | [readonly] 
**uuid** | **character** | Pin promotion preview key. | [readonly] 
**exceptions** | [**PinterestLibError**](Pinterest.Lib.Error.md) |  | 


