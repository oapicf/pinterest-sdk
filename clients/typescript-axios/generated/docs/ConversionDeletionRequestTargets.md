# ConversionDeletionRequestTargets


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**user_emails** | **Array&lt;string&gt;** | Array of plain text user emails. | [default to undefined]
**epiks** | **Array&lt;string&gt;** | Array of EPIKs (Encrypted Pinterest ID Keys). An EPIK is a user match type that utilizes 3P browser localStorage (similar to a third-party cookie). | [default to undefined]

## Example

```typescript
import { ConversionDeletionRequestTargets } from './api';

const instance: ConversionDeletionRequestTargets = {
    user_emails,
    epiks,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
