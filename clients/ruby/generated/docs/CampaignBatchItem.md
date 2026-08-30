# PinterestSdkClient::CampaignBatchItem

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **data** | [**CampaignBatchResponseData**](CampaignBatchResponseData.md) | Campaign data on success. | [optional] |
| **exceptions** | [**Array&lt;Exception&gt;**](Exception.md) | Exceptions on failure. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CampaignBatchItem.new(
  data: null,
  exceptions: null
)
```

