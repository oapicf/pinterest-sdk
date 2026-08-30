
# Pin

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** |  |  |
| **aiDisclosures** | [**AiDisclosures**](AiDisclosures.md) | AI disclosure declarations the creator has made about this Pin. |  [optional] |
| **boardId** | **kotlin.String** | The board to which this Pin belongs. |  [optional] |
| **boardOwner** | [**BoardOwner**](BoardOwner.md) |  |  [optional] [readonly] |
| **boardSectionId** | **kotlin.String** | The board section to which this Pin belongs. |  [optional] |
| **createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] [readonly] |
| **creativeType** | [**CreativeType**](CreativeType.md) |  |  [optional] [readonly] |
| **dominantColor** | **kotlin.String** | Dominant pin color. Hex number, e.g. &#x60;#6E7874&#x60;. |  [optional] |
| **hasBeenPromoted** | **kotlin.Boolean** | Whether the Pin has been promoted or not. |  [optional] [readonly] |
| **isOwner** | **kotlin.Boolean** | Whether the \&quot;operation user_account\&quot; is the Pin owner. |  [optional] [readonly] |
| **isProduct** | **kotlin.Boolean** | Whether the Pin is a product Pin. |  [optional] [readonly] |
| **isStandard** | **kotlin.Boolean** | Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information. |  [optional] [readonly] |
| **media** | [**PinMedia**](PinMedia.md) |  |  [optional] [readonly] |
| **parentPinId** | **kotlin.String** | The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest). |  [optional] |
| **pinMetrics** | [**kotlin.Any**](.md) | Pin metrics with associated time intervals if any. |  [optional] [readonly] |
| **altText** | **kotlin.String** |  |  [optional] |
| **description** | **kotlin.String** |  |  [optional] |
| **link** | **kotlin.String** |  |  [optional] |
| **title** | **kotlin.String** |  |  [optional] |



