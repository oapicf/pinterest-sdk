# UserWebsiteVerification

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DnsTxtRecord** | Pointer to **string** | DNS TXT record to check against for the website to be claimed | [optional] 
**FileContent** | Pointer to **string** | A full html file to upload to the website in order for it to be claimed | [optional] 
**Filename** | Pointer to **string** | File expected to find on the website being claimed | [optional] 
**Metatag** | Pointer to **string** | Metatag the verification process searchs for the website to be claimed | [optional] 
**VerificationCode** | Pointer to **string** | Code to check against the user claiming the website | [optional] 

## Methods

### NewUserWebsiteVerification

`func NewUserWebsiteVerification() *UserWebsiteVerification`

NewUserWebsiteVerification instantiates a new UserWebsiteVerification object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUserWebsiteVerificationWithDefaults

`func NewUserWebsiteVerificationWithDefaults() *UserWebsiteVerification`

NewUserWebsiteVerificationWithDefaults instantiates a new UserWebsiteVerification object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDnsTxtRecord

`func (o *UserWebsiteVerification) GetDnsTxtRecord() string`

GetDnsTxtRecord returns the DnsTxtRecord field if non-nil, zero value otherwise.

### GetDnsTxtRecordOk

`func (o *UserWebsiteVerification) GetDnsTxtRecordOk() (*string, bool)`

GetDnsTxtRecordOk returns a tuple with the DnsTxtRecord field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDnsTxtRecord

`func (o *UserWebsiteVerification) SetDnsTxtRecord(v string)`

SetDnsTxtRecord sets DnsTxtRecord field to given value.

### HasDnsTxtRecord

`func (o *UserWebsiteVerification) HasDnsTxtRecord() bool`

HasDnsTxtRecord returns a boolean if a field has been set.

### GetFileContent

`func (o *UserWebsiteVerification) GetFileContent() string`

GetFileContent returns the FileContent field if non-nil, zero value otherwise.

### GetFileContentOk

`func (o *UserWebsiteVerification) GetFileContentOk() (*string, bool)`

GetFileContentOk returns a tuple with the FileContent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFileContent

`func (o *UserWebsiteVerification) SetFileContent(v string)`

SetFileContent sets FileContent field to given value.

### HasFileContent

`func (o *UserWebsiteVerification) HasFileContent() bool`

HasFileContent returns a boolean if a field has been set.

### GetFilename

`func (o *UserWebsiteVerification) GetFilename() string`

GetFilename returns the Filename field if non-nil, zero value otherwise.

### GetFilenameOk

`func (o *UserWebsiteVerification) GetFilenameOk() (*string, bool)`

GetFilenameOk returns a tuple with the Filename field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilename

`func (o *UserWebsiteVerification) SetFilename(v string)`

SetFilename sets Filename field to given value.

### HasFilename

`func (o *UserWebsiteVerification) HasFilename() bool`

HasFilename returns a boolean if a field has been set.

### GetMetatag

`func (o *UserWebsiteVerification) GetMetatag() string`

GetMetatag returns the Metatag field if non-nil, zero value otherwise.

### GetMetatagOk

`func (o *UserWebsiteVerification) GetMetatagOk() (*string, bool)`

GetMetatagOk returns a tuple with the Metatag field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMetatag

`func (o *UserWebsiteVerification) SetMetatag(v string)`

SetMetatag sets Metatag field to given value.

### HasMetatag

`func (o *UserWebsiteVerification) HasMetatag() bool`

HasMetatag returns a boolean if a field has been set.

### GetVerificationCode

`func (o *UserWebsiteVerification) GetVerificationCode() string`

GetVerificationCode returns the VerificationCode field if non-nil, zero value otherwise.

### GetVerificationCodeOk

`func (o *UserWebsiteVerification) GetVerificationCodeOk() (*string, bool)`

GetVerificationCodeOk returns a tuple with the VerificationCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVerificationCode

`func (o *UserWebsiteVerification) SetVerificationCode(v string)`

SetVerificationCode sets VerificationCode field to given value.

### HasVerificationCode

`func (o *UserWebsiteVerification) HasVerificationCode() bool`

HasVerificationCode returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


