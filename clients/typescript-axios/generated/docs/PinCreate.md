# PinCreate

Resource create operation model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ai_disclosures** | [**AiDisclosures**](AiDisclosures.md) | AI disclosure declarations the creator has made about this Pin. | [optional] [default to undefined]
**alt_text** | **string** |  | [optional] [default to undefined]
**board_id** | **string** | The board to which this Pin belongs. | [optional] [default to undefined]
**board_section_id** | **string** | The board section to which this Pin belongs. | [optional] [default to undefined]
**description** | **string** |  | [optional] [default to undefined]
**dominant_color** | **string** | Dominant pin color. Hex number, e.g. &#x60;#6E7874&#x60;. | [optional] [default to undefined]
**link** | **string** |  | [optional] [default to undefined]
**media_source** | [**PinMediaSource**](PinMediaSource.md) |  | [optional] [default to undefined]
**parent_pin_id** | **string** | The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest). | [optional] [default to undefined]
**sponsor_id** | **string** | The sponsor account id to request paid partnership from.  Currently the field is only available to a list of users in a closed beta. | [optional] [default to undefined]
**title** | **string** |  | [optional] [default to undefined]

## Example

```typescript
import { PinCreate } from './api';

const instance: PinCreate = {
    ai_disclosures,
    alt_text,
    board_id,
    board_section_id,
    description,
    dominant_color,
    link,
    media_source,
    parent_pin_id,
    sponsor_id,
    title,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
