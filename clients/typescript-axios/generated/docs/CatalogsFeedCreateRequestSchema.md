# CatalogsFeedCreateRequestSchema


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional] [default to undefined]
**default_availability** | [**ProductAvailabilityType**](ProductAvailabilityType.md) |  | [optional] [default to undefined]
**default_country** | [**Country**](Country.md) |  | [optional] [default to undefined]
**default_currency** | [**NullableCurrency**](NullableCurrency.md) |  | [optional] [default to undefined]
**default_locale** | [**CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale**](CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale.md) |  | [optional] [default to undefined]
**format** | [**CatalogsFormat**](CatalogsFormat.md) |  | [default to undefined]
**location** | **string** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | [default to undefined]
**name** | **string** | A human-friendly name associated to a given feed. | [default to undefined]
**preferred_processing_schedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional] [default to undefined]
**status** | [**CatalogsStatus**](CatalogsStatus.md) |  | [optional] [default to undefined]

## Example

```typescript
import { CatalogsFeedCreateRequestSchema } from './api';

const instance: CatalogsFeedCreateRequestSchema = {
    credentials,
    default_availability,
    default_country,
    default_currency,
    default_locale,
    format,
    location,
    name,
    preferred_processing_schedule,
    status,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
