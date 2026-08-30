

# ItemResponse

Object describing an item record or error. Discriminated by `item_response_kind` (one unique value per leaf).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**CatalogsCreativeAssetsAttributes**](CatalogsCreativeAssetsAttributes.md) |  |  [optional]
**catalogType** | [**CatalogType**](#CatalogType) |  | 
**itemId** | **String** | The catalog item id in the merchant namespace |  [optional]
**itemResponseKind** | [**ItemResponseKind**](#ItemResponseKind) | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. | 
**pins** | [**Seq&lt;Pin&gt;**](Pin.md) | The pins mapped to the item |  [optional]
**hotelId** | **String** | The catalog hotel id in the merchant namespace |  [optional]
**creativeAssetsId** | **String** | The catalog creative assets id in the merchant namespace |  [optional]
**errors** | [**Seq&lt;ItemValidationEvent&gt;**](ItemValidationEvent.md) | Array with the errors for the item id requested | 


## Enum: CatalogType
Allowed values: [CREATIVE_ASSETS]



## Enum: ItemResponseKind
Allowed values: [creative_assets_item_error]




