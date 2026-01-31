

# MediaUpload

Media upload that has been registered but not uploaded/processed yet.

The class is defined in **[MediaUpload.java](../../src/main/java/org/openapitools/model/MediaUpload.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mediaId** | `String` | Unique identifier for this media upload. Used to track status and for attaching during Pin creation. |  [readonly property]
**mediaType** | `MediaUploadType` |  | 
**uploadParameters** | [`MediaUploadParameters`](MediaUploadParameters.md) | The list of parameter key/value pairs you will need to send with your POST request to upload your media file. |  [optional property] [readonly property]
**uploadUrl** | `String` | The URL where you will POST your media file. |  [optional property] [readonly property]






