# BillingProfilesResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | Billing ID. | [optional] 
**CardType** | **String** | Type of the card. | [optional] 
**Status** | **String** | Status of the billing. | [optional] 
**AdvertiserId** | **String** | Advertiser ID of the billing. | [optional] 
**PaymentMethodBrand** | **String** | Brand of the payment method. | [optional] 

## Examples

- Prepare the resource
```powershell
$BillingProfilesResponse = Initialize-PSOpenAPIToolsBillingProfilesResponse  -Id 12312451231 `
 -CardType VISA `
 -Status INVALID `
 -AdvertiserId 12312451231 `
 -PaymentMethodBrand VISA
```

- Convert the resource to JSON
```powershell
$BillingProfilesResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

