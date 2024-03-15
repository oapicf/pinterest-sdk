# UserWebsiteVerificationCode

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VerificationCode** | Pointer to **string** | Code to check against the user claiming the website | [optional] 
**DnsTxtRecord** | Pointer to **string** | DNS TXT record to check against for the website to be claimed | [optional] 
**Metatag** | Pointer to **string** | Metatag the verification process searchs for the website to be claimed | [optional] 
**Filename** | Pointer to **string** | File expected to find on the website being claimed | [optional] 
**FileContent** | Pointer to **string** | A full html file to upload to the website in order for it to be claimed | [optional] 

## Methods

### NewUserWebsiteVerificationCode

`func NewUserWebsiteVerificationCode() *UserWebsiteVerificationCode`

NewUserWebsiteVerificationCode instantiates a new UserWebsiteVerificationCode object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUserWebsiteVerificationCodeWithDefaults

`func NewUserWebsiteVerificationCodeWithDefaults() *UserWebsiteVerificationCode`

NewUserWebsiteVerificationCodeWithDefaults instantiates a new UserWebsiteVerificationCode object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetVerificationCode

`func (o *UserWebsiteVerificationCode) GetVerificationCode() string`

GetVerificationCode returns the VerificationCode field if non-nil, zero value otherwise.

### GetVerificationCodeOk

`func (o *UserWebsiteVerificationCode) GetVerificationCodeOk() (*string, bool)`

GetVerificationCodeOk returns a tuple with the VerificationCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVerificationCode

`func (o *UserWebsiteVerificationCode) SetVerificationCode(v string)`

SetVerificationCode sets VerificationCode field to given value.

### HasVerificationCode

`func (o *UserWebsiteVerificationCode) HasVerificationCode() bool`

HasVerificationCode returns a boolean if a field has been set.

### GetDnsTxtRecord

`func (o *UserWebsiteVerificationCode) GetDnsTxtRecord() string`

GetDnsTxtRecord returns the DnsTxtRecord field if non-nil, zero value otherwise.

### GetDnsTxtRecordOk

`func (o *UserWebsiteVerificationCode) GetDnsTxtRecordOk() (*string, bool)`

GetDnsTxtRecordOk returns a tuple with the DnsTxtRecord field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDnsTxtRecord

`func (o *UserWebsiteVerificationCode) SetDnsTxtRecord(v string)`

SetDnsTxtRecord sets DnsTxtRecord field to given value.

### HasDnsTxtRecord

`func (o *UserWebsiteVerificationCode) HasDnsTxtRecord() bool`

HasDnsTxtRecord returns a boolean if a field has been set.

### GetMetatag

`func (o *UserWebsiteVerificationCode) GetMetatag() string`

GetMetatag returns the Metatag field if non-nil, zero value otherwise.

### GetMetatagOk

`func (o *UserWebsiteVerificationCode) GetMetatagOk() (*string, bool)`

GetMetatagOk returns a tuple with the Metatag field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMetatag

`func (o *UserWebsiteVerificationCode) SetMetatag(v string)`

SetMetatag sets Metatag field to given value.

### HasMetatag

`func (o *UserWebsiteVerificationCode) HasMetatag() bool`

HasMetatag returns a boolean if a field has been set.

### GetFilename

`func (o *UserWebsiteVerificationCode) GetFilename() string`

GetFilename returns the Filename field if non-nil, zero value otherwise.

### GetFilenameOk

`func (o *UserWebsiteVerificationCode) GetFilenameOk() (*string, bool)`

GetFilenameOk returns a tuple with the Filename field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilename

`func (o *UserWebsiteVerificationCode) SetFilename(v string)`

SetFilename sets Filename field to given value.

### HasFilename

`func (o *UserWebsiteVerificationCode) HasFilename() bool`

HasFilename returns a boolean if a field has been set.

### GetFileContent

`func (o *UserWebsiteVerificationCode) GetFileContent() string`

GetFileContent returns the FileContent field if non-nil, zero value otherwise.

### GetFileContentOk

`func (o *UserWebsiteVerificationCode) GetFileContentOk() (*string, bool)`

GetFileContentOk returns a tuple with the FileContent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFileContent

`func (o *UserWebsiteVerificationCode) SetFileContent(v string)`

SetFileContent sets FileContent field to given value.

### HasFileContent

`func (o *UserWebsiteVerificationCode) HasFileContent() bool`

HasFileContent returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


