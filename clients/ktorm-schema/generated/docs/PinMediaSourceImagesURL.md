
# Table `PinMediaSourceImagesURL`
(mapped from: PinMediaSourceImagesURL)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PinMediaSourceImagesURLItemsInner&gt;**](PinMediaSourceImagesURLItemsInner.md) | Array with image objects. | 
**sourceType** | source_type | text |  | [**source_type**](#SourceType) |  |  [optional]
**index** | index | int UNSIGNED |  | **kotlin.Int** |  |  [optional]


# **Table `PinMediaSourceImagesURLPinMediaSourceImagesURLItemsInner`**
(mapped from: PinMediaSourceImagesURLPinMediaSourceImagesURLItemsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pinMediaSourceImagesURL | pinMediaSourceImagesURL | long | | kotlin.Long | Primary Key | *one*
pinMediaSourceImagesURLItemsInner | pinMediaSourceImagesURLItemsInner | long | | kotlin.Long | Foreign Key | *many*





