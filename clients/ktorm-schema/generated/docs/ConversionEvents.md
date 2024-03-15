
# Table `ConversionEvents`
(mapped from: ConversionEvents)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**data** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ConversionEventsDataInner&gt;**](ConversionEventsDataInner.md) |  | 


# **Table `ConversionEventsConversionEventsDataInner`**
(mapped from: ConversionEventsConversionEventsDataInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
conversionEvents | conversionEvents | long | | kotlin.Long | Primary Key | *one*
conversionEventsDataInner | conversionEventsDataInner | long | | kotlin.Long | Foreign Key | *many*



