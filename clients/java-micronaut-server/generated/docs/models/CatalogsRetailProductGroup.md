

# CatalogsRetailProductGroup

The class is defined in **[CatalogsRetailProductGroup.java](../../src/main/java/org/openapitools/model/CatalogsRetailProductGroup.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalogType** | [**CatalogTypeEnum**](#CatalogTypeEnum) |  | 
**id** | `String` | ID of the catalog product group. | 
**name** | `String` | Name of catalog product group |  [optional property]
**description** | `String` |  |  [optional property]
**filters** | [`CatalogsProductGroupFilters`](CatalogsProductGroupFilters.md) |  | 
**isFeatured** | `Boolean` | boolean indicator of whether the product group is being featured or not |  [optional property]
**type** | `CatalogsProductGroupType` |  |  [optional property]
**status** | `CatalogsProductGroupStatus` |  |  [optional property]
**createdAt** | `Integer` | Unix timestamp in seconds of when catalog product group was created. |  [optional property]
**updatedAt** | `Integer` | Unix timestamp in seconds of last time catalog product group was updated. |  [optional property]
**catalogId** | `String` | Catalog id pertaining to the retail product group. | 
**feedId** | `String` | id of the catalogs feed belonging to this catalog product group | 
**country** | `String` |  |  [optional property]
**locale** | `String` |  |  [optional property]

## CatalogTypeEnum

Name | Value
---- | -----
RETAIL | `"RETAIL"`















