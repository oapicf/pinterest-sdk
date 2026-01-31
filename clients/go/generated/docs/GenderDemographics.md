# GenderDemographics

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Female** | **float32** | Percentage of female users | 
**Male** | **float32** | Percentage of male users | 
**Unspecified** | **float32** | Percentage of users with unspecified gender | 

## Methods

### NewGenderDemographics

`func NewGenderDemographics(female float32, male float32, unspecified float32, ) *GenderDemographics`

NewGenderDemographics instantiates a new GenderDemographics object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGenderDemographicsWithDefaults

`func NewGenderDemographicsWithDefaults() *GenderDemographics`

NewGenderDemographicsWithDefaults instantiates a new GenderDemographics object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFemale

`func (o *GenderDemographics) GetFemale() float32`

GetFemale returns the Female field if non-nil, zero value otherwise.

### GetFemaleOk

`func (o *GenderDemographics) GetFemaleOk() (*float32, bool)`

GetFemaleOk returns a tuple with the Female field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFemale

`func (o *GenderDemographics) SetFemale(v float32)`

SetFemale sets Female field to given value.


### GetMale

`func (o *GenderDemographics) GetMale() float32`

GetMale returns the Male field if non-nil, zero value otherwise.

### GetMaleOk

`func (o *GenderDemographics) GetMaleOk() (*float32, bool)`

GetMaleOk returns a tuple with the Male field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMale

`func (o *GenderDemographics) SetMale(v float32)`

SetMale sets Male field to given value.


### GetUnspecified

`func (o *GenderDemographics) GetUnspecified() float32`

GetUnspecified returns the Unspecified field if non-nil, zero value otherwise.

### GetUnspecifiedOk

`func (o *GenderDemographics) GetUnspecifiedOk() (*float32, bool)`

GetUnspecifiedOk returns a tuple with the Unspecified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUnspecified

`func (o *GenderDemographics) SetUnspecified(v float32)`

SetUnspecified sets Unspecified field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


