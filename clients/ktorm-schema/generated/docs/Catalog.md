
# Table `Catalog`
(mapped from: Catalog)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**catalogType** | catalog_type | long NOT NULL |  | [**CatalogsType**](CatalogsType.md) |  |  [foreignkey]
**createdAt** | created_at | datetime NOT NULL |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) |  |  [readonly]
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | ID of the catalog entity. | 
**name** | name | text NOT NULL |  | **kotlin.String** | A human-friendly name associated to a catalog entity. | 
**updatedAt** | updated_at | datetime NOT NULL |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) |  |  [readonly]







