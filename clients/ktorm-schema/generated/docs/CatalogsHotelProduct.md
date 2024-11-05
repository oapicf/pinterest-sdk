
# Table `CatalogsHotelProduct`
(mapped from: CatalogsHotelProduct)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**catalogType** | catalog_type | text NOT NULL |  | [**catalog_type**](#CatalogType) |  | 
**metadata** | metadata | long NOT NULL |  | [**CatalogsHotelProductMetadata**](CatalogsHotelProductMetadata.md) |  |  [foreignkey]
**pin** | pin | long NOT NULL |  | [**Pin**](Pin.md) |  |  [foreignkey]





