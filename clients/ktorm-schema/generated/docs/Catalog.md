
# Table `Catalog`
(mapped from: Catalog)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**createdAt** | created_at | datetime NOT NULL |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) |  | 
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | ID of the catalog entity. | 
**updatedAt** | updated_at | datetime NOT NULL |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) |  | 
**name** | name | text NOT NULL |  | **kotlin.String** | A human-friendly name associated to a catalog entity. | 
**catalogType** | catalog_type | long NOT NULL |  | [**CatalogsType**](CatalogsType.md) |  |  [foreignkey]







