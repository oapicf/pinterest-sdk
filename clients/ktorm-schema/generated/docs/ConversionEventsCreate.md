
# Table `ConversionEventsCreate`
(mapped from: ConversionEventsCreate)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**data** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ConversionEventsDataItems&gt;**](ConversionEventsDataItems.md) | A list of events (one or more) encapsulated by a data object. | 


# **Table `ConversionEventsCreateConversionEventsDataItems`**
(mapped from: ConversionEventsCreateConversionEventsDataItems)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
conversionEventsCreate | conversionEventsCreate | long | | kotlin.Long | Primary Key | *one*
conversionEventsDataItems | conversionEventsDataItems | long | | kotlin.Long | Foreign Key | *many*



