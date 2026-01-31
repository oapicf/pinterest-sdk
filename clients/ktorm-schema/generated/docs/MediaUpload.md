
# Table `MediaUpload`
(mapped from: MediaUpload)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**mediaId** | media_id | text NOT NULL |  | **kotlin.String** | Unique identifier for this media upload. Used to track status and for attaching during Pin creation. |  [readonly]
**mediaType** | media_type | long NOT NULL |  | [**MediaUploadType**](MediaUploadType.md) |  |  [foreignkey]
**uploadParameters** | upload_parameters | long |  | [**MediaUploadParameters**](MediaUploadParameters.md) | The list of parameter key/value pairs you will need to send with your POST request to upload your media file. |  [optional] [readonly] [foreignkey]
**uploadUrl** | upload_url | text |  | **kotlin.String** | The URL where you will POST your media file. |  [optional] [readonly]






