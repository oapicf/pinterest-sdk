# CartingProduct


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**carting_product_id** | **string** | the internal Pinterest carting product id (different from industry product id) | [default to undefined]
**display_preferred_retailers_only** | **boolean** | Whether to display only the preferred retailers for the carting product | [optional] [default to undefined]
**display_product_price** | **boolean** | Whether to display the price for the carting product | [optional] [default to undefined]
**preferred_retailers** | [**Array&lt;CartingRetailer&gt;**](CartingRetailer.md) | A sorted array of preferred retailers for the carting product | [optional] [default to undefined]
**randomize_preferred_retailers** | **boolean** | Whether to randomize preferred retailers for the carting product | [optional] [default to undefined]

## Example

```typescript
import { CartingProduct } from './api';

const instance: CartingProduct = {
    carting_product_id,
    display_preferred_retailers_only,
    display_product_price,
    preferred_retailers,
    randomize_preferred_retailers,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
