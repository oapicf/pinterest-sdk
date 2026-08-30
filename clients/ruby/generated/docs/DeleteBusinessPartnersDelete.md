# PinterestSdkClient::DeleteBusinessPartnersDelete

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **partner_ids** | **Array&lt;String&gt;** | A list of partner ids to be deleted |  |
| **partner_type** | [**NullablePartnerType**](NullablePartnerType.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::DeleteBusinessPartnersDelete.new(
  partner_ids: null,
  partner_type: null
)
```

