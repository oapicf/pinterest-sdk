# PinterestSdkClient::CatalogsFeedsCreateRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **default_country** | [**Country**](Country.md) |  | [optional] |
| **default_availability** | [**ProductAvailabilityType**](ProductAvailabilityType.md) |  | [optional] |
| **default_currency** | [**NullableCurrency**](NullableCurrency.md) |  | [optional] |
| **name** | **String** | A human-friendly name associated to a given feed. |  |
| **format** | [**CatalogsFormat**](CatalogsFormat.md) |  |  |
| **default_locale** | **String** | The locale used within a feed for product descriptions. | [optional] |
| **credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional] |
| **location** | **String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. |  |
| **preferred_processing_schedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsFeedsCreateRequest.new(
  default_country: null,
  default_availability: null,
  default_currency: null,
  name: null,
  format: null,
  default_locale: en_US,
  credentials: null,
  location: null,
  preferred_processing_schedule: null
)
```

