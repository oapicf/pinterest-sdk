# CatalogsFeed



## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | This is a oneOf model. The value must be exactly one of the following types: CatalogsCreativeAssetsFeed, CatalogsHotelFeed, CatalogsRetailFeed | Catalogs Feed object | [optional] 

The discriminator field is `catalog_type` with the following mapping:
 - `CREATIVE_ASSETS`: `CatalogsCreativeAssetsFeed`
 - `HOTEL`: `CatalogsHotelFeed`
 - `RETAIL`: `CatalogsRetailFeed`



[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


