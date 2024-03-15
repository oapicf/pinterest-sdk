
# Table `PinMediaWithImageAndVideo`
(mapped from: PinMediaWithImageAndVideo)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**mediaType** | media_type | text |  | **kotlin.String** |  |  [optional]
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PinMediaMetadata&gt;**](PinMediaMetadata.md) |  |  [optional]



# **Table `PinMediaWithImageAndVideoPinMediaMetadata`**
(mapped from: PinMediaWithImageAndVideoPinMediaMetadata)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pinMediaWithImageAndVideo | pinMediaWithImageAndVideo | long | | kotlin.Long | Primary Key | *one*
pinMediaMetadata | pinMediaMetadata | long | | kotlin.Long | Foreign Key | *many*



