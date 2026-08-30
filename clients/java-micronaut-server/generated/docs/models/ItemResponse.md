

# ItemResponse

Object describing an item record or error. Discriminated by `item_response_kind` (one unique value per leaf).

The class is defined in **[ItemResponse.java](../../src/main/java/org/openapitools/model/ItemResponse.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [`CatalogsCreativeAssetsAttributes`](CatalogsCreativeAssetsAttributes.md) |  |  [optional property]
**catalogType** | [**CatalogTypeEnum**](#CatalogTypeEnum) |  | 
**itemId** | `String` | The catalog item id in the merchant namespace |  [optional property]
**itemResponseKind** | [**ItemResponseKindEnum**](#ItemResponseKindEnum) | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. | 
**pins** | [`List&lt;Pin&gt;`](Pin.md) | The pins mapped to the item |  [optional property]
**hotelId** | `String` | The catalog hotel id in the merchant namespace |  [optional property]
**creativeAssetsId** | `String` | The catalog creative assets id in the merchant namespace |  [optional property]
**errors** | [`List&lt;ItemValidationEvent&gt;`](ItemValidationEvent.md) | Array with the errors for the item id requested | 


## CatalogTypeEnum

Name | Value
---- | -----
CREATIVE_ASSETS | `"CREATIVE_ASSETS"`


## ItemResponseKindEnum

Name | Value
---- | -----
CREATIVE_ASSETS_ITEM_ERROR | `"creative_assets_item_error"`






