
# Table `CatalogsHotelProductGroupCreateRequest`
(mapped from: CatalogsHotelProductGroupCreateRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**catalogId** | catalog_id | text NOT NULL |  | **kotlin.String** | Catalog id pertaining to the hotel product group. | 
**catalogType** | catalog_type | text NOT NULL |  | [**catalog_type**](#CatalogType) |  | 
**filters** | filters | long NOT NULL |  | [**CatalogsHotelProductGroupFilters**](CatalogsHotelProductGroupFilters.md) |  |  [foreignkey]
**name** | name | text NOT NULL |  | **kotlin.String** |  | 
**description** | description | text |  | **kotlin.String** |  |  [optional]







