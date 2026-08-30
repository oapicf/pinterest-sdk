# BillingProfilesResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdvertiserId** | **String** | Advertiser ID of the billing. | [optional] 
**BillingType** | [**BillingType**](BillingType.md) | Billing type of the advertiser | [optional] 
**CardType** | [**BillingProfileCardType**](BillingProfileCardType.md) | Type of the card. | [optional] 
**Id** | **String** | Billing ID. | [optional] 
**PaymentMethodBrand** | [**BillingProfilePaymentMethodBrand**](BillingProfilePaymentMethodBrand.md) | Brand of the payment method. | [optional] 
**Status** | [**BillingProfileStatus**](BillingProfileStatus.md) | Status of the billing. | [optional] 

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

