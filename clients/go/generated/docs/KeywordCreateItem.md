# KeywordCreateItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Bid** | Pointer to **NullableInt32** | **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. | [optional] 
**MatchType** | [**NullableMatchType**](MatchType.md) | Keyword [match type](/docs/api-features/targeting-overview/) | 
**Value** | **string** | Keyword value (120 chars max). | 

## Methods

### NewKeywordCreateItem

`func NewKeywordCreateItem(matchType NullableMatchType, value string, ) *KeywordCreateItem`

NewKeywordCreateItem instantiates a new KeywordCreateItem object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewKeywordCreateItemWithDefaults

`func NewKeywordCreateItemWithDefaults() *KeywordCreateItem`

NewKeywordCreateItemWithDefaults instantiates a new KeywordCreateItem object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBid

`func (o *KeywordCreateItem) GetBid() int32`

GetBid returns the Bid field if non-nil, zero value otherwise.

### GetBidOk

`func (o *KeywordCreateItem) GetBidOk() (*int32, bool)`

GetBidOk returns a tuple with the Bid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBid

`func (o *KeywordCreateItem) SetBid(v int32)`

SetBid sets Bid field to given value.

### HasBid

`func (o *KeywordCreateItem) HasBid() bool`

HasBid returns a boolean if a field has been set.

### SetBidNil

`func (o *KeywordCreateItem) SetBidNil(b bool)`

 SetBidNil sets the value for Bid to be an explicit nil

### UnsetBid
`func (o *KeywordCreateItem) UnsetBid()`

UnsetBid ensures that no value is present for Bid, not even an explicit nil
### GetMatchType

`func (o *KeywordCreateItem) GetMatchType() MatchType`

GetMatchType returns the MatchType field if non-nil, zero value otherwise.

### GetMatchTypeOk

`func (o *KeywordCreateItem) GetMatchTypeOk() (*MatchType, bool)`

GetMatchTypeOk returns a tuple with the MatchType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMatchType

`func (o *KeywordCreateItem) SetMatchType(v MatchType)`

SetMatchType sets MatchType field to given value.


### SetMatchTypeNil

`func (o *KeywordCreateItem) SetMatchTypeNil(b bool)`

 SetMatchTypeNil sets the value for MatchType to be an explicit nil

### UnsetMatchType
`func (o *KeywordCreateItem) UnsetMatchType()`

UnsetMatchType ensures that no value is present for MatchType, not even an explicit nil
### GetValue

`func (o *KeywordCreateItem) GetValue() string`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *KeywordCreateItem) GetValueOk() (*string, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *KeywordCreateItem) SetValue(v string)`

SetValue sets Value field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


