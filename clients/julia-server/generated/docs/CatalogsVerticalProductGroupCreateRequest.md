# CatalogsVerticalProductGroupCreateRequest



## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | This is a oneOf model. The value must be exactly one of the following types: CatalogsCreativeAssetsProductGroupCreateRequest, CatalogsHotelProductGroupCreateRequest, CatalogsRetailProductGroupCreateRequest | Request object for creating a catalog based product group. | [optional] 

The discriminator field is `catalog_type` with the following mapping:
 - `CREATIVE_ASSETS`: `CatalogsCreativeAssetsProductGroupCreateRequest`
 - `HOTEL`: `CatalogsHotelProductGroupCreateRequest`
 - `RETAIL`: `CatalogsRetailProductGroupCreateRequest`



[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


