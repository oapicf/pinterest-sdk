

# CatalogsHotelItemsBatch

Object describing the catalogs hotel items batch

The class is defined in **[CatalogsHotelItemsBatch.java](../../src/main/java/org/openapitools/model/CatalogsHotelItemsBatch.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batchId** | `String` | Id of the catalogs items batch |  [optional property]
**createdTime** | `OffsetDateTime` | Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss |  [optional property] [readonly property]
**completedTime** | `OffsetDateTime` | Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss |  [optional property] [readonly property]
**status** | `BatchOperationStatus` |  |  [optional property]
**catalogType** | `CatalogsType` |  | 
**items** | [`List&lt;HotelProcessingRecord&gt;`](HotelProcessingRecord.md) | Array with the catalogs items processing records part of the catalogs items batch |  [optional property]








