# PinterestSdk.CatalogsCreativeAssetsItemErrorResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalogType** | **String** |  | 
**creativeAssetsId** | **String** | The catalog creative assets id in the merchant namespace | [optional] 
**errors** | [**[ItemValidationEvent]**](ItemValidationEvent.md) | Array with the errors for the item id requested | 
**itemResponseKind** | **String** | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. | 



## Enum: CatalogTypeEnum


* `CREATIVE_ASSETS` (value: `"CREATIVE_ASSETS"`)





## Enum: ItemResponseKindEnum


* `creative_assets_item_error` (value: `"creative_assets_item_error"`)




