
# PinMedia

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **mediaType** | [**inline**](#MediaType) |  |  |
| **images** | [**ImageSize**](ImageSize.md) |  |  [optional] |
| **coverImageUrl** | **kotlin.String** |  |  [optional] |
| **duration** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Duration (in miliseconds). Field maybe null after creation due to video processing time. |  [optional] |
| **height** | **kotlin.Int** | Height (in pixels). Field maybe null after creation due to video processing time. |  [optional] |
| **videoUrl** | **kotlin.String** | Video url (720p).  **Note:** This field is limited and not available to all apps. |  [optional] |
| **videoUrlHls** | **kotlin.String** | Video url (HLS).  **Note:** This field is limited and not available to all apps. |  [optional] |
| **width** | **kotlin.Int** | Width (in pixels). Field maybe null after creation due to video processing time. |  [optional] |
| **items** | [**kotlin.collections.List&lt;PinMediaMetadata&gt;**](PinMediaMetadata.md) |  |  [optional] |


<a id="MediaType"></a>
## Enum: media_type
| Name | Value |
| ---- | ----- |
| mediaType | multiple_mixed |



