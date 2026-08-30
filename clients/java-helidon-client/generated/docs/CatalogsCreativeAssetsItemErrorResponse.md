

# CatalogsCreativeAssetsItemErrorResponse

Object describing a creative assets item error

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**catalogType** | [**CatalogTypeEnum**](#CatalogTypeEnum) |  |  |
|**creativeAssetsId** | **String** | The catalog creative assets id in the merchant namespace |  [optional] |
|**errors** | [**List&lt;ItemValidationEvent&gt;**](ItemValidationEvent.md) | Array with the errors for the item id requested |  |
|**itemResponseKind** | [**ItemResponseKindEnum**](#ItemResponseKindEnum) | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. |  |



## Enum: CatalogTypeEnum

| Name | Value |
|---- | -----|
| CREATIVE_ASSETS | &quot;CREATIVE_ASSETS&quot; |



## Enum: ItemResponseKindEnum

| Name | Value |
|---- | -----|
| CREATIVE_ASSETS_ITEM_ERROR | &quot;creative_assets_item_error&quot; |



