# LabelBulkUpdateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | Label ID. | [default to undefined]
**status** | **string** | Set status to &#x60;ARCHIVED&#x60; to remove the label from the parent entity. | [optional] [default to undefined]
**value** | **string** | &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; value field will be deprecated. Label name. 100-character limit. | [optional] [default to undefined]

## Example

```typescript
import { LabelBulkUpdateRequest } from './api';

const instance: LabelBulkUpdateRequest = {
    id,
    status,
    value,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
