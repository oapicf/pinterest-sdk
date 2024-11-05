# BusinessAccessUserSummary
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Email** | **String** | Email of the business member/partner. | [optional] 
**Id** | **String** | Unique identifier of the business member/partner. | [optional] 
**Username** | **String** | Username of the business member/partner. | [optional] 

## Examples

- Prepare the resource
```powershell
$BusinessAccessUserSummary = Initialize-PSOpenAPIToolsBusinessAccessUserSummary  -Email business0101@business.com `
 -Id 383791336903426391 `
 -Username business0101
```

- Convert the resource to JSON
```powershell
$BusinessAccessUserSummary | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

