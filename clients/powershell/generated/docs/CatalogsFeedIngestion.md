# CatalogsFeedIngestion
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CreatedAt** | **System.DateTime** |  | 
**FeedId** | **String** |  | 
**Id** | **String** |  | 
**Status** | [**CatalogsFeedProcessingStatus**](CatalogsFeedProcessingStatus.md) |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsFeedIngestion = Initialize-PSOpenAPIToolsCatalogsFeedIngestion  -CreatedAt 2022-03-14T15:16:34Z `
 -FeedId 56789 `
 -Id 01234 `
 -Status null
```

- Convert the resource to JSON
```powershell
$CatalogsFeedIngestion | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

