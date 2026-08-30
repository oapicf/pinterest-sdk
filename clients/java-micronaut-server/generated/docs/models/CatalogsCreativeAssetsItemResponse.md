

# CatalogsCreativeAssetsItemResponse

Object describing a creative assets item record

The class is defined in **[CatalogsCreativeAssetsItemResponse.java](../../src/main/java/org/openapitools/model/CatalogsCreativeAssetsItemResponse.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [`CatalogsCreativeAssetsAttributes`](CatalogsCreativeAssetsAttributes.md) |  |  [optional property]
**catalogType** | [**CatalogTypeEnum**](#CatalogTypeEnum) |  | 
**creativeAssetsId** | `String` | The catalog creative assets id in the merchant namespace |  [optional property]
**itemResponseKind** | [**ItemResponseKindEnum**](#ItemResponseKindEnum) | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. | 
**pins** | [`List&lt;Pin&gt;`](Pin.md) | The pins mapped to the item |  [optional property]


## CatalogTypeEnum

Name | Value
---- | -----
CREATIVE_ASSETS | `"CREATIVE_ASSETS"`


## ItemResponseKindEnum

Name | Value
---- | -----
CREATIVE_ASSETS_ITEM | `"creative_assets_item"`



