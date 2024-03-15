
# Table `PinMediaSourceImagesBase64`
(mapped from: PinMediaSourceImagesBase64)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PinMediaSourceImagesBase64ItemsInner&gt;**](PinMediaSourceImagesBase64ItemsInner.md) | Array with image objects. | 
**sourceType** | source_type | text |  | [**source_type**](#SourceType) |  |  [optional]
**index** | index | int UNSIGNED |  | **kotlin.Int** |  |  [optional]


# **Table `PinMediaSourceImagesBase64PinMediaSourceImagesBase64ItemsInner`**
(mapped from: PinMediaSourceImagesBase64PinMediaSourceImagesBase64ItemsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pinMediaSourceImagesBase64 | pinMediaSourceImagesBase64 | long | | kotlin.Long | Primary Key | *one*
pinMediaSourceImagesBase64ItemsInner | pinMediaSourceImagesBase64ItemsInner | long | | kotlin.Long | Foreign Key | *many*





