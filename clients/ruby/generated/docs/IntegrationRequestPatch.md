# PinterestSdkClient::IntegrationRequestPatch

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **connected_merchant_id** | **String** |  | [optional] |
| **connected_advertiser_id** | **String** |  | [optional] |
| **connected_lba_id** | **String** |  | [optional] |
| **connected_tag_id** | **String** |  | [optional] |
| **partner_access_token** | **String** |  | [optional] |
| **partner_refresh_token** | **String** |  | [optional] |
| **partner_primary_email** | **String** |  | [optional] |
| **partner_access_token_expiry** | **Float** |  | [optional] |
| **partner_refresh_token_expiry** | **Float** |  | [optional] |
| **scopes** | **String** |  | [optional] |
| **additional_id_1** | **String** |  | [optional] |
| **partner_metadata** | **String** |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::IntegrationRequestPatch.new(
  connected_merchant_id: null,
  connected_advertiser_id: null,
  connected_lba_id: null,
  connected_tag_id: null,
  partner_access_token: null,
  partner_refresh_token: null,
  partner_primary_email: null,
  partner_access_token_expiry: null,
  partner_refresh_token_expiry: null,
  scopes: null,
  additional_id_1: null,
  partner_metadata: null
)
```

