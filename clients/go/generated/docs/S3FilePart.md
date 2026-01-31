# S3FilePart

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PartNumber** | **int32** | Part number for upload. | 
**PresignedUrl** | **string** | Pre-signed URL. | 

## Methods

### NewS3FilePart

`func NewS3FilePart(partNumber int32, presignedUrl string, ) *S3FilePart`

NewS3FilePart instantiates a new S3FilePart object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewS3FilePartWithDefaults

`func NewS3FilePartWithDefaults() *S3FilePart`

NewS3FilePartWithDefaults instantiates a new S3FilePart object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPartNumber

`func (o *S3FilePart) GetPartNumber() int32`

GetPartNumber returns the PartNumber field if non-nil, zero value otherwise.

### GetPartNumberOk

`func (o *S3FilePart) GetPartNumberOk() (*int32, bool)`

GetPartNumberOk returns a tuple with the PartNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPartNumber

`func (o *S3FilePart) SetPartNumber(v int32)`

SetPartNumber sets PartNumber field to given value.


### GetPresignedUrl

`func (o *S3FilePart) GetPresignedUrl() string`

GetPresignedUrl returns the PresignedUrl field if non-nil, zero value otherwise.

### GetPresignedUrlOk

`func (o *S3FilePart) GetPresignedUrlOk() (*string, bool)`

GetPresignedUrlOk returns a tuple with the PresignedUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPresignedUrl

`func (o *S3FilePart) SetPresignedUrl(v string)`

SetPresignedUrl sets PresignedUrl field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


