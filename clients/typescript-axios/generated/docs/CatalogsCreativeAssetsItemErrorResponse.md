# CatalogsCreativeAssetsItemErrorResponse

Object describing a creative assets item error

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | [**CatalogsType**](CatalogsType.md) |  | [default to undefined]
**creative_assets_id** | **string** | The catalog creative assets id in the merchant namespace | [optional] [default to undefined]
**errors** | [**Array&lt;ItemValidationEvent&gt;**](ItemValidationEvent.md) | Array with the errors for the item id requested | [optional] [default to undefined]

## Example

```typescript
import { CatalogsCreativeAssetsItemErrorResponse } from './api';

const instance: CatalogsCreativeAssetsItemErrorResponse = {
    catalog_type,
    creative_assets_id,
    errors,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
