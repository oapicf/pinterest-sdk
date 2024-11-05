# CatalogsHotelItemsBatch

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batchId** | **String!** | Id of the catalogs items batch | [optional] [default to null]
**createdTime** | **String!** | Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [optional] [readonly] [default to null]
**completedTime** | **String** | Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [optional] [readonly] [default to null]
**status** | [***BatchOperationStatus**](BatchOperationStatus.md) |  | [optional] [default to null]
**catalogType** | [***CatalogsType**](CatalogsType.md) |  | [default to null]
**items** | [**HotelProcessingRecord**](HotelProcessingRecord.md) | Array with the catalogs items processing records part of the catalogs items batch | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


