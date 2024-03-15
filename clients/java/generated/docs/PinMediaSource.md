

# PinMediaSource

Pin media source.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sourceType** | [**SourceTypeEnum**](#SourceTypeEnum) |  |  |
|**contentType** | [**ContentTypeEnum**](#ContentTypeEnum) |  |  |
|**data** | **String** |  |  |
|**isStandard** | **Boolean** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. |  [optional] |
|**url** | **String** |  |  |
|**coverImageUrl** | **String** | Cover image url. |  [optional] |
|**coverImageContentType** | [**CoverImageContentTypeEnum**](#CoverImageContentTypeEnum) | Content type for cover image Base64. |  [optional] |
|**coverImageData** | **String** | Cover image Base64. |  [optional] |
|**mediaId** | **String** |  |  |
|**items** | [**List&lt;PinMediaSourceImagesURLItemsInner&gt;**](PinMediaSourceImagesURLItemsInner.md) | Array with image objects. |  |
|**index** | **Integer** |  |  [optional] |
|**isAffiliateLink** | **Boolean** | This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products. |  [optional] |



## Enum: SourceTypeEnum

| Name | Value |
|---- | -----|
| PIN_URL | &quot;pin_url&quot; |



## Enum: ContentTypeEnum

| Name | Value |
|---- | -----|
| JPEG | &quot;image/jpeg&quot; |
| PNG | &quot;image/png&quot; |



## Enum: CoverImageContentTypeEnum

| Name | Value |
|---- | -----|
| JPEG | &quot;image/jpeg&quot; |
| PNG | &quot;image/png&quot; |



