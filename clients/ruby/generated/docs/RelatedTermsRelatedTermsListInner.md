# PinterestSdkClient::RelatedTermsRelatedTermsListInner

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **term** | **String** |  | [optional] |
| **related_terms** | **Array&lt;String&gt;** |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::RelatedTermsRelatedTermsListInner.new(
  term: clothes,
  related_terms: [&quot;shoes&quot;,&quot;cute clothes&quot;]
)
```

