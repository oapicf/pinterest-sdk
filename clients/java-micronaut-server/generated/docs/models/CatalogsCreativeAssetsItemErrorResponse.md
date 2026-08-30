

# CatalogsCreativeAssetsItemErrorResponse

Object describing a creative assets item error

The class is defined in **[CatalogsCreativeAssetsItemErrorResponse.java](../../src/main/java/org/openapitools/model/CatalogsCreativeAssetsItemErrorResponse.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalogType** | [**CatalogTypeEnum**](#CatalogTypeEnum) |  | 
**creativeAssetsId** | `String` | The catalog creative assets id in the merchant namespace |  [optional property]
**errors** | [`List&lt;ItemValidationEvent&gt;`](ItemValidationEvent.md) | Array with the errors for the item id requested | 
**itemResponseKind** | [**ItemResponseKindEnum**](#ItemResponseKindEnum) | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. | 

## CatalogTypeEnum

Name | Value
---- | -----
CREATIVE_ASSETS | `"CREATIVE_ASSETS"`



## ItemResponseKindEnum

Name | Value
---- | -----
CREATIVE_ASSETS_ITEM_ERROR | `"creative_assets_item_error"`


