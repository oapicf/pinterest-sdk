# PinterestSdkClient::QualityComponentDetails

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **coverage** | **Float** | Coverage percentage for this event type. |  |
| **issues** | [**Array&lt;QualityComponentIssue&gt;**](QualityComponentIssue.md) | List of issues detected for this event type, if any. | [optional] |
| **overlap** | **Float** | Overlap percentage for this event type. Only populated for external_event_id | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::QualityComponentDetails.new(
  coverage: null,
  issues: null,
  overlap: null
)
```

