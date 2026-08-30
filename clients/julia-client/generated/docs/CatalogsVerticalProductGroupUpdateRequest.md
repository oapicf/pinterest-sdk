# CatalogsVerticalProductGroupUpdateRequest



## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | This is a oneOf model. The value must be exactly one of the following types: CatalogsCreativeAssetsProductGroupUpdateRequest, CatalogsHotelProductGroupUpdateRequest, CatalogsRetailProductGroupUpdateRequest | Request object for updating a catalog based product group. | [optional] 

The discriminator field is `catalog_type` with the following mapping:
 - `CREATIVE_ASSETS`: `CatalogsCreativeAssetsProductGroupUpdateRequest`
 - `HOTEL`: `CatalogsHotelProductGroupUpdateRequest`
 - `RETAIL`: `CatalogsRetailProductGroupUpdateRequest`



[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


