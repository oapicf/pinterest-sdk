# UpdatePartnerAssetAccessBody
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Accesses** | [**UpdatePartnerAssetAccessItem[]**](UpdatePartnerAssetAccessItem.md) | List of partner asset accesses to assign or update. | 

## Examples

- Prepare the resource
```powershell
$UpdatePartnerAssetAccessBody = Initialize-PSOpenAPIToolsUpdatePartnerAssetAccessBody  -Accesses null
```

- Convert the resource to JSON
```powershell
$UpdatePartnerAssetAccessBody | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

