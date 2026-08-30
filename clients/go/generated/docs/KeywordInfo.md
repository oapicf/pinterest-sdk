# KeywordInfo

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **string** | Keyword Name | 
**PctGrowthMom** | Pointer to **float32** | MoM growth as a percentage, if there is no growth rate, this field is not present | [optional] 

## Methods

### NewKeywordInfo

`func NewKeywordInfo(name string, ) *KeywordInfo`

NewKeywordInfo instantiates a new KeywordInfo object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewKeywordInfoWithDefaults

`func NewKeywordInfoWithDefaults() *KeywordInfo`

NewKeywordInfoWithDefaults instantiates a new KeywordInfo object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *KeywordInfo) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *KeywordInfo) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *KeywordInfo) SetName(v string)`

SetName sets Name field to given value.


### GetPctGrowthMom

`func (o *KeywordInfo) GetPctGrowthMom() float32`

GetPctGrowthMom returns the PctGrowthMom field if non-nil, zero value otherwise.

### GetPctGrowthMomOk

`func (o *KeywordInfo) GetPctGrowthMomOk() (*float32, bool)`

GetPctGrowthMomOk returns a tuple with the PctGrowthMom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPctGrowthMom

`func (o *KeywordInfo) SetPctGrowthMom(v float32)`

SetPctGrowthMom sets PctGrowthMom field to given value.

### HasPctGrowthMom

`func (o *KeywordInfo) HasPctGrowthMom() bool`

HasPctGrowthMom returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


