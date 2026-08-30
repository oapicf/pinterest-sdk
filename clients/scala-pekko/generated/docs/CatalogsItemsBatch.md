

# CatalogsItemsBatch

Object describing the catalogs items batch

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batchId** | **String** | Id of the catalogs items batch |  [optional]
**catalogType** | [**CatalogType**](#CatalogType) |  | 
**completedTime** | **OffsetDateTime** | Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss |  [optional]
**createdTime** | **OffsetDateTime** | Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss | 
**items** | [**Seq&lt;CreativeAssetsProcessingRecord&gt;**](CreativeAssetsProcessingRecord.md) | Array with the catalogs items processing records part of the catalogs items batch |  [optional]
**status** | **BatchOperationStatus** |  |  [optional]


## Enum: CatalogType
Allowed values: [CREATIVE_ASSETS]




