# PromotionCreate


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`discount_status`** | [**`*DiscountStatus`**](DiscountStatus.md) |  | [optional] [default to nothing]
**`end_time`** | **`Int64`** | Promotion end time. Unix timestamp in seconds. Independent of campaign end time. | [optional] [default to nothing]
**`external_id`** | **`String`** | Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest. | [optional] [default to nothing]
**`platform_type`** | **`String`** | The source integration platform used when creating the promotion. Currently supported values are &#39;DEFAULT&#39; and &#39;SHOPIFY&#39;. | [optional] [default to nothing]
**`promotion_code`** | **`String`** | Code that can be used to redeem a promotion. | [optional] [default to nothing]
**`promotion_custom_id`** | **`String`** | An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one. | [optional] [default to nothing]
**`promotion_title`** | **`String`** | Internal name for the promotion. | [default to nothing]
**`promotion_type`** | [**`*PromotionType`**](PromotionType.md) |  | [default to nothing]
**`start_time`** | **`Int64`** | Promotion start time. Unix timestamp in seconds. Independent of campaign start time. | [optional] [default to nothing]
**`template_values`** | [**`Vector{PromotionTemplateValue}`**](PromotionTemplateValue.md) | List of values to be inserted in the promotion type-specific template. | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


