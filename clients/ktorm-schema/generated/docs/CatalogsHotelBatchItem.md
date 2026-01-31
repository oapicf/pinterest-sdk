
# Table `CatalogsHotelBatchItem`
(mapped from: CatalogsHotelBatchItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**attributes** | attributes | long NOT NULL |  | [**CatalogsUpdatableHotelAttributes**](CatalogsUpdatableHotelAttributes.md) |  |  [foreignkey]
**hotelId** | hotel_id | text NOT NULL |  | **kotlin.String** | The catalog hotel id in the merchant namespace | 
**operation** | operation | text NOT NULL |  | [**operation**](#Operation) |  | 





