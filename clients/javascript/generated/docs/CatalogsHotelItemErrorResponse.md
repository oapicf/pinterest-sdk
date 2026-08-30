# PinterestSdk.CatalogsHotelItemErrorResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalogType** | **String** |  | 
**errors** | [**[ItemValidationEvent]**](ItemValidationEvent.md) | Array with the errors for the item id requested | 
**hotelId** | **String** | The catalog hotel id in the merchant namespace | [optional] 
**itemResponseKind** | **String** | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. | 



## Enum: CatalogTypeEnum


* `HOTEL` (value: `"HOTEL"`)





## Enum: ItemResponseKindEnum


* `hotel_item_error` (value: `"hotel_item_error"`)




