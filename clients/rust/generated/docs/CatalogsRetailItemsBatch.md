# CatalogsRetailItemsBatch

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batch_id** | Option<**String**> | Id of the catalogs items batch | [optional]
**created_time** | Option<**String**> | Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss | [optional][readonly]
**completed_time** | Option<**String**> | Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss | [optional][readonly]
**status** | Option<[**models::BatchOperationStatus**](BatchOperationStatus.md)> |  | [optional]
**catalog_type** | [**models::CatalogsType**](CatalogsType.md) |  | 
**items** | Option<[**Vec<models::ItemProcessingRecord>**](ItemProcessingRecord.md)> | Array with the catalogs items processing records part of the catalogs items batch | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


