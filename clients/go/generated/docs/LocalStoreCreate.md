# LocalStoreCreate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AddressPrimary** | Pointer to **string** | Primary address line of the store. | [optional] 
**AddressSecondary** | Pointer to **string** | Secondary address line of the store. | [optional] 
**City** | Pointer to **string** | City where the store is located. | [optional] 
**Country** | [**Country**](Country.md) | Country code where the store is located. | 
**Latitude** | Pointer to **float32** | Geographic latitude coordinate of the store. | [optional] 
**Longitude** | Pointer to **float32** | Geographic longitude coordinate of the store. | [optional] 
**Name** | **string** | The name of the local store. | 
**PostalCode** | Pointer to **string** | Postal or ZIP code of the store. | [optional] 
**Region** | Pointer to **string** | State or region code where the store is located. | [optional] 
**StoreCode** | **string** | Merchant provided code for the local store. Unique within the merchant&#39;s catalog. | 

## Methods

### NewLocalStoreCreate

`func NewLocalStoreCreate(country Country, name string, storeCode string, ) *LocalStoreCreate`

NewLocalStoreCreate instantiates a new LocalStoreCreate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewLocalStoreCreateWithDefaults

`func NewLocalStoreCreateWithDefaults() *LocalStoreCreate`

NewLocalStoreCreateWithDefaults instantiates a new LocalStoreCreate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAddressPrimary

`func (o *LocalStoreCreate) GetAddressPrimary() string`

GetAddressPrimary returns the AddressPrimary field if non-nil, zero value otherwise.

### GetAddressPrimaryOk

`func (o *LocalStoreCreate) GetAddressPrimaryOk() (*string, bool)`

GetAddressPrimaryOk returns a tuple with the AddressPrimary field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAddressPrimary

`func (o *LocalStoreCreate) SetAddressPrimary(v string)`

SetAddressPrimary sets AddressPrimary field to given value.

### HasAddressPrimary

`func (o *LocalStoreCreate) HasAddressPrimary() bool`

HasAddressPrimary returns a boolean if a field has been set.

### GetAddressSecondary

`func (o *LocalStoreCreate) GetAddressSecondary() string`

GetAddressSecondary returns the AddressSecondary field if non-nil, zero value otherwise.

### GetAddressSecondaryOk

`func (o *LocalStoreCreate) GetAddressSecondaryOk() (*string, bool)`

GetAddressSecondaryOk returns a tuple with the AddressSecondary field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAddressSecondary

`func (o *LocalStoreCreate) SetAddressSecondary(v string)`

SetAddressSecondary sets AddressSecondary field to given value.

### HasAddressSecondary

`func (o *LocalStoreCreate) HasAddressSecondary() bool`

HasAddressSecondary returns a boolean if a field has been set.

### GetCity

`func (o *LocalStoreCreate) GetCity() string`

GetCity returns the City field if non-nil, zero value otherwise.

### GetCityOk

`func (o *LocalStoreCreate) GetCityOk() (*string, bool)`

GetCityOk returns a tuple with the City field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCity

`func (o *LocalStoreCreate) SetCity(v string)`

SetCity sets City field to given value.

### HasCity

`func (o *LocalStoreCreate) HasCity() bool`

HasCity returns a boolean if a field has been set.

### GetCountry

`func (o *LocalStoreCreate) GetCountry() Country`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *LocalStoreCreate) GetCountryOk() (*Country, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *LocalStoreCreate) SetCountry(v Country)`

SetCountry sets Country field to given value.


### GetLatitude

`func (o *LocalStoreCreate) GetLatitude() float32`

GetLatitude returns the Latitude field if non-nil, zero value otherwise.

### GetLatitudeOk

`func (o *LocalStoreCreate) GetLatitudeOk() (*float32, bool)`

GetLatitudeOk returns a tuple with the Latitude field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLatitude

`func (o *LocalStoreCreate) SetLatitude(v float32)`

SetLatitude sets Latitude field to given value.

### HasLatitude

`func (o *LocalStoreCreate) HasLatitude() bool`

HasLatitude returns a boolean if a field has been set.

### GetLongitude

`func (o *LocalStoreCreate) GetLongitude() float32`

GetLongitude returns the Longitude field if non-nil, zero value otherwise.

### GetLongitudeOk

`func (o *LocalStoreCreate) GetLongitudeOk() (*float32, bool)`

GetLongitudeOk returns a tuple with the Longitude field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLongitude

`func (o *LocalStoreCreate) SetLongitude(v float32)`

SetLongitude sets Longitude field to given value.

### HasLongitude

`func (o *LocalStoreCreate) HasLongitude() bool`

HasLongitude returns a boolean if a field has been set.

### GetName

`func (o *LocalStoreCreate) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *LocalStoreCreate) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *LocalStoreCreate) SetName(v string)`

SetName sets Name field to given value.


### GetPostalCode

`func (o *LocalStoreCreate) GetPostalCode() string`

GetPostalCode returns the PostalCode field if non-nil, zero value otherwise.

### GetPostalCodeOk

`func (o *LocalStoreCreate) GetPostalCodeOk() (*string, bool)`

GetPostalCodeOk returns a tuple with the PostalCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPostalCode

`func (o *LocalStoreCreate) SetPostalCode(v string)`

SetPostalCode sets PostalCode field to given value.

### HasPostalCode

`func (o *LocalStoreCreate) HasPostalCode() bool`

HasPostalCode returns a boolean if a field has been set.

### GetRegion

`func (o *LocalStoreCreate) GetRegion() string`

GetRegion returns the Region field if non-nil, zero value otherwise.

### GetRegionOk

`func (o *LocalStoreCreate) GetRegionOk() (*string, bool)`

GetRegionOk returns a tuple with the Region field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRegion

`func (o *LocalStoreCreate) SetRegion(v string)`

SetRegion sets Region field to given value.

### HasRegion

`func (o *LocalStoreCreate) HasRegion() bool`

HasRegion returns a boolean if a field has been set.

### GetStoreCode

`func (o *LocalStoreCreate) GetStoreCode() string`

GetStoreCode returns the StoreCode field if non-nil, zero value otherwise.

### GetStoreCodeOk

`func (o *LocalStoreCreate) GetStoreCodeOk() (*string, bool)`

GetStoreCodeOk returns a tuple with the StoreCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStoreCode

`func (o *LocalStoreCreate) SetStoreCode(v string)`

SetStoreCode sets StoreCode field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


