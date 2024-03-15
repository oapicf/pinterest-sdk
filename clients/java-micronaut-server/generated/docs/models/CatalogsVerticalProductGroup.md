

# CatalogsVerticalProductGroup

The class is defined in **[CatalogsVerticalProductGroup.java](../../src/main/java/org/openapitools/model/CatalogsVerticalProductGroup.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalogType** | [**CatalogTypeEnum**](#CatalogTypeEnum) |  | 
**id** | `String` | ID of the catalog product group. | 
**name** | `String` | Name of catalog product group |  [optional property]
**description** | `String` |  |  [optional property]
**filters** | [`CatalogsProductGroupFilters`](CatalogsProductGroupFilters.md) |  | 
**createdAt** | `Integer` | Unix timestamp in seconds of when catalog product group was created. |  [optional property]
**updatedAt** | `Integer` | Unix timestamp in seconds of last time catalog product group was updated. |  [optional property]
**catalogId** | `String` |  | 
**isFeatured** | `Boolean` | boolean indicator of whether the product group is being featured or not |  [optional property]
**type** | `CatalogsProductGroupType` |  |  [optional property]
**status** | `CatalogsProductGroupStatus` |  |  [optional property]
**feedId** | [**FeedIdEnum**](#FeedIdEnum) |  | 

## CatalogTypeEnum

Name | Value
---- | -----
RETAIL | `"RETAIL"`











## FeedIdEnum

Name | Value
---- | -----
NULL | `"null"`


