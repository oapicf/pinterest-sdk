
# Table `ImageMetadata`
(mapped from: ImageMetadata)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**itemType** | item_type | text NOT NULL |  | [**item_type**](#ItemType) | Discriminator literal identifying this as image metadata inside a &#x60;PinMediaMetadata&#x60; payload. | 
**description** | description | text |  | **kotlin.String** |  |  [optional]
**images** | images | long |  | [**ImageSize**](ImageSize.md) |  |  [optional] [foreignkey]
**link** | link | text |  | **kotlin.String** |  |  [optional]
**title** | title | text |  | **kotlin.String** |  |  [optional]







