# BillingProfilesResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdvertiserId** | **String** | Advertiser ID of the billing. | [optional] 
**BillingType** | **String** | Billing type of the advertiser | [optional] 
**CardType** | **String** | Type of the card. | [optional] 
**Id** | **String** | Billing ID. | [optional] 
**PaymentMethodBrand** | **String** | Brand of the payment method. | [optional] 
**Status** | **String** | Status of the billing. | [optional] 

## Examples

- Prepare the resource
```powershell
$BillingProfilesResponse = Initialize-PSOpenAPIToolsBillingProfilesResponse  -AdvertiserId 12312451231 `
 -BillingType CREDIT_CARD `
 -CardType VISA `
 -Id 12312451231 `
 -PaymentMethodBrand VISA `
 -Status INVALID
```

- Convert the resource to JSON
```powershell
$BillingProfilesResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

