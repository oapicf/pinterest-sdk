# CatalogsLocalStoresCreate200ResponseInnerData

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
**Exceptions** | [**PinterestLibError**](PinterestLibError.md) |  | 

## Methods

### NewCatalogsLocalStoresCreate200ResponseInnerData

`func NewCatalogsLocalStoresCreate200ResponseInnerData(country Country, createdAt time.Time, id string, name string, storeCode string, updatedAt time.Time, exceptions PinterestLibError, ) *CatalogsLocalStoresCreate200ResponseInnerData`

NewCatalogsLocalStoresCreate200ResponseInnerData instantiates a new CatalogsLocalStoresCreate200ResponseInnerData object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsLocalStoresCreate200ResponseInnerDataWithDefaults

`func NewCatalogsLocalStoresCreate200ResponseInnerDataWithDefaults() *CatalogsLocalStoresCreate200ResponseInnerData`

NewCatalogsLocalStoresCreate200ResponseInnerDataWithDefaults instantiates a new CatalogsLocalStoresCreate200ResponseInnerData object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAddressPrimary

`func (o *CatalogsLocalStoresCreate200ResponseInnerData) GetAddressPrimary() string`

GetAddressPrimary returns the AddressPrimary field if non-nil, zero value otherwise.

### GetAddressPrimaryOk

`func (o *CatalogsLocalStoresCreate200ResponseInnerData) GetAddressPrimaryOk() (*string, bool)`

GetAddressPrimaryOk returns a tuple with the AddressPrimary field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAddressPrimary

`func (o *CatalogsLocalStoresCreate200ResponseInnerData) SetAddressPrimary(v string)`

SetAddressPrimary sets AddressPrimary field to given value.

### HasAddressPrimary

`func (o *CatalogsLocalStoresCreate200ResponseInnerData) HasAddressPrimary() bool`

HasAddressPrimary returns a boolean if a field has been set.

### GetAddressSecondary

`func (o *CatalogsLocalStoresCreate200ResponseInnerData) GetAddressSecondary() string`

GetAddressSecondary returns the AddressSecondary field if non-nil, zero value otherwise.

### GetAddressSecondaryOk

`func (o *CatalogsLocalStoresCreate200ResponseInnerData) GetAddressSecondaryOk() (*string, bool)`

GetAddressSecondaryOk returns a tuple with the AddressSecondary field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAddressSecondary

`func (o *CatalogsLocalStoresCreate200ResponseInnerData) SetAddressSecondary(v string)`

SetAddressSecondary sets AddressSecondary field to given value.

### HasAddressSecondary

`func (o *CatalogsLocalStoresCreate200ResponseInnerData) HasAddressSecondary() bool`

HasAddressSecondary returns a boolean if a field has been set.

### GetCity

`func (o *CatalogsLocalStoresCreate200ResponseInnerData) GetCity() string`

GetCity returns the City field if non-nil, zero value otherwise.

### GetCityOk

`func (o *CatalogsLocalStoresCreate200ResponseInnerData) GetCityOk() (*string, bool)`

GetCityOk returns a tuple with the City field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCity

`func (o *CatalogsLocalStoresCreate200ResponseInnerData) SetCity(v string)`

SetCity sets City field to given value.

### HasCity

`func (o *CatalogsLocalStoresCreate200ResponseInnerData) HasCity() bool`

HasCity returns a boolean if a field has been set.

### GetCountry

`func (o *CatalogsLocalStoresCreate200ResponseInnerData) GetCountry() Country`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *CatalogsLocalStoresCreate200ResponseInnerData) GetCountryOk() (*Country, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *CatalogsLocalStoresCreate200ResponseInnerData) SetCountry(v Country)`

SetCountry sets Country field to given value.


### GetCreatedAt

`func (o *CatalogsLocalStoresCreate200ResponseInnerData) GetCreatedAt() time.Time`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *CatalogsLocalStoresCreate200ResponseInnerData) GetCreatedAtOk() (*time.Time, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *CatalogsLocalStoresCreate200ResponseInnerData) SetCreatedAt(v time.Time)`

SetCreatedAt sets CreatedAt field to given value.


### GetId

`func (o *CatalogsLocalStoresCreate200ResponseInnerData) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CatalogsLocalStoresCreate200ResponseInnerData) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CatalogsLocalStoresCreate200ResponseInnerData) SetId(v string)`

SetId sets Id field to given value.


### GetLatitude

`func (o *CatalogsLocalStoresCreate200ResponseInnerData) GetLatitude() float32`

GetLatitude returns the Latitude field if non-nil, zero value otherwise.

### GetLatitudeOk

`func (o *CatalogsLocalStoresCreate200ResponseInnerData) GetLatitudeOk() (*float32, bool)`

