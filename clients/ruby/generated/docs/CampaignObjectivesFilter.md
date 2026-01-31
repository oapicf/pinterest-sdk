# PinterestSdkClient::CampaignObjectivesFilter

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_objective_types** | [**Array&lt;ObjectiveType&gt;**](ObjectiveType.md) | List of values for filtering. [\&quot;WEB_SESSIONS\&quot;] in BETA. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CampaignObjectivesFilter.new(
  campaign_objective_types: [&quot;AWARENESS&quot;]
)
```

