# ItemResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [***models::CatalogsCreativeAssetsAttributes**](CatalogsCreativeAssetsAttributes.md) |  | [optional] [default to None]
**catalog_type** | [***models::CatalogsCreativeAssetsAvailableFilterValuesCatalogType**](CatalogsCreativeAssetsAvailableFilterValues_catalog_type.md) |  | 
**item_id** | **String** | The catalog item id in the merchant namespace | [optional] [default to None]
**item_response_kind** | [***models::CatalogsCreativeAssetsItemErrorResponseItemResponseKind**](CatalogsCreativeAssetsItemErrorResponse_item_response_kind.md) |  | 
**pins** | [**swagger::Nullable<Vec<models::Pin>>**](Pin.md) | The pins mapped to the item | [optional] [default to None]
**hotel_id** | **String** | The catalog hotel id in the merchant namespace | [optional] [default to None]
**creative_assets_id** | **String** | The catalog creative assets id in the merchant namespace | [optional] [default to None]
**errors** | [**Vec<models::ItemValidationEvent>**](ItemValidationEvent.md) | Array with the errors for the item id requested | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


