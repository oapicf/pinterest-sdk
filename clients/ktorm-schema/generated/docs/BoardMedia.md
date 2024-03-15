
# Table `Board_media`
(mapped from: BoardMedia)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**imageCoverUrl** | image_cover_url | text |  | **kotlin.String** | Board cover image. |  [optional]
**pinThumbnailUrls** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Board pin thumbnail urls. |  [optional]



# **Table `BoardMediaPinThumbnailUrls`**
(mapped from: BoardMediaPinThumbnailUrls)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
boardMedia | boardMedia | long | | kotlin.Long | Primary Key | *one*
pinThumbnailUrls | pinThumbnailUrls | text | | kotlin.String | Foreign Key | *many*



