# Promotion

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | **string** | The Ad Account ID that this promotion belongs to. | [readonly] 
**discountStatus** | [**OpenAPI\Server\Model\DiscountStatus**](DiscountStatus.md) |  | [optional] 
**endTime** | **int** | Promotion end time. Unix timestamp in seconds. Independent of campaign end time. | [optional] 
**externalId** | **string** | Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest. | [optional] 
**id** | **string** | Promotion ID | 
**platformType** | **string** | The source integration platform used when creating the promotion. Currently supported values are &#39;DEFAULT&#39; and &#39;SHOPIFY&#39;. | [optional] 
**promotionCode** | **string** | Code that can be used to redeem a promotion. | [optional] 
**promotionCustomId** | **string** | An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one. | [optional] 
**promotionTitle** | **string** | Internal name for the promotion. | 
**promotionType** | [**OpenAPI\Server\Model\PromotionType**](PromotionType.md) |  | 
**startTime** | **int** | Promotion start time. Unix timestamp in seconds. Independent of campaign start time. | [optional] 
**status** | [**OpenAPI\Server\Model\EntityStatus**](EntityStatus.md) |  | [optional] [readonly] 
**templateValues** | [**OpenAPI\Server\Model\PromotionTemplateValue**](PromotionTemplateValue.md) | List of values to be inserted in the promotion type-specific template. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


