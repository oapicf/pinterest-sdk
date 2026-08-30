# PinterestSdkClient::CatalogsHotelFeed

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalog_id** | **String** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. |  |
| **catalog_type** | **String** |  |  |
| **created_at** | **Time** |  | [readonly] |
| **credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional] |
| **default_currency** | [**NullableCurrency**](NullableCurrency.md) |  | [optional] |
| **default_locale** | **String** | The locale used within a feed for product descriptions. |  |
| **format** | [**CatalogsFormat**](CatalogsFormat.md) |  |  |
| **id** | **String** | ID of the feed entity. | [readonly] |
| **location** | **String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. |  |
| **name** | **String** | A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. |  |
| **preferred_processing_schedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional] |
| **status** | [**CatalogsStatus**](CatalogsStatus.md) |  |  |
| **updated_at** | **Time** |  | [readonly] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsHotelFeed.new(
  catalog_id: null,
  catalog_type: null,
  created_at: null,
  credentials: null,
  default_currency: null,
  default_locale: null,
  format: null,
  id: 864344156814050986,
  location: null,
  name: null,
  preferred_processing_schedule: null,
  status: null,
  updated_at: null
)
```

