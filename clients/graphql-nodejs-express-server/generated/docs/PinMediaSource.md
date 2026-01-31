# PinMediaSource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contentType** | [***ContentType**](ContentType.md) |  | [default to null]
**data** | **String!** |  | [default to null]
**isStandard** | **Boolean!** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. | [optional] [default to true]
**sourceType** | **String!** |  | [default to null]
**url** | **String!** |  | [default to null]
**coverImageContentType** | [***ContentType**](ContentType.md) | Content type for cover image Base64. | [optional] [default to null]
**coverImageData** | **String!** | Cover image Base64. | [optional] [default to null]
**coverImageKeyFrameTime** | **Int!** | Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used. | [optional] [default to null]
**coverImageUrl** | **String!** | Cover image URL. | [optional] [default to null]
**mediaId** | **String!** |  | [default to null]
**index** | **Int!** |  | [optional] [default to null]
**items** | [**PinMediaSourceImagesUrlItem**](PinMediaSourceImagesURLItem.md) | Array with image objects. | [default to null]
**isAffiliateLink** | **Boolean!** | This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products. | [optional] [default to false]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


