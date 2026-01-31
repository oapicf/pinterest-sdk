# CatalogsRetailProductMetadata

Retail product metadata entity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**availability** | [**NonNullableProductAvailabilityType**](NonNullableProductAvailabilityType.md) |  | [default to undefined]
**currency** | [**NonNullableCatalogsCurrency**](NonNullableCatalogsCurrency.md) |  | [default to undefined]
**item_group_id** | **string** | The parent ID of the product. | [default to undefined]
**item_id** | **string** | The user-created unique ID that represents the product. | [default to undefined]
**price** | **number** | The price of the product. | [default to undefined]
**sale_price** | **number** | The discounted price of the product. | [default to undefined]

## Example

```typescript
import { CatalogsRetailProductMetadata } from './api';

const instance: CatalogsRetailProductMetadata = {
    availability,
    currency,
    item_group_id,
    item_id,
    price,
    sale_price,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
