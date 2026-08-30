# CatalogsHotelItemErrorResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **CatalogType** |  (enum: HOTEL) | 
**errors** | [**Vec<models::ItemValidationEvent>**](ItemValidationEvent.md) | Array with the errors for the item id requested | 
**hotel_id** | Option<**String**> | The catalog hotel id in the merchant namespace | [optional]
**item_response_kind** | **ItemResponseKind** | Discriminator literal identifying this leaf inside an `ItemResponse` payload. (enum: hotel_item_error) | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


