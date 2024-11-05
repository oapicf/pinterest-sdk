# PinterestSdkClient::CatalogsHotelFeedsCreateRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **default_currency** | [**NullableCurrency**](NullableCurrency.md) |  | [optional] |
| **name** | **String** | A human-friendly name associated to a given feed. |  |
| **format** | [**CatalogsFormat**](CatalogsFormat.md) |  |  |
| **default_locale** | [**CatalogsFeedsCreateRequestDefaultLocale**](CatalogsFeedsCreateRequestDefaultLocale.md) |  |  |
| **credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional] |
| **location** | **String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. |  |
| **preferred_processing_schedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional] |
| **catalog_type** | [**CatalogsType**](CatalogsType.md) |  |  |
| **catalog_id** | **String** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple hotel feeds but this will change in the future. | [optional] |
| **status** | [**CatalogsStatus**](CatalogsStatus.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsHotelFeedsCreateRequest.new(
  default_currency: null,
  name: null,
  format: null,
  default_locale: null,
  credentials: null,
  location: null,
  preferred_processing_schedule: null,
  catalog_type: null,
  catalog_id: null,
  status: null
)
```

