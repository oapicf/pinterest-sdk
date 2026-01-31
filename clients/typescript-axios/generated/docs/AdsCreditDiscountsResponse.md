# AdsCreditDiscountsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **boolean** | True if the offer code is currently active. | [optional] [default to undefined]
**advertiser_id** | **string** | Advertiser ID the offer was applied to. | [optional] [default to undefined]
**discountCurrency** | **string** | Currency value for the discount. | [optional] [default to undefined]
**discountInMicroCurrency** | **number** | The discount applied in the offer’s currency value. | [optional] [default to undefined]
**discountType** | **string** | The type of discount of this credit | [optional] [default to undefined]
**remainingDiscountInMicroCurrency** | **number** | The credits left to spend. | [optional] [default to undefined]
**title** | **string** | Human readable title of the offer code. | [optional] [default to undefined]

## Example

```typescript
import { AdsCreditDiscountsResponse } from './api';

const instance: AdsCreditDiscountsResponse = {
    active,
    advertiser_id,
    discountCurrency,
    discountInMicroCurrency,
    discountType,
    remainingDiscountInMicroCurrency,
    title,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
