# CatalogsRetailProductMetadata
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Availability** | [**NonNullableProductAvailabilityType**](NonNullableProductAvailabilityType.md) |  | 
**Currency** | [**NonNullableCatalogsCurrency**](NonNullableCatalogsCurrency.md) |  | 
**ItemGroupId** | **String** | The parent ID of the product. | 
**ItemId** | **String** | The user-created unique ID that represents the product. | 
**Price** | **Decimal** | The price of the product. | 
**SalePrice** | **Decimal** | The discounted price of the product. | 

## Examples

- Prepare the resource
```powershell
$CatalogsRetailProductMetadata = Initialize-PSOpenAPIToolsCatalogsRetailProductMetadata  -Availability null `
 -Currency null `
 -ItemGroupId DS0294 `
 -ItemId DS0294-L `
 -Price 24.99 `
 -SalePrice 14.99
```

- Convert the resource to JSON
```powershell
$CatalogsRetailProductMetadata | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

