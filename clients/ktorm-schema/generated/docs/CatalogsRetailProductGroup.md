
# Table `CatalogsRetailProductGroup`
(mapped from: CatalogsRetailProductGroup)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**catalogType** | catalog_type | text NOT NULL |  | [**catalog_type**](#CatalogType) |  | 
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | ID of the catalog product group. | 
**filters** | filters | long NOT NULL |  | [**CatalogsProductGroupFilters**](CatalogsProductGroupFilters.md) |  |  [foreignkey]
**catalogId** | catalog_id | text NOT NULL |  | **kotlin.String** | Catalog id pertaining to the retail product group. | 
**feedId** | feed_id | text NOT NULL |  | **kotlin.String** | id of the catalogs feed belonging to this catalog product group | 
**name** | name | text |  | **kotlin.String** | Name of catalog product group |  [optional]
**description** | description | text |  | **kotlin.String** |  |  [optional]
**isFeatured** | is_featured | boolean |  | **kotlin.Boolean** | boolean indicator of whether the product group is being featured or not |  [optional]
**type** | type | long |  | [**CatalogsProductGroupType**](CatalogsProductGroupType.md) |  |  [optional] [foreignkey]
**status** | status | long |  | [**CatalogsProductGroupStatus**](CatalogsProductGroupStatus.md) |  |  [optional] [foreignkey]
**createdAt** | created_at | int |  | **kotlin.Int** | Unix timestamp in seconds of when catalog product group was created. |  [optional]
**updatedAt** | updated_at | int |  | **kotlin.Int** | Unix timestamp in seconds of last time catalog product group was updated. |  [optional]
**country** | country | text |  | **kotlin.String** |  |  [optional]
**locale** | locale | text |  | **kotlin.String** |  |  [optional]
















