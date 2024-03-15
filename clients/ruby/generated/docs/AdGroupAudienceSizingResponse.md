# PinterestSdkClient::AdGroupAudienceSizingResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **audience_size_lower_bound** | **Float** | The lower confidence bound of the estimated potential audience size. \&quot;Potential audience size\&quot; estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments. | [optional] |
| **audience_size_upper_bound** | **Float** | The upper confidence bound of the estimated potential audience size. \&quot;Potential audience size\&quot; estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AdGroupAudienceSizingResponse.new(
  audience_size_lower_bound: 100000,
  audience_size_upper_bound: 150000
)
```

