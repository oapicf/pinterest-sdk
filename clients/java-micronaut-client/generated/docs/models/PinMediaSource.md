

# PinMediaSource

Pin media source.

The class is defined in **[PinMediaSource.java](../../src/main/java/org/openapitools/model/PinMediaSource.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sourceType** | [**SourceTypeEnum**](#SourceTypeEnum) |  | 
**contentType** | [**ContentTypeEnum**](#ContentTypeEnum) |  | 
**data** | `String` |  | 
**isStandard** | `Boolean` | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. |  [optional property]
**url** | `String` |  | 
**coverImageUrl** | `String` | Cover image url. |  [optional property]
**coverImageContentType** | [**CoverImageContentTypeEnum**](#CoverImageContentTypeEnum) | Content type for cover image Base64. |  [optional property]
**coverImageData** | `String` | Cover image Base64. |  [optional property]
**mediaId** | `String` |  | 
**items** | [`List&lt;PinMediaSourceImagesURLItemsInner&gt;`](PinMediaSourceImagesURLItemsInner.md) | Array with image objects. | 
**index** | `Integer` |  |  [optional property]
**isAffiliateLink** | `Boolean` | This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products. |  [optional property]

## SourceTypeEnum

Name | Value
---- | -----
PIN_URL | `"pin_url"`

## ContentTypeEnum

Name | Value
---- | -----
JPEG | `"image/jpeg"`
PNG | `"image/png"`





## CoverImageContentTypeEnum

Name | Value
---- | -----
JPEG | `"image/jpeg"`
PNG | `"image/png"`







