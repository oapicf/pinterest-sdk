# AudienceCreateRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | **String** | Ad account ID. | [optional] 
**Name** | **String** | Audience name. | 
**Rule** | [**AudienceRule**](AudienceRule.md) |  | 
**Description** | **String** | Audience description. | [optional] 
**AudienceType** | [**AudienceCreateRequest1AudienceType**](AudienceCreateRequest1AudienceType.md) |  | 

## Examples

- Prepare the resource
```powershell
$AudienceCreateRequest = Initialize-PSOpenAPIToolsAudienceCreateRequest  -AdAccountId 549755885175 `
 -Name string `
 -Rule null `
 -Description string `
 -AudienceType null
```

- Convert the resource to JSON
```powershell
$AudienceCreateRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

