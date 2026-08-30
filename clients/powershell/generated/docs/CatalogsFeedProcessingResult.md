# CatalogsFeedProcessingResult
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CreatedAt** | **System.DateTime** |  | [readonly] 
**Id** | **String** | ID of the feed processing result. | 
**IngestionDetails** | [**CatalogsFeedIngestionDetails**](CatalogsFeedIngestionDetails.md) |  | 
**ProductCounts** | [**CatalogsFeedProductCounts**](CatalogsFeedProductCounts.md) |  | 
**Status** | [**CatalogsFeedProcessingStatus**](CatalogsFeedProcessingStatus.md) |  | 
**UpdatedAt** | **System.DateTime** |  | [readonly] 
**ValidationDetails** | [**CatalogsFeedValidationDetails**](CatalogsFeedValidationDetails.md) |  | 
**VideoCounts** | [**CatalogsFeedVideoCounts**](CatalogsFeedVideoCounts.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsFeedProcessingResult = Initialize-PSOpenAPIToolsCatalogsFeedProcessingResult  -CreatedAt 2022-03-14T15:15:22Z `
 -Id 864344156814050986 `
 -IngestionDetails null `
 -ProductCounts null `
 -Status null `
 -UpdatedAt 2022-03-14T15:16:34Z `
 -ValidationDetails null `
 -VideoCounts null
```

- Convert the resource to JSON
```powershell
$CatalogsFeedProcessingResult | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

