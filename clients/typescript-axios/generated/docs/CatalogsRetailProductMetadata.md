# CatalogsRetailProductMetadata

Retail product metadata entity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item_id** | **string** | The user-created unique ID that represents the product. | [default to undefined]
**item_group_id** | **string** | The parent ID of the product. | [default to undefined]
**availability** | [**NonNullableProductAvailabilityType**](NonNullableProductAvailabilityType.md) |  | [default to undefined]
**price** | **number** | The price of the product. | [default to undefined]
**sale_price** | **number** | The discounted price of the product. | [default to undefined]
**currency** | [**NonNullableCatalogsCurrency**](NonNullableCatalogsCurrency.md) |  | [default to undefined]

## Example

```typescript
import { CatalogsRetailProductMetadata } from './api';

const instance: CatalogsRetailProductMetadata = {
    item_id,
    item_group_id,
    availability,
    price,
    sale_price,
    currency,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
