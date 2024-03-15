# PinterestSdkClient::KeywordsRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **keywords** | [**Array&lt;KeywordsCommon&gt;**](KeywordsCommon.md) | Keyword JSON array. Each array element has 3 fields |  |
| **parent_id** | **String** | Keyword parent entity ID (advertiser, campaign, ad group). |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::KeywordsRequest.new(
  keywords: null,
  parent_id: 383791336903426391
)
```

