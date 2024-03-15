
# Table `ItemResponse`
(mapped from: ItemResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**catalogType** | catalog_type | long NOT NULL |  | [**CatalogsType**](CatalogsType.md) |  |  [foreignkey]
**itemId** | item_id | text |  | **kotlin.String** | The catalog item id in the merchant namespace |  [optional]
**pins** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;Pin&gt;**](Pin.md) | The pins mapped to the item |  [optional]
**attributes** | attributes | long |  | [**CatalogsHotelAttributes**](CatalogsHotelAttributes.md) |  |  [optional] [foreignkey]
**hotelId** | hotel_id | text |  | **kotlin.String** | The catalog hotel id in the merchant namespace |  [optional]
**errors** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemValidationEvent&gt;**](ItemValidationEvent.md) | Array with the errors for the item id requested |  [optional]




# **Table `ItemResponsePin`**
(mapped from: ItemResponsePin)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
itemResponse | itemResponse | long | | kotlin.Long | Primary Key | *one*
pin | pin | long | | kotlin.Long | Foreign Key | *many*





# **Table `ItemResponseItemValidationEvent`**
(mapped from: ItemResponseItemValidationEvent)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
itemResponse | itemResponse | long | | kotlin.Long | Primary Key | *one*
itemValidationEvent | itemValidationEvent | long | | kotlin.Long | Foreign Key | *many*



