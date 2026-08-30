# PinterestSdkClient::CustomerSegment

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | The ID of the ad account that this customer segment belongs to. | [optional][readonly] |
| **audience_ids** | **Array&lt;String&gt;** | Audience IDs included in the customer segment. |  |
| **created_time** | **Integer** | Customer segment created time. Unix timestamp in seconds. | [optional][readonly] |
| **id** | **String** | Customer segment ID. | [optional][readonly] |
| **name** | **String** | Customer segment name. |  |
| **status** | [**TargetingTemplateStatus**](TargetingTemplateStatus.md) | Indicates whether the customer segment is active or deleted. | [optional][readonly] |
| **updated_time** | **Integer** | Customer segment updated time. Unix timestamp in seconds. | [optional][readonly] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CustomerSegment.new(
  ad_account_id: null,
  audience_ids: null,
  created_time: null,
  id: null,
  name: null,
  status: null,
  updated_time: null
)
```

