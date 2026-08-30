# AdsCreditDiscountsResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Active** | **Boolean** | True if the offer code is currently active. | [optional] 
**AdvertiserId** | **String** | Advertiser ID the offer was applied to. | [optional] 
**DiscountCurrency** | **String** | Currency value for the discount. | [optional] 
**DiscountInMicroCurrency** | **Decimal** | The discount applied in the offer&#39;s currency value. | [optional] 
**DiscountType** | [**AdsCreditDiscountType**](AdsCreditDiscountType.md) | The type of discount of this credit | [optional] 
**RemainingDiscountInMicroCurrency** | **Decimal** | The credits left to spend. | [optional] 
**Title** | **String** | Human readable title of the offer code. | [optional] 

## Examples

- Prepare the resource
```powershell
$AdsCreditDiscountsResponse = Initialize-PSOpenAPIToolsAdsCreditDiscountsResponse  -Active true `
 -AdvertiserId 12312451231 `
 -DiscountCurrency USD `
 -DiscountInMicroCurrency 125000000 `
 -DiscountType null `
 -RemainingDiscountInMicroCurrency 125000000 `
 -Title Ads Credits
```

- Convert the resource to JSON
```powershell
$AdsCreditDiscountsResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

