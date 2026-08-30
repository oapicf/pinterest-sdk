# PinterestSdk.CatalogsHotelItemResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**CatalogsHotelAttributes**](CatalogsHotelAttributes.md) |  | [optional] 
**catalogType** | **String** |  | 
**hotelId** | **String** | The catalog hotel id in the merchant namespace | [optional] 
**itemResponseKind** | **String** | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. | 
**pins** | [**[Pin]**](Pin.md) | The pins mapped to the item | [optional] 



## Enum: CatalogTypeEnum


* `HOTEL` (value: `"HOTEL"`)





## Enum: ItemResponseKindEnum


* `hotel_item` (value: `"hotel_item"`)




