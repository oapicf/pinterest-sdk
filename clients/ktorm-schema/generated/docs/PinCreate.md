
# Table `PinCreate`
(mapped from: PinCreate)

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
**boardId** | board_id | text |  | **kotlin.String** | The board to which this Pin belongs. |  [optional]
**boardSectionId** | board_section_id | text |  | **kotlin.String** | The board section to which this Pin belongs. |  [optional]
**boardOwner** | board_owner | long |  | [**BoardOwner**](BoardOwner.md) |  |  [optional] [readonly] [foreignkey]
**media** | media | long |  | [**PinMedia**](PinMedia.md) |  |  [optional] [readonly] [foreignkey]
**mediaSource** | media_source | long |  | [**PinMediaSource**](PinMediaSource.md) |  |  [optional] [foreignkey]
**parentPinId** | parent_pin_id | text |  | **kotlin.String** | The source pin id if this pin was saved from another pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/article/save-pins-on-pinterest\&quot;&gt;Learn more&lt;/a&gt;. |  [optional]
**note** | note | text |  | **kotlin.String** | Private note for this Pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/add-notes-to-your-pins\&quot;&gt;Learn more&lt;/a&gt;. |  [optional]
















