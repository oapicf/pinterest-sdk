
# Table `CatalogsUpdatableHotelAttributes`
(mapped from: CatalogsUpdatableHotelAttributes)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**address** | address | long |  | [**CatalogsHotelAddress**](CatalogsHotelAddress.md) | Hotel address |  [optional] [foreignkey]
**basePrice** | base_price | text |  | **kotlin.String** | Base price of the hotel room per night followed by the ISO currency code |  [optional]
**brand** | brand | text |  | **kotlin.String** | The brand to which this hotel belongs to. |  [optional]
**category** | category | text |  | **kotlin.String** | The type of property. The category can be any type of internal description desired. |  [optional]
**customLabel0** | custom_label_0 | text |  | **kotlin.String** | Custom grouping of hotels |  [optional]
**customLabel1** | custom_label_1 | text |  | **kotlin.String** | Custom grouping of hotels |  [optional]
**customLabel2** | custom_label_2 | text |  | **kotlin.String** | Custom grouping of hotels |  [optional]
**customLabel3** | custom_label_3 | text |  | **kotlin.String** | Custom grouping of hotels |  [optional]
**customLabel4** | custom_label_4 | text |  | **kotlin.String** | Custom grouping of hotels |  [optional]
**description** | description | text |  | **kotlin.String** | Brief description of the hotel. |  [optional]
**guestRatings** | guest_ratings | long |  | [**CatalogsHotelGuestRatings**](CatalogsHotelGuestRatings.md) | If specified, you must provide all properties |  [optional] [foreignkey]
**latitude** | latitude | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Latitude of the hotel. |  [optional]
**link** | link | text |  | **kotlin.String** | Link to the product page |  [optional]
**longitude** | longitude | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Longitude of the hotel. |  [optional]
**name** | name | text |  | **kotlin.String** | The hotel&#39;s name. |  [optional]
**neighborhood** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | A list of neighborhoods where the hotel is located |  [optional]
**salePrice** | sale_price | text |  | **kotlin.String** | Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel. |  [optional]

















# **Table `CatalogsUpdatableHotelAttributesNeighborhood`**
(mapped from: CatalogsUpdatableHotelAttributesNeighborhood)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsUpdatableHotelAttributes | catalogsUpdatableHotelAttributes | long | | kotlin.Long | Primary Key | *one*
neighborhood | neighborhood | text | | kotlin.String | Foreign Key | *many*




