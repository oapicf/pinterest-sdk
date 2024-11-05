
# Table `CatalogsVerticalsListProductsByCatalogBasedFilterRequest`
(mapped from: CatalogsVerticalsListProductsByCatalogBasedFilterRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**catalogType** | catalog_type | text NOT NULL |  | [**catalog_type**](#CatalogType) |  | 
**catalogId** | catalog_id | text NOT NULL |  | **kotlin.String** | Catalog id pertaining to the creative assets product group. | 
**filters** | filters | long NOT NULL |  | [**CatalogsCreativeAssetsProductGroupFilters**](CatalogsCreativeAssetsProductGroupFilters.md) |  |  [foreignkey]
**country** | country | long NOT NULL |  | [**Country**](Country.md) |  |  [foreignkey]
**locale** | locale | long NOT NULL |  | [**CatalogsLocale**](CatalogsLocale.md) |  |  [foreignkey]







