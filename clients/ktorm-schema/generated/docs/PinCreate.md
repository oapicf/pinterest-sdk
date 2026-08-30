
# Table `PinCreate`
(mapped from: PinCreate)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**aiDisclosures** | ai_disclosures | long |  | [**AiDisclosures**](AiDisclosures.md) | AI disclosure declarations the creator has made about this Pin. |  [optional] [foreignkey]
**altText** | alt_text | text |  | **kotlin.String** |  |  [optional]
**boardId** | board_id | text |  | **kotlin.String** | The board to which this Pin belongs. |  [optional]
**boardSectionId** | board_section_id | text |  | **kotlin.String** | The board section to which this Pin belongs. |  [optional]
**description** | description | text |  | **kotlin.String** |  |  [optional]
**dominantColor** | dominant_color | text |  | **kotlin.String** | Dominant pin color. Hex number, e.g. &#x60;#6E7874&#x60;. |  [optional]
**link** | link | text |  | **kotlin.String** |  |  [optional]
**mediaSource** | media_source | long |  | [**PinMediaSource**](PinMediaSource.md) |  |  [optional] [foreignkey]
**parentPinId** | parent_pin_id | text |  | **kotlin.String** | The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest). |  [optional]
**sponsorId** | sponsor_id | text |  | **kotlin.String** | The sponsor account id to request paid partnership from.  Currently the field is only available to a list of users in a closed beta. |  [optional]
**title** | title | text |  | **kotlin.String** |  |  [optional]













