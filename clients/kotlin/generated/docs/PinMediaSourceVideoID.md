
# PinMediaSourceVideoID

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sourceType** | [**inline**](#SourceType) |  | 
**mediaId** | **kotlin.String** |  | 
**coverImageUrl** | **kotlin.String** | Cover image url. |  [optional]
**coverImageContentType** | [**inline**](#CoverImageContentType) | Content type for cover image Base64. |  [optional]
**coverImageData** | **kotlin.String** | Cover image Base64. |  [optional]
**isStandard** | **kotlin.Boolean** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. |  [optional]


<a id="SourceType"></a>
## Enum: source_type
Name | Value
---- | -----
sourceType | video_id


<a id="CoverImageContentType"></a>
## Enum: cover_image_content_type
Name | Value
---- | -----
coverImageContentType | image/jpeg, image/png



