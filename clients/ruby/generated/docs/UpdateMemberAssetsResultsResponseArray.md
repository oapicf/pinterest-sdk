# PinterestSdkClient::UpdateMemberAssetsResultsResponseArray

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **items** | [**Array&lt;UpdateMemberAssetsResultsResponseArrayItemsInner&gt;**](UpdateMemberAssetsResultsResponseArrayItemsInner.md) | List of assigned/updated member asset access. If there is an error, an exception object will be returned. If the action was successfully completed, a response object will be returned. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::UpdateMemberAssetsResultsResponseArray.new(
  items: null
)
```

