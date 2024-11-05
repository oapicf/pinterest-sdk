
# Table `CatalogsItemsPostFilters`
(mapped from: CatalogsItemsPostFilters)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**catalogType** | catalog_type | text NOT NULL |  | [**catalog_type**](#CatalogType) |  | 
**itemIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  | 
**hotelIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  | 
**creativeAssetsIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  | 
**catalogId** | catalog_id | text |  | **kotlin.String** | Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog |  [optional]



# **Table `CatalogsItemsPostFiltersItemIds`**
(mapped from: CatalogsItemsPostFiltersItemIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsItemsPostFilters | catalogsItemsPostFilters | long | | kotlin.Long | Primary Key | *one*
itemIds | itemIds | text | | kotlin.String | Foreign Key | *many*



# **Table `CatalogsItemsPostFiltersHotelIds`**
(mapped from: CatalogsItemsPostFiltersHotelIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsItemsPostFilters | catalogsItemsPostFilters | long | | kotlin.Long | Primary Key | *one*
hotelIds | hotelIds | text | | kotlin.String | Foreign Key | *many*



# **Table `CatalogsItemsPostFiltersCreativeAssetsIds`**
(mapped from: CatalogsItemsPostFiltersCreativeAssetsIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsItemsPostFilters | catalogsItemsPostFilters | long | | kotlin.Long | Primary Key | *one*
creativeAssetsIds | creativeAssetsIds | text | | kotlin.String | Foreign Key | *many*




