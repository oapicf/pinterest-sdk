# DeleteInvitesResultsResponseArray

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | Pointer to [**[]DeleteInvitesResultsResponseArrayItemsInner**](DeleteInvitesResultsResponseArrayItemsInner.md) | List of invite/Request deletion status. If there is an error, an exception object will be returned. If the invite/request was successfully cancelled, an invite object will be returned for the invite that was cancelled. | [optional] 

## Methods

### NewDeleteInvitesResultsResponseArray

`func NewDeleteInvitesResultsResponseArray() *DeleteInvitesResultsResponseArray`

NewDeleteInvitesResultsResponseArray instantiates a new DeleteInvitesResultsResponseArray object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewDeleteInvitesResultsResponseArrayWithDefaults

`func NewDeleteInvitesResultsResponseArrayWithDefaults() *DeleteInvitesResultsResponseArray`

NewDeleteInvitesResultsResponseArrayWithDefaults instantiates a new DeleteInvitesResultsResponseArray object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetItems

`func (o *DeleteInvitesResultsResponseArray) GetItems() []DeleteInvitesResultsResponseArrayItemsInner`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *DeleteInvitesResultsResponseArray) GetItemsOk() (*[]DeleteInvitesResultsResponseArrayItemsInner, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *DeleteInvitesResultsResponseArray) SetItems(v []DeleteInvitesResultsResponseArrayItemsInner)`

SetItems sets Items field to given value.

### HasItems

`func (o *DeleteInvitesResultsResponseArray) HasItems() bool`

HasItems returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


