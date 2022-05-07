# PinterestSdkClient::CatalogsFeedIngestionErrors

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **image_download_error** | **Integer** |  | [optional] |
| **image_download_connection_timeout** | **Integer** |  | [optional] |
| **image_format_unrecognize** | **Integer** |  | [optional] |
| **line_level_internal_error** | **Integer** |  | [optional] |
| **large_product_count_decrease** | **Integer** |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsFeedIngestionErrors.new(
  image_download_error: null,
  image_download_connection_timeout: null,
  image_format_unrecognize: null,
  line_level_internal_error: null,
  large_product_count_decrease: null
)
```

