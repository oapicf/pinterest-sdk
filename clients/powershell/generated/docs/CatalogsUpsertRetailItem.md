# CatalogsUpsertRetailItem
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attributes** | [**ItemAttributesRequest**](ItemAttributesRequest.md) |  | 
**ItemId** | **String** | The catalog item id in the merchant namespace | 
**Operation** | **String** |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsUpsertRetailItem = Initialize-PSOpenAPIToolsCatalogsUpsertRetailItem  -Attributes null `
 -ItemId DS0294-M `
 -Operation null
```

- Convert the resource to JSON
```powershell
$CatalogsUpsertRetailItem | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

