# ItemResponse



## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | This is a oneOf model. The value must be exactly one of the following types: CatalogsCreativeAssetsItemErrorResponse, CatalogsCreativeAssetsItemResponse, CatalogsHotelItemErrorResponse, CatalogsHotelItemResponse, CatalogsRetailItemErrorResponse, CatalogsRetailItemResponse | Object describing an item record or error. Discriminated by &#x60;item_response_kind&#x60; (one unique value per leaf). | [optional] 

The discriminator field is `item_response_kind` with the following mapping:
 - `creative_assets_item`: `CatalogsCreativeAssetsItemResponse`
 - `creative_assets_item_error`: `CatalogsCreativeAssetsItemErrorResponse`
 - `hotel_item`: `CatalogsHotelItemResponse`
 - `hotel_item_error`: `CatalogsHotelItemErrorResponse`
 - `retail_item`: `CatalogsRetailItemResponse`
 - `retail_item_error`: `CatalogsRetailItemErrorResponse`



[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


