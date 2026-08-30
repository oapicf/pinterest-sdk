

# CatalogsRetailItemErrorResponse

Object describing a retail item error

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**catalogType** | [**CatalogTypeEnum**](#CatalogTypeEnum) |  |  |
|**errors** | [**List&lt;ItemValidationEvent&gt;**](ItemValidationEvent.md) | Array with the errors for the item id requested |  |
|**itemId** | **String** | The catalog item id in the merchant namespace |  [optional] |
|**itemResponseKind** | [**ItemResponseKindEnum**](#ItemResponseKindEnum) | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. |  |



## Enum: CatalogTypeEnum

| Name | Value |
|---- | -----|
| RETAIL | &quot;RETAIL&quot; |



## Enum: ItemResponseKindEnum

| Name | Value |
|---- | -----|
| RETAIL_ITEM_ERROR | &quot;retail_item_error&quot; |



