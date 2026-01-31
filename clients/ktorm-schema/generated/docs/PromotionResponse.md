
# Table `PromotionResponse`
(mapped from: PromotionResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**discountStatus** | discount_status | text |  | [**discount_status**](#DiscountStatus) | Discount status based on the current time and start and end time of discount |  [optional]
**endTime** | end_time | int |  | **kotlin.Int** | Promotion end time. Unix timestamp in seconds. Independent of campaign end time. |  [optional]
**externalId** | external_id | text |  | **kotlin.String** | Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest. |  [optional]
**platformType** | platform_type | text |  | **kotlin.String** | The source integration platform used when creating the promotion. Currently supported values are &#39;DEFAULT&#39; and &#39;SHOPIFY&#39;. |  [optional]
**promotionCode** | promotion_code | text |  | **kotlin.String** | Code that can be used to redeem a promotion. |  [optional]
**promotionCustomId** | promotion_custom_id | text |  | **kotlin.String** | An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one. |  [optional]
**promotionTitle** | promotion_title | text |  | **kotlin.String** | Internal name for the promotion. |  [optional]
**promotionType** | promotion_type | long |  | [**PromotionType**](PromotionType.md) |  |  [optional] [foreignkey]
**startTime** | start_time | int |  | **kotlin.Int** | Promotion start time. Unix timestamp in seconds. Independent of campaign start time. |  [optional]
**templateValues** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PromotionTemplateValue&gt;**](PromotionTemplateValue.md) | List of values to be inserted in the promotion type-specific template. |  [optional]
**adAccountId** | ad_account_id | text |  | **kotlin.String** | The Ad Account ID that this promotion belongs to. |  [optional]
**id** | id | text PRIMARY KEY |  | **kotlin.String** | Promotion ID |  [optional]
**status** | status | long |  | [**EntityStatus**](EntityStatus.md) |  |  [optional] [foreignkey]











# **Table `PromotionResponsePromotionTemplateValue`**
(mapped from: PromotionResponsePromotionTemplateValue)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
promotionResponse | promotionResponse | long | | kotlin.Long | Primary Key | *one*
promotionTemplateValue | promotionTemplateValue | long | | kotlin.Long | Foreign Key | *many*






