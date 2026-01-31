# CatalogsFeedsCreateRequest

Request object for creating a feed. Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**default_currency** | [**NullableCurrency**](NullableCurrency.md) |  | [optional] [default to undefined]
**name** | **string** | A human-friendly name associated to a given feed. | [default to undefined]
**format** | [**CatalogsFormat**](CatalogsFormat.md) |  | [default to undefined]
**default_locale** | [**CatalogsFeedsCreateRequestDefaultLocale**](CatalogsFeedsCreateRequestDefaultLocale.md) |  | [optional] [default to undefined]
**credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional] [default to undefined]
**location** | **string** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | [default to undefined]
**preferred_processing_schedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional] [default to undefined]
**default_country** | [**Country**](Country.md) |  | [optional] [default to undefined]
**default_availability** | [**ProductAvailabilityType**](ProductAvailabilityType.md) |  | [optional] [default to undefined]
**status** | [**CatalogsStatus**](CatalogsStatus.md) |  | [optional] [default to CatalogsStatus_Active]

## Example

```typescript
import { CatalogsFeedsCreateRequest } from './api';

const instance: CatalogsFeedsCreateRequest = {
    default_currency,
    name,
    format,
    default_locale,
    credentials,
    location,
    preferred_processing_schedule,
    default_country,
    default_availability,
    status,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
