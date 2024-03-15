# PinterestSdkClient::MediaUploadAllOfUploadParameters

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **x_amz_date** | **String** |  | [optional] |
| **x_amz_signature** | **String** |  | [optional] |
| **x_amz_security_token** | **String** |  | [optional] |
| **x_amz_algorithm** | **String** |  | [optional] |
| **key** | **String** |  | [optional] |
| **policy** | **String** |  | [optional] |
| **x_amz_credential** | **String** |  | [optional] |
| **content_type** | **String** |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::MediaUploadAllOfUploadParameters.new(
  x_amz_date: null,
  x_amz_signature: null,
  x_amz_security_token: null,
  x_amz_algorithm: null,
  key: null,
  policy: null,
  x_amz_credential: null,
  content_type: multipart/form-data
)
```

