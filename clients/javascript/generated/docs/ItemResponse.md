# PinterestSdk.ItemResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**CatalogsCreativeAssetsAttributes**](CatalogsCreativeAssetsAttributes.md) |  | [optional] 
**catalogType** | **String** |  | 
**itemId** | **String** | The catalog item id in the merchant namespace | [optional] 
**itemResponseKind** | **String** | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. | 
**pins** | [**[Pin]**](Pin.md) | The pins mapped to the item | [optional] 
**hotelId** | **String** | The catalog hotel id in the merchant namespace | [optional] 
**creativeAssetsId** | **String** | The catalog creative assets id in the merchant namespace | [optional] 
**errors** | [**[ItemValidationEvent]**](ItemValidationEvent.md) | Array with the errors for the item id requested | 



## Enum: CatalogTypeEnum


* `CREATIVE_ASSETS` (value: `"CREATIVE_ASSETS"`)





## Enum: ItemResponseKindEnum


* `creative_assets_item_error` (value: `"creative_assets_item_error"`)




