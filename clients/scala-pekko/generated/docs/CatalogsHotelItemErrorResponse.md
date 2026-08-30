

# CatalogsHotelItemErrorResponse

Object describing a hotel item error

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalogType** | [**CatalogType**](#CatalogType) |  | 
**errors** | [**Seq&lt;ItemValidationEvent&gt;**](ItemValidationEvent.md) | Array with the errors for the item id requested | 
**hotelId** | **String** | The catalog hotel id in the merchant namespace |  [optional]
**itemResponseKind** | [**ItemResponseKind**](#ItemResponseKind) | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. | 


## Enum: CatalogType
Allowed values: [HOTEL]



## Enum: ItemResponseKind
Allowed values: [hotel_item_error]




