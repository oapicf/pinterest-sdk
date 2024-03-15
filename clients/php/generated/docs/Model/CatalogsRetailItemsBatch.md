# # CatalogsRetailItemsBatch

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batch_id** | **string** | Id of the catalogs items batch | [optional]
**created_time** | **\DateTime** | Time of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ssTZD | [optional] [readonly]
**completed_time** | **\DateTime** | Time of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ssTZD | [optional] [readonly]
**status** | [**\OpenAPI\Client\Model\BatchOperationStatus**](BatchOperationStatus.md) |  | [optional]
**catalog_type** | [**\OpenAPI\Client\Model\CatalogsType**](CatalogsType.md) |  |
**items** | [**\OpenAPI\Client\Model\ItemProcessingRecord[]**](ItemProcessingRecord.md) | Array with the catalogs items processing records part of the catalogs items batch | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
