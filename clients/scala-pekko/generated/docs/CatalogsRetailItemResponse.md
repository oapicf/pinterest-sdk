

# CatalogsRetailItemResponse

Object describing a retail item record

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**ItemAttributes**](ItemAttributes.md) |  |  [optional]
**catalogType** | [**CatalogType**](#CatalogType) |  | 
**itemId** | **String** | The catalog retail item id in the merchant namespace |  [optional]
**itemResponseKind** | [**ItemResponseKind**](#ItemResponseKind) | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. | 
**pins** | [**Seq&lt;Pin&gt;**](Pin.md) | The pins mapped to the item |  [optional]


## Enum: CatalogType
Allowed values: [RETAIL]



## Enum: ItemResponseKind
Allowed values: [retail_item]




