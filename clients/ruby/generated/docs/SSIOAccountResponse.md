# PinterestSdkClient::SSIOAccountResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **eligible** | **Boolean** | Advertiser eligible to create order lines | [optional] |
| **can_edit** | **Boolean** | Advertiser eligible to update order lines | [optional] |
| **billto_infos** | [**Array&lt;SSIOAccountItem&gt;**](SSIOAccountItem.md) | An array of Salesforce account information that includes address, io terms, etc. | [optional] |
| **currency** | **String** |  | [optional] |
| **pmp_names** | [**Array&lt;SSIOAccountPMPName&gt;**](SSIOAccountPMPName.md) |  | [optional] |
| **error** | **String** | Error indicator from Salesforce which could be \&quot;No Error\&quot; | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::SSIOAccountResponse.new(
  eligible: true,
  can_edit: true,
  billto_infos: null,
  currency: USD,
  pmp_names: null,
  error: No Error
)
```

