
# Table `CatalogsListProductsByFilterRequest`
(mapped from: CatalogsListProductsByFilterRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**feedId** | feed_id | text NOT NULL |  | **kotlin.String** | Catalog Feed id pertaining to the catalog product group filter. | 
**filters** | filters | long NOT NULL |  | [**CatalogsProductGroupFilters**](CatalogsProductGroupFilters.md) |  |  [foreignkey]
**catalogId** | catalog_id | text NOT NULL |  | **kotlin.String** | Catalog ID pertaining to the product group. | 
**catalogType** | catalog_type | text NOT NULL |  | [**catalog_type**](#CatalogType) |  | 
**country** | country | long NOT NULL |  | [**Country**](Country.md) |  |  [foreignkey]
**locale** | locale | long NOT NULL |  | [**CatalogsLocale**](CatalogsLocale.md) |  |  [foreignkey]








