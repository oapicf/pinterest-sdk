
# Table `PinMediaSourceImagesURL`
(mapped from: PinMediaSourceImagesURL)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PinMediaSourceImagesURLItem&gt;**](PinMediaSourceImagesURLItem.md) | Array with image objects. | 
**sourceType** | source_type | text NOT NULL |  | [**source_type**](#SourceType) | The source type of the media. | 
**index** | index | int UNSIGNED |  | **kotlin.Int** |  |  [optional]


# **Table `PinMediaSourceImagesURLPinMediaSourceImagesURLItem`**
(mapped from: PinMediaSourceImagesURLPinMediaSourceImagesURLItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pinMediaSourceImagesURL | pinMediaSourceImagesURL | long | | kotlin.Long | Primary Key | *one*
pinMediaSourceImagesURLItem | pinMediaSourceImagesURLItem | long | | kotlin.Long | Foreign Key | *many*





