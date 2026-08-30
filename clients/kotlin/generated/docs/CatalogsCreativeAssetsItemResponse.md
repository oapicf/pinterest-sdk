
# CatalogsCreativeAssetsItemResponse

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **catalogType** | [**inline**](#CatalogType) |  |  |
| **itemResponseKind** | [**inline**](#ItemResponseKind) | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. |  |
| **attributes** | [**CatalogsCreativeAssetsAttributes**](CatalogsCreativeAssetsAttributes.md) |  |  [optional] |
| **creativeAssetsId** | **kotlin.String** | The catalog creative assets id in the merchant namespace |  [optional] |
| **pins** | [**kotlin.collections.List&lt;Pin&gt;**](Pin.md) | The pins mapped to the item |  [optional] |


<a id="CatalogType"></a>
## Enum: catalog_type
| Name | Value |
| ---- | ----- |
| catalogType | CREATIVE_ASSETS |


<a id="ItemResponseKind"></a>
## Enum: item_response_kind
| Name | Value |
| ---- | ----- |
| itemResponseKind | creative_assets_item |



