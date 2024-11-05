# KeywordsCommon

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Bid** | Pointer to **NullableInt32** | &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. | [optional] 
**MatchType** | [**NullableMatchTypeResponse**](MatchTypeResponse.md) |  | 
**Value** | **string** | Keyword value (120 chars max). | 

## Methods

### NewKeywordsCommon

`func NewKeywordsCommon(matchType NullableMatchTypeResponse, value string, ) *KeywordsCommon`

NewKeywordsCommon instantiates a new KeywordsCommon object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewKeywordsCommonWithDefaults

`func NewKeywordsCommonWithDefaults() *KeywordsCommon`

NewKeywordsCommonWithDefaults instantiates a new KeywordsCommon object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBid

`func (o *KeywordsCommon) GetBid() int32`

GetBid returns the Bid field if non-nil, zero value otherwise.

### GetBidOk

`func (o *KeywordsCommon) GetBidOk() (*int32, bool)`

GetBidOk returns a tuple with the Bid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBid

`func (o *KeywordsCommon) SetBid(v int32)`

SetBid sets Bid field to given value.

### HasBid

`func (o *KeywordsCommon) HasBid() bool`

HasBid returns a boolean if a field has been set.

### SetBidNil

`func (o *KeywordsCommon) SetBidNil(b bool)`

 SetBidNil sets the value for Bid to be an explicit nil

### UnsetBid
`func (o *KeywordsCommon) UnsetBid()`

UnsetBid ensures that no value is present for Bid, not even an explicit nil
### GetMatchType

`func (o *KeywordsCommon) GetMatchType() MatchTypeResponse`

GetMatchType returns the MatchType field if non-nil, zero value otherwise.

### GetMatchTypeOk

`func (o *KeywordsCommon) GetMatchTypeOk() (*MatchTypeResponse, bool)`

GetMatchTypeOk returns a tuple with the MatchType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMatchType

`func (o *KeywordsCommon) SetMatchType(v MatchTypeResponse)`

SetMatchType sets MatchType field to given value.


### SetMatchTypeNil

`func (o *KeywordsCommon) SetMatchTypeNil(b bool)`

 SetMatchTypeNil sets the value for MatchType to be an explicit nil

### UnsetMatchType
`func (o *KeywordsCommon) UnsetMatchType()`

UnsetMatchType ensures that no value is present for MatchType, not even an explicit nil
### GetValue

`func (o *KeywordsCommon) GetValue() string`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *KeywordsCommon) GetValueOk() (*string, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *KeywordsCommon) SetValue(v string)`

SetValue sets Value field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


