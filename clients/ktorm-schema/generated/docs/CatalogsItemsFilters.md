
# Table `CatalogsItemsFilters`
(mapped from: CatalogsItemsFilters)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**catalogType** | catalog_type | text NOT NULL |  | [**catalog_type**](#CatalogType) |  | 
**itemIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  | 
**hotelIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  | 
**catalogId** | catalog_id | text |  | **kotlin.String** | Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog |  [optional]



# **Table `CatalogsItemsFiltersItemIds`**
(mapped from: CatalogsItemsFiltersItemIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsItemsFilters | catalogsItemsFilters | long | | kotlin.Long | Primary Key | *one*
itemIds | itemIds | text | | kotlin.String | Foreign Key | *many*



# **Table `CatalogsItemsFiltersHotelIds`**
(mapped from: CatalogsItemsFiltersHotelIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsItemsFilters | catalogsItemsFilters | long | | kotlin.Long | Primary Key | *one*
hotelIds | hotelIds | text | | kotlin.String | Foreign Key | *many*




