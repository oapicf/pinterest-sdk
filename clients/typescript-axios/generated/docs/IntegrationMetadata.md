# IntegrationMetadata

Integration metadata

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** |  | [optional] [default to undefined]
**external_business_id** | **string** |  | [optional] [default to undefined]
**connected_merchant_id** | **string** |  | [optional] [default to undefined]
**connected_user_id** | **string** |  | [optional] [readonly] [default to undefined]
**connected_advertiser_id** | **string** |  | [optional] [readonly] [default to undefined]
**connected_lba_id** | **string** |  | [optional] [default to undefined]
**connected_tag_id** | **string** |  | [optional] [default to undefined]
**partner_access_token_expiry** | **number** |  | [optional] [default to undefined]
**partner_refresh_token_expiry** | **number** |  | [optional] [default to undefined]
**scopes** | **string** |  | [optional] [default to undefined]
**created_timestamp** | **number** |  | [optional] [default to undefined]
**updated_timestamp** | **number** |  | [optional] [default to undefined]
**additional_id_1** | **string** |  | [optional] [default to undefined]
**partner_metadata** | **string** |  | [optional] [default to undefined]

## Example

```typescript
import { IntegrationMetadata } from './api';

const instance: IntegrationMetadata = {
    id,
    external_business_id,
    connected_merchant_id,
    connected_user_id,
    connected_advertiser_id,
    connected_lba_id,
    connected_tag_id,
    partner_access_token_expiry,
    partner_refresh_token_expiry,
    scopes,
    created_timestamp,
    updated_timestamp,
    additional_id_1,
    partner_metadata,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
