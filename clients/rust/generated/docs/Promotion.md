# Promotion

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **String** | The Ad Account ID that this promotion belongs to. | [readonly]
**discount_status** | Option<[**models::DiscountStatus**](DiscountStatus.md)> |  | [optional]
**end_time** | Option<**i32**> | Promotion end time. Unix timestamp in seconds. Independent of campaign end time. | [optional]
**external_id** | Option<**String**> | Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest. | [optional]
**id** | **String** | Promotion ID | 
**platform_type** | Option<**String**> | The source integration platform used when creating the promotion. Currently supported values are 'DEFAULT' and 'SHOPIFY'. | [optional]
**promotion_code** | Option<**String**> | Code that can be used to redeem a promotion. | [optional]
**promotion_custom_id** | Option<**String**> | An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one. | [optional]
**promotion_title** | **String** | Internal name for the promotion. | 
**promotion_type** | [**models::PromotionType**](PromotionType.md) |  | 
**start_time** | Option<**i32**> | Promotion start time. Unix timestamp in seconds. Independent of campaign start time. | [optional]
**status** | Option<[**models::EntityStatus**](EntityStatus.md)> |  | [optional][readonly]
**template_values** | Option<[**Vec<models::PromotionTemplateValue>**](PromotionTemplateValue.md)> | List of values to be inserted in the promotion type-specific template. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


