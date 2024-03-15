# PinCreate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | Option<**String**> |  | [optional][readonly]
**created_at** | Option<**String**> |  | [optional][readonly]
**link** | Option<**String**> |  | [optional]
**title** | Option<**String**> |  | [optional]
**description** | Option<**String**> |  | [optional]
**dominant_color** | Option<**String**> | Dominant pin color. Hex number, e.g. \\\"#6E7874\\\". | [optional]
**alt_text** | Option<**String**> |  | [optional]
**board_id** | Option<**String**> | The board to which this Pin belongs. | [optional]
**board_section_id** | Option<**String**> | The board section to which this Pin belongs. | [optional]
**board_owner** | Option<[**models::BoardOwner**](Board_owner.md)> |  | [optional]
**media** | Option<[**models::SummaryPinMedia**](SummaryPin_media.md)> |  | [optional]
**media_source** | Option<[**models::PinMediaSource**](PinMediaSource.md)> |  | [optional]
**parent_pin_id** | Option<**String**> | The source pin id if this pin was saved from another pin. <a href=\"https://help.pinterest.com/article/save-pins-on-pinterest\">Learn more</a>. | [optional]
**note** | Option<**String**> | Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


