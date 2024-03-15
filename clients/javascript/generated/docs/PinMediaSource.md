# PinterestSdk.PinMediaSource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sourceType** | **String** |  | 
**contentType** | **String** |  | 
**data** | **String** |  | 
**isStandard** | **Boolean** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. | [optional] [default to true]
**url** | **String** |  | 
**coverImageUrl** | **String** | Cover image url. | [optional] 
**coverImageContentType** | **String** | Content type for cover image Base64. | [optional] 
**coverImageData** | **String** | Cover image Base64. | [optional] 
**mediaId** | **String** |  | 
**items** | [**[PinMediaSourceImagesURLItemsInner]**](PinMediaSourceImagesURLItemsInner.md) | Array with image objects. | 
**index** | **Number** |  | [optional] 
**isAffiliateLink** | **Boolean** | This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products. | [optional] [default to false]



## Enum: SourceTypeEnum


* `pin_url` (value: `"pin_url"`)





## Enum: ContentTypeEnum


* `jpeg` (value: `"image/jpeg"`)

* `png` (value: `"image/png"`)





## Enum: CoverImageContentTypeEnum


* `jpeg` (value: `"image/jpeg"`)

* `png` (value: `"image/png"`)




