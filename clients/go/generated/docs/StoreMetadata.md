# StoreMetadata

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Geohash** | Pointer to **string** | Geohash of the store location | [optional] 
**Latitude** | Pointer to **float64** | Geographic latitude coordinate of the store | [optional] 
**Longitude** | Pointer to **float64** | Geographic longitude coordinate of the store | [optional] 
**StoreCode** | **string** | Merchant provided store code | 
**StoreId** | **string** | Internal store code | 
**StoreName** | Pointer to **string** | Store name | [optional] 

## Methods

### NewStoreMetadata

`func NewStoreMetadata(storeCode string, storeId string, ) *StoreMetadata`

NewStoreMetadata instantiates a new StoreMetadata object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewStoreMetadataWithDefaults

`func NewStoreMetadataWithDefaults() *StoreMetadata`

NewStoreMetadataWithDefaults instantiates a new StoreMetadata object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetGeohash

`func (o *StoreMetadata) GetGeohash() string`

GetGeohash returns the Geohash field if non-nil, zero value otherwise.

### GetGeohashOk

`func (o *StoreMetadata) GetGeohashOk() (*string, bool)`

GetGeohashOk returns a tuple with the Geohash field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGeohash

`func (o *StoreMetadata) SetGeohash(v string)`

SetGeohash sets Geohash field to given value.

### HasGeohash

`func (o *StoreMetadata) HasGeohash() bool`

HasGeohash returns a boolean if a field has been set.

### GetLatitude

`func (o *StoreMetadata) GetLatitude() float64`

GetLatitude returns the Latitude field if non-nil, zero value otherwise.

### GetLatitudeOk

`func (o *StoreMetadata) GetLatitudeOk() (*float64, bool)`

GetLatitudeOk returns a tuple with the Latitude field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLatitude

`func (o *StoreMetadata) SetLatitude(v float64)`

SetLatitude sets Latitude field to given value.

### HasLatitude

`func (o *StoreMetadata) HasLatitude() bool`

HasLatitude returns a boolean if a field has been set.

### GetLongitude

`func (o *StoreMetadata) GetLongitude() float64`

GetLongitude returns the Longitude field if non-nil, zero value otherwise.

### GetLongitudeOk

`func (o *StoreMetadata) GetLongitudeOk() (*float64, bool)`

GetLongitudeOk returns a tuple with the Longitude field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLongitude

`func (o *StoreMetadata) SetLongitude(v float64)`

SetLongitude sets Longitude field to given value.

### HasLongitude

`func (o *StoreMetadata) HasLongitude() bool`

HasLongitude returns a boolean if a field has been set.

### GetStoreCode

`func (o *StoreMetadata) GetStoreCode() string`

GetStoreCode returns the StoreCode field if non-nil, zero value otherwise.

### GetStoreCodeOk

`func (o *StoreMetadata) GetStoreCodeOk() (*string, bool)`

GetStoreCodeOk returns a tuple with the StoreCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStoreCode

`func (o *StoreMetadata) SetStoreCode(v string)`

SetStoreCode sets StoreCode field to given value.


### GetStoreId

`func (o *StoreMetadata) GetStoreId() string`

GetStoreId returns the StoreId field if non-nil, zero value otherwise.

### GetStoreIdOk

`func (o *StoreMetadata) GetStoreIdOk() (*string, bool)`

GetStoreIdOk returns a tuple with the StoreId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStoreId

`func (o *StoreMetadata) SetStoreId(v string)`

SetStoreId sets StoreId field to given value.


### GetStoreName

`func (o *StoreMetadata) GetStoreName() string`

GetStoreName returns the StoreName field if non-nil, zero value otherwise.

### GetStoreNameOk

`func (o *StoreMetadata) GetStoreNameOk() (*string, bool)`

GetStoreNameOk returns a tuple with the StoreName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStoreName

`func (o *StoreMetadata) SetStoreName(v string)`

SetStoreName sets StoreName field to given value.

### HasStoreName

`func (o *StoreMetadata) HasStoreName() bool`

HasStoreName returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


