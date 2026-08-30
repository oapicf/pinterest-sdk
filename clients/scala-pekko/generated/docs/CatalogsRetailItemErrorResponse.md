

# CatalogsRetailItemErrorResponse

Object describing a retail item error

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalogType** | [**CatalogType**](#CatalogType) |  | 
**errors** | [**Seq&lt;ItemValidationEvent&gt;**](ItemValidationEvent.md) | Array with the errors for the item id requested | 
**itemId** | **String** | The catalog item id in the merchant namespace |  [optional]
**itemResponseKind** | [**ItemResponseKind**](#ItemResponseKind) | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. | 


## Enum: CatalogType
Allowed values: [RETAIL]



## Enum: ItemResponseKind
Allowed values: [retail_item_error]




