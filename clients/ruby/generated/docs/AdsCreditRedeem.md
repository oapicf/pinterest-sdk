# PinterestSdkClient::AdsCreditRedeem

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **error_code** | **Integer** | Error code type if error occurs | [optional][readonly] |
| **error_message** | **String** | Reason for failure | [optional][readonly] |
| **success** | **Boolean** | Returns true if the offer code was successfully applied(validateOnly&#x3D;false) or can be applied(validateOnly&#x3D;true). | [optional][readonly] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AdsCreditRedeem.new(
  error_code: 2708,
  error_message: The offer has already been redeemed by this advertiser,
  success: false
)
```

