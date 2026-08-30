

# CatalogsCreativeAssetsItemErrorResponse

Object describing a creative assets item error

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalogType** | [**CatalogType**](#CatalogType) |  | 
**creativeAssetsId** | **String** | The catalog creative assets id in the merchant namespace |  [optional]
**errors** | [**Seq&lt;ItemValidationEvent&gt;**](ItemValidationEvent.md) | Array with the errors for the item id requested | 
**itemResponseKind** | [**ItemResponseKind**](#ItemResponseKind) | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. | 


## Enum: CatalogType
Allowed values: [CREATIVE_ASSETS]



## Enum: ItemResponseKind
Allowed values: [creative_assets_item_error]




