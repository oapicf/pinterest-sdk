# Keywords

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Errors** | [**[]KeywordError**](KeywordError.md) | Keyword error | [readonly] 
**Keywords** | [**[]Keyword**](Keyword.md) | Keywords | 

## Methods

### NewKeywords

`func NewKeywords(errors []KeywordError, keywords []Keyword, ) *Keywords`

NewKeywords instantiates a new Keywords object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewKeywordsWithDefaults

`func NewKeywordsWithDefaults() *Keywords`

NewKeywordsWithDefaults instantiates a new Keywords object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetErrors

`func (o *Keywords) GetErrors() []KeywordError`

GetErrors returns the Errors field if non-nil, zero value otherwise.

### GetErrorsOk

`func (o *Keywords) GetErrorsOk() (*[]KeywordError, bool)`

GetErrorsOk returns a tuple with the Errors field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetErrors

`func (o *Keywords) SetErrors(v []KeywordError)`

SetErrors sets Errors field to given value.


### GetKeywords

`func (o *Keywords) GetKeywords() []Keyword`

GetKeywords returns the Keywords field if non-nil, zero value otherwise.

### GetKeywordsOk

`func (o *Keywords) GetKeywordsOk() (*[]Keyword, bool)`

GetKeywordsOk returns a tuple with the Keywords field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKeywords

`func (o *Keywords) SetKeywords(v []Keyword)`

SetKeywords sets Keywords field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


