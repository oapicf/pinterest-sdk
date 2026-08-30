
# Table `advertiser_defined_events_create_200_response`
(mapped from: AdvertiserDefinedEventsCreate200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AdvertiserDefinedEventProcessingRecord&gt;**](AdvertiserDefinedEventProcessingRecord.md) |  | 


# **Table `AdvertiserDefinedEventsCreate200ResponseAdvertiserDefinedEventProcessingRecord`**
(mapped from: AdvertiserDefinedEventsCreate200ResponseAdvertiserDefinedEventProcessingRecord)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
advertiserDefinedEventsCreate200Response | advertiserDefinedEventsCreate200Response | long | | kotlin.Long | Primary Key | *one*
advertiserDefinedEventProcessingRecord | advertiserDefinedEventProcessingRecord | long | | kotlin.Long | Foreign Key | *many*



