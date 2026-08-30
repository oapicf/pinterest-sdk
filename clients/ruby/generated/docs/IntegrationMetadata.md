# PinterestSdkClient::IntegrationMetadata

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **additional_id_1** | **String** |  | [optional] |
| **connected_advertiser_id** | **String** |  | [optional] |
| **connected_lba_id** | **String** |  | [optional] |
| **connected_merchant_id** | **String** |  | [optional] |
| **connected_tag_id** | **String** |  | [optional] |
| **connected_user_id** | **String** |  | [optional][readonly] |
| **created_timestamp** | **Float** |  | [optional][readonly] |
| **external_business_id** | **String** | External business ID for the integration. | [optional] |
| **id** | **String** |  | [optional][readonly] |
| **partner_access_token_expiry** | **Float** |  | [optional] |
| **partner_metadata** | **String** |  | [optional] |
| **partner_refresh_token_expiry** | **Float** |  | [optional] |
| **scopes** | **String** |  | [optional] |
| **updated_timestamp** | **Float** |  | [optional][readonly] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::IntegrationMetadata.new(
  additional_id_1: null,
  connected_advertiser_id: null,
  connected_lba_id: null,
  connected_merchant_id: null,
  connected_tag_id: null,
  connected_user_id: null,
  created_timestamp: null,
  external_business_id: null,
  id: null,
  partner_access_token_expiry: null,
  partner_metadata: null,
  partner_refresh_token_expiry: null,
  scopes: null,
  updated_timestamp: null
)
```

