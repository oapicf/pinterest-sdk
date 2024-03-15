
# Table `CatalogsHotelItemErrorResponse`
(mapped from: CatalogsHotelItemErrorResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**catalogType** | catalog_type | long NOT NULL |  | [**CatalogsType**](CatalogsType.md) |  |  [foreignkey]
**hotelId** | hotel_id | text |  | **kotlin.String** | The catalog hotel id in the merchant namespace |  [optional]
**errors** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemValidationEvent&gt;**](ItemValidationEvent.md) | Array with the errors for the item id requested |  [optional]




# **Table `CatalogsHotelItemErrorResponseItemValidationEvent`**
(mapped from: CatalogsHotelItemErrorResponseItemValidationEvent)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsHotelItemErrorResponse | catalogsHotelItemErrorResponse | long | | kotlin.Long | Primary Key | *one*
itemValidationEvent | itemValidationEvent | long | | kotlin.Long | Foreign Key | *many*



