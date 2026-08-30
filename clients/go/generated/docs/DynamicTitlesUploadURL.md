# DynamicTitlesUploadURL

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ExistingFilename** | Pointer to **string** | If present, a reviewed CSV was previously submitted for this ad group. Uploading a new file will replace it. Absent when no prior submission exists. | [optional] 
**RequestId** | **string** | Unique identifier for this upload session. Must be passed to the process endpoint. | 
**UploadUrl** | **string** | Pre-signed S3 PUT URL to upload the reviewed CSV file. | 

## Methods

### NewDynamicTitlesUploadURL

`func NewDynamicTitlesUploadURL(requestId string, uploadUrl string, ) *DynamicTitlesUploadURL`

NewDynamicTitlesUploadURL instantiates a new DynamicTitlesUploadURL object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewDynamicTitlesUploadURLWithDefaults

`func NewDynamicTitlesUploadURLWithDefaults() *DynamicTitlesUploadURL`

NewDynamicTitlesUploadURLWithDefaults instantiates a new DynamicTitlesUploadURL object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetExistingFilename

`func (o *DynamicTitlesUploadURL) GetExistingFilename() string`

GetExistingFilename returns the ExistingFilename field if non-nil, zero value otherwise.

### GetExistingFilenameOk

`func (o *DynamicTitlesUploadURL) GetExistingFilenameOk() (*string, bool)`

GetExistingFilenameOk returns a tuple with the ExistingFilename field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExistingFilename

`func (o *DynamicTitlesUploadURL) SetExistingFilename(v string)`

SetExistingFilename sets ExistingFilename field to given value.

### HasExistingFilename

`func (o *DynamicTitlesUploadURL) HasExistingFilename() bool`

HasExistingFilename returns a boolean if a field has been set.

### GetRequestId

`func (o *DynamicTitlesUploadURL) GetRequestId() string`

GetRequestId returns the RequestId field if non-nil, zero value otherwise.

### GetRequestIdOk

`func (o *DynamicTitlesUploadURL) GetRequestIdOk() (*string, bool)`

GetRequestIdOk returns a tuple with the RequestId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRequestId

`func (o *DynamicTitlesUploadURL) SetRequestId(v string)`

SetRequestId sets RequestId field to given value.


### GetUploadUrl

`func (o *DynamicTitlesUploadURL) GetUploadUrl() string`

GetUploadUrl returns the UploadUrl field if non-nil, zero value otherwise.

### GetUploadUrlOk

`func (o *DynamicTitlesUploadURL) GetUploadUrlOk() (*string, bool)`

GetUploadUrlOk returns a tuple with the UploadUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUploadUrl

`func (o *DynamicTitlesUploadURL) SetUploadUrl(v string)`

SetUploadUrl sets UploadUrl field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


