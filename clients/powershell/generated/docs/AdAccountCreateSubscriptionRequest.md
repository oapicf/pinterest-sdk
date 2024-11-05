# AdAccountCreateSubscriptionRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**WebhookUrl** | **String** | Standard HTTPS webhook URL. | 
**LeadFormId** | **String** | Lead form ID. | [optional] 
**PartnerAccessToken** | **String** | Partner access token. Only for clients that requires authentication. We recommend to avoid this param. | [optional] 
**PartnerRefreshToken** | **String** | Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param. | [optional] 
**PartnerMetadata** | [**AdAccountCreateSubscriptionRequestPartnerMetadata**](AdAccountCreateSubscriptionRequestPartnerMetadata.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$AdAccountCreateSubscriptionRequest = Initialize-PSOpenAPIToolsAdAccountCreateSubscriptionRequest  -WebhookUrl https://webhook.example.com/xyz `
 -LeadFormId 383791336903426390 `
 -PartnerAccessToken null `
 -PartnerRefreshToken null `
 -PartnerMetadata null
```

- Convert the resource to JSON
```powershell
$AdAccountCreateSubscriptionRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

