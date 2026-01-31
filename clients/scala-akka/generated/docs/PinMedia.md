

# PinMedia

Pin media that can be an image, video, or a mix of both.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**images** | [**ImageSize**](ImageSize.md) |  |  [optional]
**mediaType** | [**MediaType**](#MediaType) |  | 
**coverImageUrl** | **String** |  |  [optional]
**duration** | **BigDecimal** | Duration (in miliseconds). Field maybe null after creation due to video processing time. |  [optional]
**height** | **Int** | Height (in pixels). Field maybe null after creation due to video processing time. |  [optional]
**videoUrl** | **String** | Video url (720p).  **Note:** This field is limited and not available to all apps. |  [optional]
**width** | **Int** | Width (in pixels). Field maybe null after creation due to video processing time. |  [optional]
**items** | [**Seq&lt;PinMediaMetadata&gt;**](PinMediaMetadata.md) |  |  [optional]


## Enum: MediaType
Allowed values: [multiple_mixed]




