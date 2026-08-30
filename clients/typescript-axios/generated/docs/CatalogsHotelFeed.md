# CatalogsHotelFeed

Catalogs Hotel Feed object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **string** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. | [default to undefined]
**catalog_type** | **string** |  | [default to undefined]
**created_at** | **string** |  | [readonly] [default to undefined]
**credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional] [default to undefined]
**default_currency** | [**NullableCurrency**](NullableCurrency.md) |  | [optional] [default to undefined]
**default_locale** | **string** | The locale used within a feed for product descriptions. | [default to undefined]
**format** | [**CatalogsFormat**](CatalogsFormat.md) |  | [default to undefined]
**id** | **string** | ID of the feed entity. | [readonly] [default to undefined]
**location** | **string** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | [default to undefined]
**name** | **string** | A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. | [default to undefined]
**preferred_processing_schedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional] [default to undefined]
**status** | [**CatalogsStatus**](CatalogsStatus.md) |  | [default to undefined]
**updated_at** | **string** |  | [readonly] [default to undefined]

## Example

```typescript
import { CatalogsHotelFeed } from './api';

const instance: CatalogsHotelFeed = {
    catalog_id,
    catalog_type,
    created_at,
    credentials,
    default_currency,
    default_locale,
    format,
    id,
    location,
    name,
    preferred_processing_schedule,
    status,
    updated_at,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
