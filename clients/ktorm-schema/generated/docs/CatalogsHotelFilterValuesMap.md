
# Table `catalogs_hotel_filter_values_map`
(mapped from: CatalogsHotelFilterValuesMap)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**brand** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional]
**customLabel0** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional]
**customLabel1** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional]
**customLabel2** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional]
**customLabel3** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional]
**customLabel4** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional]


# **Table `CatalogsHotelFilterValuesMapBrand`**
(mapped from: CatalogsHotelFilterValuesMapBrand)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsHotelFilterValuesMap | catalogsHotelFilterValuesMap | long | | kotlin.Long | Primary Key | *one*
brand | brand | text | | kotlin.String | Foreign Key | *many*



# **Table `CatalogsHotelFilterValuesMapCustomLabel0`**
(mapped from: CatalogsHotelFilterValuesMapCustomLabel0)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsHotelFilterValuesMap | catalogsHotelFilterValuesMap | long | | kotlin.Long | Primary Key | *one*
customLabel0 | customLabel0 | text | | kotlin.String | Foreign Key | *many*



# **Table `CatalogsHotelFilterValuesMapCustomLabel1`**
(mapped from: CatalogsHotelFilterValuesMapCustomLabel1)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsHotelFilterValuesMap | catalogsHotelFilterValuesMap | long | | kotlin.Long | Primary Key | *one*
customLabel1 | customLabel1 | text | | kotlin.String | Foreign Key | *many*



# **Table `CatalogsHotelFilterValuesMapCustomLabel2`**
(mapped from: CatalogsHotelFilterValuesMapCustomLabel2)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsHotelFilterValuesMap | catalogsHotelFilterValuesMap | long | | kotlin.Long | Primary Key | *one*
customLabel2 | customLabel2 | text | | kotlin.String | Foreign Key | *many*



# **Table `CatalogsHotelFilterValuesMapCustomLabel3`**
(mapped from: CatalogsHotelFilterValuesMapCustomLabel3)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsHotelFilterValuesMap | catalogsHotelFilterValuesMap | long | | kotlin.Long | Primary Key | *one*
customLabel3 | customLabel3 | text | | kotlin.String | Foreign Key | *many*



# **Table `CatalogsHotelFilterValuesMapCustomLabel4`**
(mapped from: CatalogsHotelFilterValuesMapCustomLabel4)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsHotelFilterValuesMap | catalogsHotelFilterValuesMap | long | | kotlin.Long | Primary Key | *one*
customLabel4 | customLabel4 | text | | kotlin.String | Foreign Key | *many*



