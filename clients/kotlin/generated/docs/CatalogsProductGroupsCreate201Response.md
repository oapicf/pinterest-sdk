
# CatalogsProductGroupsCreate201Response

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** | ID of the catalog product group. | 
**filters** | [**CatalogsProductGroupFilters**](CatalogsProductGroupFilters.md) |  | 
**feedId** | **kotlin.String** | id of the catalogs feed belonging to this catalog product group | 
**name** | **kotlin.String** | Name of catalog product group |  [optional]
**description** | **kotlin.String** |  |  [optional]
**isFeatured** | **kotlin.Boolean** | boolean indicator of whether the product group is being featured or not |  [optional]
**type** | [**CatalogsProductGroupType**](CatalogsProductGroupType.md) |  |  [optional]
**status** | [**CatalogsProductGroupStatus**](CatalogsProductGroupStatus.md) |  |  [optional]
**createdAt** | **kotlin.Int** | Unix timestamp in seconds of when catalog product group was created. |  [optional]
**updatedAt** | **kotlin.Int** | Unix timestamp in seconds of last time catalog product group was updated. |  [optional]
**catalogType** | [**inline**](#CatalogType) |  |  [optional]


<a id="CatalogType"></a>
## Enum: catalog_type
Name | Value
---- | -----
catalogType | RETAIL



