

# PinMediaMetadata

Per-item entry inside `PinMedia.items` for mixed image/video pins. Discriminated by `item_type`.

The class is defined in **[PinMediaMetadata.java](../../src/main/java/org/openapitools/model/PinMediaMetadata.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | `String` |  |  [optional property]
**images** | [`ImageSize`](ImageSize.md) |  |  [optional property]
**itemType** | [**ItemTypeEnum**](#ItemTypeEnum) | Discriminator literal identifying this as video metadata inside a &#x60;PinMediaMetadata&#x60; payload. | 
**link** | `String` |  |  [optional property]
**title** | `String` |  |  [optional property]
**coverImageUrl** | `String` |  |  [optional property]
**duration** | `BigDecimal` | Duration (in miliseconds). Field maybe null after creation due to video processing time. |  [optional property]
**height** | `Integer` | Height (in pixels). Field maybe null after creation due to video processing time. |  [optional property]
**videoUrl** | `String` | Video url (720p).  **Note:** This field is limited and not available to all apps. |  [optional property]
**videoUrlHls** | `String` | Video url (HLS).  **Note:** This field is limited and not available to all apps. |  [optional property]
**width** | `Integer` | Width (in pixels). Field maybe null after creation due to video processing time. |  [optional property]



## ItemTypeEnum

Name | Value
---- | -----
VIDEO | `"video"`










