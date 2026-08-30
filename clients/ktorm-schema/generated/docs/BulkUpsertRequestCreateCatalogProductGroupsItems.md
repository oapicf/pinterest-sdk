
# Table `BulkUpsertRequestCreateCatalogProductGroupsItems`
(mapped from: BulkUpsertRequestCreateCatalogProductGroupsItems)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**feedId** | feed_id | text NOT NULL |  | **kotlin.String** | Catalog Feed id pertaining to the catalog product group. | 
**filters** | filters | long NOT NULL |  | [**CatalogsProductGroupFiltersRequest**](CatalogsProductGroupFiltersRequest.md) |  |  [foreignkey]
**name** | name | text NOT NULL |  | **kotlin.String** |  | 
**catalogId** | catalog_id | text NOT NULL |  | **kotlin.String** | Catalog ID pertaining to the product group. | 
**catalogType** | catalog_type | text NOT NULL |  | [**catalog_type**](#CatalogType) |  | 
**description** | description | text |  | **kotlin.String** |  |  [optional]
**isFeatured** | is_featured | boolean |  | **kotlin.Boolean** | boolean indicator of whether the product group is being featured or not |  [optional]
**country** | country | long |  | [**Country**](Country.md) |  |  [optional] [foreignkey]
**locale** | locale | long |  | [**CatalogsLocale**](CatalogsLocale.md) |  |  [optional] [foreignkey]











