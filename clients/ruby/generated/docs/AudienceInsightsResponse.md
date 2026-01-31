# PinterestSdkClient::AudienceInsightsResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **categories** | [**Array&lt;AudienceCategory&gt;**](AudienceCategory.md) | Category interest distribution | [optional] |
| **date** | **String** | Generation date | [optional] |
| **demographics** | [**AudienceDemographics**](AudienceDemographics.md) |  | [optional] |
| **size** | **Integer** | Population count. | [optional] |
| **size_is_upper_bound** | **Boolean** | Indicates whether the audience size has been rounded up to the next highest upper boundary. | [optional] |
| **type** | [**AudienceInsightType**](AudienceInsightType.md) |  | [optional][default to &#39;YOUR_TOTAL_AUDIENCE&#39;] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AudienceInsightsResponse.new(
  categories: null,
  date: 2022-10-09,
  demographics: null,
  size: 10000,
  size_is_upper_bound: true,
  type: null
)
```

