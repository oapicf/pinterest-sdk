# UserWebsite
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | **String** | Status of the verification process | [optional] [readonly] 
**VerifiedAt** | **String** | UTC timestamp when the verification happened - sometimes missing | [optional] [readonly] 
**Website** | **String** | Website with path or domain only | [optional] 

## Examples

- Prepare the resource
```powershell
$UserWebsite = Initialize-PSOpenAPIToolsUserWebsite  -Status null `
 -VerifiedAt null `
 -Website null
```

- Convert the resource to JSON
```powershell
$UserWebsite | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

