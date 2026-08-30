# PinterestSdkClient::DynamicTitlesDownloadCSV

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **download_url** | **String** | Pre-signed S3 URL to download the CSV file. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::DynamicTitlesDownloadCSV.new(
  download_url: https://s3.amazonaws.com/bucket/dynamic_titles/review.csv?AWSAccessKeyId&#x3D;...
)
```

