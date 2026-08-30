# PinterestSdkClient::CatalogsCreativeAssetsFeedsUpdateRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalog_type** | **String** |  |  |
| **credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional] |
| **default_currency** | [**NullableCurrency**](NullableCurrency.md) |  | [optional] |
| **format** | [**CatalogsFormat**](CatalogsFormat.md) |  | [optional] |
| **location** | **String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | [optional] |
| **name** | **String** | A human-friendly name associated to a given feed. | [optional] |
| **preferred_processing_schedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional] |
| **status** | [**CatalogsStatus**](CatalogsStatus.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsCreativeAssetsFeedsUpdateRequest.new(
  catalog_type: null,
  credentials: null,
  default_currency: null,
  format: null,
  location: null,
  name: null,
  preferred_processing_schedule: null,
  status: null
)
```

