
# Table `HotelProcessingRecord`
(mapped from: HotelProcessingRecord)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**hotelId** | hotel_id | text |  | **kotlin.String** | The catalog hotel id in the merchant namespace |  [optional]
**errors** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemValidationEvent&gt;**](ItemValidationEvent.md) | Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. |  [optional]
**warnings** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemValidationEvent&gt;**](ItemValidationEvent.md) | Array with the validation warnings for the item processing record |  [optional]
**status** | status | long |  | [**ItemProcessingStatus**](ItemProcessingStatus.md) |  |  [optional] [foreignkey]



# **Table `HotelProcessingRecordItemValidationEvent`**
(mapped from: HotelProcessingRecordItemValidationEvent)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
hotelProcessingRecord | hotelProcessingRecord | long | | kotlin.Long | Primary Key | *one*
itemValidationEvent | itemValidationEvent | long | | kotlin.Long | Foreign Key | *many*



# **Table `HotelProcessingRecordItemValidationEvent`**
(mapped from: HotelProcessingRecordItemValidationEvent)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
hotelProcessingRecord | hotelProcessingRecord | long | | kotlin.Long | Primary Key | *one*
itemValidationEvent | itemValidationEvent | long | | kotlin.Long | Foreign Key | *many*




