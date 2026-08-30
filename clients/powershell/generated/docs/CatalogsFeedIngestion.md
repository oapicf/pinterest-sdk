# CatalogsFeedIngestion
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CreatedAt** | **System.DateTime** | Timestamp of the feed ingestion. | 
**FeedId** | **String** | Catalog Feed id pertaining to the feed ingestion. | 
**Id** | **String** | Unique identifier of a feed ingestion. | 
**Status** | [**CatalogsFeedProcessingStatus**](CatalogsFeedProcessingStatus.md) | Status of the feed ingestion. | 

## Examples

- Prepare the resource
```powershell
$CatalogsFeedIngestion = Initialize-PSOpenAPIToolsCatalogsFeedIngestion  -CreatedAt 2022-03-14T15:15:22Z `
 -FeedId 2680059592705 `
 -Id 2680059592705 `
 -Status null
```

- Convert the resource to JSON
```powershell
$CatalogsFeedIngestion | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

