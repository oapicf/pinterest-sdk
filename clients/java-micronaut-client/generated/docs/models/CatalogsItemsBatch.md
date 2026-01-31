

# CatalogsItemsBatch

Object describing the catalogs items batch

The class is defined in **[CatalogsItemsBatch.java](../../src/main/java/org/openapitools/model/CatalogsItemsBatch.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalogType** | `CatalogsType` |  | 
**batchId** | `String` | Id of the catalogs items batch |  [optional property]
**completedTime** | `OffsetDateTime` | Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss |  [optional property] [readonly property]
**createdTime** | `OffsetDateTime` | Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss |  [readonly property]
**items** | [`List&lt;CreativeAssetsProcessingRecord&gt;`](CreativeAssetsProcessingRecord.md) | Array with the catalogs items processing records part of the catalogs items batch |  [optional property]
**status** | `BatchOperationStatus` |  |  [optional property]








