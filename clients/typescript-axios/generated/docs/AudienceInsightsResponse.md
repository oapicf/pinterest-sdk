# AudienceInsightsResponse

Audience interests and demographics.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**categories** | [**Array&lt;AudienceCategory&gt;**](AudienceCategory.md) | Category interest distribution | [optional] [default to undefined]
**demographics** | [**AudienceDemographics**](AudienceDemographics.md) |  | [optional] [default to undefined]
**type** | [**AudienceInsightType**](AudienceInsightType.md) |  | [optional] [default to undefined]
**date** | **string** | Generation date | [optional] [default to undefined]
**size** | **number** | Population count. | [optional] [default to undefined]
**size_is_upper_bound** | **boolean** | Indicates whether the audience size has been rounded up to the next highest upper boundary. | [optional] [default to undefined]

## Example

```typescript
import { AudienceInsightsResponse } from './api';

const instance: AudienceInsightsResponse = {
    categories,
    demographics,
    type,
    date,
    size,
    size_is_upper_bound,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
