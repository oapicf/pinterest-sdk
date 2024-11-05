# PinterestSdkClient::DeleteInvitesResultsResponseArrayItemsInnerException

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **invite_id** | **String** | Unique identifier of an invite. | [optional] |
| **message** | **String** | Error message associated with the error in performing the action on the invite/request. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::DeleteInvitesResultsResponseArrayItemsInnerException.new(
  invite_id: null,
  message: Business Invite request cannot be performed on current invitation status.
)
```

