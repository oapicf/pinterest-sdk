# CatalogsHotelFeedsUpdateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DefaultCurrency** | Pointer to [**NullableNullableCurrency**](NullableCurrency.md) |  | [optional] 
**Name** | Pointer to **string** | A human-friendly name associated to a given feed. | [optional] 
**Format** | Pointer to [**CatalogsFormat**](CatalogsFormat.md) |  | [optional] 
**Credentials** | Pointer to [**NullableCatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional] 
**Location** | Pointer to **string** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | [optional] 
**PreferredProcessingSchedule** | Pointer to [**NullableCatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional] 
**Status** | Pointer to [**CatalogsStatus**](CatalogsStatus.md) |  | [optional] 
**CatalogType** | [**CatalogsType**](CatalogsType.md) |  | 

## Methods

### NewCatalogsHotelFeedsUpdateRequest

`func NewCatalogsHotelFeedsUpdateRequest(catalogType CatalogsType, ) *CatalogsHotelFeedsUpdateRequest`

NewCatalogsHotelFeedsUpdateRequest instantiates a new CatalogsHotelFeedsUpdateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsHotelFeedsUpdateRequestWithDefaults

`func NewCatalogsHotelFeedsUpdateRequestWithDefaults() *CatalogsHotelFeedsUpdateRequest`

NewCatalogsHotelFeedsUpdateRequestWithDefaults instantiates a new CatalogsHotelFeedsUpdateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDefaultCurrency

`func (o *CatalogsHotelFeedsUpdateRequest) GetDefaultCurrency() NullableCurrency`

GetDefaultCurrency returns the DefaultCurrency field if non-nil, zero value otherwise.

### GetDefaultCurrencyOk

`func (o *CatalogsHotelFeedsUpdateRequest) GetDefaultCurrencyOk() (*NullableCurrency, bool)`

GetDefaultCurrencyOk returns a tuple with the DefaultCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefaultCurrency

`func (o *CatalogsHotelFeedsUpdateRequest) SetDefaultCurrency(v NullableCurrency)`

SetDefaultCurrency sets DefaultCurrency field to given value.

### HasDefaultCurrency

`func (o *CatalogsHotelFeedsUpdateRequest) HasDefaultCurrency() bool`

HasDefaultCurrency returns a boolean if a field has been set.

### SetDefaultCurrencyNil

`func (o *CatalogsHotelFeedsUpdateRequest) SetDefaultCurrencyNil(b bool)`

 SetDefaultCurrencyNil sets the value for DefaultCurrency to be an explicit nil

### UnsetDefaultCurrency
`func (o *CatalogsHotelFeedsUpdateRequest) UnsetDefaultCurrency()`

UnsetDefaultCurrency ensures that no value is present for DefaultCurrency, not even an explicit nil
### GetName

`func (o *CatalogsHotelFeedsUpdateRequest) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CatalogsHotelFeedsUpdateRequest) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CatalogsHotelFeedsUpdateRequest) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CatalogsHotelFeedsUpdateRequest) HasName() bool`

HasName returns a boolean if a field has been set.

### GetFormat

`func (o *CatalogsHotelFeedsUpdateRequest) GetFormat() CatalogsFormat`

GetFormat returns the Format field if non-nil, zero value otherwise.

### GetFormatOk

`func (o *CatalogsHotelFeedsUpdateRequest) GetFormatOk() (*CatalogsFormat, bool)`

GetFormatOk returns a tuple with the Format field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFormat

`func (o *CatalogsHotelFeedsUpdateRequest) SetFormat(v CatalogsFormat)`

SetFormat sets Format field to given value.

### HasFormat

`func (o *CatalogsHotelFeedsUpdateRequest) HasFormat() bool`

HasFormat returns a boolean if a field has been set.

### GetCredentials

`func (o *CatalogsHotelFeedsUpdateRequest) GetCredentials() CatalogsFeedCredentials`

GetCredentials returns the Credentials field if non-nil, zero value otherwise.

### GetCredentialsOk

`func (o *CatalogsHotelFeedsUpdateRequest) GetCredentialsOk() (*CatalogsFeedCredentials, bool)`

