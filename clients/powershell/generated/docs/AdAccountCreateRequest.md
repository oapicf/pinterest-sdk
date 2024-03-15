# AdAccountCreateRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Country** | [**Country**](Country.md) |  | [optional] 
**Name** | **String** | Ad Account name. | [optional] 
**OwnerUserId** | **String** | Advertiser&#39;s owning user ID. | [optional] 

## Examples

- Prepare the resource
```powershell
$AdAccountCreateRequest = Initialize-PSOpenAPIToolsAdAccountCreateRequest  -Country null `
 -Name ACME Tools `
 -OwnerUserId 383791336903426391
```

- Convert the resource to JSON
```powershell
$AdAccountCreateRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

