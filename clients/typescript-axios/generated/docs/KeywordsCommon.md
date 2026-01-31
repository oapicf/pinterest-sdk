# KeywordsCommon


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bid** | **number** | &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. | [optional] [default to undefined]
**match_type** | [**MatchTypeResponse**](MatchTypeResponse.md) |  | [default to undefined]
**value** | **string** | Keyword value (120 chars max). | [default to undefined]

## Example

```typescript
import { KeywordsCommon } from './api';

const instance: KeywordsCommon = {
    bid,
    match_type,
    value,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
