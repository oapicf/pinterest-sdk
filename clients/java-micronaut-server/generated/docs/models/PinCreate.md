

# PinCreate

Pin

The class is defined in **[PinCreate.java](../../src/main/java/org/openapitools/model/PinCreate.java)**

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
**boardId** | `String` | The board to which this Pin belongs. |  [optional property]
**boardSectionId** | `String` | The board section to which this Pin belongs. |  [optional property]
**boardOwner** | [`BoardOwner`](BoardOwner.md) |  |  [optional property]
**media** | [`SummaryPinMedia`](SummaryPinMedia.md) |  |  [optional property]
**mediaSource** | [`PinMediaSource`](PinMediaSource.md) |  |  [optional property]
**parentPinId** | `String` | The source pin id if this pin was saved from another pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/article/save-pins-on-pinterest\&quot;&gt;Learn more&lt;/a&gt;. |  [optional property]
**note** | `String` | Private note for this Pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/add-notes-to-your-pins\&quot;&gt;Learn more&lt;/a&gt;. |  [optional property]
















