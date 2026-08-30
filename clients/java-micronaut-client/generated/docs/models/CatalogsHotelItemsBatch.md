

# CatalogsHotelItemsBatch

Object describing the catalogs hotel items batch. If specified, you must provide all properties.

The class is defined in **[CatalogsHotelItemsBatch.java](../../src/main/java/org/openapitools/model/CatalogsHotelItemsBatch.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batchId** | `String` | Id of the catalogs items batch |  [optional property]
**catalogType** | [**CatalogTypeEnum**](#CatalogTypeEnum) |  | 
**completedTime** | `OffsetDateTime` | Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss |  [optional property]
**createdTime** | `OffsetDateTime` | Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss |  [optional property]
**items** | [`List&lt;HotelProcessingRecord&gt;`](HotelProcessingRecord.md) | Array with the catalogs items processing records part of the catalogs items batch |  [optional property]
**status** | `BatchOperationStatus` |  |  [optional property]


## CatalogTypeEnum

Name | Value
---- | -----
HOTEL | `"HOTEL"`






