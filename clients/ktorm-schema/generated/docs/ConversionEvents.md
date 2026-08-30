
# Table `ConversionEvents`
(mapped from: ConversionEvents)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**events** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ConversionApiResponseEventsItems&gt;**](ConversionApiResponseEventsItems.md) | Specific messages for each event received. The order will match the order in which the events were received in the request. |  [readonly]
**numEventsProcessed** | num_events_processed | int NOT NULL |  | **kotlin.Int** | Number of events that were successfully processed from the events. |  [readonly]
**numEventsReceived** | num_events_received | int NOT NULL |  | **kotlin.Int** | Total number of events received in the request. |  [readonly]


# **Table `ConversionEventsConversionApiResponseEventsItems`**
(mapped from: ConversionEventsConversionApiResponseEventsItems)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
conversionEvents | conversionEvents | long | | kotlin.Long | Primary Key | *one*
conversionApiResponseEventsItems | conversionApiResponseEventsItems | long | | kotlin.Long | Foreign Key | *many*





