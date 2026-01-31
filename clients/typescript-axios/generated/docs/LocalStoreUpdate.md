# LocalStoreUpdate


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address_primary** | **string** | Primary address line of the store. | [optional] [default to undefined]
**address_secondary** | **string** | Secondary address line of the store. | [optional] [default to undefined]
**city** | **string** | City where the store is located. | [optional] [default to undefined]
**country** | [**Country**](Country.md) | Country code where the store is located. | [optional] [default to undefined]
**id** | **string** | The ID of the local store. | [default to undefined]
**latitude** | **number** | Geographic latitude coordinate of the store. | [optional] [default to undefined]
**longitude** | **number** | Geographic longitude coordinate of the store. | [optional] [default to undefined]
**name** | **string** | The name of the local store. | [optional] [default to undefined]
**postal_code** | **string** | Postal or ZIP code of the store. | [optional] [default to undefined]
**region** | **string** | State or region code where the store is located. | [optional] [default to undefined]
**store_code** | **string** | Merchant provided code for the local store. Unique within the merchant\&#39;s catalog. | [optional] [default to undefined]

## Example

```typescript
import { LocalStoreUpdate } from './api';

const instance: LocalStoreUpdate = {
    address_primary,
    address_secondary,
    city,
    country,
    id,
    latitude,
    longitude,
    name,
    postal_code,
    region,
    store_code,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
