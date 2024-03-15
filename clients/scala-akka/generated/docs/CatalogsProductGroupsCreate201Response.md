

# CatalogsProductGroupsCreate201Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | ID of the catalog product group. | 
**name** | **String** | Name of catalog product group |  [optional]
**description** | **String** |  |  [optional]
**filters** | [**CatalogsProductGroupFilters**](CatalogsProductGroupFilters.md) |  | 
**isFeatured** | **Boolean** | boolean indicator of whether the product group is being featured or not |  [optional]
**`type`** | **CatalogsProductGroupType** |  |  [optional]
**status** | **CatalogsProductGroupStatus** |  |  [optional]
**createdAt** | **Int** | Unix timestamp in seconds of when catalog product group was created. |  [optional]
**updatedAt** | **Int** | Unix timestamp in seconds of last time catalog product group was updated. |  [optional]
**feedId** | [**FeedId**](#FeedId) |  | 
**catalogType** | [**CatalogType**](#CatalogType) |  | 
**catalogId** | **String** |  | 


## Enum: FeedId
Allowed values: []



## Enum: CatalogType
Allowed values: [RETAIL]




