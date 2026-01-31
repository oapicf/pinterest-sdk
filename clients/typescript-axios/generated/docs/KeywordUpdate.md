# KeywordUpdate


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | Keyword ID. | [default to undefined]
**archived** | **boolean** | Is keyword archived? | [optional] [default to undefined]
**bid** | **number** | &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. | [optional] [default to undefined]

## Example

```typescript
import { KeywordUpdate } from './api';

const instance: KeywordUpdate = {
    id,
    archived,
    bid,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
