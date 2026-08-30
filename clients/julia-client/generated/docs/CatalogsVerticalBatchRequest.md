# CatalogsVerticalBatchRequest



## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | This is a oneOf model. The value must be exactly one of the following types: CatalogsCreativeAssetsBatchRequest, CatalogsHotelBatchRequest, CatalogsRetailBatchRequest | A request object that can have multiple operations on a single batch | [optional] 

The discriminator field is `catalog_type` with the following mapping:
 - `CREATIVE_ASSETS`: `CatalogsCreativeAssetsBatchRequest`
 - `HOTEL`: `CatalogsHotelBatchRequest`
 - `RETAIL`: `CatalogsRetailBatchRequest`



[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


