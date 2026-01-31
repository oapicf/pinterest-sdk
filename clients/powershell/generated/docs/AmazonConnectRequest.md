# AmazonConnectRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AmazonStorefrontId** | **String** | The Amazon storefront id | [optional] 
**AmazonStorefrontName** | **String** | The Amazon storefront name | 
**AmazonStorefrontUrl** | **String** | The Amazon storefront url | 
**AmazonUserId** | **String** | The Amazon user id | [optional] 
**IsAmazonAccountLinked** | **Boolean** | The Amazon account linking status | 
**OneTimePasscode** | **String** | The one time passcode for Pinterest-initiated linking requests | [optional] 
**PinterestUserId** | **String** | The Pinterest user id for Amazon-initiated linking requests | [optional] 

## Examples

- Prepare the resource
```powershell
$AmazonConnectRequest = Initialize-PSOpenAPIToolsAmazonConnectRequest  -AmazonStorefrontId null `
 -AmazonStorefrontName null `
 -AmazonStorefrontUrl null `
 -AmazonUserId null `
 -IsAmazonAccountLinked null `
 -OneTimePasscode 089aee0d-92d3-4f8f-a947-6dc016d85bf0 `
 -PinterestUserId 902057137772013006
```

- Convert the resource to JSON
```powershell
$AmazonConnectRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

