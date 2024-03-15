

# PinMediaSourceVideoID

Video ID-based media source

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sourceType** | [**SourceTypeEnum**](#SourceTypeEnum) |  |  |
|**coverImageUrl** | **String** | Cover image url. |  [optional] |
|**coverImageContentType** | [**CoverImageContentTypeEnum**](#CoverImageContentTypeEnum) | Content type for cover image Base64. |  [optional] |
|**coverImageData** | **String** | Cover image Base64. |  [optional] |
|**mediaId** | **String** |  |  |
|**isStandard** | **Boolean** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. |  [optional] |



## Enum: SourceTypeEnum

| Name | Value |
|---- | -----|
| VIDEO_ID | &quot;video_id&quot; |



## Enum: CoverImageContentTypeEnum

| Name | Value |
|---- | -----|
| JPEG | &quot;image/jpeg&quot; |
| PNG | &quot;image/png&quot; |



