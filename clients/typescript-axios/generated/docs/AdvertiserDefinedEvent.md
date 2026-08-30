# AdvertiserDefinedEvent

Advertiser defined event

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mapped_conversion_type** | [**ConversionTagTypeOptimal**](ConversionTagTypeOptimal.md) | Standard type mapped to ADE for optimization | [optional] [default to undefined]
**name** | **string** | Raw string name of the event, usually logged as raw_event_name in our dataset | [optional] [default to undefined]

## Example

```typescript
import { AdvertiserDefinedEvent } from './api';

const instance: AdvertiserDefinedEvent = {
    mapped_conversion_type,
    name,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
