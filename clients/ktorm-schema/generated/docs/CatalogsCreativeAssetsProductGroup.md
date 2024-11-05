
# Table `CatalogsCreativeAssetsProductGroup`
(mapped from: CatalogsCreativeAssetsProductGroup)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**catalogType** | catalog_type | text NOT NULL |  | [**catalog_type**](#CatalogType) |  | 
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | ID of the creative assets product group. | 
**filters** | filters | long NOT NULL |  | [**CatalogsCreativeAssetsProductGroupFilters**](CatalogsCreativeAssetsProductGroupFilters.md) |  |  [foreignkey]
**catalogId** | catalog_id | text NOT NULL |  | **kotlin.String** | Catalog id pertaining to the creative assets product group. | 
**name** | name | text |  | **kotlin.String** | Name of creative assets product group |  [optional]
**description** | description | text |  | **kotlin.String** |  |  [optional]
**createdAt** | created_at | int |  | **kotlin.Int** | Unix timestamp in seconds of when catalog product group was created. |  [optional]
**updatedAt** | updated_at | int |  | **kotlin.Int** | Unix timestamp in seconds of last time catalog product group was updated. |  [optional]










