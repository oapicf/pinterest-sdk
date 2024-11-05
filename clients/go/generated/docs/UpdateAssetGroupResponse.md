# UpdateAssetGroupResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**UpdatedAssetGroups** | Pointer to [**[]AssetGroupBinding**](AssetGroupBinding.md) | A list of successfully edited asset groups. | [optional] 
**Exceptions** | Pointer to [**[]UpdateAssetGroupResponseExceptionsInner**](UpdateAssetGroupResponseExceptionsInner.md) | A list of errors associated with the asset groups. Will be returned if there is an error. | [optional] 

## Methods

### NewUpdateAssetGroupResponse

`func NewUpdateAssetGroupResponse() *UpdateAssetGroupResponse`

NewUpdateAssetGroupResponse instantiates a new UpdateAssetGroupResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUpdateAssetGroupResponseWithDefaults

`func NewUpdateAssetGroupResponseWithDefaults() *UpdateAssetGroupResponse`

NewUpdateAssetGroupResponseWithDefaults instantiates a new UpdateAssetGroupResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetUpdatedAssetGroups

`func (o *UpdateAssetGroupResponse) GetUpdatedAssetGroups() []AssetGroupBinding`

GetUpdatedAssetGroups returns the UpdatedAssetGroups field if non-nil, zero value otherwise.

### GetUpdatedAssetGroupsOk

`func (o *UpdateAssetGroupResponse) GetUpdatedAssetGroupsOk() (*[]AssetGroupBinding, bool)`

GetUpdatedAssetGroupsOk returns a tuple with the UpdatedAssetGroups field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedAssetGroups

`func (o *UpdateAssetGroupResponse) SetUpdatedAssetGroups(v []AssetGroupBinding)`

SetUpdatedAssetGroups sets UpdatedAssetGroups field to given value.

### HasUpdatedAssetGroups

`func (o *UpdateAssetGroupResponse) HasUpdatedAssetGroups() bool`

HasUpdatedAssetGroups returns a boolean if a field has been set.

### GetExceptions

`func (o *UpdateAssetGroupResponse) GetExceptions() []UpdateAssetGroupResponseExceptionsInner`

GetExceptions returns the Exceptions field if non-nil, zero value otherwise.

### GetExceptionsOk

`func (o *UpdateAssetGroupResponse) GetExceptionsOk() (*[]UpdateAssetGroupResponseExceptionsInner, bool)`

GetExceptionsOk returns a tuple with the Exceptions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExceptions

`func (o *UpdateAssetGroupResponse) SetExceptions(v []UpdateAssetGroupResponseExceptionsInner)`

SetExceptions sets Exceptions field to given value.

### HasExceptions

`func (o *UpdateAssetGroupResponse) HasExceptions() bool`

HasExceptions returns a boolean if a field has been set.

### SetExceptionsNil

`func (o *UpdateAssetGroupResponse) SetExceptionsNil(b bool)`

 SetExceptionsNil sets the value for Exceptions to be an explicit nil

### UnsetExceptions
`func (o *UpdateAssetGroupResponse) UnsetExceptions()`

UnsetExceptions ensures that no value is present for Exceptions, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


