
# Table `media_list_200_response`
(mapped from: MediaList200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MediaUploadDetails&gt;**](MediaUploadDetails.md) | Media | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `MediaList200ResponseMediaUploadDetails`**
(mapped from: MediaList200ResponseMediaUploadDetails)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
mediaList200Response | mediaList200Response | long | | kotlin.Long | Primary Key | *one*
mediaUploadDetails | mediaUploadDetails | long | | kotlin.Long | Foreign Key | *many*




