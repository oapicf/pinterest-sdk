# Pin

Pin

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** |  | [optional] [readonly] [default to undefined]
**created_at** | **string** |  | [optional] [readonly] [default to undefined]
**link** | **string** |  | [optional] [default to undefined]
**title** | **string** |  | [optional] [default to undefined]
**description** | **string** |  | [optional] [default to undefined]
**dominant_color** | **string** | Dominant pin color. Hex number, e.g. \\\&quot;#6E7874\\\&quot;. | [optional] [default to undefined]
**alt_text** | **string** |  | [optional] [default to undefined]
**creative_type** | [**CreativeType**](CreativeType.md) |  | [optional] [readonly] [default to undefined]
**board_id** | **string** | The board to which this Pin belongs. | [optional] [default to undefined]
**board_section_id** | **string** | The board section to which this Pin belongs. | [optional] [default to undefined]
**board_owner** | [**BoardOwner**](BoardOwner.md) |  | [optional] [readonly] [default to undefined]
**is_owner** | **boolean** | Whether the \&quot;operation user_account\&quot; is the Pin owner. | [optional] [readonly] [default to undefined]
**media** | [**PinMedia**](PinMedia.md) |  | [optional] [readonly] [default to undefined]
**media_source** | [**PinMediaSource**](PinMediaSource.md) |  | [optional] [default to undefined]
**parent_pin_id** | **string** | The source pin id if this pin was saved from another pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/article/save-pins-on-pinterest\&quot;&gt;Learn more&lt;/a&gt;. | [optional] [default to undefined]
**is_standard** | **boolean** | Whether the Pin is standard or not. See documentation on &lt;a href&#x3D;\&quot;/docs/api-features/content-overview/\&quot;&gt;Changes to Pin creation&lt;/a&gt; for more information. | [optional] [default to undefined]
**has_been_promoted** | **boolean** | Whether the Pin has been promoted or not. | [optional] [readonly] [default to undefined]
**note** | **string** | Private note for this Pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/add-notes-to-your-pins\&quot;&gt;Learn more&lt;/a&gt;. | [optional] [default to undefined]
**pin_metrics** | **object** | Pin metrics with associated time intervals if any. | [optional] [default to undefined]

## Example

```typescript
import { Pin } from './api';

const instance: Pin = {
    id,
    created_at,
    link,
    title,
    description,
    dominant_color,
    alt_text,
    creative_type,
    board_id,
    board_section_id,
    board_owner,
    is_owner,
    media,
    media_source,
    parent_pin_id,
    is_standard,
    has_been_promoted,
    note,
    pin_metrics,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
