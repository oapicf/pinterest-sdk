# # CatalogsHotelItemsBatch

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batch_id** | **string** | Id of the catalogs items batch | [optional]
**catalog_type** | [**\OpenAPI\Client\Model\CatalogsType**](CatalogsType.md) |  |
**completed_time** | **\DateTime** | Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [optional] [readonly]
**created_time** | **\DateTime** | Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [optional] [readonly]
**items** | [**\OpenAPI\Client\Model\HotelProcessingRecord[]**](HotelProcessingRecord.md) | Array with the catalogs items processing records part of the catalogs items batch | [optional]
**status** | [**\OpenAPI\Client\Model\BatchOperationStatus**](BatchOperationStatus.md) |  | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
