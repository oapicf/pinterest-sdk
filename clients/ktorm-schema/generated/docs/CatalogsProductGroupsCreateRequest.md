
# Table `catalogs_product_groups_create_request`
(mapped from: CatalogsProductGroupsCreateRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**name** | name | text NOT NULL |  | **kotlin.String** |  | 
**filters** | filters | long NOT NULL |  | [**CatalogsProductGroupFiltersRequest**](CatalogsProductGroupFiltersRequest.md) |  |  [foreignkey]
**feedId** | feed_id | text NOT NULL |  | **kotlin.String** | Catalog Feed id pertaining to the catalog product group. | 
**catalogType** | catalog_type | text NOT NULL |  | [**catalog_type**](#CatalogType) |  | 
**catalogId** | catalog_id | text NOT NULL |  | **kotlin.String** | Catalog id pertaining to the hotel product group. | 
**description** | description | text |  | **kotlin.String** |  |  [optional]
**isFeatured** | is_featured | boolean |  | **kotlin.Boolean** | boolean indicator of whether the product group is being featured or not |  [optional]









