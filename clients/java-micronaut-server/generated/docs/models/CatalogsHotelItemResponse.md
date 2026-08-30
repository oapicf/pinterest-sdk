

# CatalogsHotelItemResponse

Object describing a hotel record

The class is defined in **[CatalogsHotelItemResponse.java](../../src/main/java/org/openapitools/model/CatalogsHotelItemResponse.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [`CatalogsHotelAttributes`](CatalogsHotelAttributes.md) |  |  [optional property]
**catalogType** | [**CatalogTypeEnum**](#CatalogTypeEnum) |  | 
**hotelId** | `String` | The catalog hotel id in the merchant namespace |  [optional property]
**itemResponseKind** | [**ItemResponseKindEnum**](#ItemResponseKindEnum) | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. | 
**pins** | [`List&lt;Pin&gt;`](Pin.md) | The pins mapped to the item |  [optional property]


## CatalogTypeEnum

Name | Value
---- | -----
HOTEL | `"HOTEL"`


## ItemResponseKindEnum

Name | Value
---- | -----
HOTEL_ITEM | `"hotel_item"`



