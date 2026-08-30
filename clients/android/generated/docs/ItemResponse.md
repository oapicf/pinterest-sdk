

# ItemResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**CatalogsCreativeAssetsAttributes**](CatalogsCreativeAssetsAttributes.md) |  |  [optional]
**catalogType** | [**CatalogTypeEnum**](#CatalogTypeEnum) |  | 
**itemId** | **String** | The catalog item id in the merchant namespace |  [optional]
**itemResponseKind** | [**ItemResponseKindEnum**](#ItemResponseKindEnum) | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. | 
**pins** | [**List&lt;Pin&gt;**](Pin.md) | The pins mapped to the item |  [optional]
**hotelId** | **String** | The catalog hotel id in the merchant namespace |  [optional]
**creativeAssetsId** | **String** | The catalog creative assets id in the merchant namespace |  [optional]
**errors** | [**List&lt;ItemValidationEvent&gt;**](ItemValidationEvent.md) | Array with the errors for the item id requested | 


## Enum: CatalogTypeEnum

Name | Value
---- | -----


## Enum: ItemResponseKindEnum

Name | Value
---- | -----




