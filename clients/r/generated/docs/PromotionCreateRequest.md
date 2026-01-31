# openapi::PromotionCreateRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**discount_status** | **character** | Discount status based on the current time and start and end time of discount | [optional] [Enum: [OTHER, ACTIVE, PAUSED, SCHEDULED, EXPIRED]] 
**end_time** | **integer** | Promotion end time. Unix timestamp in seconds. Independent of campaign end time. | [optional] 
**external_id** | **character** | Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest. | [optional] [Max. length: 64] 
**platform_type** | **character** | The source integration platform used when creating the promotion. Currently supported values are &#39;DEFAULT&#39; and &#39;SHOPIFY&#39;. | [optional] 
**promotion_code** | **character** | Code that can be used to redeem a promotion. | [optional] 
**promotion_custom_id** | **character** | An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one. | [optional] [Max. length: 50] 
**promotion_title** | **character** | Internal name for the promotion. | 
**promotion_type** | [**PromotionType**](PromotionType.md) |  | [Enum: ] 
**start_time** | **integer** | Promotion start time. Unix timestamp in seconds. Independent of campaign start time. | [optional] 
**template_values** | [**array[PromotionTemplateValue]**](PromotionTemplateValue.md) | List of values to be inserted in the promotion type-specific template. | [optional] [Max. items: 2] [Min. items: 0] 


