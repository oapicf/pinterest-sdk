# StoreMetadata

Store metadata for a specific store location

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**geohash** | **string** | Geohash of the store location | [optional] [default to undefined]
**latitude** | **number** | Geographic latitude coordinate of the store | [optional] [default to undefined]
**longitude** | **number** | Geographic longitude coordinate of the store | [optional] [default to undefined]
**store_code** | **string** | Merchant provided store code | [default to undefined]
**store_id** | **string** | Internal store code | [default to undefined]
**store_name** | **string** | Store name | [optional] [default to undefined]

## Example

```typescript
import { StoreMetadata } from './api';

const instance: StoreMetadata = {
    geohash,
    latitude,
    longitude,
    store_code,
    store_id,
    store_name,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
