
# Table `CatalogsRetailProduct`
(mapped from: CatalogsRetailProduct)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**catalogType** | catalog_type | text NOT NULL |  | [**catalog_type**](#CatalogType) |  | 
**metadata** | metadata | long NOT NULL |  | [**CatalogsRetailProductMetadata**](CatalogsRetailProductMetadata.md) |  |  [foreignkey]
**pin** | pin | long NOT NULL |  | [**Pin**](Pin.md) |  |  [foreignkey]





