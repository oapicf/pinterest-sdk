
# Table `media_list_200_response`
(mapped from: MediaList200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;Media&gt;**](Media.md) |  | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `MediaList200ResponseMedia`**
(mapped from: MediaList200ResponseMedia)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
mediaList200Response | mediaList200Response | long | | kotlin.Long | Primary Key | *one*
media | media | long | | kotlin.Long | Foreign Key | *many*




