
# Table `PinMediaSourceVideoID`
(mapped from: PinMediaSourceVideoID)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**sourceType** | source_type | text NOT NULL |  | [**source_type**](#SourceType) |  | 
**mediaId** | media_id | text NOT NULL |  | **kotlin.String** |  | 
**coverImageUrl** | cover_image_url | text |  | **kotlin.String** | Cover image url. |  [optional]
**coverImageContentType** | cover_image_content_type | text |  | [**cover_image_content_type**](#CoverImageContentType) | Content type for cover image Base64. |  [optional]
**coverImageData** | cover_image_data | text |  | **kotlin.String** | Cover image Base64. |  [optional]
**isStandard** | is_standard | boolean |  | **kotlin.Boolean** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. |  [optional]








