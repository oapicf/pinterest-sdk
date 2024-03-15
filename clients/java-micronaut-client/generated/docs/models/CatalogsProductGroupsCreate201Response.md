

# CatalogsProductGroupsCreate201Response

The class is defined in **[CatalogsProductGroupsCreate201Response.java](../../src/main/java/org/openapitools/model/CatalogsProductGroupsCreate201Response.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | `String` | ID of the catalog product group. | 
**name** | `String` | Name of catalog product group |  [optional property]
**description** | `String` |  |  [optional property]
**filters** | [`CatalogsProductGroupFilters`](CatalogsProductGroupFilters.md) |  | 
**isFeatured** | `Boolean` | boolean indicator of whether the product group is being featured or not |  [optional property]
**type** | `CatalogsProductGroupType` |  |  [optional property]
**status** | `CatalogsProductGroupStatus` |  |  [optional property]
**createdAt** | `Integer` | Unix timestamp in seconds of when catalog product group was created. |  [optional property]
**updatedAt** | `Integer` | Unix timestamp in seconds of last time catalog product group was updated. |  [optional property]
**feedId** | `String` | id of the catalogs feed belonging to this catalog product group | 
**catalogType** | [**CatalogTypeEnum**](#CatalogTypeEnum) |  |  [optional property]











## CatalogTypeEnum

Name | Value
---- | -----
RETAIL | `"RETAIL"`


