# S3MultipartUploadData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FileParts** | Pointer to [**[]S3FilePart**](S3FilePart.md) | Array of file parts with pre-signed URLs. | [optional] 

## Methods

### NewS3MultipartUploadData

`func NewS3MultipartUploadData() *S3MultipartUploadData`

NewS3MultipartUploadData instantiates a new S3MultipartUploadData object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewS3MultipartUploadDataWithDefaults

`func NewS3MultipartUploadDataWithDefaults() *S3MultipartUploadData`

NewS3MultipartUploadDataWithDefaults instantiates a new S3MultipartUploadData object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFileParts

`func (o *S3MultipartUploadData) GetFileParts() []S3FilePart`

GetFileParts returns the FileParts field if non-nil, zero value otherwise.

### GetFilePartsOk

`func (o *S3MultipartUploadData) GetFilePartsOk() (*[]S3FilePart, bool)`

GetFilePartsOk returns a tuple with the FileParts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFileParts

`func (o *S3MultipartUploadData) SetFileParts(v []S3FilePart)`

SetFileParts sets FileParts field to given value.

### HasFileParts

`func (o *S3MultipartUploadData) HasFileParts() bool`

HasFileParts returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


