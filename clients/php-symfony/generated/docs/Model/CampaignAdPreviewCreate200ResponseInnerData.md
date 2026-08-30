# CampaignAdPreviewCreate200ResponseInnerData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | **string** | Advertiser ID for this preview. | [readonly] 
**adGroupId** | **string** | Ad group ID to create a preview record for. | 
**clientId** | **int** | Client ID that created preview. | [optional] [readonly] 
**expiresAt** | **int** | Unix timestamp in milliseconds for preview expiration. | [readonly] 
**isActive** | **bool** | Whether preview link is active. | [readonly] 
**pinId** | **int** | Pin ID for pin promotion preview. | [optional] [readonly] 
**pinPromotionId** | **int** | Pin promotion ID for this preview. | [optional] [readonly] 
**promotedProductGroupId** | **int** | Promoted product group ID for catalog previews. | [optional] [readonly] 
**url** | **string** | Campaign ad preview URL. | [readonly] 
**userId** | **int** | User ID that created preview. | [readonly] 
**uuid** | **string** | Pin promotion preview key. | [readonly] 
**exceptions** | [**OpenAPI\Server\Model\PinterestLibError**](PinterestLibError.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


