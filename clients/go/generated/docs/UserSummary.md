# UserSummary

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Username** | Pointer to **string** | Username | [optional] 
**Type** | Pointer to **string** | Always \&quot;user\&quot; | [optional] 

## Methods

### NewUserSummary

`func NewUserSummary() *UserSummary`

NewUserSummary instantiates a new UserSummary object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUserSummaryWithDefaults

`func NewUserSummaryWithDefaults() *UserSummary`

NewUserSummaryWithDefaults instantiates a new UserSummary object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetUsername

`func (o *UserSummary) GetUsername() string`

GetUsername returns the Username field if non-nil, zero value otherwise.

### GetUsernameOk

`func (o *UserSummary) GetUsernameOk() (*string, bool)`

GetUsernameOk returns a tuple with the Username field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsername

`func (o *UserSummary) SetUsername(v string)`

SetUsername sets Username field to given value.

### HasUsername

`func (o *UserSummary) HasUsername() bool`

HasUsername returns a boolean if a field has been set.

### GetType

`func (o *UserSummary) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *UserSummary) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *UserSummary) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *UserSummary) HasType() bool`

HasType returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


