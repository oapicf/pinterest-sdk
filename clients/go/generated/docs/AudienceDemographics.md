# AudienceDemographics

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ages** | Pointer to [**[]AudienceDemographicValue**](AudienceDemographicValue.md) | Ages distribution. | [optional] 
**Genders** | Pointer to [**[]AudienceDemographicValue**](AudienceDemographicValue.md) | Gender distribution. | [optional] 
**Devices** | Pointer to [**[]AudienceDemographicValue**](AudienceDemographicValue.md) | Device usage distribution. | [optional] 
**Metros** | Pointer to [**[]AudienceDemographicValue**](AudienceDemographicValue.md) | Geographic metro area distribution. | [optional] 
**Countries** | Pointer to [**[]AudienceDemographicValue**](AudienceDemographicValue.md) | Country area distribution. | [optional] 

## Methods

### NewAudienceDemographics

`func NewAudienceDemographics() *AudienceDemographics`

NewAudienceDemographics instantiates a new AudienceDemographics object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAudienceDemographicsWithDefaults

`func NewAudienceDemographicsWithDefaults() *AudienceDemographics`

NewAudienceDemographicsWithDefaults instantiates a new AudienceDemographics object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAges

`func (o *AudienceDemographics) GetAges() []AudienceDemographicValue`

GetAges returns the Ages field if non-nil, zero value otherwise.

### GetAgesOk

`func (o *AudienceDemographics) GetAgesOk() (*[]AudienceDemographicValue, bool)`

GetAgesOk returns a tuple with the Ages field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAges

`func (o *AudienceDemographics) SetAges(v []AudienceDemographicValue)`

SetAges sets Ages field to given value.

### HasAges

`func (o *AudienceDemographics) HasAges() bool`

HasAges returns a boolean if a field has been set.

### GetGenders

`func (o *AudienceDemographics) GetGenders() []AudienceDemographicValue`

GetGenders returns the Genders field if non-nil, zero value otherwise.

### GetGendersOk

`func (o *AudienceDemographics) GetGendersOk() (*[]AudienceDemographicValue, bool)`

GetGendersOk returns a tuple with the Genders field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGenders

`func (o *AudienceDemographics) SetGenders(v []AudienceDemographicValue)`

SetGenders sets Genders field to given value.

### HasGenders

`func (o *AudienceDemographics) HasGenders() bool`

HasGenders returns a boolean if a field has been set.

### GetDevices

`func (o *AudienceDemographics) GetDevices() []AudienceDemographicValue`

GetDevices returns the Devices field if non-nil, zero value otherwise.

### GetDevicesOk

`func (o *AudienceDemographics) GetDevicesOk() (*[]AudienceDemographicValue, bool)`

GetDevicesOk returns a tuple with the Devices field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDevices

`func (o *AudienceDemographics) SetDevices(v []AudienceDemographicValue)`

SetDevices sets Devices field to given value.

### HasDevices

`func (o *AudienceDemographics) HasDevices() bool`

HasDevices returns a boolean if a field has been set.

### GetMetros

`func (o *AudienceDemographics) GetMetros() []AudienceDemographicValue`

GetMetros returns the Metros field if non-nil, zero value otherwise.

### GetMetrosOk

`func (o *AudienceDemographics) GetMetrosOk() (*[]AudienceDemographicValue, bool)`

GetMetrosOk returns a tuple with the Metros field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMetros

`func (o *AudienceDemographics) SetMetros(v []AudienceDemographicValue)`

SetMetros sets Metros field to given value.

### HasMetros

`func (o *AudienceDemographics) HasMetros() bool`

HasMetros returns a boolean if a field has been set.

### GetCountries

`func (o *AudienceDemographics) GetCountries() []AudienceDemographicValue`

GetCountries returns the Countries field if non-nil, zero value otherwise.

### GetCountriesOk

`func (o *AudienceDemographics) GetCountriesOk() (*[]AudienceDemographicValue, bool)`

GetCountriesOk returns a tuple with the Countries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountries

`func (o *AudienceDemographics) SetCountries(v []AudienceDemographicValue)`

SetCountries sets Countries field to given value.

### HasCountries

`func (o *AudienceDemographics) HasCountries() bool`

HasCountries returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


