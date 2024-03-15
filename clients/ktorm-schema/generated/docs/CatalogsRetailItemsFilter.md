
# Table `CatalogsRetailItemsFilter`
(mapped from: CatalogsRetailItemsFilter)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**catalogType** | catalog_type | text NOT NULL |  | [**catalog_type**](#CatalogType) |  | 
**itemIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  | 
**catalogId** | catalog_id | text |  | **kotlin.String** | Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog |  [optional]



# **Table `CatalogsRetailItemsFilterItemIds`**
(mapped from: CatalogsRetailItemsFilterItemIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsRetailItemsFilter | catalogsRetailItemsFilter | long | | kotlin.Long | Primary Key | *one*
itemIds | itemIds | text | | kotlin.String | Foreign Key | *many*




