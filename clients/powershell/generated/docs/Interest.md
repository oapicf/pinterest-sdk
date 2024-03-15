# Interest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CanonicalUrl** | **String** |  | [optional] 
**Id** | **String** |  | [optional] 
**Key** | **String** |  | [optional] 
**Name** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$Interest = Initialize-PSOpenAPIToolsInterest  -CanonicalUrl null `
 -Id 903972677830 `
 -Key man cave `
 -Name Man cave
```

- Convert the resource to JSON
```powershell
$Interest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

