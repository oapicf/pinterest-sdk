# PinterestSdkClient::CreateInvitesResultsResponseArrayItemsInnerInvite

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | Unique identifier of the invite/request. | [optional] |
| **user** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the member/partner that was sent the invite/request. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CreateInvitesResultsResponseArrayItemsInnerInvite.new(
  id: 383791336903426391,
  user: null
)
```

