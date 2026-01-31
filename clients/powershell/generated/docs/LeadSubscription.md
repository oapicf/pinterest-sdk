# LeadSubscription
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | **String** | The Ad Account ID that this lead form belongs to. | [optional] 
**ApiVersion** | **String** | API version. | [optional] 
**CreatedTime** | **Int32** | Subscription creation time. Unix timestamp in milliseconds. | [optional] 
**CryptographicAlgorithm** | **String** | Lead data encryption algorithm. | [optional] 
**CryptographicKey** | **String** | Base64 encoded key for client to decrypt lead data. | [optional] 
**Id** | **String** | Subscription ID. | [optional] 
**LeadFormId** | **String** | Lead form ID. | [optional] 
**UserAccountId** | **String** | User account used to subscribe lead data. | [optional] 
**WebhookUrl** | **String** | Standard HTTPS webhook URL. | [optional] 

## Examples

- Prepare the resource
```powershell
$LeadSubscription = Initialize-PSOpenAPIToolsLeadSubscription  -AdAccountId null `
 -ApiVersion null `
 -CreatedTime null `
 -CryptographicAlgorithm null `
 -CryptographicKey null `
 -Id null `
 -LeadFormId null `
 -UserAccountId null `
 -WebhookUrl null
```

- Convert the resource to JSON
```powershell
$LeadSubscription | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

