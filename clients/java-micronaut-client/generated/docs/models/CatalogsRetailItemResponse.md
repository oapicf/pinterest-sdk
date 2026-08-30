

# CatalogsRetailItemResponse

Object describing a retail item record

The class is defined in **[CatalogsRetailItemResponse.java](../../src/main/java/org/openapitools/model/CatalogsRetailItemResponse.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [`ItemAttributes`](ItemAttributes.md) |  |  [optional property]
**catalogType** | [**CatalogTypeEnum**](#CatalogTypeEnum) |  | 
**itemId** | `String` | The catalog retail item id in the merchant namespace |  [optional property]
**itemResponseKind** | [**ItemResponseKindEnum**](#ItemResponseKindEnum) | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. | 
**pins** | [`List&lt;Pin&gt;`](Pin.md) | The pins mapped to the item |  [optional property]


## CatalogTypeEnum

Name | Value
---- | -----
RETAIL | `"RETAIL"`


## ItemResponseKindEnum

Name | Value
---- | -----
RETAIL_ITEM | `"retail_item"`



