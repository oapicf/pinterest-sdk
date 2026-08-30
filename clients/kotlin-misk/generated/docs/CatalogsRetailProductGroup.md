
# CatalogsRetailProductGroup

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalogId** | **kotlin.String** | Catalog ID pertaining to the product group. | 
**catalogType** | [**inline**](#CatalogType) |  | 
**feedId** | **kotlin.String** | id of the catalogs feed belonging to this catalog product group | 
**filters** | [**CatalogsProductGroupFilters**](CatalogsProductGroupFilters.md) |  | 
**id** | **kotlin.String** | ID of the catalog product group. | 
**type** | [**CatalogsProductGroupType**](CatalogsProductGroupType.md) |  | 
**country** | **kotlin.String** |  |  [optional]
**createdAt** | **kotlin.Int** | Unix timestamp in seconds of when catalog product group was created. |  [optional]
**description** | **kotlin.String** |  |  [optional]
**isFeatured** | **kotlin.Boolean** | boolean indicator of whether the product group is being featured or not |  [optional]
**locale** | **kotlin.String** |  |  [optional]
**name** | **kotlin.String** | Name of catalog product group |  [optional]
**status** | [**CatalogsProductGroupStatus**](CatalogsProductGroupStatus.md) |  |  [optional]
**updatedAt** | **kotlin.Int** | Unix timestamp in seconds of last time catalog product group was updated. |  [optional]


<a id="CatalogType"></a>
## Enum: catalog_type
Name | Value
---- | -----
catalogType | RETAIL



