
# Table `PinMediaWithImages`
(mapped from: PinMediaWithImages)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**mediaType** | media_type | text |  | **kotlin.String** |  |  [optional]
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ImageMetadata&gt;**](ImageMetadata.md) |  |  [optional]



# **Table `PinMediaWithImagesImageMetadata`**
(mapped from: PinMediaWithImagesImageMetadata)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pinMediaWithImages | pinMediaWithImages | long | | kotlin.Long | Primary Key | *one*
imageMetadata | imageMetadata | long | | kotlin.Long | Foreign Key | *many*



