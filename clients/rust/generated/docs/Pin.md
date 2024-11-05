# Pin

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
**creative_type** | Option<[**models::CreativeType**](CreativeType.md)> |  | [optional][readonly]
**board_id** | Option<**String**> | The board to which this Pin belongs. | [optional]
**board_section_id** | Option<**String**> | The board section to which this Pin belongs. | [optional]
**board_owner** | Option<[**models::BoardOwner**](BoardOwner.md)> |  | [optional][readonly]
**is_owner** | Option<**bool**> | Whether the \"operation user_account\" is the Pin owner. | [optional][readonly]
**media** | Option<[**models::PinMedia**](PinMedia.md)> |  | [optional][readonly]
**media_source** | Option<[**models::PinMediaSource**](PinMediaSource.md)> |  | [optional]
**parent_pin_id** | Option<**String**> | The source pin id if this pin was saved from another pin. <a href=\"https://help.pinterest.com/article/save-pins-on-pinterest\">Learn more</a>. | [optional]
**is_standard** | Option<**bool**> | Whether the Pin is standard or not. See documentation on <a href=\"/docs/api-features/content-overview/\">Changes to Pin creation</a> for more information. | [optional]
**has_been_promoted** | Option<**bool**> | Whether the Pin has been promoted or not. | [optional][readonly]
**note** | Option<**String**> | Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>. | [optional]
**pin_metrics** | Option<[**serde_json::Value**](.md)> | Pin metrics with associated time intervals if any. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


