# TargetingTypeFilter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**targeting_types** | **Array&lt;string&gt;** | List of targeting types. Requires &#x60;level&#x60; to be a value ending in &#x60;_TARGETING&#x60;. [\&quot;AUDIENCE_MULTIPLIER\&quot;] is only available in CAMPAIGN_TARGETING level. [\&quot;MEDIA_TYPE\&quot;] is only available in PRODUCT_ITEM_TARGETING level. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users. | [optional] [default to undefined]

## Example

```typescript
import { TargetingTypeFilter } from './api';

const instance: TargetingTypeFilter = {
    targeting_types,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
