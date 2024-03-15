# PinterestSdkClient::CatalogsFeedsCreateRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **default_currency** | [**NullableCurrency**](NullableCurrency.md) |  | [optional] |
| **name** | **String** | A human-friendly name associated to a given feed. |  |
| **format** | [**CatalogsFormat**](CatalogsFormat.md) |  |  |
| **default_locale** | [**CatalogsFeedsCreateRequestDefaultLocale**](CatalogsFeedsCreateRequestDefaultLocale.md) |  | [optional] |
| **credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional] |
| **location** | **String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. |  |
| **preferred_processing_schedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional] |
| **default_country** | [**Country**](Country.md) |  | [optional] |
| **default_availability** | [**ProductAvailabilityType**](ProductAvailabilityType.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsFeedsCreateRequest.new(
  default_currency: null,
  name: null,
  format: null,
  default_locale: null,
  credentials: null,
  location: null,
  preferred_processing_schedule: null,
  default_country: null,
  default_availability: null
)
```

