# Org.OpenAPITools.Model.PromotionBatchUpdate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Promotion ID | 
**DiscountStatus** | **DiscountStatus** |  | [optional] 
**EndTime** | **int** | Promotion end time. Unix timestamp in seconds. Independent of campaign end time. | [optional] 
**ExternalId** | **string** | Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest. | [optional] 
**PlatformType** | **string** | The source integration platform used when creating the promotion. Currently supported values are &#39;DEFAULT&#39; and &#39;SHOPIFY&#39;. | [optional] 
**PromotionCode** | **string** | Code that can be used to redeem a promotion. | [optional] 
**PromotionCustomId** | **string** | An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one. | [optional] 
**PromotionTitle** | **string** | Internal name for the promotion. | [optional] 
**PromotionType** | **PromotionType** |  | [optional] 
**StartTime** | **int** | Promotion start time. Unix timestamp in seconds. Independent of campaign start time. | [optional] 
**TemplateValues** | [**List&lt;PromotionTemplateValue&gt;**](PromotionTemplateValue.md) | List of values to be inserted in the promotion type-specific template. | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

