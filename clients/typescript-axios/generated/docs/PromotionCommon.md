# PromotionCommon


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**discount_status** | **string** | Discount status based on the current time and start and end time of discount | [optional] [default to undefined]
**end_time** | **number** | Promotion end time. Unix timestamp in seconds. Independent of campaign end time. | [optional] [default to undefined]
**external_id** | **string** | Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest. | [optional] [default to undefined]
**platform_type** | **string** | The source integration platform used when creating the promotion. Currently supported values are \&#39;DEFAULT\&#39; and \&#39;SHOPIFY\&#39;. | [optional] [default to undefined]
**promotion_code** | **string** | Code that can be used to redeem a promotion. | [optional] [default to undefined]
**promotion_custom_id** | **string** | An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one. | [optional] [default to undefined]
**promotion_title** | **string** | Internal name for the promotion. | [optional] [default to undefined]
**promotion_type** | [**PromotionType**](PromotionType.md) |  | [optional] [default to undefined]
**start_time** | **number** | Promotion start time. Unix timestamp in seconds. Independent of campaign start time. | [optional] [default to undefined]
**template_values** | [**Array&lt;PromotionTemplateValue&gt;**](PromotionTemplateValue.md) | List of values to be inserted in the promotion type-specific template. | [optional] [default to undefined]

## Example

```typescript
import { PromotionCommon } from './api';

const instance: PromotionCommon = {
    discount_status,
    end_time,
    external_id,
    platform_type,
    promotion_code,
    promotion_custom_id,
    promotion_title,
    promotion_type,
    start_time,
    template_values,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
