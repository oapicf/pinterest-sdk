
# Table `MediaUpload_allOf`
(mapped from: MediaUploadAllOf)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**mediaId** | media_id | text |  | **kotlin.String** | Unique identifier for this media upload. Used to track status and for attaching during Pin creation. |  [optional]
**mediaType** | media_type | long |  | [**MediaUploadType**](MediaUploadType.md) |  |  [optional] [foreignkey]
**uploadUrl** | upload_url | text |  | **kotlin.String** | The URL where you will POST your media file. |  [optional]
**uploadParameters** | upload_parameters | long |  | [**MediaUploadAllOfUploadParameters**](MediaUploadAllOfUploadParameters.md) |  |  [optional] [foreignkey]






