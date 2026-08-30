# Org.OpenAPITools.Model.CampaignAdPreview
Campaign ad preview record.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | **string** | Advertiser ID for this preview. | [readonly] 
**AdGroupId** | **string** | Ad group ID to create a preview record for. | 
**ExpiresAt** | **int** | Unix timestamp in milliseconds for preview expiration. | [readonly] 
**IsActive** | **bool** | Whether preview link is active. | [readonly] 
**Url** | **string** | Campaign ad preview URL. | [readonly] 
**UserId** | **int** | User ID that created preview. | [readonly] 
**Uuid** | **string** | Pin promotion preview key. | [readonly] 
**ClientId** | **int** | Client ID that created preview. | [optional] [readonly] 
**PinId** | **int** | Pin ID for pin promotion preview. | [optional] [readonly] 
**PinPromotionId** | **int** | Pin promotion ID for this preview. | [optional] [readonly] 
**PromotedProductGroupId** | **int** | Promoted product group ID for catalog previews. | [optional] [readonly] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

