# PinterestSdkClient::UpdateInvitesResultsResponseArray

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **items** | [**Array&lt;InviteActionResultItem&gt;**](InviteActionResultItem.md) | List of invite/Request action status. If there is an error, an exception object will be returned. If the action was successfully completed, an invite object will be returned. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::UpdateInvitesResultsResponseArray.new(
  items: null
)
```

