# ConversionHealthSelectionItem

User selection of conversion health criteria for a single feature

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conversionType** | **object** | Status for conversion types | [optional] [default to undefined]
**criteria** | **object** | Status for criteria | [optional] [default to undefined]
**ingestionSource** | **object** | Status for ingestion sources | [optional] [default to undefined]
**status** | **any** | Overall status for this selection item | [default to undefined]

## Example

```typescript
import { ConversionHealthSelectionItem } from './api';

const instance: ConversionHealthSelectionItem = {
    conversionType,
    criteria,
    ingestionSource,
    status,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
