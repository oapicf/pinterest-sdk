# AdAccountCreateSubscriptionRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**LeadFormId** | **String** | Lead form ID. | [optional] 
**PartnerAccessToken** | **String** | Partner access token. Only for clients that requires authentication. We recommend to avoid this param. | [optional] 
**PartnerMetadata** | [**AdAccountCreateSubscriptionRequestPartnerMetadata**](AdAccountCreateSubscriptionRequestPartnerMetadata.md) |  | [optional] 
**PartnerRefreshToken** | **String** | Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param. | [optional] 
**WebhookUrl** | **String** | Standard HTTPS webhook URL. | 

## Examples

- Prepare the resource
```powershell
$AdAccountCreateSubscriptionRequest = Initialize-PSOpenAPIToolsAdAccountCreateSubscriptionRequest  -LeadFormId 383791336903426390 `
 -PartnerAccessToken null `
 -PartnerMetadata null `
 -PartnerRefreshToken null `
 -WebhookUrl https://webhook.example.com/xyz
```

- Convert the resource to JSON
```powershell
$AdAccountCreateSubscriptionRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

