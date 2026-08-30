# PinterestSdk.CatalogsRetailItemResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**ItemAttributes**](ItemAttributes.md) |  | [optional] 
**catalogType** | **String** |  | 
**itemId** | **String** | The catalog retail item id in the merchant namespace | [optional] 
**itemResponseKind** | **String** | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. | 
**pins** | [**[Pin]**](Pin.md) | The pins mapped to the item | [optional] 



## Enum: CatalogTypeEnum


* `RETAIL` (value: `"RETAIL"`)





## Enum: ItemResponseKindEnum


* `retail_item` (value: `"retail_item"`)




