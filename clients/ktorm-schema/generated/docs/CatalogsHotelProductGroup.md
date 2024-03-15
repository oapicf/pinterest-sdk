
# Table `CatalogsHotelProductGroup`
(mapped from: CatalogsHotelProductGroup)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**catalogType** | catalog_type | text NOT NULL |  | [**catalog_type**](#CatalogType) |  | 
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | ID of the hotel product group. | 
**filters** | filters | long NOT NULL |  | [**CatalogsHotelProductGroupFilters**](CatalogsHotelProductGroupFilters.md) |  |  [foreignkey]
**catalogId** | catalog_id | text NOT NULL |  | **kotlin.String** |  | 
**name** | name | text |  | **kotlin.String** | Name of hotel product group |  [optional]
**description** | description | text |  | **kotlin.String** |  |  [optional]
**createdAt** | created_at | int |  | **kotlin.Int** | Unix timestamp in seconds of when catalog product group was created. |  [optional]
**updatedAt** | updated_at | int |  | **kotlin.Int** | Unix timestamp in seconds of last time catalog product group was updated. |  [optional]










