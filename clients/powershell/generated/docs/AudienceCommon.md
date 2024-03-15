# AudienceCommon
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | **String** | Ad account ID. | [optional] 
**Name** | **String** | Audience name. | [optional] 
**Rule** | [**AudienceRule**](AudienceRule.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$AudienceCommon = Initialize-PSOpenAPIToolsAudienceCommon  -AdAccountId 549755885175 `
 -Name string `
 -Rule null
```

- Convert the resource to JSON
```powershell
$AudienceCommon | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

