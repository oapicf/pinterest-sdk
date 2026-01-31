
# Table `PinMediaSource`
(mapped from: PinMediaSource)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**contentType** | content_type | long NOT NULL |  | [**ContentType**](ContentType.md) |  |  [foreignkey]
**data** | data | text NOT NULL |  | **kotlin.String** |  | 
**sourceType** | source_type | text NOT NULL |  | [**source_type**](#SourceType) |  | 
**url** | url | text NOT NULL |  | **kotlin.String** |  | 
**mediaId** | media_id | text NOT NULL |  | **kotlin.String** |  | 
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PinMediaSourceImagesURLItem&gt;**](PinMediaSourceImagesURLItem.md) | Array with image objects. | 
**isStandard** | is_standard | boolean |  | **kotlin.Boolean** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. |  [optional]
**coverImageContentType** | cover_image_content_type | long |  | [**ContentType**](ContentType.md) | Content type for cover image Base64. |  [optional] [foreignkey]
**coverImageData** | cover_image_data | text |  | **kotlin.String** | Cover image Base64. |  [optional]
**coverImageKeyFrameTime** | cover_image_key_frame_time | int UNSIGNED |  | **kotlin.Int** | Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used. |  [optional]
**coverImageUrl** | cover_image_url | text |  | **kotlin.String** | Cover image URL. |  [optional]
**index** | index | int UNSIGNED |  | **kotlin.Int** |  |  [optional]
**isAffiliateLink** | is_affiliate_link | boolean |  | **kotlin.Boolean** | This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products. |  [optional]







# **Table `PinMediaSourcePinMediaSourceImagesURLItem`**
(mapped from: PinMediaSourcePinMediaSourceImagesURLItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pinMediaSource | pinMediaSource | long | | kotlin.Long | Primary Key | *one*
pinMediaSourceImagesURLItem | pinMediaSourceImagesURLItem | long | | kotlin.Long | Foreign Key | *many*










