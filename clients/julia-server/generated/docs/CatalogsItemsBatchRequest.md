# CatalogsItemsBatchRequest



## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | This is a oneOf model. The value must be exactly one of the following types: CatalogsItemsCreateBatchRequest, CatalogsItemsDeleteBatchRequest, CatalogsItemsDeleteDiscontinuedBatchRequest, CatalogsItemsUpdateBatchRequest, CatalogsItemsUpsertBatchRequest | Request object of catalogs items batch | [optional] 

The discriminator field is `operation` with the following mapping:
 - `CREATE`: `CatalogsItemsCreateBatchRequest`
 - `DELETE`: `CatalogsItemsDeleteBatchRequest`
 - `DELETE_DISCONTINUED`: `CatalogsItemsDeleteDiscontinuedBatchRequest`
 - `UPDATE`: `CatalogsItemsUpdateBatchRequest`
 - `UPSERT`: `CatalogsItemsUpsertBatchRequest`



[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


