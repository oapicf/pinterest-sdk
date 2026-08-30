# PinterestSdkClient::BoardWithUpdatePrivacyUpdate

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **description** | **String** |  | [optional] |
| **name** | **String** |     Name of the board.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the board name automatically becomes \&quot;Ad-only Pins\&quot;. | [optional] |
| **privacy** | [**BoardUpdatePrivacy**](BoardUpdatePrivacy.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::BoardWithUpdatePrivacyUpdate.new(
  description: My favorite summer recipes,
  name: Summer recipes,
  privacy: null
)
```

