
# Table `CatalogsHotelListProductsByCatalogBasedFilterRequest`
(mapped from: CatalogsHotelListProductsByCatalogBasedFilterRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**catalogId** | catalog_id | text NOT NULL |  | **kotlin.String** | Catalog ID pertaining to the product group. | 
**catalogType** | catalog_type | text NOT NULL |  | [**catalog_type**](#CatalogType) |  | 
**filters** | filters | long NOT NULL |  | [**CatalogsHotelProductGroupFilters**](CatalogsHotelProductGroupFilters.md) |  |  [foreignkey]





