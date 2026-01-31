# PromotionResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**discountStatus** | **String!** | Discount status based on the current time and start and end time of discount | [optional] [default to null]
**endTime** | **Int!** | Promotion end time. Unix timestamp in seconds. Independent of campaign end time. | [optional] [default to null]
**externalId** | **String!** | Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest. | [optional] [default to null]
**platformType** | **String!** | The source integration platform used when creating the promotion. Currently supported values are &#39;DEFAULT&#39; and &#39;SHOPIFY&#39;. | [optional] [default to null]
**promotionCode** | **String!** | Code that can be used to redeem a promotion. | [optional] [default to null]
**promotionCustomId** | **String!** | An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one. | [optional] [default to null]
**promotionTitle** | **String!** | Internal name for the promotion. | [optional] [default to null]
**promotionType** | [***PromotionType**](PromotionType.md) |  | [optional] [default to null]
**startTime** | **Int!** | Promotion start time. Unix timestamp in seconds. Independent of campaign start time. | [optional] [default to null]
**templateValues** | [**PromotionTemplateValue**](PromotionTemplateValue.md) | List of values to be inserted in the promotion type-specific template. | [optional] [default to null]
**adAccountId** | **String!** | The Ad Account ID that this promotion belongs to. | [optional] [default to null]
**Id_** | **String!** | Promotion ID | [optional] [default to null]
**status** | [***EntityStatus**](EntityStatus.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


