# KeywordsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Keywords** | [**[]KeywordsCommon**](KeywordsCommon.md) | Keyword JSON array. Each array element has 3 fields | 
**ParentId** | **string** | Keyword parent entity ID (advertiser, campaign, ad group). | 

## Methods

### NewKeywordsRequest

`func NewKeywordsRequest(keywords []KeywordsCommon, parentId string, ) *KeywordsRequest`

NewKeywordsRequest instantiates a new KeywordsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewKeywordsRequestWithDefaults

`func NewKeywordsRequestWithDefaults() *KeywordsRequest`

NewKeywordsRequestWithDefaults instantiates a new KeywordsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetKeywords

`func (o *KeywordsRequest) GetKeywords() []KeywordsCommon`

GetKeywords returns the Keywords field if non-nil, zero value otherwise.

### GetKeywordsOk

`func (o *KeywordsRequest) GetKeywordsOk() (*[]KeywordsCommon, bool)`

GetKeywordsOk returns a tuple with the Keywords field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKeywords

`func (o *KeywordsRequest) SetKeywords(v []KeywordsCommon)`

SetKeywords sets Keywords field to given value.


### GetParentId

`func (o *KeywordsRequest) GetParentId() string`

GetParentId returns the ParentId field if non-nil, zero value otherwise.

### GetParentIdOk

`func (o *KeywordsRequest) GetParentIdOk() (*string, bool)`

GetParentIdOk returns a tuple with the ParentId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParentId

`func (o *KeywordsRequest) SetParentId(v string)`

SetParentId sets ParentId field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


