

# CatalogsHotelItemsBatch

Object describing the catalogs hotel items batch

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**batchId** | **String** | Id of the catalogs items batch |  [optional] |
|**createdTime** | **OffsetDateTime** | Time of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ssTZD |  [optional] [readonly] |
|**completedTime** | **OffsetDateTime** | Time of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ssTZD |  [optional] [readonly] |
|**status** | **BatchOperationStatus** |  |  [optional] |
|**catalogType** | **CatalogsType** |  |  |
|**items** | [**List&lt;HotelProcessingRecord&gt;**](HotelProcessingRecord.md) | Array with the catalogs items processing records part of the catalogs items batch |  [optional] |



