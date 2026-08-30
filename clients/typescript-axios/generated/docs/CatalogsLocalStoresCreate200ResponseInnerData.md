# CatalogsLocalStoresCreate200ResponseInnerData

Created/updated resource on success or error details on failure

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address_primary** | **string** | Primary address line of the store. | [optional] [default to undefined]
**address_secondary** | **string** | Secondary address line of the store. | [optional] [default to undefined]
**city** | **string** | City where the store is located. | [optional] [default to undefined]
**country** | [**Country**](Country.md) | Country code where the store is located. | [default to undefined]
**created_at** | **string** | Creation timestamp | [readonly] [default to undefined]
**id** | **string** | The ID of the local store. | [default to undefined]
**latitude** | **number** | Geographic latitude coordinate of the store. | [optional] [default to undefined]
**longitude** | **number** | Geographic longitude coordinate of the store. | [optional] [default to undefined]
**name** | **string** | The name of the local store. | [default to undefined]
**postal_code** | **string** | Postal or ZIP code of the store. | [optional] [default to undefined]
**region** | **string** | State or region code where the store is located. | [optional] [default to undefined]
**store_code** | **string** | Merchant provided code for the local store. Unique within the merchant\&#39;s catalog. | [default to undefined]
**updated_at** | **string** | Last update timestamp | [readonly] [default to undefined]
**exceptions** | [**PinterestLibError**](PinterestLibError.md) |  | [default to undefined]

## Example

```typescript
import { CatalogsLocalStoresCreate200ResponseInnerData } from './api';

const instance: CatalogsLocalStoresCreate200ResponseInnerData = {
    address_primary,
    address_secondary,
    city,
    country,
    created_at,
    id,
    latitude,
    longitude,
    name,
    postal_code,
    region,
    store_code,
    updated_at,
    exceptions,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
