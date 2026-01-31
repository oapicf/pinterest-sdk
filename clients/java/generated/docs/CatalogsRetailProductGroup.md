

# CatalogsRetailProductGroup


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**catalogId** | **String** | Catalog id pertaining to the retail product group. |  |
|**catalogType** | [**CatalogTypeEnum**](#CatalogTypeEnum) |  |  |
|**country** | **String** |  |  [optional] |
|**createdAt** | **Integer** | Unix timestamp in seconds of when catalog product group was created. |  [optional] |
|**description** | **String** |  |  [optional] |
|**feedId** | **String** | id of the catalogs feed belonging to this catalog product group |  |
|**filters** | [**CatalogsProductGroupFilters**](CatalogsProductGroupFilters.md) |  |  |
|**id** | **String** | ID of the catalog product group. |  |
|**isFeatured** | **Boolean** | boolean indicator of whether the product group is being featured or not |  [optional] |
|**locale** | **String** |  |  [optional] |
|**name** | **String** | Name of catalog product group |  [optional] |
|**status** | **CatalogsProductGroupStatus** |  |  [optional] |
|**type** | **CatalogsProductGroupType** |  |  |
|**updatedAt** | **Integer** | Unix timestamp in seconds of last time catalog product group was updated. |  [optional] |



## Enum: CatalogTypeEnum

| Name | Value |
|---- | -----|
| RETAIL | &quot;RETAIL&quot; |



