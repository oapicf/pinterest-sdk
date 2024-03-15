# AdAccountCreateSubscriptionResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | Subscription ID. | [optional] 
**CryptographicKey** | **String** | Base64 encoded key for client to decrypt lead data. | [optional] 
**CryptographicAlgorithm** | **String** | Lead data encryption algorithm. | [optional] 
**CreatedTime** | **Int32** | Subscription creation time. Unix timestamp in milliseconds. | [optional] 

## Examples

- Prepare the resource
```powershell
$AdAccountCreateSubscriptionResponse = Initialize-PSOpenAPIToolsAdAccountCreateSubscriptionResponse  -Id 8078432025948590686 `
 -CryptographicKey ucvxbV2Tdss0vNeYsdh4Qfa/1Khm2b0PqXvXeTTZh54 `
 -CryptographicAlgorithm AES-256-GCM `
 -CreatedTime 1699209842000
```

- Convert the resource to JSON
```powershell
$AdAccountCreateSubscriptionResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

