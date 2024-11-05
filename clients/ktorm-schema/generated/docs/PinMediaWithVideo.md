
# Table `PinMediaWithVideo`
(mapped from: PinMediaWithVideo)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**mediaType** | media_type | text |  | **kotlin.String** |  |  [optional]
**images** | images | long |  | [**PinMediaWithImageAllOfImages**](PinMediaWithImageAllOfImages.md) |  |  [optional] [foreignkey]
**coverImageUrl** | cover_image_url | text |  | **kotlin.String** |  |  [optional]
**videoUrl** | video_url | text |  | **kotlin.String** | Video url (720p). &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; This field is limited and not available to all apps. |  [optional]
**duration** | duration | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Duration (in milliseconds) |  [optional]
**height** | height | int |  | **kotlin.Int** | Height (in pixels) |  [optional]
**width** | width | int |  | **kotlin.Int** | Width (in pixels) |  [optional]









