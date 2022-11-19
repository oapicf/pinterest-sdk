# pinterestsdk.model.media_upload.MediaUpload

Media upload that has been registered but not uploaded/processed yet.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO | Media upload that has been registered but not uploaded/processed yet. | 

### Composed Schemas (allOf/anyOf/oneOf/not)
#### allOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[all_of_0](#all_of_0) | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

# all_of_0

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**media_id** | str,  | str,  | Unique identifier for this media upload. Used to track status and for attaching during Pin creation. | [optional] 
**[media_type](#media_type)** | str,  | str,  |  | [optional] 
**upload_url** | str,  | str,  | The URL where you will POST your media file. | [optional] 
**[upload_parameters](#upload_parameters)** | dict, frozendict.frozendict,  | frozendict.frozendict,  | The list of parameter key/value pairs you will need to send with your POST request to upload your media file. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# media_type

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Composed Schemas (allOf/anyOf/oneOf/not)
#### allOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[MediaUploadType](MediaUploadType.md) | [**MediaUploadType**](MediaUploadType.md) | [**MediaUploadType**](MediaUploadType.md) |  | 

# upload_parameters

The list of parameter key/value pairs you will need to send with your POST request to upload your media file.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | The list of parameter key/value pairs you will need to send with your POST request to upload your media file. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**x-amz-date** | str,  | str,  |  | [optional] 
**x-amz-signature** | str,  | str,  |  | [optional] 
**x-amz-security-token** | str,  | str,  |  | [optional] 
**x-amz-algorithm** | str,  | str,  |  | [optional] 
**key** | str,  | str,  |  | [optional] 
**policy** | str,  | str,  |  | [optional] 
**x-amz-credential** | str,  | str,  |  | [optional] 
**Content-Type** | str,  | str,  |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

