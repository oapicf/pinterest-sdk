# CatalogsFeedProcessingResult
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CreatedAt** | **System.DateTime** |  | 
**Id** | **String** |  | 
**UpdatedAt** | **System.DateTime** |  | 
**IngestionDetails** | [**CatalogsFeedIngestionDetails**](CatalogsFeedIngestionDetails.md) |  | 
**Status** | [**CatalogsFeedProcessingStatus**](CatalogsFeedProcessingStatus.md) |  | 
**ProductCounts** | [**CatalogsFeedProductCounts**](CatalogsFeedProductCounts.md) |  | 
**ValidationDetails** | [**CatalogsFeedValidationDetails**](CatalogsFeedValidationDetails.md) |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsFeedProcessingResult = Initialize-PSOpenAPIToolsCatalogsFeedProcessingResult  -CreatedAt 2022-03-14T15:15:22Z `
 -Id null `
 -UpdatedAt 2022-03-14T15:16:34Z `
 -IngestionDetails null `
 -Status null `
 -ProductCounts null `
 -ValidationDetails null
```

- Convert the resource to JSON
```powershell
$CatalogsFeedProcessingResult | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

