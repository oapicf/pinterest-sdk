# AdsCreditDiscountsResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Active** | **Boolean** | True if the offer code is currently active. | [optional] 
**AdvertiserId** | **String** | Advertiser ID the offer was applied to. | [optional] 
**DiscountType** | **String** | The type of discount of this credit | [optional] 
**DiscountInMicroCurrency** | **Decimal** | The discount applied in the offer’s currency value. | [optional] 
**DiscountCurrency** | **String** | Currency value for the discount. | [optional] 
**Title** | **String** | Human readable title of the offer code. | [optional] 
**RemainingDiscountInMicroCurrency** | **Decimal** | The credits left to spend. | [optional] 

## Examples

- Prepare the resource
```powershell
$AdsCreditDiscountsResponse = Initialize-PSOpenAPIToolsAdsCreditDiscountsResponse  -Active true `
 -AdvertiserId 12312451231 `
 -DiscountType null `
 -DiscountInMicroCurrency 125000000 `
 -DiscountCurrency USD `
 -Title Ads Credits `
 -RemainingDiscountInMicroCurrency 125000000
```

- Convert the resource to JSON
```powershell
$AdsCreditDiscountsResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

