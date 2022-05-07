# Account
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AccountType** | **String** | Type of account | [optional] 
**ProfileImage** | **String** |  | [optional] 
**WebsiteUrl** | **String** |  | [optional] 
**Username** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$Account = Initialize-PSOpenAPIToolsAccount  -AccountType null `
 -ProfileImage null `
 -WebsiteUrl null `
 -Username null
```

- Convert the resource to JSON
```powershell
$Account | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

