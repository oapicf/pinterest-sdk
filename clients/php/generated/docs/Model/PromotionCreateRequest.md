# # PromotionCreateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**discount_status** | **string** | Discount status based on the current time and start and end time of discount | [optional]
**end_time** | **int** | Promotion end time. Unix timestamp in seconds. Independent of campaign end time. | [optional]
**external_id** | **string** | Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest. | [optional]
**platform_type** | **string** | The source integration platform used when creating the promotion. Currently supported values are &#39;DEFAULT&#39; and &#39;SHOPIFY&#39;. | [optional]
**promotion_code** | **string** | Code that can be used to redeem a promotion. | [optional]
**promotion_custom_id** | **string** | An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one. | [optional]
**promotion_title** | **string** | Internal name for the promotion. |
**promotion_type** | [**\OpenAPI\Client\Model\PromotionType**](PromotionType.md) |  |
**start_time** | **int** | Promotion start time. Unix timestamp in seconds. Independent of campaign start time. | [optional]
**template_values** | [**\OpenAPI\Client\Model\PromotionTemplateValue[]**](PromotionTemplateValue.md) | List of values to be inserted in the promotion type-specific template. | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
