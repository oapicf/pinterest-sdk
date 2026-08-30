
# CatalogsCreativeAssetsItemErrorResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalogType** | [**inline**](#CatalogType) |  | 
**errors** | [**kotlin.collections.List&lt;ItemValidationEvent&gt;**](ItemValidationEvent.md) | Array with the errors for the item id requested | 
**itemResponseKind** | [**inline**](#ItemResponseKind) | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. | 
**creativeAssetsId** | **kotlin.String** | The catalog creative assets id in the merchant namespace |  [optional]


<a id="CatalogType"></a>
## Enum: catalog_type
Name | Value
---- | -----
catalogType | CREATIVE_ASSETS


<a id="ItemResponseKind"></a>
## Enum: item_response_kind
Name | Value
---- | -----
itemResponseKind | creative_assets_item_error



