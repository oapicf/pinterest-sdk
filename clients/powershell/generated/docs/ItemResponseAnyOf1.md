# ItemResponseAnyOf1
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | [**CatalogsType**](CatalogsType.md) |  | 
**ItemId** | **String** | The catalog item id in the merchant namespace | [optional] 
**Errors** | [**ItemValidationEvent[]**](ItemValidationEvent.md) | Array with the errors for the item id requested | [optional] 
**HotelId** | **String** | The catalog hotel id in the merchant namespace | [optional] 

## Examples

- Prepare the resource
```powershell
$ItemResponseAnyOf1 = Initialize-PSOpenAPIToolsItemResponseAnyOf1  -CatalogType null `
 -ItemId DS0294-M `
 -Errors null `
 -HotelId DS0294-M
```

- Convert the resource to JSON
```powershell
$ItemResponseAnyOf1 | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

