# CatalogsRetailItemResponse

Object describing a retail item record

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | [**CatalogsType**](CatalogsType.md) |  | [default to undefined]
**item_id** | **string** | The catalog retail item id in the merchant namespace | [optional] [default to undefined]
**pins** | [**Array&lt;Pin&gt;**](Pin.md) | The pins mapped to the item | [optional] [default to undefined]
**attributes** | [**ItemAttributes**](ItemAttributes.md) |  | [optional] [default to undefined]

## Example

```typescript
import { CatalogsRetailItemResponse } from './api';

const instance: CatalogsRetailItemResponse = {
    catalog_type,
    item_id,
    pins,
    attributes,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
