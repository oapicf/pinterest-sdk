# PinterestSdkClient::IntegrationMetadata

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
| **partner_access_token_expiry** | **Float** |  | [optional] |
| **partner_refresh_token_expiry** | **Float** |  | [optional] |
| **scopes** | **String** |  | [optional] |
| **created_timestamp** | **Float** |  | [optional] |
| **updated_timestamp** | **Float** |  | [optional] |
| **additional_id_1** | **String** |  | [optional] |
| **partner_metadata** | **String** |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::IntegrationMetadata.new(
  id: null,
  external_business_id: null,
  connected_merchant_id: null,
  connected_user_id: null,
  connected_advertiser_id: null,
  connected_lba_id: null,
  connected_tag_id: null,
  partner_access_token_expiry: null,
  partner_refresh_token_expiry: null,
  scopes: null,
  created_timestamp: null,
  updated_timestamp: null,
  additional_id_1: null,
  partner_metadata: null
)
```

