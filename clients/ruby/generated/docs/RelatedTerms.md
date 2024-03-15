# PinterestSdkClient::RelatedTerms

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | First input term. For example, if you pass \&quot;?terms&#x3D;clothes,workout\&quot;, then id will be \&quot;clothes\&quot; | [optional] |
| **related_term_count** | **Integer** | Total number of related terms returned | [optional] |
| **related_terms_list** | [**Array&lt;RelatedTermsRelatedTermsListInner&gt;**](RelatedTermsRelatedTermsListInner.md) | The id of the advertiser. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::RelatedTerms.new(
  id: clothes,
  related_term_count: 2,
  related_terms_list: null
)
```

