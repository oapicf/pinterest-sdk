

# PinMedia

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**images** | [**ImageSize**](ImageSize.md) |  |  [optional]
**mediaType** | [**MediaTypeEnum**](#MediaTypeEnum) |  | 
**coverImageUrl** | **String** |  |  [optional]
**duration** | [**BigDecimal**](BigDecimal.md) | Duration (in miliseconds). Field maybe null after creation due to video processing time. |  [optional]
**height** | **Integer** | Height (in pixels). Field maybe null after creation due to video processing time. |  [optional]
**videoUrl** | **String** | Video url (720p).  **Note:** This field is limited and not available to all apps. |  [optional]
**videoUrlHls** | **String** | Video url (HLS).  **Note:** This field is limited and not available to all apps. |  [optional]
**width** | **Integer** | Width (in pixels). Field maybe null after creation due to video processing time. |  [optional]
**items** | [**List&lt;PinMediaMetadata&gt;**](PinMediaMetadata.md) |  |  [optional]


## Enum: MediaTypeEnum

Name | Value
---- | -----




