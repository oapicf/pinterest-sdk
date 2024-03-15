# PinterestSdkClient::TargetingTypeFilter

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **targeting_types** | [**Array&lt;AdsAnalyticsTargetingType&gt;**](AdsAnalyticsTargetingType.md) | List of targeting types. Requires &#x60;level&#x60; to be a value ending in &#x60;_TARGETING&#x60;. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::TargetingTypeFilter.new(
  targeting_types: null
)
```

