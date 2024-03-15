
# Table `CatalogsUpdatableHotelAttributes`
(mapped from: CatalogsUpdatableHotelAttributes)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**name** | name | text |  | **kotlin.String** | The hotel&#39;s name. |  [optional]
**link** | link | text |  | **kotlin.String** | Link to the product page |  [optional]
**description** | description | text |  | **kotlin.String** | Brief description of the hotel. |  [optional]
**brand** | brand | text |  | **kotlin.String** | The brand to which this hotel belongs to. |  [optional]
**latitude** | latitude | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Latitude of the hotel. |  [optional]
**longitude** | longitude | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Longitude of the hotel. |  [optional]
**neighborhood** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | A list of neighborhoods where the hotel is located |  [optional]
**address** | address | long |  | [**CatalogsHotelAddress**](CatalogsHotelAddress.md) |  |  [optional] [foreignkey]
**customLabel0** | custom_label_0 | text |  | **kotlin.String** | Custom grouping of hotels |  [optional]
**customLabel1** | custom_label_1 | text |  | **kotlin.String** | Custom grouping of hotels |  [optional]
**customLabel2** | custom_label_2 | text |  | **kotlin.String** | Custom grouping of hotels |  [optional]
**customLabel3** | custom_label_3 | text |  | **kotlin.String** | Custom grouping of hotels |  [optional]
**customLabel4** | custom_label_4 | text |  | **kotlin.String** | Custom grouping of hotels |  [optional]
**category** | category | text |  | **kotlin.String** | The type of property. The category can be any type of internal description desired. |  [optional]
**basePrice** | base_price | text |  | **kotlin.String** | Base price of the hotel room per night followed by the ISO currency code |  [optional]
**salePrice** | sale_price | text |  | **kotlin.String** | Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel. |  [optional]
**guestRatings** | guest_ratings | long |  | [**CatalogsHotelGuestRatings**](CatalogsHotelGuestRatings.md) |  |  [optional] [foreignkey]








# **Table `CatalogsUpdatableHotelAttributesNeighborhood`**
(mapped from: CatalogsUpdatableHotelAttributesNeighborhood)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsUpdatableHotelAttributes | catalogsUpdatableHotelAttributes | long | | kotlin.Long | Primary Key | *one*
neighborhood | neighborhood | text | | kotlin.String | Foreign Key | *many*













