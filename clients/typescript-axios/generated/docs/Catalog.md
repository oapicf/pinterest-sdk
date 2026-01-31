# Catalog

Catalog entity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_at** | **string** |  | [default to undefined]
**id** | **string** | ID of the catalog entity. | [default to undefined]
**updated_at** | **string** |  | [default to undefined]
**name** | **string** | A human-friendly name associated to a catalog entity. | [default to undefined]
**catalog_type** | [**CatalogsType**](CatalogsType.md) |  | [default to undefined]

## Example

```typescript
import { Catalog } from './api';

const instance: Catalog = {
    created_at,
    id,
    updated_at,
    name,
    catalog_type,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
