# IntegrationRequest

Schema used for creating the integration metadata.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**external_business_id** | **string** | External business ID for the integration. | [optional] [default to undefined]
**connected_merchant_id** | **string** |  | [optional] [default to undefined]
**connected_advertiser_id** | **string** |  | [optional] [default to undefined]
**connected_lba_id** | **string** |  | [optional] [default to undefined]
**connected_tag_id** | **string** |  | [optional] [default to undefined]
**partner_access_token** | **string** |  | [optional] [default to undefined]
**partner_refresh_token** | **string** |  | [optional] [default to undefined]
**partner_primary_email** | **string** |  | [optional] [default to undefined]
**partner_access_token_expiry** | **number** |  | [optional] [default to undefined]
**partner_refresh_token_expiry** | **number** |  | [optional] [default to undefined]
**scopes** | **string** |  | [optional] [default to undefined]
**additional_id_1** | **string** |  | [optional] [default to undefined]
**partner_metadata** | **string** |  | [optional] [default to undefined]

## Example

```typescript
import { IntegrationRequest } from './api';

const instance: IntegrationRequest = {
    external_business_id,
    connected_merchant_id,
    connected_advertiser_id,
    connected_lba_id,
    connected_tag_id,
    partner_access_token,
    partner_refresh_token,
    partner_primary_email,
    partner_access_token_expiry,
    partner_refresh_token_expiry,
    scopes,
    additional_id_1,
    partner_metadata,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
