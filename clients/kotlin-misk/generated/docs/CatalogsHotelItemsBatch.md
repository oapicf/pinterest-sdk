
# CatalogsHotelItemsBatch

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalogType** | [**inline**](#CatalogType) |  | 
**batchId** | **kotlin.String** | Id of the catalogs items batch |  [optional]
**completedTime** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss |  [optional]
**createdTime** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss |  [optional]
**items** | [**kotlin.collections.List&lt;HotelProcessingRecord&gt;**](HotelProcessingRecord.md) | Array with the catalogs items processing records part of the catalogs items batch |  [optional]
**status** | [**BatchOperationStatus**](BatchOperationStatus.md) |  |  [optional]


<a id="CatalogType"></a>
## Enum: catalog_type
Name | Value
---- | -----
catalogType | HOTEL



