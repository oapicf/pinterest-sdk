# CatalogsVerticalsListProductsByCatalogBasedFilterRequest



## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | This is a oneOf model. The value must be exactly one of the following types: CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest, CatalogsHotelListProductsByCatalogBasedFilterRequest, CatalogsRetailListProductsByCatalogBasedFilterRequest | Request object to list products for a given catalog_id and product group filter. | [optional] 

The discriminator field is `catalog_type` with the following mapping:
 - `CREATIVE_ASSETS`: `CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest`
 - `HOTEL`: `CatalogsHotelListProductsByCatalogBasedFilterRequest`
 - `RETAIL`: `CatalogsRetailListProductsByCatalogBasedFilterRequest`



[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


