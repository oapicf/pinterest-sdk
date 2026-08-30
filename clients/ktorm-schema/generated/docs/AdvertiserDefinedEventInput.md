
# Table `AdvertiserDefinedEventInput`
(mapped from: AdvertiserDefinedEventInput)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**mappedConversionType** | mapped_conversion_type | long NOT NULL |  | [**AdvertiserDefinedEventMappingType**](AdvertiserDefinedEventMappingType.md) | Pinterest standard event type to map this custom event to for campaign optimization and reporting |  [foreignkey]
**name** | name | text NOT NULL |  | **kotlin.String** | Raw string name of the event | 




