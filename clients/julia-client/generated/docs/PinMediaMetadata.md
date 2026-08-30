# PinMediaMetadata



## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | This is a oneOf model. The value must be exactly one of the following types: ImageMetadata, VideoMetadataWithItemType | Per-item entry inside &#x60;PinMedia.items&#x60; for mixed image/video pins. Discriminated by &#x60;item_type&#x60;. | [optional] 

The discriminator field is `item_type` with the following mapping:
 - `image`: `ImageMetadata`
 - `video`: `VideoMetadataWithItemType`



[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


