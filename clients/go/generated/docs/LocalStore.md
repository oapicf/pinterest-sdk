# LocalStore

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AddressPrimary** | Pointer to **string** | Primary address line of the store. | [optional] 
**AddressSecondary** | Pointer to **string** | Secondary address line of the store. | [optional] 
**City** | Pointer to **string** | City where the store is located. | [optional] 
**Country** | [**Country**](Country.md) | Country code where the store is located. | 
**CreatedAt** | **time.Time** | Creation timestamp | [readonly] 
**Id** | **string** | The ID of the local store. | 
**Latitude** | Pointer to **float32** | Geographic latitude coordinate of the store. | [optional] 
**Longitude** | Pointer to **float32** | Geographic longitude coordinate of the store. | [optional] 
**Name** | **string** | The name of the local store. | 
**PostalCode** | Pointer to **string** | Postal or ZIP code of the store. | [optional] 
**Region** | Pointer to **string** | State or region code where the store is located. | [optional] 
**StoreCode** | **string** | Merchant provided code for the local store. Unique within the merchant&#39;s catalog. | 
**UpdatedAt** | **time.Time** | Last update timestamp | [readonly] 

## Methods

### NewLocalStore

`func NewLocalStore(country Country, createdAt time.Time, id string, name string, storeCode string, updatedAt time.Time, ) *LocalStore`

NewLocalStore instantiates a new LocalStore object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewLocalStoreWithDefaults

`func NewLocalStoreWithDefaults() *LocalStore`

NewLocalStoreWithDefaults instantiates a new LocalStore object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAddressPrimary

`func (o *LocalStore) GetAddressPrimary() string`

GetAddressPrimary returns the AddressPrimary field if non-nil, zero value otherwise.

### GetAddressPrimaryOk

`func (o *LocalStore) GetAddressPrimaryOk() (*string, bool)`

GetAddressPrimaryOk returns a tuple with the AddressPrimary field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAddressPrimary

`func (o *LocalStore) SetAddressPrimary(v string)`

SetAddressPrimary sets AddressPrimary field to given value.

### HasAddressPrimary

`func (o *LocalStore) HasAddressPrimary() bool`

HasAddressPrimary returns a boolean if a field has been set.

### GetAddressSecondary

`func (o *LocalStore) GetAddressSecondary() string`

GetAddressSecondary returns the AddressSecondary field if non-nil, zero value otherwise.

### GetAddressSecondaryOk

`func (o *LocalStore) GetAddressSecondaryOk() (*string, bool)`

GetAddressSecondaryOk returns a tuple with the AddressSecondary field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAddressSecondary

`func (o *LocalStore) SetAddressSecondary(v string)`

SetAddressSecondary sets AddressSecondary field to given value.

### HasAddressSecondary

`func (o *LocalStore) HasAddressSecondary() bool`

HasAddressSecondary returns a boolean if a field has been set.

### GetCity

`func (o *LocalStore) GetCity() string`

GetCity returns the City field if non-nil, zero value otherwise.

### GetCityOk

`func (o *LocalStore) GetCityOk() (*string, bool)`

GetCityOk returns a tuple with the City field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCity

`func (o *LocalStore) SetCity(v string)`

SetCity sets City field to given value.

### HasCity

`func (o *LocalStore) HasCity() bool`

HasCity returns a boolean if a field has been set.

### GetCountry

`func (o *LocalStore) GetCountry() Country`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *LocalStore) GetCountryOk() (*Country, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *LocalStore) SetCountry(v Country)`

SetCountry sets Country field to given value.


### GetCreatedAt

`func (o *LocalStore) GetCreatedAt() time.Time`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *LocalStore) GetCreatedAtOk() (*time.Time, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *LocalStore) SetCreatedAt(v time.Time)`

SetCreatedAt sets CreatedAt field to given value.


### GetId

`func (o *LocalStore) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *LocalStore) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *LocalStore) SetId(v string)`

SetId sets Id field to given value.


### GetLatitude

`func (o *LocalStore) GetLatitude() float32`

GetLatitude returns the Latitude field if non-nil, zero value otherwise.

### GetLatitudeOk

`func (o *LocalStore) GetLatitudeOk() (*float32, bool)`

GetLatitudeOk returns a tuple with the Latitude field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLatitude

`func (o *LocalStore) SetLatitude(v float32)`

SetLatitude sets Latitude field to given value.

### HasLatitude

`func (o *LocalStore) HasLatitude() bool`

HasLatitude returns a boolean if a field has been set.

### GetLongitude

`func (o *LocalStore) GetLongitude() float32`

GetLongitude returns the Longitude field if non-nil, zero value otherwise.

### GetLongitudeOk

`func (o *LocalStore) GetLongitudeOk() (*float32, bool)`

GetLongitudeOk returns a tuple with the Longitude field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLongitude

`func (o *LocalStore) SetLongitude(v float32)`

SetLongitude sets Longitude field to given value.

### HasLongitude

`func (o *LocalStore) HasLongitude() bool`

HasLongitude returns a boolean if a field has been set.

### GetName

`func (o *LocalStore) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *LocalStore) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *LocalStore) SetName(v string)`

SetName sets Name field to given value.


### GetPostalCode

`func (o *LocalStore) GetPostalCode() string`

GetPostalCode returns the PostalCode field if non-nil, zero value otherwise.

### GetPostalCodeOk

`func (o *LocalStore) GetPostalCodeOk() (*string, bool)`

GetPostalCodeOk returns a tuple with the PostalCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPostalCode

`func (o *LocalStore) SetPostalCode(v string)`

SetPostalCode sets PostalCode field to given value.

### HasPostalCode

`func (o *LocalStore) HasPostalCode() bool`

HasPostalCode returns a boolean if a field has been set.

### GetRegion

`func (o *LocalStore) GetRegion() string`

GetRegion returns the Region field if non-nil, zero value otherwise.

### GetRegionOk

`func (o *LocalStore) GetRegionOk() (*string, bool)`

GetRegionOk returns a tuple with the Region field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRegion

`func (o *LocalStore) SetRegion(v string)`

SetRegion sets Region field to given value.

### HasRegion

`func (o *LocalStore) HasRegion() bool`

HasRegion returns a boolean if a field has been set.

### GetStoreCode

`func (o *LocalStore) GetStoreCode() string`

GetStoreCode returns the StoreCode field if non-nil, zero value otherwise.

### GetStoreCodeOk

`func (o *LocalStore) GetStoreCodeOk() (*string, bool)`

GetStoreCodeOk returns a tuple with the StoreCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStoreCode

`func (o *LocalStore) SetStoreCode(v string)`

SetStoreCode sets StoreCode field to given value.


### GetUpdatedAt

`func (o *LocalStore) GetUpdatedAt() time.Time`

GetUpdatedAt returns the UpdatedAt field if non-nil, zero value otherwise.

### GetUpdatedAtOk

`func (o *LocalStore) GetUpdatedAtOk() (*time.Time, bool)`

GetUpdatedAtOk returns a tuple with the UpdatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedAt

`func (o *LocalStore) SetUpdatedAt(v time.Time)`

SetUpdatedAt sets UpdatedAt field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


