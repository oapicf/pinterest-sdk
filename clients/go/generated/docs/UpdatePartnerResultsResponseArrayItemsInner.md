# UpdatePartnerResultsResponseArrayItemsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Exception** | Pointer to [**NullableBusinessAccessError**](BusinessAccessError.md) |  | [optional] 
**MemberOrPartnerId** | Pointer to **NullableString** |  | [optional] 

## Methods

### NewUpdatePartnerResultsResponseArrayItemsInner

`func NewUpdatePartnerResultsResponseArrayItemsInner() *UpdatePartnerResultsResponseArrayItemsInner`

NewUpdatePartnerResultsResponseArrayItemsInner instantiates a new UpdatePartnerResultsResponseArrayItemsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUpdatePartnerResultsResponseArrayItemsInnerWithDefaults

`func NewUpdatePartnerResultsResponseArrayItemsInnerWithDefaults() *UpdatePartnerResultsResponseArrayItemsInner`

NewUpdatePartnerResultsResponseArrayItemsInnerWithDefaults instantiates a new UpdatePartnerResultsResponseArrayItemsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetException

`func (o *UpdatePartnerResultsResponseArrayItemsInner) GetException() BusinessAccessError`

GetException returns the Exception field if non-nil, zero value otherwise.

### GetExceptionOk

`func (o *UpdatePartnerResultsResponseArrayItemsInner) GetExceptionOk() (*BusinessAccessError, bool)`

GetExceptionOk returns a tuple with the Exception field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetException

`func (o *UpdatePartnerResultsResponseArrayItemsInner) SetException(v BusinessAccessError)`

SetException sets Exception field to given value.

### HasException

`func (o *UpdatePartnerResultsResponseArrayItemsInner) HasException() bool`

HasException returns a boolean if a field has been set.

### SetExceptionNil

`func (o *UpdatePartnerResultsResponseArrayItemsInner) SetExceptionNil(b bool)`

 SetExceptionNil sets the value for Exception to be an explicit nil

### UnsetException
`func (o *UpdatePartnerResultsResponseArrayItemsInner) UnsetException()`

UnsetException ensures that no value is present for Exception, not even an explicit nil
### GetMemberOrPartnerId

`func (o *UpdatePartnerResultsResponseArrayItemsInner) GetMemberOrPartnerId() string`

GetMemberOrPartnerId returns the MemberOrPartnerId field if non-nil, zero value otherwise.

### GetMemberOrPartnerIdOk

`func (o *UpdatePartnerResultsResponseArrayItemsInner) GetMemberOrPartnerIdOk() (*string, bool)`

GetMemberOrPartnerIdOk returns a tuple with the MemberOrPartnerId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMemberOrPartnerId

`func (o *UpdatePartnerResultsResponseArrayItemsInner) SetMemberOrPartnerId(v string)`

SetMemberOrPartnerId sets MemberOrPartnerId field to given value.

### HasMemberOrPartnerId

`func (o *UpdatePartnerResultsResponseArrayItemsInner) HasMemberOrPartnerId() bool`

HasMemberOrPartnerId returns a boolean if a field has been set.

### SetMemberOrPartnerIdNil

`func (o *UpdatePartnerResultsResponseArrayItemsInner) SetMemberOrPartnerIdNil(b bool)`

 SetMemberOrPartnerIdNil sets the value for MemberOrPartnerId to be an explicit nil

### UnsetMemberOrPartnerId
`func (o *UpdatePartnerResultsResponseArrayItemsInner) UnsetMemberOrPartnerId()`

UnsetMemberOrPartnerId ensures that no value is present for MemberOrPartnerId, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


