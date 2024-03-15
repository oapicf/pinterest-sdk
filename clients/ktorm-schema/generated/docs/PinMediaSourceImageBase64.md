
# Table `PinMediaSourceImageBase64`
(mapped from: PinMediaSourceImageBase64)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**sourceType** | source_type | text NOT NULL |  | [**source_type**](#SourceType) |  | 
**contentType** | content_type | text NOT NULL |  | [**content_type**](#ContentType) |  | 
**data** | data | text NOT NULL |  | **kotlin.String** |  | 
**isStandard** | is_standard | boolean |  | **kotlin.Boolean** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. |  [optional]






