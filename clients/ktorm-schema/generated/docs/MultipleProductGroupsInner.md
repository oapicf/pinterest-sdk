
# Table `multiple_product_groups_inner`
(mapped from: MultipleProductGroupsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**name** | name | text NOT NULL |  | **kotlin.String** |  | 
**filters** | filters | long NOT NULL |  | [**CatalogsProductGroupFiltersRequest**](CatalogsProductGroupFiltersRequest.md) |  |  [foreignkey]
**feedId** | feed_id | text NOT NULL |  | **kotlin.String** | Catalog Feed id pertaining to the catalog product group. | 
**catalogType** | catalog_type | text NOT NULL |  | [**catalog_type**](#CatalogType) |  | 
**catalogId** | catalog_id | text NOT NULL |  | **kotlin.String** | Catalog id pertaining to the creative assets product group. | 
**country** | country | long NOT NULL |  | [**Country**](Country.md) |  |  [foreignkey]
**locale** | locale | long NOT NULL |  | [**CatalogsLocale**](CatalogsLocale.md) |  |  [foreignkey]
**description** | description | text |  | **kotlin.String** |  |  [optional]
**isFeatured** | is_featured | boolean |  | **kotlin.Boolean** | boolean indicator of whether the product group is being featured or not |  [optional]











