

# VideoMetadataWithItemType

The class is defined in **[VideoMetadataWithItemType.java](../../src/main/java/org/openapitools/model/VideoMetadataWithItemType.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**coverImageUrl** | `String` |  |  [optional property]
**duration** | `BigDecimal` | Duration (in miliseconds). Field maybe null after creation due to video processing time. |  [optional property]
**height** | `Integer` | Height (in pixels). Field maybe null after creation due to video processing time. |  [optional property]
**itemType** | [**ItemTypeEnum**](#ItemTypeEnum) | Discriminator literal identifying this as video metadata inside a &#x60;PinMediaMetadata&#x60; payload. | 
**videoUrl** | `String` | Video url (720p).  **Note:** This field is limited and not available to all apps. |  [optional property]
**videoUrlHls** | `String` | Video url (HLS).  **Note:** This field is limited and not available to all apps. |  [optional property]
**width** | `Integer` | Width (in pixels). Field maybe null after creation due to video processing time. |  [optional property]




## ItemTypeEnum

Name | Value
---- | -----
VIDEO | `"video"`





