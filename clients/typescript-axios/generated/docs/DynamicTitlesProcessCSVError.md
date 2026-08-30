# DynamicTitlesProcessCSVError


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error_type** | **string** | The type of validation error: INVALID_FILE or ROW_VALIDATION_FAILED. | [optional] [default to undefined]
**row_number** | **number** | The row number with a validation error. -1 indicates a file-level error. | [optional] [default to undefined]

## Example

```typescript
import { DynamicTitlesProcessCSVError } from './api';

const instance: DynamicTitlesProcessCSVError = {
    error_type,
    row_number,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
