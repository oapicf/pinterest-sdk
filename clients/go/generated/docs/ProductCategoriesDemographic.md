# ProductCategoriesDemographic

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Age** | **map[string]float32** | Age demographic distribution | 
**Gender** | [**GenderDemographics**](GenderDemographics.md) |  | 

## Methods

### NewProductCategoriesDemographic

`func NewProductCategoriesDemographic(age map[string]float32, gender GenderDemographics, ) *ProductCategoriesDemographic`

NewProductCategoriesDemographic instantiates a new ProductCategoriesDemographic object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewProductCategoriesDemographicWithDefaults

`func NewProductCategoriesDemographicWithDefaults() *ProductCategoriesDemographic`

NewProductCategoriesDemographicWithDefaults instantiates a new ProductCategoriesDemographic object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAge

`func (o *ProductCategoriesDemographic) GetAge() map[string]float32`

GetAge returns the Age field if non-nil, zero value otherwise.

### GetAgeOk

`func (o *ProductCategoriesDemographic) GetAgeOk() (*map[string]float32, bool)`

GetAgeOk returns a tuple with the Age field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAge

`func (o *ProductCategoriesDemographic) SetAge(v map[string]float32)`

SetAge sets Age field to given value.


### GetGender

`func (o *ProductCategoriesDemographic) GetGender() GenderDemographics`

GetGender returns the Gender field if non-nil, zero value otherwise.

### GetGenderOk

`func (o *ProductCategoriesDemographic) GetGenderOk() (*GenderDemographics, bool)`

GetGenderOk returns a tuple with the Gender field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGender

`func (o *ProductCategoriesDemographic) SetGender(v GenderDemographics)`

SetGender sets Gender field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


