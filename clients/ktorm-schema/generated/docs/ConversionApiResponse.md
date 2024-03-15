
# Table `ConversionApiResponse`
(mapped from: ConversionApiResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**numEventsReceived** | num_events_received | int NOT NULL |  | **kotlin.Int** | Total number of events received in the request. | 
**numEventsProcessed** | num_events_processed | int NOT NULL |  | **kotlin.Int** | Number of events that were successfully processed from the events. | 
**events** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ConversionApiResponseEventsInner&gt;**](ConversionApiResponseEventsInner.md) | Specific messages for each event received. The order will match the order in which the events were received in the request. | 




# **Table `ConversionApiResponseConversionApiResponseEventsInner`**
(mapped from: ConversionApiResponseConversionApiResponseEventsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
conversionApiResponse | conversionApiResponse | long | | kotlin.Long | Primary Key | *one*
conversionApiResponseEventsInner | conversionApiResponseEventsInner | long | | kotlin.Long | Foreign Key | *many*



