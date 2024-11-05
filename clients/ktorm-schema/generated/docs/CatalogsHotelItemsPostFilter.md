
# Table `CatalogsHotelItemsPostFilter`
(mapped from: CatalogsHotelItemsPostFilter)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**catalogType** | catalog_type | text NOT NULL |  | [**catalog_type**](#CatalogType) |  | 
**hotelIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  | 
**catalogId** | catalog_id | text |  | **kotlin.String** | Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog |  [optional]



# **Table `CatalogsHotelItemsPostFilterHotelIds`**
(mapped from: CatalogsHotelItemsPostFilterHotelIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsHotelItemsPostFilter | catalogsHotelItemsPostFilter | long | | kotlin.Long | Primary Key | *one*
hotelIds | hotelIds | text | | kotlin.String | Foreign Key | *many*




