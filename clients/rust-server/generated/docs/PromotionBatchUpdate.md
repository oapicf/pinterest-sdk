# PromotionBatchUpdate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**discount_status** | [***models::DiscountStatus**](DiscountStatus.md) |  | [optional] [default to None]
**end_time** | **i32** | Promotion end time. Unix timestamp in seconds. Independent of campaign end time. | [optional] [default to None]
**external_id** | **String** | Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest. | [optional] [default to None]
**id** | **String** | Promotion ID | 
**platform_type** | **String** | The source integration platform used when creating the promotion. Currently supported values are 'DEFAULT' and 'SHOPIFY'. | [optional] [default to None]
**promotion_code** | **String** | Code that can be used to redeem a promotion. | [optional] [default to None]
**promotion_custom_id** | **String** | An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one. | [optional] [default to None]
**promotion_title** | **String** | Internal name for the promotion. | [optional] [default to None]
**promotion_type** | [***models::PromotionType**](PromotionType.md) |  | [optional] [default to None]
**start_time** | **i32** | Promotion start time. Unix timestamp in seconds. Independent of campaign start time. | [optional] [default to None]
**template_values** | [**Vec<models::PromotionTemplateValue>**](PromotionTemplateValue.md) | List of values to be inserted in the promotion type-specific template. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


