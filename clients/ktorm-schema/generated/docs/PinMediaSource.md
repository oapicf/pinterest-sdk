
# Table `PinMediaSource`
(mapped from: PinMediaSource)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**sourceType** | source_type | text NOT NULL |  | [**source_type**](#SourceType) |  | 
**contentType** | content_type | text NOT NULL |  | [**content_type**](#ContentType) |  | 
**data** | data | text NOT NULL |  | **kotlin.String** |  | 
**url** | url | text NOT NULL |  | **kotlin.String** |  | 
**mediaId** | media_id | text NOT NULL |  | **kotlin.String** |  | 
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PinMediaSourceImagesURLItemsInner&gt;**](PinMediaSourceImagesURLItemsInner.md) | Array with image objects. | 
**isStandard** | is_standard | boolean |  | **kotlin.Boolean** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. |  [optional]
**coverImageUrl** | cover_image_url | text |  | **kotlin.String** | Cover image url. |  [optional]
**coverImageContentType** | cover_image_content_type | text |  | [**cover_image_content_type**](#CoverImageContentType) | Content type for cover image Base64. |  [optional]
**coverImageData** | cover_image_data | text |  | **kotlin.String** | Cover image Base64. |  [optional]
**index** | index | int UNSIGNED |  | **kotlin.Int** |  |  [optional]
**isAffiliateLink** | is_affiliate_link | boolean |  | **kotlin.Boolean** | This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products. |  [optional]







# **Table `PinMediaSourcePinMediaSourceImagesURLItemsInner`**
(mapped from: PinMediaSourcePinMediaSourceImagesURLItemsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pinMediaSource | pinMediaSource | long | | kotlin.Long | Primary Key | *one*
pinMediaSourceImagesURLItemsInner | pinMediaSourceImagesURLItemsInner | long | | kotlin.Long | Foreign Key | *many*









