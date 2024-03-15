# Keyword

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Archived** | Pointer to **bool** |  | [optional] 
**Id** | Pointer to **string** | Keyword ID . | [optional] 
**ParentId** | Pointer to **string** | Keyword parent entity ID (advertiser, campaign, ad group). | [optional] 
**ParentType** | Pointer to **string** | Parent entity type | [optional] 
**Type** | Pointer to **string** | Always keyword | [optional] 
**Bid** | Pointer to **NullableInt32** | Keyword custom bid in microcurrency - null if inherited from parent ad group. | [optional] 
**MatchType** | [**NullableMatchTypeResponse**](MatchTypeResponse.md) |  | 
**Value** | **string** | Keyword value (120 chars max). | 

## Methods

### NewKeyword

`func NewKeyword(matchType NullableMatchTypeResponse, value string, ) *Keyword`

NewKeyword instantiates a new Keyword object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewKeywordWithDefaults

`func NewKeywordWithDefaults() *Keyword`

NewKeywordWithDefaults instantiates a new Keyword object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetArchived

`func (o *Keyword) GetArchived() bool`

GetArchived returns the Archived field if non-nil, zero value otherwise.

### GetArchivedOk

`func (o *Keyword) GetArchivedOk() (*bool, bool)`

GetArchivedOk returns a tuple with the Archived field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetArchived

`func (o *Keyword) SetArchived(v bool)`

SetArchived sets Archived field to given value.

### HasArchived

`func (o *Keyword) HasArchived() bool`

HasArchived returns a boolean if a field has been set.

### GetId

`func (o *Keyword) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *Keyword) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *Keyword) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *Keyword) HasId() bool`

HasId returns a boolean if a field has been set.

### GetParentId

`func (o *Keyword) GetParentId() string`

GetParentId returns the ParentId field if non-nil, zero value otherwise.

### GetParentIdOk

`func (o *Keyword) GetParentIdOk() (*string, bool)`

GetParentIdOk returns a tuple with the ParentId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParentId

`func (o *Keyword) SetParentId(v string)`

SetParentId sets ParentId field to given value.

### HasParentId

`func (o *Keyword) HasParentId() bool`

HasParentId returns a boolean if a field has been set.

### GetParentType

`func (o *Keyword) GetParentType() string`

GetParentType returns the ParentType field if non-nil, zero value otherwise.

### GetParentTypeOk

`func (o *Keyword) GetParentTypeOk() (*string, bool)`

GetParentTypeOk returns a tuple with the ParentType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParentType

`func (o *Keyword) SetParentType(v string)`

SetParentType sets ParentType field to given value.

### HasParentType

`func (o *Keyword) HasParentType() bool`

HasParentType returns a boolean if a field has been set.

### GetType

`func (o *Keyword) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *Keyword) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *Keyword) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *Keyword) HasType() bool`

HasType returns a boolean if a field has been set.

### GetBid

`func (o *Keyword) GetBid() int32`

GetBid returns the Bid field if non-nil, zero value otherwise.

### GetBidOk

`func (o *Keyword) GetBidOk() (*int32, bool)`

GetBidOk returns a tuple with the Bid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBid

`func (o *Keyword) SetBid(v int32)`

SetBid sets Bid field to given value.

### HasBid

`func (o *Keyword) HasBid() bool`

HasBid returns a boolean if a field has been set.

### SetBidNil

`func (o *Keyword) SetBidNil(b bool)`

 SetBidNil sets the value for Bid to be an explicit nil

### UnsetBid
`func (o *Keyword) UnsetBid()`

UnsetBid ensures that no value is present for Bid, not even an explicit nil
### GetMatchType

`func (o *Keyword) GetMatchType() MatchTypeResponse`

GetMatchType returns the MatchType field if non-nil, zero value otherwise.

### GetMatchTypeOk

`func (o *Keyword) GetMatchTypeOk() (*MatchTypeResponse, bool)`

GetMatchTypeOk returns a tuple with the MatchType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMatchType

`func (o *Keyword) SetMatchType(v MatchTypeResponse)`

SetMatchType sets MatchType field to given value.


### SetMatchTypeNil

`func (o *Keyword) SetMatchTypeNil(b bool)`

 SetMatchTypeNil sets the value for MatchType to be an explicit nil

### UnsetMatchType
`func (o *Keyword) UnsetMatchType()`

UnsetMatchType ensures that no value is present for MatchType, not even an explicit nil
### GetValue

`func (o *Keyword) GetValue() string`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *Keyword) GetValueOk() (*string, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *Keyword) SetValue(v string)`

SetValue sets Value field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


