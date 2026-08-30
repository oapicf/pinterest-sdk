# UpdateMemberAssetAccessBody

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Accesses** | [**[]UpdateMemberAssetAccessItem**](UpdateMemberAssetAccessItem.md) | List of member asset accesses to assign or update. | 

## Methods

### NewUpdateMemberAssetAccessBody

`func NewUpdateMemberAssetAccessBody(accesses []UpdateMemberAssetAccessItem, ) *UpdateMemberAssetAccessBody`

NewUpdateMemberAssetAccessBody instantiates a new UpdateMemberAssetAccessBody object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUpdateMemberAssetAccessBodyWithDefaults

`func NewUpdateMemberAssetAccessBodyWithDefaults() *UpdateMemberAssetAccessBody`

NewUpdateMemberAssetAccessBodyWithDefaults instantiates a new UpdateMemberAssetAccessBody object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAccesses

`func (o *UpdateMemberAssetAccessBody) GetAccesses() []UpdateMemberAssetAccessItem`

GetAccesses returns the Accesses field if non-nil, zero value otherwise.

### GetAccessesOk

`func (o *UpdateMemberAssetAccessBody) GetAccessesOk() (*[]UpdateMemberAssetAccessItem, bool)`

GetAccessesOk returns a tuple with the Accesses field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccesses

`func (o *UpdateMemberAssetAccessBody) SetAccesses(v []UpdateMemberAssetAccessItem)`

SetAccesses sets Accesses field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


