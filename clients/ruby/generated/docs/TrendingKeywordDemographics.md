# PinterestSdkClient::TrendingKeywordDemographics

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **age_distribution** | [**TrendingKeywordDemographicsAgeDistribution**](TrendingKeywordDemographicsAgeDistribution.md) |  | [optional] |
| **gender_distribution** | [**TrendingKeywordDemographicsGenderDistribution**](TrendingKeywordDemographicsGenderDistribution.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::TrendingKeywordDemographics.new(
  age_distribution: null,
  gender_distribution: null
)
```

