# PinterestSdkClient::DynamicTitlesUploadURL

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **existing_filename** | **String** | If present, a reviewed CSV was previously submitted for this ad group. Uploading a new file will replace it. Absent when no prior submission exists. | [optional] |
| **request_id** | **String** | Unique identifier for this upload session. Must be passed to the process endpoint. |  |
| **upload_url** | **String** | Pre-signed S3 PUT URL to upload the reviewed CSV file. |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::DynamicTitlesUploadURL.new(
  existing_filename: aid-549755814107/ad_group-1099511703602/validated_approvals.csv,
  request_id: 549755814107-1099511703602-1714300000-abc123,
  upload_url: https://s3.amazonaws.com/bucket/dynamic_titles/candidate.csv?AWSAccessKeyId&#x3D;...
)
```

