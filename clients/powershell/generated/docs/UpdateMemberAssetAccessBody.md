# UpdateMemberAssetAccessBody
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Accesses** | [**UpdateMemberAssetAccessItem[]**](UpdateMemberAssetAccessItem.md) | List of member asset accesses to assign or update. | 

## Examples

- Prepare the resource
```powershell
$UpdateMemberAssetAccessBody = Initialize-PSOpenAPIToolsUpdateMemberAssetAccessBody  -Accesses null
```

- Convert the resource to JSON
```powershell
$UpdateMemberAssetAccessBody | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

