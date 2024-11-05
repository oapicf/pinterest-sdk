

# CatalogsRetailItemsBatch

Object describing the catalogs retail items batch

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**batchId** | **String** | Id of the catalogs items batch |  [optional] |
|**createdTime** | **OffsetDateTime** | Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss |  [optional] [readonly] |
|**completedTime** | **OffsetDateTime** | Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss |  [optional] [readonly] |
|**status** | **BatchOperationStatus** |  |  [optional] |
|**catalogType** | **CatalogsType** |  |  |
|**items** | [**List&lt;ItemProcessingRecord&gt;**](ItemProcessingRecord.md) | Array with the catalogs items processing records part of the catalogs items batch |  [optional] |



