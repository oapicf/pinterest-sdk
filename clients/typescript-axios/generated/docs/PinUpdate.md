# PinUpdate

Resource create or update operation model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alt_text** | **string** |  | [optional] [default to undefined]
**board_id** | **string** | The board to which this Pin belongs. | [optional] [default to undefined]
**board_section_id** | **string** | The board section to which this Pin belongs. | [optional] [default to undefined]
**carousel_slots** | [**Array&lt;CarouselSlot&gt;**](CarouselSlot.md) | Carousel Pin slots data. | [optional] [default to undefined]
**description** | **string** |  | [optional] [default to undefined]
**link** | **string** |  | [optional] [default to undefined]
**title** | **string** |  | [optional] [default to undefined]

## Example

```typescript
import { PinUpdate } from './api';

const instance: PinUpdate = {
    alt_text,
    board_id,
    board_section_id,
    carousel_slots,
    description,
    link,
    title,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
