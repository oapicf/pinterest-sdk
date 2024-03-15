# RelatedTerms

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **string** | First input term. For example, if you pass \&quot;?terms&#x3D;clothes,workout\&quot;, then id will be \&quot;clothes\&quot; | [optional] 
**RelatedTermCount** | Pointer to **int32** | Total number of related terms returned | [optional] 
**RelatedTermsList** | Pointer to [**[]RelatedTermsRelatedTermsListInner**](RelatedTermsRelatedTermsListInner.md) | The id of the advertiser. | [optional] 

## Methods

### NewRelatedTerms

`func NewRelatedTerms() *RelatedTerms`

NewRelatedTerms instantiates a new RelatedTerms object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRelatedTermsWithDefaults

`func NewRelatedTermsWithDefaults() *RelatedTerms`

NewRelatedTermsWithDefaults instantiates a new RelatedTerms object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *RelatedTerms) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *RelatedTerms) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *RelatedTerms) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *RelatedTerms) HasId() bool`

HasId returns a boolean if a field has been set.

### GetRelatedTermCount

`func (o *RelatedTerms) GetRelatedTermCount() int32`

GetRelatedTermCount returns the RelatedTermCount field if non-nil, zero value otherwise.

### GetRelatedTermCountOk

`func (o *RelatedTerms) GetRelatedTermCountOk() (*int32, bool)`

GetRelatedTermCountOk returns a tuple with the RelatedTermCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRelatedTermCount

`func (o *RelatedTerms) SetRelatedTermCount(v int32)`

SetRelatedTermCount sets RelatedTermCount field to given value.

### HasRelatedTermCount

`func (o *RelatedTerms) HasRelatedTermCount() bool`

HasRelatedTermCount returns a boolean if a field has been set.

### GetRelatedTermsList

`func (o *RelatedTerms) GetRelatedTermsList() []RelatedTermsRelatedTermsListInner`

GetRelatedTermsList returns the RelatedTermsList field if non-nil, zero value otherwise.

### GetRelatedTermsListOk

`func (o *RelatedTerms) GetRelatedTermsListOk() (*[]RelatedTermsRelatedTermsListInner, bool)`

GetRelatedTermsListOk returns a tuple with the RelatedTermsList field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRelatedTermsList

`func (o *RelatedTerms) SetRelatedTermsList(v []RelatedTermsRelatedTermsListInner)`

SetRelatedTermsList sets RelatedTermsList field to given value.

### HasRelatedTermsList

`func (o *RelatedTerms) HasRelatedTermsList() bool`

HasRelatedTermsList returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


