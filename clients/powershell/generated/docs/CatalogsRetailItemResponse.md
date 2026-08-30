# CatalogsRetailItemResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attributes** | [**ItemAttributes**](ItemAttributes.md) |  | [optional] 
**CatalogType** | **String** |  | 
**ItemId** | **String** | The catalog retail item id in the merchant namespace | [optional] 
**ItemResponseKind** | **String** | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. | 
**Pins** | [**Pin[]**](Pin.md) | The pins mapped to the item | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsRetailItemResponse = Initialize-PSOpenAPIToolsCatalogsRetailItemResponse  -Attributes null `
 -CatalogType null `
 -ItemId DS0294-M `
 -ItemResponseKind null `
 -Pins null
```

- Convert the resource to JSON
```powershell
$CatalogsRetailItemResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

