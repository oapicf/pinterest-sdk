# UpdateBusinessMembershipsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | Pointer to [**[]BusinessMembershipMember**](BusinessMembershipMember.md) | List of members with updated business access role. | [optional] 

## Methods

### NewUpdateBusinessMembershipsResponse

`func NewUpdateBusinessMembershipsResponse() *UpdateBusinessMembershipsResponse`

NewUpdateBusinessMembershipsResponse instantiates a new UpdateBusinessMembershipsResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUpdateBusinessMembershipsResponseWithDefaults

`func NewUpdateBusinessMembershipsResponseWithDefaults() *UpdateBusinessMembershipsResponse`

NewUpdateBusinessMembershipsResponseWithDefaults instantiates a new UpdateBusinessMembershipsResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetItems

`func (o *UpdateBusinessMembershipsResponse) GetItems() []BusinessMembershipMember`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *UpdateBusinessMembershipsResponse) GetItemsOk() (*[]BusinessMembershipMember, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *UpdateBusinessMembershipsResponse) SetItems(v []BusinessMembershipMember)`

SetItems sets Items field to given value.

### HasItems

`func (o *UpdateBusinessMembershipsResponse) HasItems() bool`

HasItems returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


