# PinterestSdkClient::AppsflyerAudienceSyncCreate

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **container_id** | **String** | The container ID of the audience |  |
| **url_adid_sha256** | **String** | The pre-signed URL for SHA256 hashed GAID/IDFA file | [optional] |
| **url_email_sha256** | **String** | The pre-signed URL for SHA256 hashed email file | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AppsflyerAudienceSyncCreate.new(
  container_id: null,
  url_adid_sha256: null,
  url_email_sha256: null
)
```

