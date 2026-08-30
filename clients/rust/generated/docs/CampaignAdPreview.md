# CampaignAdPreview

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **String** | Advertiser ID for this preview. | [readonly]
**ad_group_id** | **String** | Ad group ID to create a preview record for. | 
**client_id** | Option<**i32**> | Client ID that created preview. | [optional][readonly]
**expires_at** | **i32** | Unix timestamp in milliseconds for preview expiration. | [readonly]
**is_active** | **bool** | Whether preview link is active. | [readonly]
**pin_id** | Option<**i32**> | Pin ID for pin promotion preview. | [optional][readonly]
**pin_promotion_id** | Option<**i32**> | Pin promotion ID for this preview. | [optional][readonly]
**promoted_product_group_id** | Option<**i32**> | Promoted product group ID for catalog previews. | [optional][readonly]
**url** | **String** | Campaign ad preview URL. | [readonly]
**user_id** | **i32** | User ID that created preview. | [readonly]
**uuid** | **String** | Pin promotion preview key. | [readonly]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


