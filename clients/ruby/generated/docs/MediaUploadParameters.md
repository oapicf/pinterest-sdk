# PinterestSdkClient::MediaUploadParameters

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **content_type** | **String** |  | [optional] |
| **key** | **String** |  | [optional] |
| **policy** | **String** |  | [optional] |
| **x_amz_algorithm** | **String** |  | [optional] |
| **x_amz_credential** | **String** |  | [optional] |
| **x_amz_date** | **String** |  | [optional] |
| **x_amz_security_token** | **String** |  | [optional] |
| **x_amz_signature** | **String** |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::MediaUploadParameters.new(
  content_type: multipart/form-data,
  key: uploads/11/aa/22/3:video:203014033110991560:5212123920968240771,
  policy: eyJleHBpcmF0aW9uIjoiMj..&#x3D;&#x3D;,
  x_amz_algorithm: AWS4-HMAC-SHA256,
  x_amz_credential: ASIA6QZJ64OPIKV7FRVX/20220127/us-east-1/s3/aws4_request,
  x_amz_date: 20220127T185143Z,
  x_amz_security_token: IQoJb3JpZ2luX2VjEJr...&#x3D;&#x3D;,
  x_amz_signature: fcd6309a6aaee213348666a72abed8b44552a43acb6b340e8e1b288d21a5fe92
)
```

