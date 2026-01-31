
# Table `Media`
(mapped from: Media)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**mediaId** | media_id | text NOT NULL |  | **kotlin.String** | Unique identifier for this media upload. Used to track status and for attaching during Pin creation. |  [readonly]
**mediaType** | media_type | long NOT NULL |  | [**MediaUploadType**](MediaUploadType.md) |  |  [foreignkey]
**status** | status | long |  | [**MediaUploadStatus**](MediaUploadStatus.md) |  |  [optional] [readonly] [foreignkey]





