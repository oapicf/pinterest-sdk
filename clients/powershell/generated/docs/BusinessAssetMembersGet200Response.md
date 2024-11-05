# BusinessAssetMembersGet200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**UserSingleAssetBinding[]**](UserSingleAssetBinding.md) | List of members with permissions to the asset. | 
**Bookmark** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$BusinessAssetMembersGet200Response = Initialize-PSOpenAPIToolsBusinessAssetMembersGet200Response  -Items null `
 -Bookmark null
```

- Convert the resource to JSON
```powershell
$BusinessAssetMembersGet200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

