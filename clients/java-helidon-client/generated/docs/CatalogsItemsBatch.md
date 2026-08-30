

# CatalogsItemsBatch

Object describing the catalogs items batch

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**batchId** | **String** | Id of the catalogs items batch |  [optional] |
|**catalogType** | [**CatalogTypeEnum**](#CatalogTypeEnum) |  |  |
|**completedTime** | **OffsetDateTime** | Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss |  [optional] |
|**createdTime** | **OffsetDateTime** | Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss |  |
|**items** | [**List&lt;CreativeAssetsProcessingRecord&gt;**](CreativeAssetsProcessingRecord.md) | Array with the catalogs items processing records part of the catalogs items batch |  [optional] |
|**status** | **BatchOperationStatus** |  |  [optional] |



## Enum: CatalogTypeEnum

| Name | Value |
|---- | -----|
| CREATIVE_ASSETS | &quot;CREATIVE_ASSETS&quot; |



