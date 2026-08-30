

# Promotion

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | **String** | The Ad Account ID that this promotion belongs to. |  [readonly]
**discountStatus** | [**DiscountStatus**](DiscountStatus.md) |  |  [optional]
**endTime** | **Integer** | Promotion end time. Unix timestamp in seconds. Independent of campaign end time. |  [optional]
**externalId** | **String** | Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest. |  [optional]
**id** | **String** | Promotion ID | 
**platformType** | **String** | The source integration platform used when creating the promotion. Currently supported values are &#39;DEFAULT&#39; and &#39;SHOPIFY&#39;. |  [optional]
**promotionCode** | **String** | Code that can be used to redeem a promotion. |  [optional]
**promotionCustomId** | **String** | An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one. |  [optional]
**promotionTitle** | **String** | Internal name for the promotion. | 
**promotionType** | [**PromotionType**](PromotionType.md) |  | 
**startTime** | **Integer** | Promotion start time. Unix timestamp in seconds. Independent of campaign start time. |  [optional]
**status** | [**EntityStatus**](EntityStatus.md) |  |  [optional] [readonly]
**templateValues** | [**List&lt;PromotionTemplateValue&gt;**](PromotionTemplateValue.md) | List of values to be inserted in the promotion type-specific template. |  [optional]




