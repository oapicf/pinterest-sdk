# AudienceCategory


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | Interest ID. | [optional] [default to undefined]
**index** | **number** | Interest affinity index. | [optional] [default to undefined]
**key** | **string** | Interest unique key (same as ID). | [optional] [default to undefined]
**name** | **string** | Interest name. | [optional] [default to undefined]
**ratio** | **number** | Interest\&#39;s percent of category\&#39;s total audience. | [optional] [default to undefined]
**subcategories** | [**Array&lt;AudienceSubcategory&gt;**](AudienceSubcategory.md) | Subcategory interest distribution | [optional] [default to undefined]

## Example

```typescript
import { AudienceCategory } from './api';

const instance: AudienceCategory = {
    id,
    index,
    key,
    name,
    ratio,
    subcategories,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
