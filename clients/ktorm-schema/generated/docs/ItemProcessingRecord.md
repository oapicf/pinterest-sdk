
# Table `ItemProcessingRecord`
(mapped from: ItemProcessingRecord)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**itemId** | item_id | text |  | **kotlin.String** | The catalog item id in the merchant namespace |  [optional]
**errors** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemValidationEvent&gt;**](ItemValidationEvent.md) | Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. |  [optional]
**warnings** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemValidationEvent&gt;**](ItemValidationEvent.md) | Array with the validation warnings for the item processing record |  [optional]
**status** | status | long |  | [**ItemProcessingStatus**](ItemProcessingStatus.md) |  |  [optional] [foreignkey]



# **Table `ItemProcessingRecordItemValidationEvent`**
(mapped from: ItemProcessingRecordItemValidationEvent)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
itemProcessingRecord | itemProcessingRecord | long | | kotlin.Long | Primary Key | *one*
itemValidationEvent | itemValidationEvent | long | | kotlin.Long | Foreign Key | *many*



# **Table `ItemProcessingRecordItemValidationEvent`**
(mapped from: ItemProcessingRecordItemValidationEvent)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
itemProcessingRecord | itemProcessingRecord | long | | kotlin.Long | Primary Key | *one*
itemValidationEvent | itemValidationEvent | long | | kotlin.Long | Foreign Key | *many*




