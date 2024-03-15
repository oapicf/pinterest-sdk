

# PinMediaSourceVideoID

Video ID-based media source

The class is defined in **[PinMediaSourceVideoID.java](../../src/main/java/org/openapitools/model/PinMediaSourceVideoID.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sourceType** | [**SourceTypeEnum**](#SourceTypeEnum) |  | 
**coverImageUrl** | `String` | Cover image url. |  [optional property]
**coverImageContentType** | [**CoverImageContentTypeEnum**](#CoverImageContentTypeEnum) | Content type for cover image Base64. |  [optional property]
**coverImageData** | `String` | Cover image Base64. |  [optional property]
**mediaId** | `String` |  | 
**isStandard** | `Boolean` | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. |  [optional property]

## SourceTypeEnum

Name | Value
---- | -----
VIDEO_ID | `"video_id"`


## CoverImageContentTypeEnum

Name | Value
---- | -----
JPEG | `"image/jpeg"`
PNG | `"image/png"`





