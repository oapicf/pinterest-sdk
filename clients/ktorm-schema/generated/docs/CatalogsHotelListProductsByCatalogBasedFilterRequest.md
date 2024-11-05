
# Table `CatalogsHotelListProductsByCatalogBasedFilterRequest`
(mapped from: CatalogsHotelListProductsByCatalogBasedFilterRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**catalogType** | catalog_type | text NOT NULL |  | [**catalog_type**](#CatalogType) |  | 
**catalogId** | catalog_id | text NOT NULL |  | **kotlin.String** | Catalog id pertaining to the hotel product group. | 
**filters** | filters | long NOT NULL |  | [**CatalogsHotelProductGroupFilters**](CatalogsHotelProductGroupFilters.md) |  |  [foreignkey]





