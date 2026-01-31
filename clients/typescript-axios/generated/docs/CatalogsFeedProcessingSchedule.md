# CatalogsFeedProcessingSchedule

Daily processing schedule. This field is **OPTIONAL**. Use this to configure the preferred time for processing a feed (otherwise random).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**time** | **string** | A time in format HH:MM with leading 0 (zero) | [default to undefined]
**timezone** | **string** | The timezone considered for the processing schedule time. | [default to undefined]

## Example

```typescript
import { CatalogsFeedProcessingSchedule } from './api';

const instance: CatalogsFeedProcessingSchedule = {
    time,
    timezone,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
