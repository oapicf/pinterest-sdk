# PinterestSdkClient::AdvertiserDefinedEventProcessingRecord

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **exceptions** | **Array&lt;String&gt;** | List of exception messages if the operation failed | [optional] |
| **name** | **String** | Name of the advertiser defined event |  |
| **status** | **String** | Processing status (success or failure) |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AdvertiserDefinedEventProcessingRecord.new(
  exceptions: null,
  name: newsletter_signup,
  status: success
)
```

