
# Table `CatalogsProductGroupsUpdateRequestSchema`
(mapped from: CatalogsProductGroupsUpdateRequestSchema)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**description** | description | text |  | **kotlin.String** |  |  [optional]
**filters** | filters | long |  | [**CatalogsProductGroupFiltersRequest**](CatalogsProductGroupFiltersRequest.md) |  |  [optional] [foreignkey]
**isFeatured** | is_featured | boolean |  | **kotlin.Boolean** | boolean indicator of whether the product group is being featured or not |  [optional]
**name** | name | text |  | **kotlin.String** |  |  [optional]
**catalogType** | catalog_type | text |  | [**catalog_type**](#CatalogType) |  |  [optional]
**country** | country | long |  | [**Country**](Country.md) |  |  [optional] [foreignkey]
**locale** | locale | long |  | [**CatalogsLocale**](CatalogsLocale.md) |  |  [optional] [foreignkey]









