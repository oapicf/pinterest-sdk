

# Pin

The class is defined in **[Pin.java](../../src/main/java/org/openapitools/model/Pin.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aiDisclosures** | [`AiDisclosures`](AiDisclosures.md) | AI disclosure declarations the creator has made about this Pin. |  [optional property]
**boardId** | `String` | The board to which this Pin belongs. |  [optional property]
**boardOwner** | [`BoardOwner`](BoardOwner.md) |  |  [optional property] [readonly property]
**boardSectionId** | `String` | The board section to which this Pin belongs. |  [optional property]
**createdAt** | `OffsetDateTime` |  |  [optional property] [readonly property]
**creativeType** | `CreativeType` |  |  [optional property] [readonly property]
**dominantColor** | `String` | Dominant pin color. Hex number, e.g. &#x60;#6E7874&#x60;. |  [optional property]
**hasBeenPromoted** | `Boolean` | Whether the Pin has been promoted or not. |  [optional property] [readonly property]
**id** | `String` |  | 
**isOwner** | `Boolean` | Whether the \&quot;operation user_account\&quot; is the Pin owner. |  [optional property] [readonly property]
**isProduct** | `Boolean` | Whether the Pin is a product Pin. |  [optional property] [readonly property]
**isStandard** | `Boolean` | Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information. |  [optional property] [readonly property]
**media** | [`PinMedia`](PinMedia.md) |  |  [optional property] [readonly property]
**parentPinId** | `String` | The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest). |  [optional property]
**pinMetrics** | `Object` | Pin metrics with associated time intervals if any. |  [optional property] [readonly property]
**altText** | `String` |  |  [optional property]
**description** | `String` |  |  [optional property]
**link** | `String` |  |  [optional property]
**title** | `String` |  |  [optional property]





















