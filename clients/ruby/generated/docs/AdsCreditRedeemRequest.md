# PinterestSdkClient::AdsCreditRedeemRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **offer_code_hash** | **String** | Takes in a SHA256 hash of the offerCode. |  |
| **validate_only** | **Boolean** | If true, only validate if we can redeem offer code. Otherwise it will actually apply the offer code to the account |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AdsCreditRedeemRequest.new(
  offer_code_hash: 138e9e0ff7e38cf511b880975eb574c09aa9d5e1657590ab0431040da68caa67,
  validate_only: true
)
```

