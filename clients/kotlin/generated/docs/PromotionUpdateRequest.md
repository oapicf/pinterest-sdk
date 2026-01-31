
# PromotionUpdateRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** | Promotion ID |  |
| **discountStatus** | [**inline**](#DiscountStatus) | Discount status based on the current time and start and end time of discount |  [optional] |
| **endTime** | **kotlin.Int** | Promotion end time. Unix timestamp in seconds. Independent of campaign end time. |  [optional] |
| **externalId** | **kotlin.String** | Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest. |  [optional] |
| **platformType** | **kotlin.String** | The source integration platform used when creating the promotion. Currently supported values are &#39;DEFAULT&#39; and &#39;SHOPIFY&#39;. |  [optional] |
| **promotionCode** | **kotlin.String** | Code that can be used to redeem a promotion. |  [optional] |
| **promotionCustomId** | **kotlin.String** | An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one. |  [optional] |
| **promotionTitle** | **kotlin.String** | Internal name for the promotion. |  [optional] |
| **promotionType** | [**PromotionType**](PromotionType.md) |  |  [optional] |
| **startTime** | **kotlin.Int** | Promotion start time. Unix timestamp in seconds. Independent of campaign start time. |  [optional] |
| **templateValues** | [**kotlin.collections.List&lt;PromotionTemplateValue&gt;**](PromotionTemplateValue.md) | List of values to be inserted in the promotion type-specific template. |  [optional] |
| **status** | [**EntityStatus**](EntityStatus.md) |  |  [optional] |


<a id="DiscountStatus"></a>
## Enum: discount_status
| Name | Value |
| ---- | ----- |
| discountStatus | OTHER, ACTIVE, PAUSED, SCHEDULED, EXPIRED |



