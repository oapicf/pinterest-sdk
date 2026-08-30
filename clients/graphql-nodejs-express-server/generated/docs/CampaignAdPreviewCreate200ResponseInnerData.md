# CampaignAdPreviewCreate200ResponseInnerData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | **String!** | Advertiser ID for this preview. | [readonly] [default to null]
**adGroupId** | **String!** | Ad group ID to create a preview record for. | [default to null]
**clientId** | **Int!** | Client ID that created preview. | [optional] [readonly] [default to null]
**expiresAt** | **Int!** | Unix timestamp in milliseconds for preview expiration. | [readonly] [default to null]
**isActive** | **Boolean!** | Whether preview link is active. | [readonly] [default to null]
**pinId** | **Int!** | Pin ID for pin promotion preview. | [optional] [readonly] [default to null]
**pinPromotionId** | **Int!** | Pin promotion ID for this preview. | [optional] [readonly] [default to null]
**promotedProductGroupId** | **Int!** | Promoted product group ID for catalog previews. | [optional] [readonly] [default to null]
**url** | **String!** | Campaign ad preview URL. | [readonly] [default to null]
**userId** | **Int!** | User ID that created preview. | [readonly] [default to null]
**uuid** | **String!** | Pin promotion preview key. | [readonly] [default to null]
**exceptions** | [***PinterestLibError**](Pinterest.Lib.Error.md) |  | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


