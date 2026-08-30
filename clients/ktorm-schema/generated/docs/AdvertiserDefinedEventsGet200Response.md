
# Table `advertiser_defined_events_get_200_response`
(mapped from: AdvertiserDefinedEventsGet200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AdvertiserDefinedEvent&gt;**](AdvertiserDefinedEvent.md) |  | 


# **Table `AdvertiserDefinedEventsGet200ResponseAdvertiserDefinedEvent`**
(mapped from: AdvertiserDefinedEventsGet200ResponseAdvertiserDefinedEvent)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
advertiserDefinedEventsGet200Response | advertiserDefinedEventsGet200Response | long | | kotlin.Long | Primary Key | *one*
advertiserDefinedEvent | advertiserDefinedEvent | long | | kotlin.Long | Foreign Key | *many*



