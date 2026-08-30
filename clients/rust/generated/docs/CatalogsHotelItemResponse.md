# CatalogsHotelItemResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | Option<[**models::CatalogsHotelAttributes**](CatalogsHotelAttributes.md)> |  | [optional]
**catalog_type** | **CatalogType** |  (enum: HOTEL) | 
**hotel_id** | Option<**String**> | The catalog hotel id in the merchant namespace | [optional]
**item_response_kind** | **ItemResponseKind** | Discriminator literal identifying this leaf inside an `ItemResponse` payload. (enum: hotel_item) | 
**pins** | Option<[**Vec<models::Pin>**](Pin.md)> | The pins mapped to the item | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


