
# CatalogsHotelItemErrorResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalogType** | [**inline**](#CatalogType) |  | 
**errors** | [**kotlin.collections.List&lt;ItemValidationEvent&gt;**](ItemValidationEvent.md) | Array with the errors for the item id requested | 
**itemResponseKind** | [**inline**](#ItemResponseKind) | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. | 
**hotelId** | **kotlin.String** | The catalog hotel id in the merchant namespace |  [optional]


<a id="CatalogType"></a>
## Enum: catalog_type
Name | Value
---- | -----
catalogType | HOTEL


<a id="ItemResponseKind"></a>
## Enum: item_response_kind
Name | Value
---- | -----
itemResponseKind | hotel_item_error



