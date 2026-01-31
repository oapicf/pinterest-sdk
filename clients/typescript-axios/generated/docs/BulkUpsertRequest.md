# BulkUpsertRequest

Two set of objects to be managed asyncronusly by bulk. One for creations, one for modifications.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**create** | [**BulkUpsertRequestCreate**](BulkUpsertRequestCreate.md) |  | [optional] [default to undefined]
**update** | [**BulkUpsertRequestUpdate**](BulkUpsertRequestUpdate.md) |  | [optional] [default to undefined]

## Example

```typescript
import { BulkUpsertRequest } from './api';

const instance: BulkUpsertRequest = {
    create,
    update,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
