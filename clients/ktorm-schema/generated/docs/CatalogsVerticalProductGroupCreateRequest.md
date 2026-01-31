
# Table `CatalogsVerticalProductGroupCreateRequest`
(mapped from: CatalogsVerticalProductGroupCreateRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**catalogId** | catalog_id | text NOT NULL |  | **kotlin.String** | Catalog id pertaining to the creative assets product group. | 
**catalogType** | catalog_type | text NOT NULL |  | [**catalog_type**](#CatalogType) |  | 
**filters** | filters | long NOT NULL |  | [**CatalogsCreativeAssetsProductGroupFilters**](CatalogsCreativeAssetsProductGroupFilters.md) |  |  [foreignkey]
**name** | name | text NOT NULL |  | **kotlin.String** |  | 
**country** | country | long |  | [**Country**](Country.md) |  |  [optional] [foreignkey]
**description** | description | text |  | **kotlin.String** |  |  [optional]
**locale** | locale | long |  | [**CatalogsLocale**](CatalogsLocale.md) |  |  [optional] [foreignkey]









