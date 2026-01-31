

# BoardWithUpdatePrivacy

The class is defined in **[BoardWithUpdatePrivacy.java](../../src/main/java/org/openapitools/model/BoardWithUpdatePrivacy.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**boardPinsModifiedAt** | `OffsetDateTime` | Date and time of last board pins modified. |  [optional property] [readonly property]
**collaboratorCount** | `Integer` | Count of collaborators on the board. |  [optional property] [readonly property]
**createdAt** | `OffsetDateTime` | Date and time of board creation. |  [optional property] [readonly property]
**description** | `String` |  |  [optional property]
**followerCount** | `Integer` | Board follower count. |  [optional property] [readonly property]
**id** | `String` |  |  [readonly property]
**isAdsOnly** | `Boolean` | If set to &#x60;true&#x60;, the board will be ad-only and can store ad-only Pins. |  [optional property]
**media** | [`BoardMedia`](BoardMedia.md) | Board media. |  [optional property] [readonly property]
**name** | `String` |      Name of the board.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the board name automatically becomes \&quot;Ad-only Pins\&quot;. | 
**owner** | [`BoardOwner`](BoardOwner.md) |  |  [optional property] [readonly property]
**pinCount** | `Integer` | Count of Pins on the board. |  [optional property] [readonly property]
**privacy** | `BoardUpdatePrivacy` |  |  [optional property]














