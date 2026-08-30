# KeywordsCreate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Keywords** | [**[]KeywordCreateItem**](KeywordCreateItem.md) | Keywords | 
**ParentId** | **string** | Keyword data | 

## Methods

### NewKeywordsCreate

`func NewKeywordsCreate(keywords []KeywordCreateItem, parentId string, ) *KeywordsCreate`

NewKeywordsCreate instantiates a new KeywordsCreate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewKeywordsCreateWithDefaults

`func NewKeywordsCreateWithDefaults() *KeywordsCreate`

NewKeywordsCreateWithDefaults instantiates a new KeywordsCreate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetKeywords

`func (o *KeywordsCreate) GetKeywords() []KeywordCreateItem`

GetKeywords returns the Keywords field if non-nil, zero value otherwise.

### GetKeywordsOk

`func (o *KeywordsCreate) GetKeywordsOk() (*[]KeywordCreateItem, bool)`

GetKeywordsOk returns a tuple with the Keywords field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKeywords

`func (o *KeywordsCreate) SetKeywords(v []KeywordCreateItem)`

SetKeywords sets Keywords field to given value.


### GetParentId

`func (o *KeywordsCreate) GetParentId() string`

GetParentId returns the ParentId field if non-nil, zero value otherwise.

### GetParentIdOk

`func (o *KeywordsCreate) GetParentIdOk() (*string, bool)`

GetParentIdOk returns a tuple with the ParentId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParentId

`func (o *KeywordsCreate) SetParentId(v string)`

SetParentId sets ParentId field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


