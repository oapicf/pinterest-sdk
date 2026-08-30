# PinterestSdk.CatalogsCreativeAssetsItemResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**CatalogsCreativeAssetsAttributes**](CatalogsCreativeAssetsAttributes.md) |  | [optional] 
**catalogType** | **String** |  | 
**creativeAssetsId** | **String** | The catalog creative assets id in the merchant namespace | [optional] 
**itemResponseKind** | **String** | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. | 
**pins** | [**[Pin]**](Pin.md) | The pins mapped to the item | [optional] 



## Enum: CatalogTypeEnum


* `CREATIVE_ASSETS` (value: `"CREATIVE_ASSETS"`)





## Enum: ItemResponseKindEnum


* `creative_assets_item` (value: `"creative_assets_item"`)




