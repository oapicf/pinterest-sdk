

# PinMediaMetadata

Per-item entry inside `PinMedia.items` for mixed image/video pins. Discriminated by `item_type`.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** |  |  [optional]
**images** | [**ImageSize**](ImageSize.md) |  |  [optional]
**itemType** | [**ItemType**](#ItemType) | Discriminator literal identifying this as video metadata inside a &#x60;PinMediaMetadata&#x60; payload. | 
**link** | **String** |  |  [optional]
**title** | **String** |  |  [optional]
**coverImageUrl** | **String** |  |  [optional]
**duration** | **BigDecimal** | Duration (in miliseconds). Field maybe null after creation due to video processing time. |  [optional]
**height** | **Int** | Height (in pixels). Field maybe null after creation due to video processing time. |  [optional]
**videoUrl** | **String** | Video url (720p).  **Note:** This field is limited and not available to all apps. |  [optional]
**videoUrlHls** | **String** | Video url (HLS).  **Note:** This field is limited and not available to all apps. |  [optional]
**width** | **Int** | Width (in pixels). Field maybe null after creation due to video processing time. |  [optional]


## Enum: ItemType
Allowed values: [video]




