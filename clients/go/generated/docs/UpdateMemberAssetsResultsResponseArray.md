# UpdateMemberAssetsResultsResponseArray

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | Pointer to [**[]UpdateMemberAssetsResultsResponseArrayItemsInner**](UpdateMemberAssetsResultsResponseArrayItemsInner.md) | List of assigned/updated member asset access. If there is an error, an exception object will be returned. If the action was successfully completed, a response object will be returned. | [optional] 

## Methods

### NewUpdateMemberAssetsResultsResponseArray

`func NewUpdateMemberAssetsResultsResponseArray() *UpdateMemberAssetsResultsResponseArray`

NewUpdateMemberAssetsResultsResponseArray instantiates a new UpdateMemberAssetsResultsResponseArray object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUpdateMemberAssetsResultsResponseArrayWithDefaults

`func NewUpdateMemberAssetsResultsResponseArrayWithDefaults() *UpdateMemberAssetsResultsResponseArray`

NewUpdateMemberAssetsResultsResponseArrayWithDefaults instantiates a new UpdateMemberAssetsResultsResponseArray object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetItems

`func (o *UpdateMemberAssetsResultsResponseArray) GetItems() []UpdateMemberAssetsResultsResponseArrayItemsInner`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *UpdateMemberAssetsResultsResponseArray) GetItemsOk() (*[]UpdateMemberAssetsResultsResponseArrayItemsInner, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *UpdateMemberAssetsResultsResponseArray) SetItems(v []UpdateMemberAssetsResultsResponseArrayItemsInner)`

SetItems sets Items field to given value.

### HasItems

`func (o *UpdateMemberAssetsResultsResponseArray) HasItems() bool`

HasItems returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


