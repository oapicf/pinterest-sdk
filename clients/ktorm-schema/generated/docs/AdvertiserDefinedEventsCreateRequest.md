
# Table `AdvertiserDefinedEventsCreateRequest`
(mapped from: AdvertiserDefinedEventsCreateRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AdvertiserDefinedEventInput&gt;**](AdvertiserDefinedEventInput.md) | List of advertiser defined events to create or update | 


# **Table `AdvertiserDefinedEventsCreateRequestAdvertiserDefinedEventInput`**
(mapped from: AdvertiserDefinedEventsCreateRequestAdvertiserDefinedEventInput)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
advertiserDefinedEventsCreateRequest | advertiserDefinedEventsCreateRequest | long | | kotlin.Long | Primary Key | *one*
advertiserDefinedEventInput | advertiserDefinedEventInput | long | | kotlin.Long | Foreign Key | *many*



