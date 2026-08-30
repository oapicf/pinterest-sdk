
# PinMediaMetadata

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **itemType** | [**inline**](#ItemType) | Discriminator literal identifying this as video metadata inside a &#x60;PinMediaMetadata&#x60; payload. |  |
| **description** | **kotlin.String** |  |  [optional] |
| **images** | [**ImageSize**](ImageSize.md) |  |  [optional] |
| **link** | **kotlin.String** |  |  [optional] |
| **title** | **kotlin.String** |  |  [optional] |
| **coverImageUrl** | **kotlin.String** |  |  [optional] |
| **duration** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Duration (in miliseconds). Field maybe null after creation due to video processing time. |  [optional] |
| **height** | **kotlin.Int** | Height (in pixels). Field maybe null after creation due to video processing time. |  [optional] |
| **videoUrl** | **kotlin.String** | Video url (720p).  **Note:** This field is limited and not available to all apps. |  [optional] |
| **videoUrlHls** | **kotlin.String** | Video url (HLS).  **Note:** This field is limited and not available to all apps. |  [optional] |
| **width** | **kotlin.Int** | Width (in pixels). Field maybe null after creation due to video processing time. |  [optional] |


<a id="ItemType"></a>
## Enum: item_type
| Name | Value |
| ---- | ----- |
| itemType | video |



