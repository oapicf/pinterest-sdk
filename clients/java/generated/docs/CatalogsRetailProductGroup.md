

# CatalogsRetailProductGroup


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**catalogType** | [**CatalogTypeEnum**](#CatalogTypeEnum) |  |  |
|**id** | **String** | ID of the catalog product group. |  |
|**name** | **String** | Name of catalog product group |  [optional] |
|**description** | **String** |  |  [optional] |
|**filters** | [**CatalogsProductGroupFilters**](CatalogsProductGroupFilters.md) |  |  |
|**isFeatured** | **Boolean** | boolean indicator of whether the product group is being featured or not |  [optional] |
|**type** | **CatalogsProductGroupType** |  |  [optional] |
|**status** | **CatalogsProductGroupStatus** |  |  [optional] |
|**createdAt** | **Integer** | Unix timestamp in seconds of when catalog product group was created. |  [optional] |
|**updatedAt** | **Integer** | Unix timestamp in seconds of last time catalog product group was updated. |  [optional] |
|**feedId** | [**FeedIdEnum**](#FeedIdEnum) |  |  |



## Enum: CatalogTypeEnum

| Name | Value |
|---- | -----|
| RETAIL | &quot;RETAIL&quot; |



## Enum: FeedIdEnum

| Name | Value |
|---- | -----|
| NULL | &quot;null&quot; |



