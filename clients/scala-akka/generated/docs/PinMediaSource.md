

# PinMediaSource

Pin media source.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sourceType** | [**SourceType**](#SourceType) |  | 
**contentType** | [**ContentType**](#ContentType) |  | 
**data** | **String** |  | 
**isStandard** | **Boolean** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. |  [optional]
**url** | **String** |  | 
**coverImageUrl** | **String** | Cover image url. |  [optional]
**coverImageContentType** | [**CoverImageContentType**](#CoverImageContentType) | Content type for cover image Base64. |  [optional]
**coverImageData** | **String** | Cover image Base64. |  [optional]
**mediaId** | **String** |  | 
**items** | [**Seq&lt;PinMediaSourceImagesURLItemsInner&gt;**](PinMediaSourceImagesURLItemsInner.md) | Array with image objects. | 
**index** | **Int** |  |  [optional]
**isAffiliateLink** | **Boolean** | This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products. |  [optional]


## Enum: SourceType
Allowed values: [pin_url]



## Enum: ContentType
Allowed values: [image/jpeg, image/png]



## Enum: CoverImageContentType
Allowed values: [image/jpeg, image/png]




