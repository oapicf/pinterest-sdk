# PinterestSdkClient::TrendingKeywordDemographics

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **age_distribution** | [**TrendsAgeDistribution**](TrendsAgeDistribution.md) |  | [optional] |
| **gender_distribution** | [**TrendsGenderDistribution**](TrendsGenderDistribution.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::TrendingKeywordDemographics.new(
  age_distribution: null,
  gender_distribution: null
)
```

