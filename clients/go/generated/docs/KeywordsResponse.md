# KeywordsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Errors** | Pointer to [**[]KeywordError**](KeywordError.md) |  | [optional] 
**Keywords** | Pointer to [**[]Keyword**](Keyword.md) |  | [optional] 

## Methods

### NewKeywordsResponse

`func NewKeywordsResponse() *KeywordsResponse`

NewKeywordsResponse instantiates a new KeywordsResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewKeywordsResponseWithDefaults

`func NewKeywordsResponseWithDefaults() *KeywordsResponse`

NewKeywordsResponseWithDefaults instantiates a new KeywordsResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetErrors

`func (o *KeywordsResponse) GetErrors() []KeywordError`

GetErrors returns the Errors field if non-nil, zero value otherwise.

### GetErrorsOk

`func (o *KeywordsResponse) GetErrorsOk() (*[]KeywordError, bool)`

GetErrorsOk returns a tuple with the Errors field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetErrors

`func (o *KeywordsResponse) SetErrors(v []KeywordError)`

SetErrors sets Errors field to given value.

### HasErrors

`func (o *KeywordsResponse) HasErrors() bool`

HasErrors returns a boolean if a field has been set.

### GetKeywords

`func (o *KeywordsResponse) GetKeywords() []Keyword`

GetKeywords returns the Keywords field if non-nil, zero value otherwise.

### GetKeywordsOk

`func (o *KeywordsResponse) GetKeywordsOk() (*[]Keyword, bool)`

GetKeywordsOk returns a tuple with the Keywords field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKeywords

`func (o *KeywordsResponse) SetKeywords(v []Keyword)`

SetKeywords sets Keywords field to given value.

### HasKeywords

`func (o *KeywordsResponse) HasKeywords() bool`

HasKeywords returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


