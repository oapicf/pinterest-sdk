

# AggregatedPinComment


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aiDisclosures** | [**AiDisclosures**](AiDisclosures.md) | AI disclosure declarations the creator has made about this Pin. |  [optional]
**altText** | **String** |  |  [optional]
**boardId** | **String** | The board to which this Pin belongs. |  [optional]
**boardOwner** | [**BoardOwner**](BoardOwner.md) |  |  [optional] [readonly]
**boardSectionId** | **String** | The board section to which this Pin belongs. |  [optional]
**createdAt** | **OffsetDateTime** |  |  [optional] [readonly]
**creativeType** | **CreativeType** |  |  [optional] [readonly]
**description** | **String** |  |  [optional]
**dominantColor** | **String** | Dominant pin color. Hex number, e.g. &#x60;#6E7874&#x60;. |  [optional]
**hasBeenPromoted** | **Boolean** | Whether the Pin has been promoted or not. |  [optional] [readonly]
**id** | **String** |  | 
**isOwner** | **Boolean** | Whether the \&quot;operation user_account\&quot; is the Pin owner. |  [optional] [readonly]
**isProduct** | **Boolean** | Whether the Pin is a product Pin. |  [optional] [readonly]
**isStandard** | **Boolean** | Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information. |  [optional] [readonly]
**link** | **String** |  |  [optional]
**media** | [**PinMedia**](PinMedia.md) |  |  [optional] [readonly]
**parentPinId** | **String** | The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest). |  [optional]
**pinMetrics** | **Any** | Pin metrics with associated time intervals if any. |  [optional] [readonly]
**title** | **String** |  |  [optional]



