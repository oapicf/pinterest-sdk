# CatalogsRetailProductMetadata
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ItemId** | **String** | The user-created unique ID that represents the product. | 
**ItemGroupId** | **String** | The parent ID of the product. | 
**Availability** | [**NonNullableProductAvailabilityType**](NonNullableProductAvailabilityType.md) |  | 
**Price** | **Decimal** | The price of the product. | 
**SalePrice** | **Decimal** | The discounted price of the product. | 
**Currency** | [**NonNullableCatalogsCurrency**](NonNullableCatalogsCurrency.md) |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsRetailProductMetadata = Initialize-PSOpenAPIToolsCatalogsRetailProductMetadata  -ItemId DS0294-L `
 -ItemGroupId DS0294 `
 -Availability null `
 -Price 24.99 `
 -SalePrice 14.99 `
 -Currency null
```

- Convert the resource to JSON
```powershell
$CatalogsRetailProductMetadata | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

