# CreateAssetAccessRequestResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Exceptions** | Pointer to [**[]CreateAssetAccessRequestErrorMessageInner**](CreateAssetAccessRequestErrorMessageInner.md) | A list of errors associated with the asset access requests. Will be returned if there is an error. | [optional] 
**Invites** | Pointer to **map[string]string** |  | [optional] 

## Methods

### NewCreateAssetAccessRequestResponse

`func NewCreateAssetAccessRequestResponse() *CreateAssetAccessRequestResponse`

NewCreateAssetAccessRequestResponse instantiates a new CreateAssetAccessRequestResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateAssetAccessRequestResponseWithDefaults

`func NewCreateAssetAccessRequestResponseWithDefaults() *CreateAssetAccessRequestResponse`

NewCreateAssetAccessRequestResponseWithDefaults instantiates a new CreateAssetAccessRequestResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetExceptions

`func (o *CreateAssetAccessRequestResponse) GetExceptions() []CreateAssetAccessRequestErrorMessageInner`

GetExceptions returns the Exceptions field if non-nil, zero value otherwise.

### GetExceptionsOk

`func (o *CreateAssetAccessRequestResponse) GetExceptionsOk() (*[]CreateAssetAccessRequestErrorMessageInner, bool)`

GetExceptionsOk returns a tuple with the Exceptions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExceptions

`func (o *CreateAssetAccessRequestResponse) SetExceptions(v []CreateAssetAccessRequestErrorMessageInner)`

SetExceptions sets Exceptions field to given value.

### HasExceptions

`func (o *CreateAssetAccessRequestResponse) HasExceptions() bool`

HasExceptions returns a boolean if a field has been set.

### SetExceptionsNil

`func (o *CreateAssetAccessRequestResponse) SetExceptionsNil(b bool)`

 SetExceptionsNil sets the value for Exceptions to be an explicit nil

### UnsetExceptions
`func (o *CreateAssetAccessRequestResponse) UnsetExceptions()`

UnsetExceptions ensures that no value is present for Exceptions, not even an explicit nil
### GetInvites

`func (o *CreateAssetAccessRequestResponse) GetInvites() map[string]string`

GetInvites returns the Invites field if non-nil, zero value otherwise.

### GetInvitesOk

`func (o *CreateAssetAccessRequestResponse) GetInvitesOk() (*map[string]string, bool)`

GetInvitesOk returns a tuple with the Invites field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInvites

`func (o *CreateAssetAccessRequestResponse) SetInvites(v map[string]string)`

SetInvites sets Invites field to given value.

### HasInvites

`func (o *CreateAssetAccessRequestResponse) HasInvites() bool`

HasInvites returns a boolean if a field has been set.

### SetInvitesNil

`func (o *CreateAssetAccessRequestResponse) SetInvitesNil(b bool)`

 SetInvitesNil sets the value for Invites to be an explicit nil

### UnsetInvites
`func (o *CreateAssetAccessRequestResponse) UnsetInvites()`

UnsetInvites ensures that no value is present for Invites, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


