# CreateInvitesResultsResponseArray

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | Pointer to [**[]CreateInvitesResultsResponseArrayItemsInner**](CreateInvitesResultsResponseArrayItemsInner.md) | List of invite/request creation status. If there is an error, an exception object will be returned. If the action was successfully completed, an invite object will be returned. | [optional] 

## Methods

### NewCreateInvitesResultsResponseArray

`func NewCreateInvitesResultsResponseArray() *CreateInvitesResultsResponseArray`

NewCreateInvitesResultsResponseArray instantiates a new CreateInvitesResultsResponseArray object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateInvitesResultsResponseArrayWithDefaults

`func NewCreateInvitesResultsResponseArrayWithDefaults() *CreateInvitesResultsResponseArray`

NewCreateInvitesResultsResponseArrayWithDefaults instantiates a new CreateInvitesResultsResponseArray object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetItems

`func (o *CreateInvitesResultsResponseArray) GetItems() []CreateInvitesResultsResponseArrayItemsInner`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *CreateInvitesResultsResponseArray) GetItemsOk() (*[]CreateInvitesResultsResponseArrayItemsInner, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *CreateInvitesResultsResponseArray) SetItems(v []CreateInvitesResultsResponseArrayItemsInner)`

SetItems sets Items field to given value.

### HasItems

`func (o *CreateInvitesResultsResponseArray) HasItems() bool`

HasItems returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


