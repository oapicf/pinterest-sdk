# AdsCreditRedeemRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OfferCodeHash** | **String** | Takes in a SHA256 hash of the offerCode. | 
**ValidateOnly** | **Boolean** | If true, only validate if we can redeem offer code. Otherwise it will actually apply the offer code to the account | 

## Examples

- Prepare the resource
```powershell
$AdsCreditRedeemRequest = Initialize-PSOpenAPIToolsAdsCreditRedeemRequest  -OfferCodeHash 138e9e0ff7e38cf511b880975eb574c09aa9d5e1657590ab0431040da68caa67 `
 -ValidateOnly true
```

- Convert the resource to JSON
```powershell
$AdsCreditRedeemRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

