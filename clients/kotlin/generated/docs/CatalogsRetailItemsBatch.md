
# CatalogsRetailItemsBatch

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **catalogType** | [**CatalogsType**](CatalogsType.md) |  |  |
| **batchId** | **kotlin.String** | Id of the catalogs items batch |  [optional] |
| **createdTime** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss |  [optional] [readonly] |
| **completedTime** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss |  [optional] [readonly] |
| **status** | [**BatchOperationStatus**](BatchOperationStatus.md) |  |  [optional] |
| **items** | [**kotlin.collections.List&lt;ItemProcessingRecord&gt;**](ItemProcessingRecord.md) | Array with the catalogs items processing records part of the catalogs items batch |  [optional] |



