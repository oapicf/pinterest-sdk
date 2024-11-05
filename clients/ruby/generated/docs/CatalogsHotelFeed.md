# PinterestSdkClient::CatalogsHotelFeed

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **created_at** | **Time** |  |  |
| **id** | **String** |  |  |
| **updated_at** | **Time** |  |  |
| **name** | **String** | A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. |  |
| **format** | [**CatalogsFormat**](CatalogsFormat.md) |  |  |
| **catalog_type** | [**CatalogsType**](CatalogsType.md) |  |  |
| **credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  |  |
| **location** | **String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. |  |
| **preferred_processing_schedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  |  |
| **status** | [**CatalogsStatus**](CatalogsStatus.md) |  |  |
| **default_currency** | [**NullableCurrency**](NullableCurrency.md) |  |  |
| **default_locale** | **String** | The locale used within a feed for product descriptions. |  |
| **catalog_id** | **String** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsHotelFeed.new(
  created_at: 2022-03-14T15:15:22Z,
  id: null,
  updated_at: 2022-03-14T15:16:34Z,
  name: null,
  format: null,
  catalog_type: null,
  credentials: null,
  location: null,
  preferred_processing_schedule: null,
  status: null,
  default_currency: null,
  default_locale: en-US,
  catalog_id: null
)
```

