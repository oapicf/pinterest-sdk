# PinterestSdkClient::CatalogsRetailFeedsCreateRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalog_id** | **String** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. Currently, this field has no effect. | [optional] |
| **catalog_type** | [**CatalogsType**](CatalogsType.md) |  |  |
| **credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional] |
| **default_availability** | [**ProductAvailabilityType**](ProductAvailabilityType.md) |  | [optional] |
| **default_country** | [**Country**](Country.md) |  |  |
| **default_currency** | [**NullableCurrency**](NullableCurrency.md) |  | [optional] |
| **default_locale** | [**CatalogsFeedsCreateRequestDefaultLocale**](CatalogsFeedsCreateRequestDefaultLocale.md) |  |  |
| **format** | [**CatalogsFormat**](CatalogsFormat.md) |  |  |
| **location** | **String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. |  |
| **name** | **String** | A human-friendly name associated to a given feed. |  |
| **preferred_processing_schedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional] |
| **status** | [**CatalogsStatus**](CatalogsStatus.md) |  | [optional][default to &#39;ACTIVE&#39;] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsRetailFeedsCreateRequest.new(
  catalog_id: null,
  catalog_type: null,
  credentials: null,
  default_availability: null,
  default_country: null,
  default_currency: null,
  default_locale: null,
  format: null,
  location: null,
  name: null,
  preferred_processing_schedule: null,
  status: null
)
```

