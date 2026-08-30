# CreateAssetAccessRequestResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Exceptions** | Pointer to [**[]AssetAccessRequestError**](AssetAccessRequestError.md) | A list of errors associated with the asset access requests. Will be returned if there is an error. | [optional] 
**Invites** | Pointer to **map[string]string** | An object mapping each partner id to the asset access request id. Only one request id is returned per partner. | [optional] 

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

`func (o *CreateAssetAccessRequestResponse) GetExceptions() []AssetAccessRequestError`

GetExceptions returns the Exceptions field if non-nil, zero value otherwise.

### GetExceptionsOk

`func (o *CreateAssetAccessRequestResponse) GetExceptionsOk() (*[]AssetAccessRequestError, bool)`

GetExceptionsOk returns a tuple with the Exceptions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExceptions

`func (o *CreateAssetAccessRequestResponse) SetExceptions(v []AssetAccessRequestError)`

SetExceptions sets Exceptions field to given value.

### HasExceptions

`func (o *CreateAssetAccessRequestResponse) HasExceptions() bool`

HasExceptions returns a boolean if a field has been set.

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


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


