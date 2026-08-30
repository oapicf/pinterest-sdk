# ConversionDeletionRequestCreate

Resource create operation model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deletion_targets** | [**ConversionDeletionRequestTargets**](ConversionDeletionRequestTargets.md) | Object containing the targets of the conversion deletion request. Users can be identified with user_emails, epiks, or both within the same request. | [default to undefined]

## Example

```typescript
import { ConversionDeletionRequestCreate } from './api';

const instance: ConversionDeletionRequestCreate = {
    deletion_targets,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
