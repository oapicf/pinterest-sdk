# OAIPinMediaSource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contentType** | [**OAIContentType***](OAIContentType.md) |  | 
**data** | **NSString*** |  | 
**isStandard** | **NSNumber*** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. | [optional] [default to @(YES)]
**sourceType** | **NSString*** |  | 
**url** | **NSString*** |  | 
**coverImageContentType** | [**OAIContentType***](OAIContentType.md) | Content type for cover image Base64. | [optional] 
**coverImageData** | **NSString*** | Cover image Base64. | [optional] 
**coverImageKeyFrameTime** | **NSNumber*** | Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used. | [optional] 
**coverImageUrl** | **NSString*** | Cover image URL. | [optional] 
**mediaId** | **NSString*** |  | 
**index** | **NSNumber*** |  | [optional] 
**items** | [**NSArray&lt;OAIPinMediaSourceImagesURLItem&gt;***](OAIPinMediaSourceImagesURLItem.md) | Array with image objects. | 
**isAffiliateLink** | **NSNumber*** | This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products. | [optional] [default to @(NO)]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


