# PIN

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**STRING_32**](STRING_32.md) |  | [optional] [readonly] [default to null]
**created_at** | [**DATE_TIME**](DATE_TIME.md) |  | [optional] [readonly] [default to null]
**link** | [**STRING_32**](STRING_32.md) |  | [optional] [default to null]
**title** | [**STRING_32**](STRING_32.md) |  | [optional] [default to null]
**description** | [**STRING_32**](STRING_32.md) |  | [optional] [default to null]
**dominant_color** | [**STRING_32**](STRING_32.md) | Dominant pin color. Hex number, e.g. \\\&quot;#6E7874\\\&quot;. | [optional] [default to null]
**alt_text** | [**STRING_32**](STRING_32.md) |  | [optional] [default to null]
**creative_type** | [**CREATIVE_TYPE**](CreativeType.md) |  | [optional] [readonly] [default to null]
**board_id** | [**STRING_32**](STRING_32.md) | The board to which this Pin belongs. | [optional] [default to null]
**board_section_id** | [**STRING_32**](STRING_32.md) | The board section to which this Pin belongs. | [optional] [default to null]
**board_owner** | [**BOARD_OWNER**](BoardOwner.md) |  | [optional] [readonly] [default to null]
**is_owner** | **BOOLEAN** | Whether the \&quot;operation user_account\&quot; is the Pin owner. | [optional] [readonly] [default to null]
**media** | [**PIN_MEDIA**](PinMedia.md) |  | [optional] [readonly] [default to null]
**media_source** | [**PIN_MEDIA_SOURCE**](PinMediaSource.md) |  | [optional] [default to null]
**parent_pin_id** | [**STRING_32**](STRING_32.md) | The source pin id if this pin was saved from another pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/article/save-pins-on-pinterest\&quot;&gt;Learn more&lt;/a&gt;. | [optional] [default to null]
**is_standard** | **BOOLEAN** | Whether the Pin is standard or not. See documentation on &lt;a href&#x3D;\&quot;/docs/api-features/content-overview/\&quot;&gt;Changes to Pin creation&lt;/a&gt; for more information. | [optional] [default to null]
**has_been_promoted** | **BOOLEAN** | Whether the Pin has been promoted or not. | [optional] [readonly] [default to null]
**var_note** | [**STRING_32**](STRING_32.md) | Private note for this Pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/add-notes-to-your-pins\&quot;&gt;Learn more&lt;/a&gt;. | [optional] [default to null]
**pin_metrics** | [**ANY**](.md) | Pin metrics with associated time intervals if any. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


