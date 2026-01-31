# LabelCreateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**labels** | [**Array&lt;LabelCreateRequestLabelsInner&gt;**](LabelCreateRequestLabelsInner.md) | Labels that you are applying to the campaign. | [default to undefined]
**parent_id** | **string** | Unique identifier of the asset you are labelling. Currently, you can only label campaigns. | [default to undefined]

## Example

```typescript
import { LabelCreateRequest } from './api';

const instance: LabelCreateRequest = {
    labels,
    parent_id,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
