
# PinMediaSource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sourceType** | [**inline**](#SourceType) |  | 
**contentType** | [**inline**](#ContentType) |  | 
**&#x60;data&#x60;** | **kotlin.String** |  | 
**url** | **kotlin.String** |  | 
**mediaId** | **kotlin.String** |  | 
**items** | [**kotlin.collections.List&lt;PinMediaSourceImagesURLItemsInner&gt;**](PinMediaSourceImagesURLItemsInner.md) | Array with image objects. | 
**isStandard** | **kotlin.Boolean** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. |  [optional]
**coverImageUrl** | **kotlin.String** | Cover image url. |  [optional]
**coverImageContentType** | [**inline**](#CoverImageContentType) | Content type for cover image Base64. |  [optional]
**coverImageData** | **kotlin.String** | Cover image Base64. |  [optional]
**index** | **kotlin.Int** |  |  [optional]
**isAffiliateLink** | **kotlin.Boolean** | This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products. |  [optional]


<a id="SourceType"></a>
## Enum: source_type
Name | Value
---- | -----
sourceType | pin_url


<a id="ContentType"></a>
## Enum: content_type
Name | Value
---- | -----
contentType | image/jpeg, image/png


<a id="CoverImageContentType"></a>
## Enum: cover_image_content_type
Name | Value
---- | -----
coverImageContentType | image/jpeg, image/png



