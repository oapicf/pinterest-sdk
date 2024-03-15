# AdAccount
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** |  | [optional] 
**Name** | **String** |  | [optional] 
**Owner** | [**AdAccountOwner**](AdAccountOwner.md) |  | [optional] 
**Country** | [**Country**](Country.md) |  | [optional] 
**Currency** | [**Currency**](Currency.md) |  | [optional] 
**Permissions** | [**BusinessAccessRole[]**](BusinessAccessRole.md) |  | [optional] 
**CreatedTime** | **Int32** | Creation time. Unix timestamp in seconds. | [optional] 
**UpdatedTime** | **Int32** | Last update time. Unix timestamp in seconds. | [optional] 

## Examples

- Prepare the resource
```powershell
$AdAccount = Initialize-PSOpenAPIToolsAdAccount  -Id null `
 -Name null `
 -Owner null `
 -Country null `
 -Currency null `
 -Permissions null `
 -CreatedTime 1451431341 `
 -UpdatedTime 1451431341
```

- Convert the resource to JSON
```powershell
$AdAccount | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

