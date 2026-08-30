

# CatalogsRetailItemErrorResponse

Object describing a retail item error

The class is defined in **[CatalogsRetailItemErrorResponse.java](../../src/main/java/org/openapitools/model/CatalogsRetailItemErrorResponse.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalogType** | [**CatalogTypeEnum**](#CatalogTypeEnum) |  | 
**errors** | [`List&lt;ItemValidationEvent&gt;`](ItemValidationEvent.md) | Array with the errors for the item id requested | 
**itemId** | `String` | The catalog item id in the merchant namespace |  [optional property]
**itemResponseKind** | [**ItemResponseKindEnum**](#ItemResponseKindEnum) | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. | 

## CatalogTypeEnum

Name | Value
---- | -----
RETAIL | `"RETAIL"`



## ItemResponseKindEnum

Name | Value
---- | -----
RETAIL_ITEM_ERROR | `"retail_item_error"`


