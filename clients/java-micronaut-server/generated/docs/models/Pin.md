

# Pin

Pin

The class is defined in **[Pin.java](../../src/main/java/org/openapitools/model/Pin.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | `String` |  |  [optional property] [readonly property]
**createdAt** | `OffsetDateTime` |  |  [optional property] [readonly property]
**link** | `String` |  |  [optional property]
**title** | `String` |  |  [optional property]
**description** | `String` |  |  [optional property]
**dominantColor** | `String` | Dominant pin color. Hex number, e.g. \\\&quot;#6E7874\\\&quot;. |  [optional property]
**altText** | `String` |  |  [optional property]
**creativeType** | `CreativeType` |  |  [optional property] [readonly property]
**boardId** | `String` | The board to which this Pin belongs. |  [optional property]
**boardSectionId** | `String` | The board section to which this Pin belongs. |  [optional property]
**boardOwner** | [`BoardOwner`](BoardOwner.md) |  |  [optional property] [readonly property]
**isOwner** | `Boolean` | Whether the \&quot;operation user_account\&quot; is the Pin owner. |  [optional property] [readonly property]
**media** | [`PinMedia`](PinMedia.md) |  |  [optional property] [readonly property]
**mediaSource** | [`PinMediaSource`](PinMediaSource.md) |  |  [optional property]
**parentPinId** | `String` | The source pin id if this pin was saved from another pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/article/save-pins-on-pinterest\&quot;&gt;Learn more&lt;/a&gt;. |  [optional property]
**isStandard** | `Boolean` | Whether the Pin is standard or not. See documentation on &lt;a href&#x3D;\&quot;/docs/api-features/content-overview/\&quot;&gt;Changes to Pin creation&lt;/a&gt; for more information. |  [optional property]
**hasBeenPromoted** | `Boolean` | Whether the Pin has been promoted or not. |  [optional property] [readonly property]
**note** | `String` | Private note for this Pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/add-notes-to-your-pins\&quot;&gt;Learn more&lt;/a&gt;. |  [optional property]
**pinMetrics** | `Object` | Pin metrics with associated time intervals if any. |  [optional property]





















