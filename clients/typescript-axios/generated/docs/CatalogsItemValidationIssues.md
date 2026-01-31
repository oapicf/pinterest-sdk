# CatalogsItemValidationIssues


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item_number** | **number** | Item number based on order of appearance in the Catalogs Feed. For example, \&#39;0\&#39; refers to first item found in a feed that was downloaded from a \&#39;location\&#39; specified during feed creation. | [default to undefined]
**item_id** | **string** | The merchant-created unique ID that represents the product. | [default to undefined]
**errors** | [**CatalogsItemValidationErrors**](CatalogsItemValidationErrors.md) |  | [default to undefined]
**warnings** | [**CatalogsItemValidationWarnings**](CatalogsItemValidationWarnings.md) |  | [default to undefined]

## Example

```typescript
import { CatalogsItemValidationIssues } from './api';

const instance: CatalogsItemValidationIssues = {
    item_number,
    item_id,
    errors,
    warnings,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
