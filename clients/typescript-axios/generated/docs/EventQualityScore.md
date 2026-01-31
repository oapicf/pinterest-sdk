# EventQualityScore

Schema for GET Conversion EQS response.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ingestion_source** | [**IngestionSourceOptions**](IngestionSourceOptions.md) |  | [default to undefined]
**lookback_period** | [**LookbackPeriodOptions**](LookbackPeriodOptions.md) |  | [default to undefined]
**overall_status** | [**OverallStatusOptions**](OverallStatusOptions.md) |  | [default to undefined]
**quality_components** | [**QualityComponents**](QualityComponents.md) |  | [default to undefined]
**source_platform** | [**SourcePlatformOptions**](SourcePlatformOptions.md) |  | [default to undefined]

## Example

```typescript
import { EventQualityScore } from './api';

const instance: EventQualityScore = {
    ingestion_source,
    lookback_period,
    overall_status,
    quality_components,
    source_platform,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
