
# Table `CatalogsCreativeAssetsItemsPostFilter`
(mapped from: CatalogsCreativeAssetsItemsPostFilter)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**catalogType** | catalog_type | text NOT NULL |  | [**catalog_type**](#CatalogType) |  | 
**creativeAssetsIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  | 
**catalogId** | catalog_id | text |  | **kotlin.String** | Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog |  [optional]



# **Table `CatalogsCreativeAssetsItemsPostFilterCreativeAssetsIds`**
(mapped from: CatalogsCreativeAssetsItemsPostFilterCreativeAssetsIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsCreativeAssetsItemsPostFilter | catalogsCreativeAssetsItemsPostFilter | long | | kotlin.Long | Primary Key | *one*
creativeAssetsIds | creativeAssetsIds | text | | kotlin.String | Foreign Key | *many*




