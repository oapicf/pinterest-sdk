
# Table `PinMediaWithVideo`
(mapped from: PinMediaWithVideo)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**mediaType** | media_type | text NOT NULL |  | [**media_type**](#MediaType) |  | 
**coverImageUrl** | cover_image_url | text |  | **kotlin.String** |  |  [optional]
**duration** | duration | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Duration (in miliseconds). Field maybe null after creation due to video processing time. |  [optional]
**height** | height | int |  | **kotlin.Int** | Height (in pixels). Field maybe null after creation due to video processing time. |  [optional]
**images** | images | long |  | [**ImageSize**](ImageSize.md) |  |  [optional] [foreignkey]
**videoUrl** | video_url | text |  | **kotlin.String** | Video url (720p).  **Note:** This field is limited and not available to all apps. |  [optional]
**width** | width | int |  | **kotlin.Int** | Width (in pixels). Field maybe null after creation due to video processing time. |  [optional]









