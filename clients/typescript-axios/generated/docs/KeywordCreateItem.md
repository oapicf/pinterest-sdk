# KeywordCreateItem


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bid** | **number** | **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. | [optional] [default to undefined]
**match_type** | [**MatchType**](MatchType.md) | Keyword [match type](/docs/api-features/targeting-overview/) | [default to undefined]
**value** | **string** | Keyword value (120 chars max). | [default to undefined]

## Example

```typescript
import { KeywordCreateItem } from './api';

const instance: KeywordCreateItem = {
    bid,
    match_type,
    value,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
