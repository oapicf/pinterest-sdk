
# Table `AdvertiserDefinedEventsResponse`
(mapped from: AdvertiserDefinedEventsResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AdvertiserDefinedEvent&gt;**](AdvertiserDefinedEvent.md) |  |  [optional]


# **Table `AdvertiserDefinedEventsResponseAdvertiserDefinedEvent`**
(mapped from: AdvertiserDefinedEventsResponseAdvertiserDefinedEvent)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
advertiserDefinedEventsResponse | advertiserDefinedEventsResponse | long | | kotlin.Long | Primary Key | *one*
advertiserDefinedEvent | advertiserDefinedEvent | long | | kotlin.Long | Foreign Key | *many*



