# BusinessMembersAssetAccessDeleteRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Accesses** | [**BusinessMembersAssetAccessDeleteRequestAccessesInner[]**](BusinessMembersAssetAccessDeleteRequestAccessesInner.md) | List of members asset access to be deleted | 

## Examples

- Prepare the resource
```powershell
$BusinessMembersAssetAccessDeleteRequest = Initialize-PSOpenAPIToolsBusinessMembersAssetAccessDeleteRequest  -Accesses null
```

- Convert the resource to JSON
```powershell
$BusinessMembersAssetAccessDeleteRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

