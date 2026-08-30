
# Table `CatalogsCreativeAssetsProductGroupCreateRequest`
(mapped from: CatalogsCreativeAssetsProductGroupCreateRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**catalogId** | catalog_id | text NOT NULL |  | **kotlin.String** | Catalog ID pertaining to the product group. | 
**catalogType** | catalog_type | text NOT NULL |  | [**catalog_type**](#CatalogType) |  | 
**filters** | filters | long NOT NULL |  | [**CatalogsCreativeAssetsProductGroupFilters**](CatalogsCreativeAssetsProductGroupFilters.md) |  |  [foreignkey]
**name** | name | text NOT NULL |  | **kotlin.String** |  | 
**description** | description | text |  | **kotlin.String** |  |  [optional]







