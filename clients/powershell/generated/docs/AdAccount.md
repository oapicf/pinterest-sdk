# AdAccount
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** |  | [optional] 
**Name** | **String** |  | [optional] 
**Owner** | [**AdAccountOwner**](AdAccountOwner.md) |  | [optional] 
**Country** | [**Country**](Country.md) |  | [optional] 
**Currency** | [**Currency**](Currency.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$AdAccount = Initialize-PSOpenAPIToolsAdAccount  -Id null `
 -Name null `
 -Owner null `
 -Country null `
 -Currency null
```

- Convert the resource to JSON
```powershell
$AdAccount | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

