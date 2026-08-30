
# Table `VideoMetadataWithItemType`
(mapped from: VideoMetadataWithItemType)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**itemType** | item_type | text NOT NULL |  | [**item_type**](#ItemType) | Discriminator literal identifying this as video metadata inside a &#x60;PinMediaMetadata&#x60; payload. | 
**coverImageUrl** | cover_image_url | text |  | **kotlin.String** |  |  [optional]
**duration** | duration | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Duration (in miliseconds). Field maybe null after creation due to video processing time. |  [optional]
**height** | height | int |  | **kotlin.Int** | Height (in pixels). Field maybe null after creation due to video processing time. |  [optional]
**videoUrl** | video_url | text |  | **kotlin.String** | Video url (720p).  **Note:** This field is limited and not available to all apps. |  [optional]
**videoUrlHls** | video_url_hls | text |  | **kotlin.String** | Video url (HLS).  **Note:** This field is limited and not available to all apps. |  [optional]
**width** | width | int |  | **kotlin.Int** | Width (in pixels). Field maybe null after creation due to video processing time. |  [optional]









