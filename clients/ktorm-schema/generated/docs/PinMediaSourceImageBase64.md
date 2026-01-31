
# Table `PinMediaSourceImageBase64`
(mapped from: PinMediaSourceImageBase64)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**contentType** | content_type | long NOT NULL |  | [**ContentType**](ContentType.md) |  |  [foreignkey]
**data** | data | text NOT NULL |  | **kotlin.String** |  | 
**sourceType** | source_type | text NOT NULL |  | [**source_type**](#SourceType) | The source type of the media. | 
**isStandard** | is_standard | boolean |  | **kotlin.Boolean** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. |  [optional]






