# PinterestSdkClient::ConversionEventResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **conversion_event** | [**ConversionTagType**](ConversionTagType.md) |  | [optional] |
| **conversion_tag_id** | **String** | Id of the tag. | [optional] |
| **ad_account_id** | **String** | Id of the ad account. | [optional] |
| **created_time** | **Integer** | Creation date in epoch format. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::ConversionEventResponse.new(
  conversion_event: null,
  conversion_tag_id: 2614324385652,
  ad_account_id: 549757463328,
  created_time: 1564768710
)
```