GetLatitudeOk returns a tuple with the Latitude field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLatitude

`func (o *CatalogsLocalStoresCreate200ResponseInnerData) SetLatitude(v float32)`

SetLatitude sets Latitude field to given value.

### HasLatitude

`func (o *CatalogsLocalStoresCreate200ResponseInnerData) HasLatitude() bool`

HasLatitude returns a boolean if a field has been set.

### GetLongitude

`func (o *CatalogsLocalStoresCreate200ResponseInnerData) GetLongitude() float32`

GetLongitude returns the Longitude field if non-nil, zero value otherwise.

### GetLongitudeOk

`func (o *CatalogsLocalStoresCreate200ResponseInnerData) GetLongitudeOk() (*float32, bool)`

GetLongitudeOk returns a tuple with the Longitude field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLongitude

`func (o *CatalogsLocalStoresCreate200ResponseInnerData) SetLongitude(v float32)`

SetLongitude sets Longitude field to given value.

### HasLongitude

`func (o *CatalogsLocalStoresCreate200ResponseInnerData) HasLongitude() bool`

HasLongitude returns a boolean if a field has been set.

### GetName

`func (o *CatalogsLocalStoresCreate200ResponseInnerData) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CatalogsLocalStoresCreate200ResponseInnerData) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CatalogsLocalStoresCreate200ResponseInnerData) SetName(v string)`

SetName sets Name field to given value.


### GetPostalCode

`func (o *CatalogsLocalStoresCreate200ResponseInnerData) GetPostalCode() string`

GetPostalCode returns the PostalCode field if non-nil, zero value otherwise.

### GetPostalCodeOk

`func (o *CatalogsLocalStoresCreate200ResponseInnerData) GetPostalCodeOk() (*string, bool)`

GetPostalCodeOk returns a tuple with the PostalCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPostalCode

`func (o *CatalogsLocalStoresCreate200ResponseInnerData) SetPostalCode(v string)`

SetPostalCode sets PostalCode field to given value.

### HasPostalCode

`func (o *CatalogsLocalStoresCreate200ResponseInnerData) HasPostalCode() bool`

HasPostalCode returns a boolean if a field has been set.

### GetRegion

`func (o *CatalogsLocalStoresCreate200ResponseInnerData) GetRegion() string`

GetRegion returns the Region field if non-nil, zero value otherwise.

### GetRegionOk

`func (o *CatalogsLocalStoresCreate200ResponseInnerData) GetRegionOk() (*string, bool)`

GetRegionOk returns a tuple with the Region field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRegion

`func (o *CatalogsLocalStoresCreate200ResponseInnerData) SetRegion(v string)`

SetRegion sets Region field to given value.

### HasRegion

`func (o *CatalogsLocalStoresCreate200ResponseInnerData) HasRegion() bool`

HasRegion returns a boolean if a field has been set.

### GetStoreCode

`func (o *CatalogsLocalStoresCreate200ResponseInnerData) GetStoreCode() string`

GetStoreCode returns the StoreCode field if non-nil, zero value otherwise.

### GetStoreCodeOk

`func (o *CatalogsLocalStoresCreate200ResponseInnerData) GetStoreCodeOk() (*string, bool)`

GetStoreCodeOk returns a tuple with the StoreCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStoreCode

`func (o *CatalogsLocalStoresCreate200ResponseInnerData) SetStoreCode(v string)`

SetStoreCode sets StoreCode field to given value.


### GetUpdatedAt

`func (o *CatalogsLocalStoresCreate200ResponseInnerData) GetUpdatedAt() time.Time`

GetUpdatedAt returns the UpdatedAt field if non-nil, zero value otherwise.

### GetUpdatedAtOk

`func (o *CatalogsLocalStoresCreate200ResponseInnerData) GetUpdatedAtOk() (*time.Time, bool)`

GetUpdatedAtOk returns a tuple with the UpdatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedAt

`func (o *CatalogsLocalStoresCreate200ResponseInnerData) SetUpdatedAt(v time.Time)`

SetUpdatedAt sets UpdatedAt field to given value.


### GetExceptions

`func (o *CatalogsLocalStoresCreate200ResponseInnerData) GetExceptions() PinterestLibError`

GetExceptions returns the Exceptions field if non-nil, zero value otherwise.

### GetExceptionsOk

`func (o *CatalogsLocalStoresCreate200ResponseInnerData) GetExceptionsOk() (*PinterestLibError, bool)`

GetExceptionsOk returns a tuple with the Exceptions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExceptions

`func (o *CatalogsLocalStoresCreate200ResponseInnerData) SetExceptions(v PinterestLibError)`

SetExceptions sets Exceptions field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


