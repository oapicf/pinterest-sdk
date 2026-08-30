# FollowUserCreate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AutoFollow** | Pointer to **bool** |   Whether this request comes as result of auto-follow after clicking on a link.   Follow links can be used by partners on their site or in emails.   Only selected partners can be followed this way. We verify that partner can be auto-followed. | [optional] 

## Methods

### NewFollowUserCreate

`func NewFollowUserCreate() *FollowUserCreate`

NewFollowUserCreate instantiates a new FollowUserCreate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFollowUserCreateWithDefaults

`func NewFollowUserCreateWithDefaults() *FollowUserCreate`

NewFollowUserCreateWithDefaults instantiates a new FollowUserCreate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAutoFollow

`func (o *FollowUserCreate) GetAutoFollow() bool`

GetAutoFollow returns the AutoFollow field if non-nil, zero value otherwise.

### GetAutoFollowOk

`func (o *FollowUserCreate) GetAutoFollowOk() (*bool, bool)`

GetAutoFollowOk returns a tuple with the AutoFollow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAutoFollow

`func (o *FollowUserCreate) SetAutoFollow(v bool)`

SetAutoFollow sets AutoFollow field to given value.

### HasAutoFollow

`func (o *FollowUserCreate) HasAutoFollow() bool`

HasAutoFollow returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


