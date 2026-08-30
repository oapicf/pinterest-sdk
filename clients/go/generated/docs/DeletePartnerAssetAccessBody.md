# DeletePartnerAssetAccessBody

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Accesses** | [**[]DeletePartnerAssetAccessItem**](DeletePartnerAssetAccessItem.md) | List of partner asset accesses to delete. | 

## Methods

### NewDeletePartnerAssetAccessBody

`func NewDeletePartnerAssetAccessBody(accesses []DeletePartnerAssetAccessItem, ) *DeletePartnerAssetAccessBody`

NewDeletePartnerAssetAccessBody instantiates a new DeletePartnerAssetAccessBody object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewDeletePartnerAssetAccessBodyWithDefaults

`func NewDeletePartnerAssetAccessBodyWithDefaults() *DeletePartnerAssetAccessBody`

NewDeletePartnerAssetAccessBodyWithDefaults instantiates a new DeletePartnerAssetAccessBody object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAccesses

`func (o *DeletePartnerAssetAccessBody) GetAccesses() []DeletePartnerAssetAccessItem`

GetAccesses returns the Accesses field if non-nil, zero value otherwise.

### GetAccessesOk

`func (o *DeletePartnerAssetAccessBody) GetAccessesOk() (*[]DeletePartnerAssetAccessItem, bool)`

GetAccessesOk returns a tuple with the Accesses field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccesses

`func (o *DeletePartnerAssetAccessBody) SetAccesses(v []DeletePartnerAssetAccessItem)`

SetAccesses sets Accesses field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


