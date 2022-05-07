
# Table `CatalogsProductGroupUpdateRequest`
(mapped from: CatalogsProductGroupUpdateRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**feedId** | feed_id | text NOT NULL |  | **kotlin.String** | Catalog Feed id pertaining to the catalog product group. | 
**name** | name | text NOT NULL |  | **kotlin.String** |  | 
**filters** | filters | long NOT NULL |  | [**CatalogsProductGroupFilters**](CatalogsProductGroupFilters.md) |  |  [foreignkey]
**description** | description | text |  | **kotlin.String** |  |  [optional]






