# ProductGroupAnalyticsResponseInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DATE** | **string** | Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;) | [optional] [default to undefined]
**PRODUCT_GROUP_ID** | **string** | The ID of the product group that this metrics belongs to. | [default to undefined]

## Example

```typescript
import { ProductGroupAnalyticsResponseInner } from './api';

const instance: ProductGroupAnalyticsResponseInner = {
    DATE,
    PRODUCT_GROUP_ID,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
