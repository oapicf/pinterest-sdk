

# PinMediaWithVideo

Pin with video.

The class is defined in **[PinMediaWithVideo.java](../../src/main/java/org/openapitools/model/PinMediaWithVideo.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**coverImageUrl** | `String` |  |  [optional property]
**duration** | `BigDecimal` | Duration (in miliseconds). Field maybe null after creation due to video processing time. |  [optional property]
**height** | `Integer` | Height (in pixels). Field maybe null after creation due to video processing time. |  [optional property]
**images** | [`ImageSize`](ImageSize.md) |  |  [optional property]
**mediaType** | [**MediaTypeEnum**](#MediaTypeEnum) |  | 
**videoUrl** | `String` | Video url (720p).  **Note:** This field is limited and not available to all apps. |  [optional property]
**videoUrlHls** | `String` | Video url (HLS).  **Note:** This field is limited and not available to all apps. |  [optional property]
**width** | `Integer` | Width (in pixels). Field maybe null after creation due to video processing time. |  [optional property]





## MediaTypeEnum

Name | Value
---- | -----
VIDEO | `"video"`





