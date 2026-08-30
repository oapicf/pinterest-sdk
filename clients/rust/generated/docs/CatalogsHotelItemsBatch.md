# CatalogsHotelItemsBatch

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batch_id** | Option<**String**> | Id of the catalogs items batch | [optional]
**catalog_type** | **CatalogType** |  (enum: HOTEL) | 
**completed_time** | Option<**chrono::DateTime<chrono::FixedOffset>**> | Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss | [optional]
**created_time** | Option<**chrono::DateTime<chrono::FixedOffset>**> | Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss | [optional]
**items** | Option<[**Vec<models::HotelProcessingRecord>**](HotelProcessingRecord.md)> | Array with the catalogs items processing records part of the catalogs items batch | [optional]
**status** | Option<[**models::BatchOperationStatus**](BatchOperationStatus.md)> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


