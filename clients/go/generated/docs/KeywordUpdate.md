# KeywordUpdate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Keyword ID. | 
**Archived** | Pointer to **bool** | Is keyword archived? | [optional] 
**Bid** | Pointer to **NullableInt32** | Keyword custom bid in microcurrency - null if inherited from parent ad group. | [optional] 

## Methods

### NewKeywordUpdate

`func NewKeywordUpdate(id string, ) *KeywordUpdate`

NewKeywordUpdate instantiates a new KeywordUpdate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewKeywordUpdateWithDefaults

`func NewKeywordUpdateWithDefaults() *KeywordUpdate`

NewKeywordUpdateWithDefaults instantiates a new KeywordUpdate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *KeywordUpdate) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *KeywordUpdate) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *KeywordUpdate) SetId(v string)`

SetId sets Id field to given value.


### GetArchived

`func (o *KeywordUpdate) GetArchived() bool`

GetArchived returns the Archived field if non-nil, zero value otherwise.

### GetArchivedOk

`func (o *KeywordUpdate) GetArchivedOk() (*bool, bool)`

GetArchivedOk returns a tuple with the Archived field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetArchived

`func (o *KeywordUpdate) SetArchived(v bool)`

SetArchived sets Archived field to given value.

### HasArchived

`func (o *KeywordUpdate) HasArchived() bool`

HasArchived returns a boolean if a field has been set.

### GetBid

`func (o *KeywordUpdate) GetBid() int32`

GetBid returns the Bid field if non-nil, zero value otherwise.

### GetBidOk

`func (o *KeywordUpdate) GetBidOk() (*int32, bool)`

GetBidOk returns a tuple with the Bid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBid

`func (o *KeywordUpdate) SetBid(v int32)`

SetBid sets Bid field to given value.

### HasBid

`func (o *KeywordUpdate) HasBid() bool`

HasBid returns a boolean if a field has been set.

### SetBidNil

`func (o *KeywordUpdate) SetBidNil(b bool)`

 SetBidNil sets the value for Bid to be an explicit nil

### UnsetBid
`func (o *KeywordUpdate) UnsetBid()`

UnsetBid ensures that no value is present for Bid, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


