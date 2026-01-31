# Pin

Pin model containing properties related to a Pinterest Pin.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alt_text** | **string** |  | [optional] [default to undefined]
**board_id** | **string** | The board to which this Pin belongs. | [optional] [default to undefined]
**board_owner** | [**BoardOwner**](BoardOwner.md) |  | [optional] [readonly] [default to undefined]
**board_section_id** | **string** | The board section to which this Pin belongs. | [optional] [default to undefined]
**created_at** | **string** |  | [optional] [readonly] [default to undefined]
**creative_type** | [**CreativeType**](CreativeType.md) |  | [optional] [readonly] [default to undefined]
**description** | **string** |  | [optional] [default to undefined]
**dominant_color** | **string** | Dominant pin color. Hex number, e.g. &#x60;#6E7874&#x60;. | [optional] [default to undefined]
**has_been_promoted** | **boolean** | Whether the Pin has been promoted or not. | [optional] [readonly] [default to undefined]
**id** | **string** |  | [default to undefined]
**is_owner** | **boolean** | Whether the \&quot;operation user_account\&quot; is the Pin owner. | [optional] [readonly] [default to undefined]
**is_standard** | **boolean** | Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information. | [optional] [readonly] [default to undefined]
**link** | **string** |  | [optional] [default to undefined]
**media** | [**PinMedia**](PinMedia.md) |  | [optional] [readonly] [default to undefined]
**parent_pin_id** | **string** | The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest). | [optional] [default to undefined]
**pin_metrics** | **object** | Pin metrics with associated time intervals if any. | [optional] [readonly] [default to undefined]
**title** | **string** |  | [optional] [default to undefined]

## Example

```typescript
import { Pin } from './api';

const instance: Pin = {
    alt_text,
    board_id,
    board_owner,
    board_section_id,
    created_at,
    creative_type,
    description,
    dominant_color,
    has_been_promoted,
    id,
    is_owner,
    is_standard,
    link,
    media,
    parent_pin_id,
    pin_metrics,
    title,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
