

# CatalogsCreativeAssetsItemResponse

Object describing a creative assets item record

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**CatalogsCreativeAssetsAttributes**](CatalogsCreativeAssetsAttributes.md) |  |  [optional]
**catalogType** | [**CatalogType**](#CatalogType) |  | 
**creativeAssetsId** | **String** | The catalog creative assets id in the merchant namespace |  [optional]
**itemResponseKind** | [**ItemResponseKind**](#ItemResponseKind) | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. | 
**pins** | [**Seq&lt;Pin&gt;**](Pin.md) | The pins mapped to the item |  [optional]


## Enum: CatalogType
Allowed values: [CREATIVE_ASSETS]



## Enum: ItemResponseKind
Allowed values: [creative_assets_item]




