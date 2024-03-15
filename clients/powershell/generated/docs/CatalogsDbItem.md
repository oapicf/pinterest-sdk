# CatalogsDbItem
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CreatedAt** | **System.DateTime** |  | [optional] 
**Id** | **String** |  | [optional] 
**UpdatedAt** | **System.DateTime** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsDbItem = Initialize-PSOpenAPIToolsCatalogsDbItem  -CreatedAt 2022-03-14T15:15:22Z `
 -Id null `
 -UpdatedAt 2022-03-14T15:16:34Z
```

- Convert the resource to JSON
```powershell
$CatalogsDbItem | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

