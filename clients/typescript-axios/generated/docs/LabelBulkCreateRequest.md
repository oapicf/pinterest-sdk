# LabelBulkCreateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**labels** | [**Array&lt;LabelCreateItem&gt;**](LabelCreateItem.md) | Labels that you are applying to the campaign. | [default to undefined]
**parent_id** | **string** | Unique identifier of the asset you are labelling. Currently, you can only label campaigns. | [default to undefined]

## Example

```typescript
import { LabelBulkCreateRequest } from './api';

const instance: LabelBulkCreateRequest = {
    labels,
    parent_id,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
