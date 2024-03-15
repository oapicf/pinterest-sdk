# PinterestSdkClient::AdsCreditRedeemResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **success** | **Boolean** | Returns true if the offer code was successfully applied(validateOnly&#x3D;false) or can be applied(validateOnly&#x3D;true). | [optional] |
| **error_code** | **Integer** | Error code type if error occurs | [optional] |
| **error_message** | **String** | Reason for failure | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AdsCreditRedeemResponse.new(
  success: false,
  error_code: 2708,
  error_message: The offer has already been redeemed by this advertiser
)
```

