# Pin

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  | [optional] [readonly] [default to None]
**created_at** | [**chrono::DateTime::<chrono::Utc>**](DateTime.md) |  | [optional] [readonly] [default to None]
**link** | **String** |  | [optional] [default to None]
**title** | **String** |  | [optional] [default to None]
**description** | **String** |  | [optional] [default to None]
**dominant_color** | **String** | Dominant pin color. Hex number, e.g. \\\"#6E7874\\\". | [optional] [default to None]
**alt_text** | **String** |  | [optional] [default to None]
**creative_type** | [***models::CreativeType**](CreativeType.md) |  | [optional] [readonly] [default to None]
**board_id** | **String** | The board to which this Pin belongs. | [optional] [default to None]
**board_section_id** | **String** | The board section to which this Pin belongs. | [optional] [default to None]
**board_owner** | [***models::BoardOwner**](Board_owner.md) |  | [optional] [default to None]
**is_owner** | **bool** | Whether the \"operation user_account\" is the Pin owner. | [optional] [readonly] [default to None]
**media** | [***models::SummaryPinMedia**](SummaryPin_media.md) |  | [optional] [default to None]
**media_source** | [***models::PinMediaSource**](PinMediaSource.md) |  | [optional] [default to None]
**parent_pin_id** | **String** | The source pin id if this pin was saved from another pin. <a href=\"https://help.pinterest.com/article/save-pins-on-pinterest\">Learn more</a>. | [optional] [default to None]
**is_standard** | **bool** | Whether the Pin is standard or not. See documentation on <a href=\"https://developers.pinterest.com/docs/content/update/\">Changes to Pin creation</a> for more information. | [optional] [default to None]
**has_been_promoted** | **bool** | Whether the Pin has been promoted or not. | [optional] [readonly] [default to None]
**note** | **String** | Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>. | [optional] [default to None]
**pin_metrics** | [***serde_json::Value**](.md) | Pin metrics with associated time intervals if any. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


