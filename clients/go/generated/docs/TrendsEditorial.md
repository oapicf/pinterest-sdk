# TrendsEditorial

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BoardUrl** | **string** | URL of the editorial board | 
**Description** | **string** | Description of the editorial article | 
**Interests** | **[]string** | List of interests related to the editorial article | 
**PinsUrl** | **[]string** | URL of the pins related to the editorial article | 
**RelatedKeywords** | [**[]KeywordInfo**](KeywordInfo.md) | List of keywords related to the editorial article | 
**Title** | **string** | Title of the editorial article | 

## Methods

### NewTrendsEditorial

`func NewTrendsEditorial(boardUrl string, description string, interests []string, pinsUrl []string, relatedKeywords []KeywordInfo, title string, ) *TrendsEditorial`

NewTrendsEditorial instantiates a new TrendsEditorial object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTrendsEditorialWithDefaults

`func NewTrendsEditorialWithDefaults() *TrendsEditorial`

NewTrendsEditorialWithDefaults instantiates a new TrendsEditorial object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBoardUrl

`func (o *TrendsEditorial) GetBoardUrl() string`

GetBoardUrl returns the BoardUrl field if non-nil, zero value otherwise.

### GetBoardUrlOk

`func (o *TrendsEditorial) GetBoardUrlOk() (*string, bool)`

GetBoardUrlOk returns a tuple with the BoardUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBoardUrl

`func (o *TrendsEditorial) SetBoardUrl(v string)`

SetBoardUrl sets BoardUrl field to given value.


### GetDescription

`func (o *TrendsEditorial) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *TrendsEditorial) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *TrendsEditorial) SetDescription(v string)`

SetDescription sets Description field to given value.


### GetInterests

`func (o *TrendsEditorial) GetInterests() []string`

GetInterests returns the Interests field if non-nil, zero value otherwise.

### GetInterestsOk

`func (o *TrendsEditorial) GetInterestsOk() (*[]string, bool)`

GetInterestsOk returns a tuple with the Interests field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInterests

`func (o *TrendsEditorial) SetInterests(v []string)`

SetInterests sets Interests field to given value.


### GetPinsUrl

`func (o *TrendsEditorial) GetPinsUrl() []string`

GetPinsUrl returns the PinsUrl field if non-nil, zero value otherwise.

### GetPinsUrlOk

`func (o *TrendsEditorial) GetPinsUrlOk() (*[]string, bool)`

GetPinsUrlOk returns a tuple with the PinsUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPinsUrl

`func (o *TrendsEditorial) SetPinsUrl(v []string)`

SetPinsUrl sets PinsUrl field to given value.


### GetRelatedKeywords

`func (o *TrendsEditorial) GetRelatedKeywords() []KeywordInfo`

GetRelatedKeywords returns the RelatedKeywords field if non-nil, zero value otherwise.

### GetRelatedKeywordsOk

`func (o *TrendsEditorial) GetRelatedKeywordsOk() (*[]KeywordInfo, bool)`

GetRelatedKeywordsOk returns a tuple with the RelatedKeywords field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRelatedKeywords

`func (o *TrendsEditorial) SetRelatedKeywords(v []KeywordInfo)`

SetRelatedKeywords sets RelatedKeywords field to given value.


### GetTitle

`func (o *TrendsEditorial) GetTitle() string`

GetTitle returns the Title field if non-nil, zero value otherwise.

### GetTitleOk

`func (o *TrendsEditorial) GetTitleOk() (*string, bool)`

GetTitleOk returns a tuple with the Title field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTitle

`func (o *TrendsEditorial) SetTitle(v string)`

SetTitle sets Title field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


