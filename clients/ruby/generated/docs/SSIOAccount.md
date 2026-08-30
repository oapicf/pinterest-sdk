# PinterestSdkClient::SSIOAccount

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **billto_infos** | [**Array&lt;SSIOAccountItem&gt;**](SSIOAccountItem.md) | An array of Salesforce account information that includes address, io terms, etc. | [optional] |
| **can_edit** | **Boolean** | Advertiser eligible to update order lines | [optional] |
| **currency** | **String** |  | [optional] |
| **eligible** | **Boolean** | Advertiser eligible to create order lines | [optional] |
| **error** | **String** | Error indicator from Salesforce which could be \&quot;No Error\&quot; | [optional] |
| **pmp_names** | [**Array&lt;SSIOAccountPMPName&gt;**](SSIOAccountPMPName.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::SSIOAccount.new(
  billto_infos: null,
  can_edit: true,
  currency: USD,
  eligible: true,
  error: No Error,
  pmp_names: null
)
```

