

# PinMediaWithVideo

Pin with video.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**coverImageUrl** | **String** |  |  [optional] |
|**duration** | **BigDecimal** | Duration (in miliseconds). Field maybe null after creation due to video processing time. |  [optional] |
|**height** | **Integer** | Height (in pixels). Field maybe null after creation due to video processing time. |  [optional] |
|**images** | [**ImageSize**](ImageSize.md) |  |  [optional] |
|**mediaType** | [**MediaTypeEnum**](#MediaTypeEnum) |  |  |
|**videoUrl** | **String** | Video url (720p).  **Note:** This field is limited and not available to all apps. |  [optional] |
|**width** | **Integer** | Width (in pixels). Field maybe null after creation due to video processing time. |  [optional] |



## Enum: MediaTypeEnum

| Name | Value |
|---- | -----|
| VIDEO | &quot;video&quot; |



