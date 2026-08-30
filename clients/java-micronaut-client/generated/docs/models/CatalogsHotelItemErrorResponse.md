

# CatalogsHotelItemErrorResponse

Object describing a hotel item error

The class is defined in **[CatalogsHotelItemErrorResponse.java](../../src/main/java/org/openapitools/model/CatalogsHotelItemErrorResponse.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalogType** | [**CatalogTypeEnum**](#CatalogTypeEnum) |  | 
**errors** | [`List&lt;ItemValidationEvent&gt;`](ItemValidationEvent.md) | Array with the errors for the item id requested | 
**hotelId** | `String` | The catalog hotel id in the merchant namespace |  [optional property]
**itemResponseKind** | [**ItemResponseKindEnum**](#ItemResponseKindEnum) | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. | 

## CatalogTypeEnum

Name | Value
---- | -----
HOTEL | `"HOTEL"`



## ItemResponseKindEnum

Name | Value
---- | -----
HOTEL_ITEM_ERROR | `"hotel_item_error"`


