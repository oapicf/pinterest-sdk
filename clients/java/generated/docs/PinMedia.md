

# PinMedia

Pin media that can be an image, video, or a mix of both.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**images** | [**ImageSize**](ImageSize.md) |  |  [optional] |
|**mediaType** | [**MediaTypeEnum**](#MediaTypeEnum) |  |  |
|**coverImageUrl** | **String** |  |  [optional] |
|**duration** | **BigDecimal** | Duration (in miliseconds). Field maybe null after creation due to video processing time. |  [optional] |
|**height** | **Integer** | Height (in pixels). Field maybe null after creation due to video processing time. |  [optional] |
|**videoUrl** | **String** | Video url (720p).  **Note:** This field is limited and not available to all apps. |  [optional] |
|**width** | **Integer** | Width (in pixels). Field maybe null after creation due to video processing time. |  [optional] |
|**items** | [**List&lt;PinMediaMetadata&gt;**](PinMediaMetadata.md) |  |  [optional] |



## Enum: MediaTypeEnum

| Name | Value |
|---- | -----|
| MULTIPLE_MIXED | &quot;multiple_mixed&quot; |



