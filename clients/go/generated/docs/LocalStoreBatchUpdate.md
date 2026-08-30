# LocalStoreBatchUpdate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AddressPrimary** | Pointer to **string** | Primary address line of the store. | [optional] 
**AddressSecondary** | Pointer to **string** | Secondary address line of the store. | [optional] 
**City** | Pointer to **string** | City where the store is located. | [optional] 
**Country** | Pointer to [**Country**](Country.md) | Country code where the store is located. | [optional] 
**Id** | **string** | The ID of the local store. | 
**Latitude** | Pointer to **float32** | Geographic latitude coordinate of the store. | [optional] 
**Longitude** | Pointer to **float32** | Geographic longitude coordinate of the store. | [optional] 
**Name** | Pointer to **string** | The name of the local store. | [optional] 
**PostalCode** | Pointer to **string** | Postal or ZIP code of the store. | [optional] 
**Region** | Pointer to **string** | State or region code where the store is located. | [optional] 
**StoreCode** | Pointer to **string** | Merchant provided code for the local store. Unique within the merchant&#39;s catalog. | [optional] 

## Methods

### NewLocalStoreBatchUpdate

`func NewLocalStoreBatchUpdate(id string, ) *LocalStoreBatchUpdate`

NewLocalStoreBatchUpdate instantiates a new LocalStoreBatchUpdate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewLocalStoreBatchUpdateWithDefaults

`func NewLocalStoreBatchUpdateWithDefaults() *LocalStoreBatchUpdate`

NewLocalStoreBatchUpdateWithDefaults instantiates a new LocalStoreBatchUpdate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAddressPrimary

`func (o *LocalStoreBatchUpdate) GetAddressPrimary() string`

GetAddressPrimary returns the AddressPrimary field if non-nil, zero value otherwise.

### GetAddressPrimaryOk

`func (o *LocalStoreBatchUpdate) GetAddressPrimaryOk() (*string, bool)`

GetAddressPrimaryOk returns a tuple with the AddressPrimary field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAddressPrimary

`func (o *LocalStoreBatchUpdate) SetAddressPrimary(v string)`

SetAddressPrimary sets AddressPrimary field to given value.

### HasAddressPrimary

`func (o *LocalStoreBatchUpdate) HasAddressPrimary() bool`

HasAddressPrimary returns a boolean if a field has been set.

### GetAddressSecondary

`func (o *LocalStoreBatchUpdate) GetAddressSecondary() string`

GetAddressSecondary returns the AddressSecondary field if non-nil, zero value otherwise.

### GetAddressSecondaryOk

`func (o *LocalStoreBatchUpdate) GetAddressSecondaryOk() (*string, bool)`

GetAddressSecondaryOk returns a tuple with the AddressSecondary field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAddressSecondary

`func (o *LocalStoreBatchUpdate) SetAddressSecondary(v string)`

SetAddressSecondary sets AddressSecondary field to given value.

### HasAddressSecondary

`func (o *LocalStoreBatchUpdate) HasAddressSecondary() bool`

HasAddressSecondary returns a boolean if a field has been set.

### GetCity

`func (o *LocalStoreBatchUpdate) GetCity() string`

GetCity returns the City field if non-nil, zero value otherwise.

### GetCityOk

`func (o *LocalStoreBatchUpdate) GetCityOk() (*string, bool)`

GetCityOk returns a tuple with the City field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCity

`func (o *LocalStoreBatchUpdate) SetCity(v string)`

SetCity sets City field to given value.

### HasCity

`func (o *LocalStoreBatchUpdate) HasCity() bool`

HasCity returns a boolean if a field has been set.

### GetCountry

`func (o *LocalStoreBatchUpdate) GetCountry() Country`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *LocalStoreBatchUpdate) GetCountryOk() (*Country, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *LocalStoreBatchUpdate) SetCountry(v Country)`

SetCountry sets Country field to given value.

### HasCountry

`func (o *LocalStoreBatchUpdate) HasCountry() bool`

HasCountry returns a boolean if a field has been set.

### GetId

`func (o *LocalStoreBatchUpdate) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *LocalStoreBatchUpdate) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *LocalStoreBatchUpdate) SetId(v string)`

SetId sets Id field to given value.


### GetLatitude

`func (o *LocalStoreBatchUpdate) GetLatitude() float32`

GetLatitude returns the Latitude field if non-nil, zero value otherwise.

### GetLatitudeOk

`func (o *LocalStoreBatchUpdate) GetLatitudeOk() (*float32, bool)`

GetLatitudeOk returns a tuple with the Latitude field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLatitude

`func (o *LocalStoreBatchUpdate) SetLatitude(v float32)`

SetLatitude sets Latitude field to given value.

### HasLatitude

`func (o *LocalStoreBatchUpdate) HasLatitude() bool`

HasLatitude returns a boolean if a field has been set.

### GetLongitude

`func (o *LocalStoreBatchUpdate) GetLongitude() float32`

GetLongitude returns the Longitude field if non-nil, zero value otherwise.

### GetLongitudeOk

`func (o *LocalStoreBatchUpdate) GetLongitudeOk() (*float32, bool)`

GetLongitudeOk returns a tuple with the Longitude field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLongitude

`func (o *LocalStoreBatchUpdate) SetLongitude(v float32)`

SetLongitude sets Longitude field to given value.

### HasLongitude

`func (o *LocalStoreBatchUpdate) HasLongitude() bool`

HasLongitude returns a boolean if a field has been set.

### GetName

`func (o *LocalStoreBatchUpdate) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *LocalStoreBatchUpdate) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *LocalStoreBatchUpdate) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *LocalStoreBatchUpdate) HasName() bool`

HasName returns a boolean if a field has been set.

### GetPostalCode

`func (o *LocalStoreBatchUpdate) GetPostalCode() string`

GetPostalCode returns the PostalCode field if non-nil, zero value otherwise.

### GetPostalCodeOk

`func (o *LocalStoreBatchUpdate) GetPostalCodeOk() (*string, bool)`

GetPostalCodeOk returns a tuple with the PostalCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPostalCode

`func (o *LocalStoreBatchUpdate) SetPostalCode(v string)`

SetPostalCode sets PostalCode field to given value.

### HasPostalCode

`func (o *LocalStoreBatchUpdate) HasPostalCode() bool`

HasPostalCode returns a boolean if a field has been set.

### GetRegion

`func (o *LocalStoreBatchUpdate) GetRegion() string`

GetRegion returns the Region field if non-nil, zero value otherwise.

### GetRegionOk

`func (o *LocalStoreBatchUpdate) GetRegionOk() (*string, bool)`

GetRegionOk returns a tuple with the Region field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRegion

`func (o *LocalStoreBatchUpdate) SetRegion(v string)`

SetRegion sets Region field to given value.

### HasRegion

`func (o *LocalStoreBatchUpdate) HasRegion() bool`

HasRegion returns a boolean if a field has been set.

### GetStoreCode

`func (o *LocalStoreBatchUpdate) GetStoreCode() string`

GetStoreCode returns the StoreCode field if non-nil, zero value otherwise.

### GetStoreCodeOk

`func (o *LocalStoreBatchUpdate) GetStoreCodeOk() (*string, bool)`

GetStoreCodeOk returns a tuple with the StoreCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStoreCode

`func (o *LocalStoreBatchUpdate) SetStoreCode(v string)`

SetStoreCode sets StoreCode field to given value.

### HasStoreCode

`func (o *LocalStoreBatchUpdate) HasStoreCode() bool`

HasStoreCode returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


