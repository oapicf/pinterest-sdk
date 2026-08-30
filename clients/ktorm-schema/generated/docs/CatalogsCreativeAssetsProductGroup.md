
# Table `CatalogsCreativeAssetsProductGroup`
(mapped from: CatalogsCreativeAssetsProductGroup)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**catalogId** | catalog_id | text NOT NULL |  | **kotlin.String** | Catalog ID pertaining to the product group. | 
**catalogType** | catalog_type | text NOT NULL |  | [**catalog_type**](#CatalogType) |  | 
**filters** | filters | long NOT NULL |  | [**CatalogsCreativeAssetsProductGroupFilters**](CatalogsCreativeAssetsProductGroupFilters.md) |  |  [foreignkey]
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | ID of the catalog product group. | 
**createdAt** | created_at | int |  | **kotlin.Int** | Unix timestamp in seconds of when catalog product group was created. |  [optional]
**description** | description | text |  | **kotlin.String** |  |  [optional]
**name** | name | text |  | **kotlin.String** | Name of catalog product group |  [optional]
**updatedAt** | updated_at | int |  | **kotlin.Int** | Unix timestamp in seconds of last time catalog product group was updated. |  [optional]










