# AdAccountCreate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Country** | [**Country**](Country.md) |  | [optional] 
**Currency** | [**Currency**](Currency.md) |  | [optional] 
**Name** | **String** | Ad account name. | [optional] 
**OwnerUserId** | **String** | Advertiser&#39;s owning user ID. | [optional] 

## Examples

- Prepare the resource
```powershell
$AdAccountCreate = Initialize-PSOpenAPIToolsAdAccountCreate  -Country null `
 -Currency null `
 -Name null `
 -OwnerUserId null
```

- Convert the resource to JSON
```powershell
$AdAccountCreate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

