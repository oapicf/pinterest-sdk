

# PinMediaSourceImageBase64

Base64-encoded image media source

The class is defined in **[PinMediaSourceImageBase64.java](../../src/main/java/org/openapitools/model/PinMediaSourceImageBase64.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sourceType** | [**SourceTypeEnum**](#SourceTypeEnum) |  | 
**contentType** | [**ContentTypeEnum**](#ContentTypeEnum) |  | 
**data** | `String` |  | 
**isStandard** | `Boolean` | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. |  [optional property]

## SourceTypeEnum

Name | Value
---- | -----
IMAGE_BASE64 | `"image_base64"`

## ContentTypeEnum

Name | Value
---- | -----
JPEG | `"image/jpeg"`
PNG | `"image/png"`




