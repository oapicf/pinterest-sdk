# PinterestSdk.CatalogsRetailItemErrorResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalogType** | **String** |  | 
**errors** | [**[ItemValidationEvent]**](ItemValidationEvent.md) | Array with the errors for the item id requested | 
**itemId** | **String** | The catalog item id in the merchant namespace | [optional] 
**itemResponseKind** | **String** | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. | 



## Enum: CatalogTypeEnum


* `RETAIL` (value: `"RETAIL"`)





## Enum: ItemResponseKindEnum


* `retail_item_error` (value: `"retail_item_error"`)




