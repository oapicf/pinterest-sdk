
# Table `CatalogsUpsertHotelItem`
(mapped from: CatalogsUpsertHotelItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**hotelId** | hotel_id | text NOT NULL |  | **kotlin.String** | The catalog hotel id in the merchant namespace | 
**operation** | operation | text NOT NULL |  | [**operation**](#Operation) |  | 
**attributes** | attributes | long NOT NULL |  | [**CatalogsHotelAttributes**](CatalogsHotelAttributes.md) |  |  [foreignkey]





