

# PinMediaSourceImageBase64

Base64-encoded image media source

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sourceType** | [**SourceTypeEnum**](#SourceTypeEnum) |  |  |
|**contentType** | [**ContentTypeEnum**](#ContentTypeEnum) |  |  |
|**data** | **String** |  |  |
|**isStandard** | **Boolean** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. |  [optional] |



## Enum: SourceTypeEnum

| Name | Value |
|---- | -----|
| IMAGE_BASE64 | &quot;image_base64&quot; |



## Enum: ContentTypeEnum

| Name | Value |
|---- | -----|
| JPEG | &quot;image/jpeg&quot; |
| PNG | &quot;image/png&quot; |



