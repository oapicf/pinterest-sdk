# KeywordUpdateItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Archived** | Pointer to **bool** |  | [optional] 
**Bid** | Pointer to **NullableInt32** | **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. | [optional] 
**Id** | **string** | Keyword ID . | 

## Methods

### NewKeywordUpdateItem

`func NewKeywordUpdateItem(id string, ) *KeywordUpdateItem`

NewKeywordUpdateItem instantiates a new KeywordUpdateItem object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewKeywordUpdateItemWithDefaults

`func NewKeywordUpdateItemWithDefaults() *KeywordUpdateItem`

NewKeywordUpdateItemWithDefaults instantiates a new KeywordUpdateItem object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetArchived

`func (o *KeywordUpdateItem) GetArchived() bool`

GetArchived returns the Archived field if non-nil, zero value otherwise.

### GetArchivedOk

`func (o *KeywordUpdateItem) GetArchivedOk() (*bool, bool)`

GetArchivedOk returns a tuple with the Archived field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetArchived

`func (o *KeywordUpdateItem) SetArchived(v bool)`

SetArchived sets Archived field to given value.

### HasArchived

`func (o *KeywordUpdateItem) HasArchived() bool`

HasArchived returns a boolean if a field has been set.

### GetBid

`func (o *KeywordUpdateItem) GetBid() int32`

GetBid returns the Bid field if non-nil, zero value otherwise.

### GetBidOk

`func (o *KeywordUpdateItem) GetBidOk() (*int32, bool)`

GetBidOk returns a tuple with the Bid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBid

`func (o *KeywordUpdateItem) SetBid(v int32)`

SetBid sets Bid field to given value.

### HasBid

`func (o *KeywordUpdateItem) HasBid() bool`

HasBid returns a boolean if a field has been set.

### SetBidNil

`func (o *KeywordUpdateItem) SetBidNil(b bool)`

 SetBidNil sets the value for Bid to be an explicit nil

### UnsetBid
`func (o *KeywordUpdateItem) UnsetBid()`

UnsetBid ensures that no value is present for Bid, not even an explicit nil
### GetId

`func (o *KeywordUpdateItem) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *KeywordUpdateItem) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *KeywordUpdateItem) SetId(v string)`

SetId sets Id field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


