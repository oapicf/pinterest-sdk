
# Table `CatalogsVerticalProductGroupUpdateRequest`
(mapped from: CatalogsVerticalProductGroupUpdateRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**catalogType** | catalog_type | text |  | [**catalog_type**](#CatalogType) |  |  [optional]
**country** | country | long |  | [**Country**](Country.md) |  |  [optional] [foreignkey]
**description** | description | text |  | **kotlin.String** |  |  [optional]
**filters** | filters | long |  | [**CatalogsCreativeAssetsProductGroupFilters**](CatalogsCreativeAssetsProductGroupFilters.md) |  |  [optional] [foreignkey]
**locale** | locale | long |  | [**CatalogsLocale**](CatalogsLocale.md) |  |  [optional] [foreignkey]
**name** | name | text |  | **kotlin.String** | Name of catalog product group |  [optional]








