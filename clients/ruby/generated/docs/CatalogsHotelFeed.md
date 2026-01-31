# PinterestSdkClient::CatalogsHotelFeed

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **created_at** | **Time** |  |  |
| **id** | **String** |  |  |
| **updated_at** | **Time** |  |  |
| **catalog_id** | **String** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. |  |
| **catalog_type** | [**CatalogsType**](CatalogsType.md) |  |  |
| **credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  |  |
| **default_currency** | [**NullableCurrency**](NullableCurrency.md) |  |  |
| **default_locale** | **String** | The locale used within a feed for product descriptions. |  |
| **format** | [**CatalogsFormat**](CatalogsFormat.md) |  |  |
| **location** | **String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. |  |
| **name** | **String** | A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. |  |
| **preferred_processing_schedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  |  |
| **status** | [**CatalogsStatus**](CatalogsStatus.md) |  |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsHotelFeed.new(
  created_at: 2022-03-14T15:15:22Z,
  id: null,
  updated_at: 2022-03-14T15:16:34Z,
  catalog_id: null,
  catalog_type: null,
  credentials: null,
  default_currency: null,
  default_locale: en-US,
  format: null,
  location: null,
  name: null,
  preferred_processing_schedule: null,
  status: null
)
```

