
# Table `Pin`
(mapped from: Pin)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text PRIMARY KEY |  | **kotlin.String** |  |  [optional] [readonly]
**createdAt** | created_at | datetime |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) |  |  [optional] [readonly]
**link** | link | text |  | **kotlin.String** |  |  [optional]
**title** | title | text |  | **kotlin.String** |  |  [optional]
**description** | description | text |  | **kotlin.String** |  |  [optional]
**dominantColor** | dominant_color | text |  | **kotlin.String** | Dominant pin color. Hex number, e.g. \\\&quot;#6E7874\\\&quot;. |  [optional]
**altText** | alt_text | text |  | **kotlin.String** |  |  [optional]
**creativeType** | creative_type | long |  | [**CreativeType**](CreativeType.md) |  |  [optional] [readonly] [foreignkey]
**boardId** | board_id | text |  | **kotlin.String** | The board to which this Pin belongs. |  [optional]
**boardSectionId** | board_section_id | text |  | **kotlin.String** | The board section to which this Pin belongs. |  [optional]
**boardOwner** | board_owner | long |  | [**BoardOwner**](BoardOwner.md) |  |  [optional] [foreignkey]
**isOwner** | is_owner | boolean |  | **kotlin.Boolean** | Whether the \&quot;operation user_account\&quot; is the Pin owner. |  [optional] [readonly]
**media** | media | long |  | [**SummaryPinMedia**](SummaryPinMedia.md) |  |  [optional] [foreignkey]
**mediaSource** | media_source | long |  | [**PinMediaSource**](PinMediaSource.md) |  |  [optional] [foreignkey]
**parentPinId** | parent_pin_id | text |  | **kotlin.String** | The source pin id if this pin was saved from another pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/article/save-pins-on-pinterest\&quot;&gt;Learn more&lt;/a&gt;. |  [optional]
**isStandard** | is_standard | boolean |  | **kotlin.Boolean** | Whether the Pin is standard or not. See documentation on &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/content/update/\&quot;&gt;Changes to Pin creation&lt;/a&gt; for more information. |  [optional]
**hasBeenPromoted** | has_been_promoted | boolean |  | **kotlin.Boolean** | Whether the Pin has been promoted or not. |  [optional] [readonly]
**note** | note | text |  | **kotlin.String** | Private note for this Pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/add-notes-to-your-pins\&quot;&gt;Learn more&lt;/a&gt;. |  [optional]
**pinMetrics** | pin_metrics | blob |  | [**kotlin.Any**](.md) | Pin metrics with associated time intervals if any. |  [optional]





















