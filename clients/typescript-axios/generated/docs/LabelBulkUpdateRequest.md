# LabelBulkUpdateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | Label ID. | [default to undefined]
**parent_id** | **string** | Unique identifier of the asset you are labelling. Currently, you can only label campaigns. | [default to undefined]
**status** | [**LabelStatusBulkUpdate**](LabelStatusBulkUpdate.md) |  | [default to undefined]

## Example

```typescript
import { LabelBulkUpdateRequest } from './api';

const instance: LabelBulkUpdateRequest = {
    id,
    parent_id,
    status,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
