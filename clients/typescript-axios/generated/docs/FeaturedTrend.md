# FeaturedTrend

Featured trending topics for a specific interest and market

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**interest** | [**InterestsEnum**](InterestsEnum.md) | The main interest category | [default to undefined]
**market** | [**ProductCategoryRegion**](ProductCategoryRegion.md) | Market code (e.g., \&#39;US\&#39;, \&#39;UK\&#39;, etc.) | [optional] [default to undefined]
**trends** | [**Array&lt;TrendingTopic&gt;**](TrendingTopic.md) | List of trending topics within this interest category | [optional] [default to undefined]

## Example

```typescript
import { FeaturedTrend } from './api';

const instance: FeaturedTrend = {
    interest,
    market,
    trends,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
