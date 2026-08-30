
# Table `Pin`
(mapped from: Pin)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** |  | 
**aiDisclosures** | ai_disclosures | long |  | [**AiDisclosures**](AiDisclosures.md) | AI disclosure declarations the creator has made about this Pin. |  [optional] [foreignkey]
**boardId** | board_id | text |  | **kotlin.String** | The board to which this Pin belongs. |  [optional]
**boardOwner** | board_owner | long |  | [**BoardOwner**](BoardOwner.md) |  |  [optional] [readonly] [foreignkey]
**boardSectionId** | board_section_id | text |  | **kotlin.String** | The board section to which this Pin belongs. |  [optional]
**createdAt** | created_at | datetime |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) |  |  [optional] [readonly]
**creativeType** | creative_type | long |  | [**CreativeType**](CreativeType.md) |  |  [optional] [readonly] [foreignkey]
**dominantColor** | dominant_color | text |  | **kotlin.String** | Dominant pin color. Hex number, e.g. &#x60;#6E7874&#x60;. |  [optional]
**hasBeenPromoted** | has_been_promoted | boolean |  | **kotlin.Boolean** | Whether the Pin has been promoted or not. |  [optional] [readonly]
**isOwner** | is_owner | boolean |  | **kotlin.Boolean** | Whether the \&quot;operation user_account\&quot; is the Pin owner. |  [optional] [readonly]
**isProduct** | is_product | boolean |  | **kotlin.Boolean** | Whether the Pin is a product Pin. |  [optional] [readonly]
**isStandard** | is_standard | boolean |  | **kotlin.Boolean** | Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information. |  [optional] [readonly]
**media** | media | long |  | [**PinMedia**](PinMedia.md) |  |  [optional] [readonly] [foreignkey]
**parentPinId** | parent_pin_id | text |  | **kotlin.String** | The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest). |  [optional]
**pinMetrics** | pin_metrics | blob |  | [**kotlin.Any**](.md) | Pin metrics with associated time intervals if any. |  [optional] [readonly]
**altText** | alt_text | text |  | **kotlin.String** |  |  [optional]
**description** | description | text |  | **kotlin.String** |  |  [optional]
**link** | link | text |  | **kotlin.String** |  |  [optional]
**title** | title | text |  | **kotlin.String** |  |  [optional]





















