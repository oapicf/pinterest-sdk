# CatalogsItemsBatch

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**[]ItemProcessingRecord**](ItemProcessingRecord.md) | Array with the catalogs items processing records part of the catalogs items batch | [optional] 
**BatchId** | **string** | Id of the catalogs items batch | [optional] 
**CreatedTime** | [**time.Time**](time.Time.md) | Time of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ssTZD | [optional] [readonly] 
**CompletedTime** | Pointer to [**time.Time**](time.Time.md) | Time of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ssTZD | [optional] [readonly] 
**Status** | [**BatchOperationStatus**](BatchOperationStatus.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


