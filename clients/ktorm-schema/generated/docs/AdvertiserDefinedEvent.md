
# Table `AdvertiserDefinedEvent`
(mapped from: AdvertiserDefinedEvent)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**mappedConversionType** | mapped_conversion_type | long |  | [**ConversionTagTypeOptimal**](ConversionTagTypeOptimal.md) | Standard type mapped to ADE for optimization |  [optional] [foreignkey]
**name** | name | text |  | **kotlin.String** | Raw string name of the event, usually logged as raw_event_name in our dataset |  [optional]




