# PinUpdate

Pin fields for updates

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alt_text** | **string** | Pin\&#39;s alternative text. | [optional] [default to undefined]
**board_id** | **string** | The id of the board to move the Pin onto. | [optional] [default to undefined]
**board_section_id** | **string** | &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/create-a-board-section\&quot;&gt;Board section&lt;/a&gt; ID. | [optional] [default to undefined]
**description** | **string** | Pin description - 800 characters maximum. | [optional] [default to undefined]
**link** | **string** | URL viewer is taken to when they click pin. | [optional] [default to undefined]
**title** | **string** | The native pin title that creators explicitly prefer to display. | [optional] [default to undefined]
**carousel_slots** | [**Array&lt;PinUpdateCarouselSlotsInner&gt;**](PinUpdateCarouselSlotsInner.md) | Carousel Pin slots data. | [optional] [default to undefined]
**note** | **string** | Private note for this Pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/add-notes-to-your-pins\&quot;&gt;Learn more&lt;/a&gt;. | [optional] [default to undefined]

## Example

```typescript
import { PinUpdate } from './api';

const instance: PinUpdate = {
    alt_text,
    board_id,
    board_section_id,
    description,
    link,
    title,
    carousel_slots,
    note,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
