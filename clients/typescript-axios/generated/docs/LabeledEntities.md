# LabeledEntities


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entities_labels** | [**Array&lt;EntityLabel&gt;**](EntityLabel.md) |  | [optional] [readonly] [default to undefined]
**errors** | [**Array&lt;EntityLabelError&gt;**](EntityLabelError.md) | Labels that were not successfully applied. | [optional] [readonly] [default to undefined]

## Example

```typescript
import { LabeledEntities } from './api';

const instance: LabeledEntities = {
    entities_labels,
    errors,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
