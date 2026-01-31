

# CatalogsItemsBatch

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalogType** | [**CatalogsType**](CatalogsType.md) |  | 
**batchId** | **String** | Id of the catalogs items batch |  [optional]
**completedTime** | [**Date**](Date.md) | Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss |  [optional] [readonly]
**createdTime** | [**Date**](Date.md) | Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss |  [readonly]
**items** | [**List&lt;CreativeAssetsProcessingRecord&gt;**](CreativeAssetsProcessingRecord.md) | Array with the catalogs items processing records part of the catalogs items batch |  [optional]
**status** | [**BatchOperationStatus**](BatchOperationStatus.md) |  |  [optional]




