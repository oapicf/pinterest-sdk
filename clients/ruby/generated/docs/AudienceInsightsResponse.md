# PinterestSdkClient::AudienceInsightsResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **categories** | [**Array&lt;AudienceCategory&gt;**](AudienceCategory.md) | Category interest distribution | [optional] |
| **demographics** | [**AudienceDemographics**](AudienceDemographics.md) |  | [optional] |
| **type** | [**AudienceInsightType**](AudienceInsightType.md) |  | [optional][default to &#39;YOUR_TOTAL_AUDIENCE&#39;] |
| **date** | **String** | Generation date | [optional] |
| **size** | **Integer** | Population count. | [optional] |
| **size_is_upper_bound** | **Boolean** | Indicates whether the audience size has been rounded up to the next highest upper boundary. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AudienceInsightsResponse.new(
  categories: null,
  demographics: null,
  type: null,
  date: 2022-10-09,
  size: 10000,
  size_is_upper_bound: true
)
```

