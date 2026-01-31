# IntegrationLogClientError

System error details included in the log sent by the client.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cause** | **string** | Original cause of the error. | [optional] [default to undefined]
**column_number** | **number** | Column number in the line of the file that raised the error. | [optional] [default to undefined]
**file_name** | **string** | Filename where the error happened. | [optional] [default to undefined]
**line_number** | **number** | Line number where the error happened. | [optional] [default to undefined]
**message** | **string** | Human-readable description of the error. | [optional] [default to undefined]
**message_detail** | **string** | More detail about the message. | [optional] [default to undefined]
**name** | **string** | Filename where the error happened. | [optional] [default to undefined]
**number** | **number** | Integer that specifies the error code. | [optional] [default to undefined]
**stack_trace** | **string** | Stack trace of where the error happened. | [optional] [default to undefined]

## Example

```typescript
import { IntegrationLogClientError } from './api';

const instance: IntegrationLogClientError = {
    cause,
    column_number,
    file_name,
    line_number,
    message,
    message_detail,
    name,
    number,
    stack_trace,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
