# CatalogsRetailItemsBatch
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **batch\_id** | **String** | Id of the catalogs items batch | [optional] [default to null] |
| **created\_time** | **Date** | Time of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ssTZD | [optional] [default to null] |
| **completed\_time** | **Date** | Time of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ssTZD | [optional] [default to null] |
| **status** | [**BatchOperationStatus**](BatchOperationStatus.md) |  | [optional] [default to null] |
| **catalog\_type** | [**CatalogsType**](CatalogsType.md) |  | [default to null] |
| **items** | [**List**](ItemProcessingRecord.md) | Array with the catalogs items processing records part of the catalogs items batch | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

