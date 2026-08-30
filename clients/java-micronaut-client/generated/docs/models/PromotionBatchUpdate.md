

# PromotionBatchUpdate

The class is defined in **[PromotionBatchUpdate.java](../../src/main/java/org/openapitools/model/PromotionBatchUpdate.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**discountStatus** | `DiscountStatus` |  |  [optional property]
**endTime** | `Integer` | Promotion end time. Unix timestamp in seconds. Independent of campaign end time. |  [optional property]
**externalId** | `String` | Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest. |  [optional property]
**id** | `String` | Promotion ID | 
**platformType** | `String` | The source integration platform used when creating the promotion. Currently supported values are &#39;DEFAULT&#39; and &#39;SHOPIFY&#39;. |  [optional property]
**promotionCode** | `String` | Code that can be used to redeem a promotion. |  [optional property]
**promotionCustomId** | `String` | An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one. |  [optional property]
**promotionTitle** | `String` | Internal name for the promotion. |  [optional property]
**promotionType** | `PromotionType` |  |  [optional property]
**startTime** | `Integer` | Promotion start time. Unix timestamp in seconds. Independent of campaign start time. |  [optional property]
**templateValues** | [`List&lt;PromotionTemplateValue&gt;`](PromotionTemplateValue.md) | List of values to be inserted in the promotion type-specific template. |  [optional property]













