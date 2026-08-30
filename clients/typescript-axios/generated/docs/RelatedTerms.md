# RelatedTerms


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | First input term. For example, if you pass \&quot;?terms&#x3D;clothes,workout\&quot;, then id will be \&quot;clothes\&quot; | [optional] [default to undefined]
**related_term_count** | **number** | Total number of related terms returned | [optional] [default to undefined]
**related_terms_list** | [**Array&lt;RelatedTermsRelatedTermsListItems&gt;**](RelatedTermsRelatedTermsListItems.md) | The id of the advertiser. | [optional] [default to undefined]

## Example

```typescript
import { RelatedTerms } from './api';

const instance: RelatedTerms = {
    id,
    related_term_count,
    related_terms_list,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
