# CatalogsItemsBatch



## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | This is a oneOf model. The value must be exactly one of the following types: CatalogsCreativeAssetsItemsBatch, CatalogsHotelItemsBatch, CatalogsRetailItemsBatch | Object describing the catalogs items batch | [optional] 

The discriminator field is `catalog_type` with the following mapping:
 - `CREATIVE_ASSETS`: `CatalogsCreativeAssetsItemsBatch`
 - `HOTEL`: `CatalogsHotelItemsBatch`
 - `RETAIL`: `CatalogsRetailItemsBatch`



[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


