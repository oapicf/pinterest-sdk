

# CatalogsItemsBatch

Object describing the catalogs items batch

The class is defined in **[CatalogsItemsBatch.java](../../src/main/java/org/openapitools/model/CatalogsItemsBatch.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [`List&lt;ItemProcessingRecord&gt;`](ItemProcessingRecord.md) | Array with the catalogs items processing records part of the catalogs items batch |  [optional property]
**batchId** | `String` | Id of the catalogs items batch |  [optional property]
**createdTime** | `LocalDateTime` | Time of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ssTZD |  [optional property] [readonly property]
**completedTime** | `LocalDateTime` | Time of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ssTZD |  [optional property] [readonly property]
**status** | `BatchOperationStatus` |  |  [optional property]







