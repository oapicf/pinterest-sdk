# CatalogsVerticalFeedsCreateRequest



## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | This is a oneOf model. The value must be exactly one of the following types: CatalogsCreativeAssetsFeedsCreateRequest, CatalogsHotelFeedsCreateRequest, CatalogsRetailFeedsCreateRequest | Request object for creating a feed. | [optional] 

The discriminator field is `catalog_type` with the following mapping:
 - `CREATIVE_ASSETS`: `CatalogsCreativeAssetsFeedsCreateRequest`
 - `HOTEL`: `CatalogsHotelFeedsCreateRequest`
 - `RETAIL`: `CatalogsRetailFeedsCreateRequest`



[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


