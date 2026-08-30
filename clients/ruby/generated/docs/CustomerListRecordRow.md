# PinterestSdkClient::CustomerListRecordRow

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **email** | **String** | Email address (plain or hashed with SHA1, SHA256, or MD5). | [optional] |
| **external_id** | **String** | External ID identifier (not hashed). | [optional] |
| **hashed_phone_number** | **String** | Hashed phone number (hashed with SHA1, SHA256, or MD5). | [optional] |
| **hashed_pinner_id** | **String** | Hashed pinner ID (hashed with SHA1, SHA256, or MD5). | [optional] |
| **ip_address** | **String** | IP address (not hashed). | [optional] |
| **liveramp_envelope** | **String** | LiveRamp envelope identifier (Base64-encoded, not hashed). | [optional] |
| **maid** | **String** | Mobile advertising ID (plain or hashed with SHA1, SHA256, or MD5). | [optional] |
| **user_agent** | **String** | User agent string (not hashed). | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CustomerListRecordRow.new(
  email: null,
  external_id: null,
  hashed_phone_number: null,
  hashed_pinner_id: null,
  ip_address: null,
  liveramp_envelope: null,
  maid: null,
  user_agent: null
)
```

