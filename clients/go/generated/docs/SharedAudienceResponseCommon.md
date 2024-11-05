# SharedAudienceResponseCommon

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AudienceId** | Pointer to **string** | Audience ID that was shared | [optional] 
**Permissions** | Pointer to [**[]Role**](Role.md) |  | [optional] 

## Methods

### NewSharedAudienceResponseCommon

`func NewSharedAudienceResponseCommon() *SharedAudienceResponseCommon`

NewSharedAudienceResponseCommon instantiates a new SharedAudienceResponseCommon object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSharedAudienceResponseCommonWithDefaults

`func NewSharedAudienceResponseCommonWithDefaults() *SharedAudienceResponseCommon`

NewSharedAudienceResponseCommonWithDefaults instantiates a new SharedAudienceResponseCommon object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAudienceId

`func (o *SharedAudienceResponseCommon) GetAudienceId() string`

GetAudienceId returns the AudienceId field if non-nil, zero value otherwise.

### GetAudienceIdOk

`func (o *SharedAudienceResponseCommon) GetAudienceIdOk() (*string, bool)`

GetAudienceIdOk returns a tuple with the AudienceId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAudienceId

`func (o *SharedAudienceResponseCommon) SetAudienceId(v string)`

SetAudienceId sets AudienceId field to given value.

### HasAudienceId

`func (o *SharedAudienceResponseCommon) HasAudienceId() bool`

HasAudienceId returns a boolean if a field has been set.

### GetPermissions

`func (o *SharedAudienceResponseCommon) GetPermissions() []Role`

GetPermissions returns the Permissions field if non-nil, zero value otherwise.

### GetPermissionsOk

`func (o *SharedAudienceResponseCommon) GetPermissionsOk() (*[]Role, bool)`

GetPermissionsOk returns a tuple with the Permissions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPermissions

`func (o *SharedAudienceResponseCommon) SetPermissions(v []Role)`

SetPermissions sets Permissions field to given value.

### HasPermissions

`func (o *SharedAudienceResponseCommon) HasPermissions() bool`

HasPermissions returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


