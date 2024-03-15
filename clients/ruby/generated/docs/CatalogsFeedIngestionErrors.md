# PinterestSdkClient::CatalogsFeedIngestionErrors

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **line_level_internal_error** | **Integer** | We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours. | [optional] |
| **large_product_count_decrease** | **Integer** | The product count has decreased by more than 99% compared to the last successful ingestion. | [optional] |
| **account_flagged** | **Integer** | We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information. | [optional] |
| **image_level_internal_error** | **Integer** | We experienced a technical difficulty and were unable to download some images. The next download attempt will happen in 24 hours. | [optional] |
| **image_file_not_accessible** | **Integer** | Image files are unreadable. Please upload new files to continue. | [optional] |
| **image_malformed_url** | **Integer** | Image files are unreadable. Please check your link and upload new files to continue. | [optional] |
| **image_file_not_found** | **Integer** | Image files are unreadable. Please upload new files to continue. | [optional] |
| **image_invalid_file** | **Integer** | Image files are unreadable. Please upload new files to continue. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsFeedIngestionErrors.new(
  line_level_internal_error: null,
  large_product_count_decrease: null,
  account_flagged: null,
  image_level_internal_error: null,
  image_file_not_accessible: null,
  image_malformed_url: null,
  image_file_not_found: null,
  image_invalid_file: null
)
```

