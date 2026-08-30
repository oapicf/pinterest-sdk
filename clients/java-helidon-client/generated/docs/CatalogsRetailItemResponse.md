

# CatalogsRetailItemResponse

Object describing a retail item record

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attributes** | [**ItemAttributes**](ItemAttributes.md) |  |  [optional] |
|**catalogType** | [**CatalogTypeEnum**](#CatalogTypeEnum) |  |  |
|**itemId** | **String** | The catalog retail item id in the merchant namespace |  [optional] |
|**itemResponseKind** | [**ItemResponseKindEnum**](#ItemResponseKindEnum) | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. |  |
|**pins** | [**List&lt;Pin&gt;**](Pin.md) | The pins mapped to the item |  [optional] |



## Enum: CatalogTypeEnum

| Name | Value |
|---- | -----|
| RETAIL | &quot;RETAIL&quot; |



## Enum: ItemResponseKindEnum

| Name | Value |
|---- | -----|
| RETAIL_ITEM | &quot;retail_item&quot; |



