# CatalogsRetailItemResponse

Object describing a retail item record

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**ItemAttributes**](ItemAttributes.md) |  | [optional] [default to undefined]
**catalog_type** | **string** |  | [default to undefined]
**item_id** | **string** | The catalog retail item id in the merchant namespace | [optional] [default to undefined]
**item_response_kind** | **string** | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. | [default to undefined]
**pins** | [**Array&lt;Pin&gt;**](Pin.md) | The pins mapped to the item | [optional] [default to undefined]

## Example

```typescript
import { CatalogsRetailItemResponse } from './api';

const instance: CatalogsRetailItemResponse = {
    attributes,
    catalog_type,
    item_id,
    item_response_kind,
    pins,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
