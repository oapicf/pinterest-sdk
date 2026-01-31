# PinterestSdkClient::RelatedTermsRelatedTermsListInner

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **related_terms** | **Array&lt;String&gt;** |  | [optional] |
| **term** | **String** |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::RelatedTermsRelatedTermsListInner.new(
  related_terms: [&quot;shoes&quot;,&quot;cute clothes&quot;],
  term: clothes
)
```

