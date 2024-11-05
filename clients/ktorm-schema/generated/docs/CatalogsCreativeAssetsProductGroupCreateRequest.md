
# Table `CatalogsCreativeAssetsProductGroupCreateRequest`
(mapped from: CatalogsCreativeAssetsProductGroupCreateRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**catalogType** | catalog_type | text NOT NULL |  | [**catalog_type**](#CatalogType) |  | 
**name** | name | text NOT NULL |  | **kotlin.String** |  | 
**filters** | filters | long NOT NULL |  | [**CatalogsCreativeAssetsProductGroupFilters**](CatalogsCreativeAssetsProductGroupFilters.md) |  |  [foreignkey]
**catalogId** | catalog_id | text NOT NULL |  | **kotlin.String** | Catalog id pertaining to the creative assets product group. | 
**description** | description | text |  | **kotlin.String** |  |  [optional]







