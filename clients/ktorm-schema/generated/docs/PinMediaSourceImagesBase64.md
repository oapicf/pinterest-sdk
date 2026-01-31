
# Table `PinMediaSourceImagesBase64`
(mapped from: PinMediaSourceImagesBase64)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PinMediaSourceImagesBase64Item&gt;**](PinMediaSourceImagesBase64Item.md) | Array with image objects. | 
**sourceType** | source_type | text NOT NULL |  | [**source_type**](#SourceType) | The source type of the media. | 
**index** | index | int UNSIGNED |  | **kotlin.Int** |  |  [optional]


# **Table `PinMediaSourceImagesBase64PinMediaSourceImagesBase64Item`**
(mapped from: PinMediaSourceImagesBase64PinMediaSourceImagesBase64Item)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pinMediaSourceImagesBase64 | pinMediaSourceImagesBase64 | long | | kotlin.Long | Primary Key | *one*
pinMediaSourceImagesBase64Item | pinMediaSourceImagesBase64Item | long | | kotlin.Long | Foreign Key | *many*





