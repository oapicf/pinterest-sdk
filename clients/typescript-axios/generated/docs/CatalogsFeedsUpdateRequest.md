# CatalogsFeedsUpdateRequest

Request object for updating a feed.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**default_availability** | [**ProductAvailabilityType**](ProductAvailabilityType.md) |  | [optional] [default to undefined]
**default_currency** | [**NullableCurrency**](NullableCurrency.md) |  | [optional] [default to undefined]
**name** | **string** | A human-friendly name associated to a given feed. | [optional] [default to undefined]
**format** | [**CatalogsFormat**](CatalogsFormat.md) |  | [optional] [default to undefined]
**credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional] [default to undefined]
**location** | **string** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | [optional] [default to undefined]
**preferred_processing_schedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional] [default to undefined]
**status** | [**CatalogsStatus**](CatalogsStatus.md) |  | [optional] [default to undefined]

## Example

```typescript
import { CatalogsFeedsUpdateRequest } from './api';

const instance: CatalogsFeedsUpdateRequest = {
    default_availability,
    default_currency,
    name,
    format,
    credentials,
    location,
    preferred_processing_schedule,
    status,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
