# Label


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | Label ID. | [optional] [default to undefined]
**label_type** | [**LabelType**](LabelType.md) |  | [optional] [default to undefined]
**parent_id** | **string** | Label parent entity ID. | [optional] [default to undefined]
**parent_type** | **string** | Label parent entity type. | [optional] [default to undefined]
**status** | [**LabelStatus**](LabelStatus.md) |  | [optional] [default to undefined]
**value** | **string** | Label name. | [optional] [default to undefined]

## Example

```typescript
import { Label } from './api';

const instance: Label = {
    id,
    label_type,
    parent_id,
    parent_type,
    status,
    value,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
