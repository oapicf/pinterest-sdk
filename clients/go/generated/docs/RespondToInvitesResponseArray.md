# RespondToInvitesResponseArray

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | Pointer to [**[]RespondToInvitesResponseArrayItemsInner**](RespondToInvitesResponseArrayItemsInner.md) | List of invite/request accept/decline status. If there is an error, an exception object will be returned. If the invite/request was successfully accepted/declined, an invite object will be returned. | [optional] 

## Methods

### NewRespondToInvitesResponseArray

`func NewRespondToInvitesResponseArray() *RespondToInvitesResponseArray`

NewRespondToInvitesResponseArray instantiates a new RespondToInvitesResponseArray object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRespondToInvitesResponseArrayWithDefaults

`func NewRespondToInvitesResponseArrayWithDefaults() *RespondToInvitesResponseArray`

NewRespondToInvitesResponseArrayWithDefaults instantiates a new RespondToInvitesResponseArray object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetItems

`func (o *RespondToInvitesResponseArray) GetItems() []RespondToInvitesResponseArrayItemsInner`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *RespondToInvitesResponseArray) GetItemsOk() (*[]RespondToInvitesResponseArrayItemsInner, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *RespondToInvitesResponseArray) SetItems(v []RespondToInvitesResponseArrayItemsInner)`

SetItems sets Items field to given value.

### HasItems

`func (o *RespondToInvitesResponseArray) HasItems() bool`

HasItems returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


