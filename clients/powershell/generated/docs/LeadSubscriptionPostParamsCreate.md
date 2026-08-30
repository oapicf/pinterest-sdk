# LeadSubscriptionPostParamsCreate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**LeadFormId** | **String** | Lead form ID. | [optional] 
**WebhookUrl** | **String** | Standard HTTPS webhook URL. | 
**PartnerAccessToken** | **String** | Partner access token. Only for clients that requires authentication. We recommend to avoid this param. | [optional] 
**PartnerMetadata** | [**PartnerMetadata**](PartnerMetadata.md) | Partner metadata. Only for clients that requires special handling. We recommend to avoid this param. | [optional] 
**PartnerRefreshToken** | **String** | Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param. | [optional] 

## Examples

- Prepare the resource
```powershell
$LeadSubscriptionPostParamsCreate = Initialize-PSOpenAPIToolsLeadSubscriptionPostParamsCreate  -LeadFormId null `
 -WebhookUrl null `
 -PartnerAccessToken null `
 -PartnerMetadata null `
 -PartnerRefreshToken null
```

- Convert the resource to JSON
```powershell
$LeadSubscriptionPostParamsCreate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

