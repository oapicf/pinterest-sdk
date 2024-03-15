
# Table `PinMediaWithVideos`
(mapped from: PinMediaWithVideos)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**mediaType** | media_type | text |  | **kotlin.String** |  |  [optional]
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;VideoMetadata&gt;**](VideoMetadata.md) |  |  [optional]



# **Table `PinMediaWithVideosVideoMetadata`**
(mapped from: PinMediaWithVideosVideoMetadata)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pinMediaWithVideos | pinMediaWithVideos | long | | kotlin.Long | Primary Key | *one*
videoMetadata | videoMetadata | long | | kotlin.Long | Foreign Key | *many*



