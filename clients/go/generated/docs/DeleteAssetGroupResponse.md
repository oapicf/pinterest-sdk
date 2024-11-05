# DeleteAssetGroupResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DeletedAssetGroups** | Pointer to **[]string** | A list of ids of successfully deleted asset groups. | [optional] 
**Exceptions** | Pointer to [**[]DeleteAssetGroupResponseExceptionsInner**](DeleteAssetGroupResponseExceptionsInner.md) | A list of errors associated with the asset groups. Will be returned if there is an error. | [optional] 

## Methods

### NewDeleteAssetGroupResponse

`func NewDeleteAssetGroupResponse() *DeleteAssetGroupResponse`

NewDeleteAssetGroupResponse instantiates a new DeleteAssetGroupResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewDeleteAssetGroupResponseWithDefaults

`func NewDeleteAssetGroupResponseWithDefaults() *DeleteAssetGroupResponse`

NewDeleteAssetGroupResponseWithDefaults instantiates a new DeleteAssetGroupResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDeletedAssetGroups

`func (o *DeleteAssetGroupResponse) GetDeletedAssetGroups() []string`

GetDeletedAssetGroups returns the DeletedAssetGroups field if non-nil, zero value otherwise.

### GetDeletedAssetGroupsOk

`func (o *DeleteAssetGroupResponse) GetDeletedAssetGroupsOk() (*[]string, bool)`

GetDeletedAssetGroupsOk returns a tuple with the DeletedAssetGroups field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeletedAssetGroups

`func (o *DeleteAssetGroupResponse) SetDeletedAssetGroups(v []string)`

SetDeletedAssetGroups sets DeletedAssetGroups field to given value.

### HasDeletedAssetGroups

`func (o *DeleteAssetGroupResponse) HasDeletedAssetGroups() bool`

HasDeletedAssetGroups returns a boolean if a field has been set.

### GetExceptions

`func (o *DeleteAssetGroupResponse) GetExceptions() []DeleteAssetGroupResponseExceptionsInner`

GetExceptions returns the Exceptions field if non-nil, zero value otherwise.

### GetExceptionsOk

`func (o *DeleteAssetGroupResponse) GetExceptionsOk() (*[]DeleteAssetGroupResponseExceptionsInner, bool)`

GetExceptionsOk returns a tuple with the Exceptions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExceptions

`func (o *DeleteAssetGroupResponse) SetExceptions(v []DeleteAssetGroupResponseExceptionsInner)`

SetExceptions sets Exceptions field to given value.

### HasExceptions

`func (o *DeleteAssetGroupResponse) HasExceptions() bool`

HasExceptions returns a boolean if a field has been set.

### SetExceptionsNil

`func (o *DeleteAssetGroupResponse) SetExceptionsNil(b bool)`

 SetExceptionsNil sets the value for Exceptions to be an explicit nil

### UnsetExceptions
`func (o *DeleteAssetGroupResponse) UnsetExceptions()`

UnsetExceptions ensures that no value is present for Exceptions, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


