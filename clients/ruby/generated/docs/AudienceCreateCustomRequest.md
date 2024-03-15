# PinterestSdkClient::AudienceCreateCustomRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Ad account ID. | [optional] |
| **name** | **String** | Audience name. |  |
| **rule** | [**AudienceRule**](AudienceRule.md) |  |  |
| **sharing_type** | [**AudienceSharingType**](AudienceSharingType.md) |  |  |
| **data_party** | [**AudienceDataParty**](AudienceDataParty.md) |  |  |
| **category** | **String** |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AudienceCreateCustomRequest.new(
  ad_account_id: 549755885175,
  name: string,
  rule: null,
  sharing_type: null,
  data_party: null,
  category: DLX Demographics
)
```

