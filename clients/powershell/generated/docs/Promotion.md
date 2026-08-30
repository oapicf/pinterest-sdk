# Promotion
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | **String** | The Ad Account ID that this promotion belongs to. | [readonly] 
**DiscountStatus** | [**DiscountStatus**](DiscountStatus.md) |  | [optional] 
**EndTime** | **Int32** | Promotion end time. Unix timestamp in seconds. Independent of campaign end time. | [optional] 
**ExternalId** | **String** | Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest. | [optional] 
**Id** | **String** | Promotion ID | 
**PlatformType** | **String** | The source integration platform used when creating the promotion. Currently supported values are &#39;DEFAULT&#39; and &#39;SHOPIFY&#39;. | [optional] 
**PromotionCode** | **String** | Code that can be used to redeem a promotion. | [optional] 
**PromotionCustomId** | **String** | An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one. | [optional] 
**PromotionTitle** | **String** | Internal name for the promotion. | 
**PromotionType** | [**PromotionType**](PromotionType.md) |  | 
**StartTime** | **Int32** | Promotion start time. Unix timestamp in seconds. Independent of campaign start time. | [optional] 
**Status** | [**EntityStatus**](EntityStatus.md) |  | [optional] [readonly] 
**TemplateValues** | [**PromotionTemplateValue[]**](PromotionTemplateValue.md) | List of values to be inserted in the promotion type-specific template. | [optional] 

## Examples

- Prepare the resource
```powershell
$Promotion = Initialize-PSOpenAPIToolsPromotion  -AdAccountId null `
 -DiscountStatus null `
 -EndTime null `
 -ExternalId null `
 -Id null `
 -PlatformType null `
 -PromotionCode null `
 -PromotionCustomId null `
 -PromotionTitle null `
 -PromotionType null `
 -StartTime null `
 -Status null `
 -TemplateValues null
```

- Convert the resource to JSON
```powershell
$Promotion | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

