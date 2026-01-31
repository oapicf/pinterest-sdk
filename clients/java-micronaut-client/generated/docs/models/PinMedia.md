

# PinMedia

Pin media that can be an image, video, or a mix of both.

The class is defined in **[PinMedia.java](../../src/main/java/org/openapitools/model/PinMedia.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**images** | [`ImageSize`](ImageSize.md) |  |  [optional property]
**mediaType** | [**MediaTypeEnum**](#MediaTypeEnum) |  | 
**coverImageUrl** | `String` |  |  [optional property]
**duration** | `BigDecimal` | Duration (in miliseconds). Field maybe null after creation due to video processing time. |  [optional property]
**height** | `Integer` | Height (in pixels). Field maybe null after creation due to video processing time. |  [optional property]
**videoUrl** | `String` | Video url (720p).  **Note:** This field is limited and not available to all apps. |  [optional property]
**width** | `Integer` | Width (in pixels). Field maybe null after creation due to video processing time. |  [optional property]
**items** | [`List&lt;PinMediaMetadata&gt;`](PinMediaMetadata.md) |  |  [optional property]


## MediaTypeEnum

Name | Value
---- | -----
MULTIPLE_MIXED | `"multiple_mixed"`








