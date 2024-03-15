
# Table `CatalogsHotelItemResponse`
(mapped from: CatalogsHotelItemResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**catalogType** | catalog_type | long NOT NULL |  | [**CatalogsType**](CatalogsType.md) |  |  [foreignkey]
**hotelId** | hotel_id | text |  | **kotlin.String** | The catalog hotel id in the merchant namespace |  [optional]
**pins** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;Pin&gt;**](Pin.md) | The pins mapped to the item |  [optional]
**attributes** | attributes | long |  | [**CatalogsHotelAttributes**](CatalogsHotelAttributes.md) |  |  [optional] [foreignkey]




# **Table `CatalogsHotelItemResponsePin`**
(mapped from: CatalogsHotelItemResponsePin)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsHotelItemResponse | catalogsHotelItemResponse | long | | kotlin.Long | Primary Key | *one*
pin | pin | long | | kotlin.Long | Foreign Key | *many*




