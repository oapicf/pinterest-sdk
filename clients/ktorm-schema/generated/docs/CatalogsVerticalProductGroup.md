
# Table `CatalogsVerticalProductGroup`
(mapped from: CatalogsVerticalProductGroup)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**catalogId** | catalog_id | text NOT NULL |  | **kotlin.String** | Catalog ID pertaining to the product group. | 
**catalogType** | catalog_type | text NOT NULL |  | [**catalog_type**](#CatalogType) |  | 
**feedId** | feed_id | text NOT NULL |  | **kotlin.String** | id of the catalogs feed belonging to this catalog product group | 
**filters** | filters | long NOT NULL |  | [**CatalogsCreativeAssetsProductGroupFilters**](CatalogsCreativeAssetsProductGroupFilters.md) |  |  [foreignkey]
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | ID of the catalog product group. | 
**type** | type | long NOT NULL |  | [**CatalogsHotelProductGroupType**](CatalogsHotelProductGroupType.md) |  |  [foreignkey]
**country** | country | text |  | **kotlin.String** |  |  [optional]
**createdAt** | created_at | int |  | **kotlin.Int** | Unix timestamp in seconds of when catalog product group was created. |  [optional]
**description** | description | text |  | **kotlin.String** |  |  [optional]
**isFeatured** | is_featured | boolean |  | **kotlin.Boolean** | boolean indicator of whether the product group is being featured or not |  [optional]
**locale** | locale | text |  | **kotlin.String** |  |  [optional]
**name** | name | text |  | **kotlin.String** | Name of catalog product group |  [optional]
**status** | status | long |  | [**CatalogsProductGroupStatus**](CatalogsProductGroupStatus.md) |  |  [optional] [foreignkey]
**updatedAt** | updated_at | int |  | **kotlin.Int** | Unix timestamp in seconds of last time catalog product group was updated. |  [optional]
















