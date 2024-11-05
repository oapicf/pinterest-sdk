# CatalogsFeedIngestion
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** |  | 
**FeedId** | **String** |  | 
**CreatedAt** | **System.DateTime** |  | 
**Status** | [**CatalogsFeedProcessingStatus**](CatalogsFeedProcessingStatus.md) |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsFeedIngestion = Initialize-PSOpenAPIToolsCatalogsFeedIngestion  -Id 01234 `
 -FeedId 56789 `
 -CreatedAt 2022-03-14T15:16:34Z `
 -Status null
```

- Convert the resource to JSON
```powershell
$CatalogsFeedIngestion | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

