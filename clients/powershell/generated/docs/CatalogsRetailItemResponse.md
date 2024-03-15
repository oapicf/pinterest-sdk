# CatalogsRetailItemResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | [**CatalogsType**](CatalogsType.md) |  | 
**ItemId** | **String** | The catalog retail item id in the merchant namespace | [optional] 
**Pins** | [**Pin[]**](Pin.md) | The pins mapped to the item | [optional] 
**Attributes** | [**ItemAttributes**](ItemAttributes.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsRetailItemResponse = Initialize-PSOpenAPIToolsCatalogsRetailItemResponse  -CatalogType null `
 -ItemId DS0294-M `
 -Pins null `
 -Attributes null
```

- Convert the resource to JSON
```powershell
$CatalogsRetailItemResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

