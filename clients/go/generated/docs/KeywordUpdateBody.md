# KeywordUpdateBody

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Keywords** | [**[]KeywordUpdate**](KeywordUpdate.md) | Keywords to update. Object array. Each object has 3 possible fields:&lt;br&gt;1. \&quot;id\&quot;: (required) keyword ID&lt;br&gt;2. \&quot;archived\&quot;: boolean. Should keyword be archived?&lt;br&gt;3. \&quot;bid\&quot;: number&lt;br&gt;For example: [{\&quot;id\&quot;:\&quot;2886610576653\&quot;, \&quot;archived\&quot;: false, \&quot;bid\&quot;: 20000}, {\&quot;id\&quot;:\&quot;2886610576654\&quot;,  \&quot;archived\&quot;: true, \&quot;bid\&quot;: 20000}, ...] | 

## Methods

### NewKeywordUpdateBody

`func NewKeywordUpdateBody(keywords []KeywordUpdate, ) *KeywordUpdateBody`

NewKeywordUpdateBody instantiates a new KeywordUpdateBody object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewKeywordUpdateBodyWithDefaults

`func NewKeywordUpdateBodyWithDefaults() *KeywordUpdateBody`

NewKeywordUpdateBodyWithDefaults instantiates a new KeywordUpdateBody object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetKeywords

`func (o *KeywordUpdateBody) GetKeywords() []KeywordUpdate`

GetKeywords returns the Keywords field if non-nil, zero value otherwise.

### GetKeywordsOk

`func (o *KeywordUpdateBody) GetKeywordsOk() (*[]KeywordUpdate, bool)`

GetKeywordsOk returns a tuple with the Keywords field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKeywords

`func (o *KeywordUpdateBody) SetKeywords(v []KeywordUpdate)`

SetKeywords sets Keywords field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


