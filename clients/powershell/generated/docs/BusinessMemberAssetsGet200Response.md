# BusinessMemberAssetsGet200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Bookmark** | **String** |  | [optional] 
**Items** | [**AssetIdPermissions[]**](AssetIdPermissions.md) | List asset permissions the given member was granted. | 

## Examples

- Prepare the resource
```powershell
$BusinessMemberAssetsGet200Response = Initialize-PSOpenAPIToolsBusinessMemberAssetsGet200Response  -Bookmark null `
 -Items null
```

- Convert the resource to JSON
```powershell
$BusinessMemberAssetsGet200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

