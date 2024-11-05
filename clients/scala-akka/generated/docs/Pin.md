

# Pin

Pin

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional] [readonly]
**createdAt** | **OffsetDateTime** |  |  [optional] [readonly]
**link** | **String** |  |  [optional]
**title** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**dominantColor** | **String** | Dominant pin color. Hex number, e.g. \\\&quot;#6E7874\\\&quot;. |  [optional]
**altText** | **String** |  |  [optional]
**creativeType** | **CreativeType** |  |  [optional] [readonly]
**boardId** | **String** | The board to which this Pin belongs. |  [optional]
**boardSectionId** | **String** | The board section to which this Pin belongs. |  [optional]
**boardOwner** | [**BoardOwner**](BoardOwner.md) |  |  [optional] [readonly]
**isOwner** | **Boolean** | Whether the \&quot;operation user_account\&quot; is the Pin owner. |  [optional] [readonly]
**media** | [**PinMedia**](PinMedia.md) |  |  [optional] [readonly]
**mediaSource** | [**PinMediaSource**](PinMediaSource.md) |  |  [optional]
**parentPinId** | **String** | The source pin id if this pin was saved from another pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/article/save-pins-on-pinterest\&quot;&gt;Learn more&lt;/a&gt;. |  [optional]
**isStandard** | **Boolean** | Whether the Pin is standard or not. See documentation on &lt;a href&#x3D;\&quot;/docs/api-features/content-overview/\&quot;&gt;Changes to Pin creation&lt;/a&gt; for more information. |  [optional]
**hasBeenPromoted** | **Boolean** | Whether the Pin has been promoted or not. |  [optional] [readonly]
**note** | **String** | Private note for this Pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/add-notes-to-your-pins\&quot;&gt;Learn more&lt;/a&gt;. |  [optional]
**pinMetrics** | **Any** | Pin metrics with associated time intervals if any. |  [optional]



