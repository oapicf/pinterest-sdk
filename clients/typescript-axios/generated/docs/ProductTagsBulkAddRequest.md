# ProductTagsBulkAddRequest

Request body for bulk adding product tags to a pin.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**product_tags** | [**Array&lt;ProductTagItem&gt;**](ProductTagItem.md) | List of product tags to add. Maximum 24 items allowed. | [default to undefined]

## Example

```typescript
import { ProductTagsBulkAddRequest } from './api';

const instance: ProductTagsBulkAddRequest = {
    product_tags,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
