# UpdateInvitesResultsResponseArray

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | Pointer to [**[]InviteActionResultItem**](InviteActionResultItem.md) | List of invite/Request action status. If there is an error, an exception object will be returned. If the action was successfully completed, an invite object will be returned. | [optional] 

## Methods

### NewUpdateInvitesResultsResponseArray

`func NewUpdateInvitesResultsResponseArray() *UpdateInvitesResultsResponseArray`

NewUpdateInvitesResultsResponseArray instantiates a new UpdateInvitesResultsResponseArray object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUpdateInvitesResultsResponseArrayWithDefaults

`func NewUpdateInvitesResultsResponseArrayWithDefaults() *UpdateInvitesResultsResponseArray`

NewUpdateInvitesResultsResponseArrayWithDefaults instantiates a new UpdateInvitesResultsResponseArray object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetItems

`func (o *UpdateInvitesResultsResponseArray) GetItems() []InviteActionResultItem`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *UpdateInvitesResultsResponseArray) GetItemsOk() (*[]InviteActionResultItem, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *UpdateInvitesResultsResponseArray) SetItems(v []InviteActionResultItem)`

SetItems sets Items field to given value.

### HasItems

`func (o *UpdateInvitesResultsResponseArray) HasItems() bool`

HasItems returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