GetCredentialsOk returns a tuple with the Credentials field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCredentials

`func (o *CatalogsHotelFeedsUpdateRequest) SetCredentials(v CatalogsFeedCredentials)`

SetCredentials sets Credentials field to given value.

### HasCredentials

`func (o *CatalogsHotelFeedsUpdateRequest) HasCredentials() bool`

HasCredentials returns a boolean if a field has been set.

### SetCredentialsNil

`func (o *CatalogsHotelFeedsUpdateRequest) SetCredentialsNil(b bool)`

 SetCredentialsNil sets the value for Credentials to be an explicit nil

### UnsetCredentials
`func (o *CatalogsHotelFeedsUpdateRequest) UnsetCredentials()`

UnsetCredentials ensures that no value is present for Credentials, not even an explicit nil
### GetLocation

`func (o *CatalogsHotelFeedsUpdateRequest) GetLocation() string`

GetLocation returns the Location field if non-nil, zero value otherwise.

### GetLocationOk

`func (o *CatalogsHotelFeedsUpdateRequest) GetLocationOk() (*string, bool)`

GetLocationOk returns a tuple with the Location field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocation

`func (o *CatalogsHotelFeedsUpdateRequest) SetLocation(v string)`

SetLocation sets Location field to given value.

### HasLocation

`func (o *CatalogsHotelFeedsUpdateRequest) HasLocation() bool`

HasLocation returns a boolean if a field has been set.

### GetPreferredProcessingSchedule

`func (o *CatalogsHotelFeedsUpdateRequest) GetPreferredProcessingSchedule() CatalogsFeedProcessingSchedule`

GetPreferredProcessingSchedule returns the PreferredProcessingSchedule field if non-nil, zero value otherwise.

### GetPreferredProcessingScheduleOk

`func (o *CatalogsHotelFeedsUpdateRequest) GetPreferredProcessingScheduleOk() (*CatalogsFeedProcessingSchedule, bool)`

GetPreferredProcessingScheduleOk returns a tuple with the PreferredProcessingSchedule field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPreferredProcessingSchedule

`func (o *CatalogsHotelFeedsUpdateRequest) SetPreferredProcessingSchedule(v CatalogsFeedProcessingSchedule)`

SetPreferredProcessingSchedule sets PreferredProcessingSchedule field to given value.

### HasPreferredProcessingSchedule

`func (o *CatalogsHotelFeedsUpdateRequest) HasPreferredProcessingSchedule() bool`

HasPreferredProcessingSchedule returns a boolean if a field has been set.

### SetPreferredProcessingScheduleNil

`func (o *CatalogsHotelFeedsUpdateRequest) SetPreferredProcessingScheduleNil(b bool)`

 SetPreferredProcessingScheduleNil sets the value for PreferredProcessingSchedule to be an explicit nil

### UnsetPreferredProcessingSchedule
`func (o *CatalogsHotelFeedsUpdateRequest) UnsetPreferredProcessingSchedule()`

UnsetPreferredProcessingSchedule ensures that no value is present for PreferredProcessingSchedule, not even an explicit nil
### GetStatus

`func (o *CatalogsHotelFeedsUpdateRequest) GetStatus() CatalogsStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *CatalogsHotelFeedsUpdateRequest) GetStatusOk() (*CatalogsStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *CatalogsHotelFeedsUpdateRequest) SetStatus(v CatalogsStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *CatalogsHotelFeedsUpdateRequest) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetCatalogType

`func (o *CatalogsHotelFeedsUpdateRequest) GetCatalogType() CatalogsType`

GetCatalogType returns the CatalogType field if non-nil, zero value otherwise.

### GetCatalogTypeOk

`func (o *CatalogsHotelFeedsUpdateRequest) GetCatalogTypeOk() (*CatalogsType, bool)`

GetCatalogTypeOk returns a tuple with the CatalogType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogType

`func (o *CatalogsHotelFeedsUpdateRequest) SetCatalogType(v CatalogsType)`

SetCatalogType sets CatalogType field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


