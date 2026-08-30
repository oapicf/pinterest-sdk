# CatalogsCreativeAssetsItemsBatch


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`batch_id`** | **`String`** | Id of the catalogs items batch | [optional] [default to nothing]
**`catalog_type`** | **`String`** |  | [default to nothing]
**`completed_time`** | **`ZonedDateTime`** | Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [optional] [default to nothing]
**`created_time`** | **`ZonedDateTime`** | Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [optional] [default to nothing]
**`items`** | [**`Vector{CreativeAssetsProcessingRecord}`**](CreativeAssetsProcessingRecord.md) | Array with the catalogs items processing records part of the catalogs items batch | [optional] [default to nothing]
**`status`** | [**`*BatchOperationStatus`**](BatchOperationStatus.md) |  | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


