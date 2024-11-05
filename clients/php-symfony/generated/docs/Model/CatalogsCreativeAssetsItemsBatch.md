# CatalogsCreativeAssetsItemsBatch

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batchId** | **string** | Id of the catalogs items batch | [optional] 
**createdTime** | **\DateTime** | Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [optional] [readonly] 
**completedTime** | **\DateTime** | Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [optional] [readonly] 
**status** | [**OpenAPI\Server\Model\BatchOperationStatus**](BatchOperationStatus.md) |  | [optional] 
**catalogType** | [**OpenAPI\Server\Model\CatalogsType**](CatalogsType.md) |  | 
**items** | [**OpenAPI\Server\Model\CreativeAssetsProcessingRecord**](CreativeAssetsProcessingRecord.md) | Array with the catalogs items processing records part of the catalogs items batch | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


