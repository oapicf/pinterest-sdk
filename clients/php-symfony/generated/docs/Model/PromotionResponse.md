# PromotionResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**discountStatus** | **string** | Discount status based on the current time and start and end time of discount | [optional] 
**endTime** | **int** | Promotion end time. Unix timestamp in seconds. Independent of campaign end time. | [optional] 
**externalId** | **string** | Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest. | [optional] 
**platformType** | **string** | The source integration platform used when creating the promotion. Currently supported values are &#39;DEFAULT&#39; and &#39;SHOPIFY&#39;. | [optional] 
**promotionCode** | **string** | Code that can be used to redeem a promotion. | [optional] 
**promotionCustomId** | **string** | An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one. | [optional] 
**promotionTitle** | **string** | Internal name for the promotion. | [optional] 
**promotionType** | [**OpenAPI\Server\Model\PromotionType**](PromotionType.md) |  | [optional] 
**startTime** | **int** | Promotion start time. Unix timestamp in seconds. Independent of campaign start time. | [optional] 
**templateValues** | [**OpenAPI\Server\Model\PromotionTemplateValue**](PromotionTemplateValue.md) | List of values to be inserted in the promotion type-specific template. | [optional] 
**adAccountId** | **string** | The Ad Account ID that this promotion belongs to. | [optional] 
**id** | **string** | Promotion ID | [optional] 
**status** | [**OpenAPI\Server\Model\EntityStatus**](EntityStatus.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


