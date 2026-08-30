# CatalogsRetailItemErrorResponse

Object describing a retail item error

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **string** |  | [default to undefined]
**errors** | [**Array&lt;ItemValidationEvent&gt;**](ItemValidationEvent.md) | Array with the errors for the item id requested | [default to undefined]
**item_id** | **string** | The catalog item id in the merchant namespace | [optional] [default to undefined]
**item_response_kind** | **string** | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. | [default to undefined]

## Example

```typescript
import { CatalogsRetailItemErrorResponse } from './api';

const instance: CatalogsRetailItemErrorResponse = {
    catalog_type,
    errors,
    item_id,
    item_response_kind,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
