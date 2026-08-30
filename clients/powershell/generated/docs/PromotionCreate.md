# PromotionCreate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DiscountStatus** | [**DiscountStatus**](DiscountStatus.md) |  | [optional] 
**EndTime** | **Int32** | Promotion end time. Unix timestamp in seconds. Independent of campaign end time. | [optional] 
**ExternalId** | **String** | Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest. | [optional] 
**PlatformType** | **String** | The source integration platform used when creating the promotion. Currently supported values are &#39;DEFAULT&#39; and &#39;SHOPIFY&#39;. | [optional] 
**PromotionCode** | **String** | Code that can be used to redeem a promotion. | [optional] 
**PromotionCustomId** | **String** | An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one. | [optional] 
**PromotionTitle** | **String** | Internal name for the promotion. | 
**PromotionType** | [**PromotionType**](PromotionType.md) |  | 
**StartTime** | **Int32** | Promotion start time. Unix timestamp in seconds. Independent of campaign start time. | [optional] 
**TemplateValues** | [**PromotionTemplateValue[]**](PromotionTemplateValue.md) | List of values to be inserted in the promotion type-specific template. | [optional] 

## Examples

- Prepare the resource
```powershell
$PromotionCreate = Initialize-PSOpenAPIToolsPromotionCreate  -DiscountStatus null `
 -EndTime null `
 -ExternalId null `
 -PlatformType null `
 -PromotionCode null `
 -PromotionCustomId null `
 -PromotionTitle null `
 -PromotionType null `
 -StartTime null `
 -TemplateValues null
```

- Convert the resource to JSON
```powershell
$PromotionCreate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

