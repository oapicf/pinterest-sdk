# PinterestSdkClient::IntegrationRecord

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** |  | [optional] |
| **external_business_id** | **String** |  | [optional] |
| **connected_merchant_id** | **String** |  | [optional] |
| **connected_user_id** | **String** |  | [optional][readonly] |
| **connected_advertiser_id** | **String** |  | [optional][readonly] |
| **connected_lba_id** | **String** |  | [optional] |
| **connected_tag_id** | **String** |  | [optional] |
| **partner_access_token** | **String** |  | [optional] |
| **partner_refresh_token** | **String** |  | [optional] |
| **partner_primary_email** | **String** |  | [optional] |
| **partner_access_token_expiry** | **Integer** |  | [optional] |
| **partner_refresh_token_expiry** | **Integer** |  | [optional] |
| **scopes** | **String** |  | [optional] |
| **partner_metadata** | **String** |  | [optional] |
| **additional_id_1** | **String** |  | [optional] |
| **created_time** | **Integer** |  | [optional] |
| **updated_time** | **Integer** |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::IntegrationRecord.new(
  id: null,
  external_business_id: null,
  connected_merchant_id: null,
  connected_user_id: null,
  connected_advertiser_id: null,
  connected_lba_id: null,
  connected_tag_id: null,
  partner_access_token: null,
  partner_refresh_token: null,
  partner_primary_email: null,
  partner_access_token_expiry: null,
  partner_refresh_token_expiry: null,
  scopes: null,
  partner_metadata: null,
  additional_id_1: null,
  created_time: null,
  updated_time: null
)
```

