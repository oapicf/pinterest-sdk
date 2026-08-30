

# CatalogsItemsBatch

Object describing the catalogs items batch

The class is defined in **[CatalogsItemsBatch.java](../../src/main/java/org/openapitools/model/CatalogsItemsBatch.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batchId** | `String` | Id of the catalogs items batch |  [optional property]
**catalogType** | [**CatalogTypeEnum**](#CatalogTypeEnum) |  | 
**completedTime** | `OffsetDateTime` | Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss |  [optional property]
**createdTime** | `OffsetDateTime` | Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss | 
**items** | [`List&lt;CreativeAssetsProcessingRecord&gt;`](CreativeAssetsProcessingRecord.md) | Array with the catalogs items processing records part of the catalogs items batch |  [optional property]
**status** | `BatchOperationStatus` |  |  [optional property]


## CatalogTypeEnum

Name | Value
---- | -----
CREATIVE_ASSETS | `"CREATIVE_ASSETS"`






