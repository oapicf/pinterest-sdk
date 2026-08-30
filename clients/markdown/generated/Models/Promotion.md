# Promotion
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String** | The Ad Account ID that this promotion belongs to. | [default to null] |
| **discount\_status** | [**DiscountStatus**](DiscountStatus.md) |  | [optional] [default to null] |
| **end\_time** | **Integer** | Promotion end time. Unix timestamp in seconds. Independent of campaign end time. | [optional] [default to null] |
| **external\_id** | **String** | Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest. | [optional] [default to null] |
| **id** | **String** | Promotion ID | [default to null] |
| **platform\_type** | **String** | The source integration platform used when creating the promotion. Currently supported values are &#39;DEFAULT&#39; and &#39;SHOPIFY&#39;. | [optional] [default to null] |
| **promotion\_code** | **String** | Code that can be used to redeem a promotion. | [optional] [default to null] |
| **promotion\_custom\_id** | **String** | An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one. | [optional] [default to null] |
| **promotion\_title** | **String** | Internal name for the promotion. | [default to null] |
| **promotion\_type** | [**PromotionType**](PromotionType.md) |  | [default to null] |
| **start\_time** | **Integer** | Promotion start time. Unix timestamp in seconds. Independent of campaign start time. | [optional] [default to null] |
| **status** | [**EntityStatus**](EntityStatus.md) |  | [optional] [default to null] |
| **template\_values** | [**List**](PromotionTemplateValue.md) | List of values to be inserted in the promotion type-specific template. | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

