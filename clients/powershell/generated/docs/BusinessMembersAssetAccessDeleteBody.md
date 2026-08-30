# BusinessMembersAssetAccessDeleteBody
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Accesses** | [**DeleteMemberAssetAccessItem[]**](DeleteMemberAssetAccessItem.md) | List of members asset access to be deleted | 

## Examples

- Prepare the resource
```powershell
$BusinessMembersAssetAccessDeleteBody = Initialize-PSOpenAPIToolsBusinessMembersAssetAccessDeleteBody  -Accesses null
```

- Convert the resource to JSON
```powershell
$BusinessMembersAssetAccessDeleteBody | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

