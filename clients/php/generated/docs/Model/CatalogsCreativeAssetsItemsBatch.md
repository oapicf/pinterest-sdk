# # CatalogsCreativeAssetsItemsBatch

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batch_id** | **string** | Id of the catalogs items batch | [optional]
**created_time** | **\DateTime** | Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [optional] [readonly]
**completed_time** | **\DateTime** | Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [optional] [readonly]
**status** | [**\OpenAPI\Client\Model\BatchOperationStatus**](BatchOperationStatus.md) |  | [optional]
**catalog_type** | [**\OpenAPI\Client\Model\CatalogsType**](CatalogsType.md) |  |
**items** | [**\OpenAPI\Client\Model\CreativeAssetsProcessingRecord[]**](CreativeAssetsProcessingRecord.md) | Array with the catalogs items processing records part of the catalogs items batch | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
