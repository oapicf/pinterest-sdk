

# CatalogsCreativeAssetsItemResponse

Object describing a creative assets item record

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attributes** | [**CatalogsCreativeAssetsAttributes**](CatalogsCreativeAssetsAttributes.md) |  |  [optional] |
|**catalogType** | [**CatalogTypeEnum**](#CatalogTypeEnum) |  |  |
|**creativeAssetsId** | **String** | The catalog creative assets id in the merchant namespace |  [optional] |
|**itemResponseKind** | [**ItemResponseKindEnum**](#ItemResponseKindEnum) | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. |  |
|**pins** | [**List&lt;Pin&gt;**](Pin.md) | The pins mapped to the item |  [optional] |



## Enum: CatalogTypeEnum

| Name | Value |
|---- | -----|
| CREATIVE_ASSETS | &quot;CREATIVE_ASSETS&quot; |



## Enum: ItemResponseKindEnum

| Name | Value |
|---- | -----|
| CREATIVE_ASSETS_ITEM | &quot;creative_assets_item&quot; |



