# CatalogsCreativeAssetsItemErrorResponse

Object describing a creative assets item error

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **string** |  | [default to undefined]
**creative_assets_id** | **string** | The catalog creative assets id in the merchant namespace | [optional] [default to undefined]
**errors** | [**Array&lt;ItemValidationEvent&gt;**](ItemValidationEvent.md) | Array with the errors for the item id requested | [default to undefined]
**item_response_kind** | **string** | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. | [default to undefined]

## Example

```typescript
import { CatalogsCreativeAssetsItemErrorResponse } from './api';

const instance: CatalogsCreativeAssetsItemErrorResponse = {
    catalog_type,
    creative_assets_id,
    errors,
    item_response_kind,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
