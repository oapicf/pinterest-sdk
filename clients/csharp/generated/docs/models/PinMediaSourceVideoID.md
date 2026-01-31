# Org.OpenAPITools.Model.PinMediaSourceVideoID
Video ID-based media source.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MediaId** | **string** |  | 
**SourceType** | **string** |  | 
**CoverImageContentType** | **ContentType** | Content type for cover image Base64. | [optional] 
**CoverImageData** | **string** | Cover image Base64. | [optional] 
**CoverImageKeyFrameTime** | **int** | Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used. | [optional] 
**CoverImageUrl** | **string** | Cover image URL. | [optional] 
**IsStandard** | **bool** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. | [optional] [default to true]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

