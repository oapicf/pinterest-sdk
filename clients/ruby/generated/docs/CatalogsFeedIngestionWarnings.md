# PinterestSdkClient::CatalogsFeedIngestionWarnings

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **additional_image_level_internal_error** | **Integer** | We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours. | [optional] |
| **additional_image_file_not_accessible** | **Integer** | Additional image files are unreadable. Please upload new files to continue. | [optional] |
| **additional_image_malformed_url** | **Integer** | Additional image files are unreadable. Please check your link and upload new files to continue. | [optional] |
| **additional_image_file_not_found** | **Integer** | Additional image files are unreadable. Please upload new files to continue. | [optional] |
| **additional_image_invalid_file** | **Integer** | Additional image files are unreadable. Please upload new files to continue. | [optional] |
| **hotel_price_header_is_present** | **Integer** | price is not a supported column. Use base_price and sale_price instead. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsFeedIngestionWarnings.new(
  additional_image_level_internal_error: null,
  additional_image_file_not_accessible: null,
  additional_image_malformed_url: null,
  additional_image_file_not_found: null,
  additional_image_invalid_file: null,
  hotel_price_header_is_present: null
)
```

