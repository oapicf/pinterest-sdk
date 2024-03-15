# PinterestSdk.CatalogsHotelItemsBatch

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batchId** | **String** | Id of the catalogs items batch | [optional] 
**createdTime** | **Date** | Time of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ssTZD | [optional] [readonly] 
**completedTime** | **Date** | Time of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ssTZD | [optional] [readonly] 
**status** | [**BatchOperationStatus**](BatchOperationStatus.md) |  | [optional] 
**catalogType** | [**CatalogsType**](CatalogsType.md) |  | 
**items** | [**[HotelProcessingRecord]**](HotelProcessingRecord.md) | Array with the catalogs items processing records part of the catalogs items batch | [optional] 


