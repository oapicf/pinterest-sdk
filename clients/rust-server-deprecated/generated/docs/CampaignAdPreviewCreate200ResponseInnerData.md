# CampaignAdPreviewCreate200ResponseInnerData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **String** | Advertiser ID for this preview. | [readonly] 
**ad_group_id** | **String** | Ad group ID to create a preview record for. | 
**client_id** | **i32** | Client ID that created preview. | [optional] [readonly] [default to None]
**expires_at** | **i32** | Unix timestamp in milliseconds for preview expiration. | [readonly] 
**is_active** | **bool** | Whether preview link is active. | [readonly] 
**pin_id** | **i32** | Pin ID for pin promotion preview. | [optional] [readonly] [default to None]
**pin_promotion_id** | **i32** | Pin promotion ID for this preview. | [optional] [readonly] [default to None]
**promoted_product_group_id** | **i32** | Promoted product group ID for catalog previews. | [optional] [readonly] [default to None]
**url** | **String** | Campaign ad preview URL. | [readonly] 
**user_id** | **i32** | User ID that created preview. | [readonly] 
**uuid** | **String** | Pin promotion preview key. | [readonly] 
**exceptions** | [***models::PinterestLibError**](Pinterest.Lib.Error.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


