# BusinessAssetPartnersGet200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**UserSingleAssetBinding[]**](UserSingleAssetBinding.md) | List of partners with permissions to the asset. | 
**Bookmark** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$BusinessAssetPartnersGet200Response = Initialize-PSOpenAPIToolsBusinessAssetPartnersGet200Response  -Items null `
 -Bookmark null
```

- Convert the resource to JSON
```powershell
$BusinessAssetPartnersGet200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

