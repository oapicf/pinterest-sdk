# PinterestSdkClient::Keyword

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **archived** | **Boolean** |  | [optional] |
| **bid** | **Integer** | **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. | [optional] |
| **id** | **String** | Keyword ID . |  |
| **match_type** | [**MatchType**](MatchType.md) | Keyword [match type](/docs/api-features/targeting-overview/) |  |
| **parent_id** | **String** | Keyword parent entity ID (advertiser, campaign, ad group). | [readonly] |
| **parent_type** | **String** | Parent entity type (advertiser, campaign, ad group). | [optional][readonly] |
| **type** | **String** | Always keyword | [optional][readonly] |
| **value** | **String** | Keyword value (120 chars max). |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::Keyword.new(
  archived: false,
  bid: null,
  id: 383791336903426391,
  match_type: null,
  parent_id: 383791336903426391,
  parent_type: campaign,
  type: keyword,
  value: null
)
```

