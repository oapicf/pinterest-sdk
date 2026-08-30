# promotion_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **char \*** | The Ad Account ID that this promotion belongs to. | [readonly] 
**discount_status** | **discount_status_t \*** |  | [optional] 
**end_time** | **int** | Promotion end time. Unix timestamp in seconds. Independent of campaign end time. | [optional] 
**external_id** | **char \*** | Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest. | [optional] 
**id** | **char \*** | Promotion ID | 
**platform_type** | **char \*** | The source integration platform used when creating the promotion. Currently supported values are &#39;DEFAULT&#39; and &#39;SHOPIFY&#39;. | [optional] 
**promotion_code** | **char \*** | Code that can be used to redeem a promotion. | [optional] 
**promotion_custom_id** | **char \*** | An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one. | [optional] 
**promotion_title** | **char \*** | Internal name for the promotion. | 
**promotion_type** | **promotion_type_t \*** |  | 
**start_time** | **int** | Promotion start time. Unix timestamp in seconds. Independent of campaign start time. | [optional] 
**status** | **entity_status_t \*** |  | [optional] [readonly] 
**template_values** | [**list_t**](promotion_template_value.md) \* | List of values to be inserted in the promotion type-specific template. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


