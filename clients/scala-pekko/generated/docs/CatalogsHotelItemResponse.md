

# CatalogsHotelItemResponse

Object describing a hotel record

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**CatalogsHotelAttributes**](CatalogsHotelAttributes.md) |  |  [optional]
**catalogType** | [**CatalogType**](#CatalogType) |  | 
**hotelId** | **String** | The catalog hotel id in the merchant namespace |  [optional]
**itemResponseKind** | [**ItemResponseKind**](#ItemResponseKind) | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. | 
**pins** | [**Seq&lt;Pin&gt;**](Pin.md) | The pins mapped to the item |  [optional]


## Enum: CatalogType
Allowed values: [HOTEL]



## Enum: ItemResponseKind
Allowed values: [hotel_item]




