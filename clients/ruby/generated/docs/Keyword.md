# PinterestSdkClient::Keyword

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **bid** | **Integer** | &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. | [optional] |
| **match_type** | [**MatchTypeResponse**](MatchTypeResponse.md) |  |  |
| **value** | **String** | Keyword value (120 chars max). |  |
| **archived** | **Boolean** |  | [optional] |
| **id** | **String** | Keyword ID . | [optional] |
| **parent_id** | **String** | Keyword parent entity ID (advertiser, campaign, ad group). | [optional] |
| **parent_type** | **String** | Parent entity type | [optional] |
| **type** | **String** | Always keyword | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::Keyword.new(
  bid: null,
  match_type: null,
  value: null,
  archived: false,
  id: 383791336903426391,
  parent_id: 383791336903426391,
  parent_type: campaign,
  type: keyword
)
```

