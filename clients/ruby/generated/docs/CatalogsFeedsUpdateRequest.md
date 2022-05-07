# PinterestSdkClient::CatalogsFeedsUpdateRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **default_availability** | [**ProductAvailabilityType**](ProductAvailabilityType.md) |  | [optional] |
| **default_currency** | [**NullableCurrency**](NullableCurrency.md) |  | [optional] |
| **name** | **String** | A human-friendly name associated to a given feed. | [optional] |
| **format** | [**CatalogsFormat**](CatalogsFormat.md) |  | [optional] |
| **credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional] |
| **location** | **String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | [optional] |
| **preferred_processing_schedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional] |
| **status** | [**CatalogsStatus**](CatalogsStatus.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsFeedsUpdateRequest.new(
  default_availability: null,
  default_currency: null,
  name: null,
  format: null,
  credentials: null,
  location: null,
  preferred_processing_schedule: null,
  status: null
)
```

