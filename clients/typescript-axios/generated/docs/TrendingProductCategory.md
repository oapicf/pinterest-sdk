# TrendingProductCategory

Trending shopping product category

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**engagement_type** | [**ProductCategoriesEngagementType**](ProductCategoriesEngagementType.md) | Engagement type | [default to undefined]
**pct_change_mom** | **number** | Month-over-month change percentage | [default to undefined]
**percent_relative_volume** | **number** | Relative volume percentage | [default to undefined]
**pinterest_product_category_id** | **number** | Pinterest Product Category Id | [default to undefined]
**product_category** | **string** | Product Category Name | [default to undefined]
**verticals** | **Array&lt;string&gt;** | Vertical name associated with the product category | [optional] [default to undefined]

## Example

```typescript
import { TrendingProductCategory } from './api';

const instance: TrendingProductCategory = {
    engagement_type,
    pct_change_mom,
    percent_relative_volume,
    pinterest_product_category_id,
    product_category,
    verticals,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
