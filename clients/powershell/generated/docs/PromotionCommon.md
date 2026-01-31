# PromotionCommon
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DiscountStatus** | **String** | Discount status based on the current time and start and end time of discount | [optional] 
**EndTime** | **Int32** | Promotion end time. Unix timestamp in seconds. Independent of campaign end time. | [optional] 
**ExternalId** | **String** | Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest. | [optional] 
**PlatformType** | **String** | The source integration platform used when creating the promotion. Currently supported values are &#39;DEFAULT&#39; and &#39;SHOPIFY&#39;. | [optional] 
**PromotionCode** | **String** | Code that can be used to redeem a promotion. | [optional] 
**PromotionCustomId** | **String** | An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one. | [optional] 
**PromotionTitle** | **String** | Internal name for the promotion. | [optional] 
**PromotionType** | [**PromotionType**](PromotionType.md) |  | [optional] 
**StartTime** | **Int32** | Promotion start time. Unix timestamp in seconds. Independent of campaign start time. | [optional] 
**TemplateValues** | [**PromotionTemplateValue[]**](PromotionTemplateValue.md) | List of values to be inserted in the promotion type-specific template. | [optional] 

## Examples

- Prepare the resource
```powershell
$PromotionCommon = Initialize-PSOpenAPIToolsPromotionCommon  -DiscountStatus ACTIVE `
 -EndTime 1678003860 `
 -ExternalId abc `
 -PlatformType DEFAULT `
 -PromotionCode blackfriday10 `
 -PromotionCustomId freeshipping_2025 `
 -PromotionTitle Black Friday 10% off `
 -PromotionType null `
 -StartTime 1677003860 `
 -TemplateValues null
```

- Convert the resource to JSON
```powershell
$PromotionCommon | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

