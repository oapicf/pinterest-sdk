

# CatalogsRetailItemsBatch

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batchId** | **String** | Id of the catalogs items batch |  [optional]
**createdTime** | [**Date**](Date.md) | Time of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ssTZD |  [optional] [readonly]
**completedTime** | [**Date**](Date.md) | Time of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ssTZD |  [optional] [readonly]
**status** | [**BatchOperationStatus**](BatchOperationStatus.md) |  |  [optional]
**catalogType** | [**CatalogsType**](CatalogsType.md) |  | 
**items** | [**List&lt;ItemProcessingRecord&gt;**](ItemProcessingRecord.md) | Array with the catalogs items processing records part of the catalogs items batch |  [optional]




