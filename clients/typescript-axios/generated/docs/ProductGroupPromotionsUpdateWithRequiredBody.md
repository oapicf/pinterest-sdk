# ProductGroupPromotionsUpdateWithRequiredBody

Resource create or update operation model with required body fields (no OptionalProperties).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_group_id** | **string** | ID of the ad group the product group promotion belongs to. | [default to undefined]
**product_group_promotion** | [**Array&lt;ProductGroupPromotion&gt;**](ProductGroupPromotion.md) | List of product group promotions to create or update. | [default to undefined]

## Example

```typescript
import { ProductGroupPromotionsUpdateWithRequiredBody } from './api';

const instance: ProductGroupPromotionsUpdateWithRequiredBody = {
    ad_group_id,
    product_group_promotion,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
