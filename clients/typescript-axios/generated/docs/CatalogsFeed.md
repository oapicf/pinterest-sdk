# CatalogsFeed

Catalogs Feed object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_at** | **string** |  | [default to undefined]
**id** | **string** |  | [default to undefined]
**updated_at** | **string** |  | [default to undefined]
**catalog_type** | [**CatalogsType**](CatalogsType.md) |  | [default to undefined]
**credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [default to undefined]
**default_availability** | [**ProductAvailabilityType**](ProductAvailabilityType.md) |  | [default to undefined]
**default_country** | [**Country**](Country.md) |  | [default to undefined]
**default_currency** | [**NullableCurrency**](NullableCurrency.md) |  | [default to undefined]
**default_locale** | **string** | The locale used within a feed for product descriptions. | [default to undefined]
**format** | [**CatalogsFormat**](CatalogsFormat.md) |  | [default to undefined]
**location** | **string** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | [default to undefined]
**name** | **string** | A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. | [default to undefined]
**preferred_processing_schedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [default to undefined]
**status** | [**CatalogsStatus**](CatalogsStatus.md) |  | [default to undefined]
**catalog_id** | **string** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. | [default to undefined]

## Example

```typescript
import { CatalogsFeed } from './api';

const instance: CatalogsFeed = {
    created_at,
    id,
    updated_at,
    catalog_type,
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
    catalog_id,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
