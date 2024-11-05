# PinterestSdkClient::KeywordUpdate

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | Keyword ID. |  |
| **archived** | **Boolean** | Is keyword archived? | [optional] |
| **bid** | **Integer** | &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::KeywordUpdate.new(
  id: 2886364308355,
  archived: false,
  bid: null
)
```

