

# CatalogsRetailItemsBatch

Object describing the catalogs retail items batch

The class is defined in **[CatalogsRetailItemsBatch.java](../../src/main/java/org/openapitools/model/CatalogsRetailItemsBatch.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batchId** | `String` | Id of the catalogs items batch |  [optional property]
**createdTime** | `OffsetDateTime` | Time of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ssTZD |  [optional property] [readonly property]
**completedTime** | `OffsetDateTime` | Time of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ssTZD |  [optional property] [readonly property]
**status** | `BatchOperationStatus` |  |  [optional property]
**catalogType** | `CatalogsType` |  | 
**items** | [`List&lt;ItemProcessingRecord&gt;`](ItemProcessingRecord.md) | Array with the catalogs items processing records part of the catalogs items batch |  [optional property]








