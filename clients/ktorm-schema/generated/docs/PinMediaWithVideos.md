
# Table `PinMediaWithVideos`
(mapped from: PinMediaWithVideos)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**mediaType** | media_type | text NOT NULL |  | [**media_type**](#MediaType) |  | 
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;VideoMetadataWithItemType&gt;**](VideoMetadataWithItemType.md) |  |  [optional]



# **Table `PinMediaWithVideosVideoMetadataWithItemType`**
(mapped from: PinMediaWithVideosVideoMetadataWithItemType)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pinMediaWithVideos | pinMediaWithVideos | long | | kotlin.Long | Primary Key | *one*
videoMetadataWithItemType | videoMetadataWithItemType | long | | kotlin.Long | Foreign Key | *many*



