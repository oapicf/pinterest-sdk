# TermsOfService
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | The ID of the terms of service | [optional] 
**Html** | **String** | The terms of service content | [optional] 
**HasAccepted** | **Boolean** | Whether the ad account has accepted terms of service. | [optional] 
**AdAccountId** | **String** | The ID of the ad account. | [optional] 

## Examples

- Prepare the resource
```powershell
$TermsOfService = Initialize-PSOpenAPIToolsTermsOfService  -Id 2650449554526 `
 -Html example test `
 -HasAccepted true `
 -AdAccountId 549755885175
```

- Convert the resource to JSON
```powershell
$TermsOfService | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

