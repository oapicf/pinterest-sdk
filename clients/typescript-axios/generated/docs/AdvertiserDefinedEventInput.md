# AdvertiserDefinedEventInput

Advertiser defined event input for create/update operations

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mapped_conversion_type** | [**AdvertiserDefinedEventMappingType**](AdvertiserDefinedEventMappingType.md) | Pinterest standard event type to map this custom event to for campaign optimization and reporting | [default to undefined]
**name** | **string** | Raw string name of the event | [default to undefined]

## Example

```typescript
import { AdvertiserDefinedEventInput } from './api';

const instance: AdvertiserDefinedEventInput = {
    mapped_conversion_type,
    name,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
