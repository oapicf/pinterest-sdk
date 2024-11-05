
# Table `CatalogsRetailProductGroupUpdateRequest`
(mapped from: CatalogsRetailProductGroupUpdateRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**catalogType** | catalog_type | text |  | [**catalog_type**](#CatalogType) | Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one. |  [optional]
**name** | name | text |  | **kotlin.String** |  |  [optional]
**description** | description | text |  | **kotlin.String** |  |  [optional]
**filters** | filters | long |  | [**CatalogsProductGroupFiltersRequest**](CatalogsProductGroupFiltersRequest.md) |  |  [optional] [foreignkey]
**country** | country | long |  | [**Country**](Country.md) |  |  [optional] [foreignkey]
**locale** | locale | long |  | [**CatalogsLocale**](CatalogsLocale.md) |  |  [optional] [foreignkey]








