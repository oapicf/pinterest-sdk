# PROMOTION_RESPONSE

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**discount_status** | [**STRING_32**](STRING_32.md) | Discount status based on the current time and start and end time of discount | [optional] [default to null]
**end_time** | **INTEGER_32** | Promotion end time. Unix timestamp in seconds. Independent of campaign end time. | [optional] [default to null]
**external_id** | [**STRING_32**](STRING_32.md) | Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest. | [optional] [default to null]
**platform_type** | [**STRING_32**](STRING_32.md) | The source integration platform used when creating the promotion. Currently supported values are &#39;DEFAULT&#39; and &#39;SHOPIFY&#39;. | [optional] [default to null]
**promotion_code** | [**STRING_32**](STRING_32.md) | Code that can be used to redeem a promotion. | [optional] [default to null]
**promotion_custom_id** | [**STRING_32**](STRING_32.md) | An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one. | [optional] [default to null]
**promotion_title** | [**STRING_32**](STRING_32.md) | Internal name for the promotion. | [optional] [default to null]
**promotion_type** | [**PROMOTION_TYPE**](PromotionType.md) |  | [optional] [default to null]
**start_time** | **INTEGER_32** | Promotion start time. Unix timestamp in seconds. Independent of campaign start time. | [optional] [default to null]
**template_values** | [**LIST [PROMOTION_TEMPLATE_VALUE]**](PromotionTemplateValue.md) | List of values to be inserted in the promotion type-specific template. | [optional] [default to null]
**ad_account_id** | [**STRING_32**](STRING_32.md) | The Ad Account ID that this promotion belongs to. | [optional] [default to null]
**id** | [**STRING_32**](STRING_32.md) | Promotion ID | [optional] [default to null]
**status** | [**ENTITY_STATUS**](EntityStatus.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


