# PromotionResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**discount_status** | Option<**String**> | Discount status based on the current time and start and end time of discount | [optional]
**end_time** | Option<**i32**> | Promotion end time. Unix timestamp in seconds. Independent of campaign end time. | [optional]
**external_id** | Option<**String**> | Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest. | [optional]
**platform_type** | Option<**String**> | The source integration platform used when creating the promotion. Currently supported values are 'DEFAULT' and 'SHOPIFY'. | [optional]
**promotion_code** | Option<**String**> | Code that can be used to redeem a promotion. | [optional]
**promotion_custom_id** | Option<**String**> | An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one. | [optional]
**promotion_title** | Option<**String**> | Internal name for the promotion. | [optional]
**promotion_type** | Option<[**models::PromotionType**](PromotionType.md)> |  | [optional]
**start_time** | Option<**i32**> | Promotion start time. Unix timestamp in seconds. Independent of campaign start time. | [optional]
**template_values** | Option<[**Vec<models::PromotionTemplateValue>**](PromotionTemplateValue.md)> | List of values to be inserted in the promotion type-specific template. | [optional]
**ad_account_id** | Option<**String**> | The Ad Account ID that this promotion belongs to. | [optional]
**id** | Option<**String**> | Promotion ID | [optional]
**status** | Option<[**models::EntityStatus**](EntityStatus.md)> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


