# CatalogsVerticalFeedsUpdateRequest



## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | This is a oneOf model. The value must be exactly one of the following types: CatalogsCreativeAssetsFeedsUpdateRequest, CatalogsHotelFeedsUpdateRequest, CatalogsRetailFeedsUpdateRequest | Request object for updating a feed. | [optional] 

The discriminator field is `catalog_type` with the following mapping:
 - `CREATIVE_ASSETS`: `CatalogsCreativeAssetsFeedsUpdateRequest`
 - `HOTEL`: `CatalogsHotelFeedsUpdateRequest`
 - `RETAIL`: `CatalogsRetailFeedsUpdateRequest`



[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


