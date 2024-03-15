# CatalogsDeleteRetailItem
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ItemId** | **String** | The catalog item id in the merchant namespace | 
**Operation** | **String** |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsDeleteRetailItem = Initialize-PSOpenAPIToolsCatalogsDeleteRetailItem  -ItemId DS0294-M `
 -Operation null
```

- Convert the resource to JSON
```powershell
$CatalogsDeleteRetailItem | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

