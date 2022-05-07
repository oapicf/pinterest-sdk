# CatalogsFeedsUpdateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DefaultAvailability** | Pointer to [**NullableProductAvailabilityType**](ProductAvailabilityType.md) |  | [optional] 
**DefaultCurrency** | Pointer to [**NullableNullableCurrency**](NullableCurrency.md) |  | [optional] 
**Name** | Pointer to **string** | A human-friendly name associated to a given feed. | [optional] 
**Format** | Pointer to [**CatalogsFormat**](CatalogsFormat.md) |  | [optional] 
**Credentials** | Pointer to [**NullableCatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional] 
**Location** | Pointer to **string** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | [optional] 
**PreferredProcessingSchedule** | Pointer to [**NullableCatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional] 
**Status** | Pointer to [**CatalogsStatus**](CatalogsStatus.md) |  | [optional] 

## Methods

### NewCatalogsFeedsUpdateRequest

`func NewCatalogsFeedsUpdateRequest() *CatalogsFeedsUpdateRequest`

NewCatalogsFeedsUpdateRequest instantiates a new CatalogsFeedsUpdateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsFeedsUpdateRequestWithDefaults

`func NewCatalogsFeedsUpdateRequestWithDefaults() *CatalogsFeedsUpdateRequest`

NewCatalogsFeedsUpdateRequestWithDefaults instantiates a new CatalogsFeedsUpdateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDefaultAvailability

`func (o *CatalogsFeedsUpdateRequest) GetDefaultAvailability() ProductAvailabilityType`

GetDefaultAvailability returns the DefaultAvailability field if non-nil, zero value otherwise.

### GetDefaultAvailabilityOk

`func (o *CatalogsFeedsUpdateRequest) GetDefaultAvailabilityOk() (*ProductAvailabilityType, bool)`

GetDefaultAvailabilityOk returns a tuple with the DefaultAvailability field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefaultAvailability

`func (o *CatalogsFeedsUpdateRequest) SetDefaultAvailability(v ProductAvailabilityType)`

SetDefaultAvailability sets DefaultAvailability field to given value.

### HasDefaultAvailability

`func (o *CatalogsFeedsUpdateRequest) HasDefaultAvailability() bool`

HasDefaultAvailability returns a boolean if a field has been set.

### SetDefaultAvailabilityNil

`func (o *CatalogsFeedsUpdateRequest) SetDefaultAvailabilityNil(b bool)`

 SetDefaultAvailabilityNil sets the value for DefaultAvailability to be an explicit nil

### UnsetDefaultAvailability
`func (o *CatalogsFeedsUpdateRequest) UnsetDefaultAvailability()`

UnsetDefaultAvailability ensures that no value is present for DefaultAvailability, not even an explicit nil
### GetDefaultCurrency

`func (o *CatalogsFeedsUpdateRequest) GetDefaultCurrency() NullableCurrency`

GetDefaultCurrency returns the DefaultCurrency field if non-nil, zero value otherwise.

### GetDefaultCurrencyOk

`func (o *CatalogsFeedsUpdateRequest) GetDefaultCurrencyOk() (*NullableCurrency, bool)`

GetDefaultCurrencyOk returns a tuple with the DefaultCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefaultCurrency

`func (o *CatalogsFeedsUpdateRequest) SetDefaultCurrency(v NullableCurrency)`

SetDefaultCurrency sets DefaultCurrency field to given value.

### HasDefaultCurrency

`func (o *CatalogsFeedsUpdateRequest) HasDefaultCurrency() bool`

HasDefaultCurrency returns a boolean if a field has been set.

### SetDefaultCurrencyNil

`func (o *CatalogsFeedsUpdateRequest) SetDefaultCurrencyNil(b bool)`

 SetDefaultCurrencyNil sets the value for DefaultCurrency to be an explicit nil

### UnsetDefaultCurrency
`func (o *CatalogsFeedsUpdateRequest) UnsetDefaultCurrency()`

UnsetDefaultCurrency ensures that no value is present for DefaultCurrency, not even an explicit nil
### GetName

`func (o *CatalogsFeedsUpdateRequest) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CatalogsFeedsUpdateRequest) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CatalogsFeedsUpdateRequest) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CatalogsFeedsUpdateRequest) HasName() bool`

HasName returns a boolean if a field has been set.

### GetFormat

`func (o *CatalogsFeedsUpdateRequest) GetFormat() CatalogsFormat`

GetFormat returns the Format field if non-nil, zero value otherwise.

### GetFormatOk

`func (o *CatalogsFeedsUpdateRequest) GetFormatOk() (*CatalogsFormat, bool)`

GetFormatOk returns a tuple with the Format field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFormat

`func (o *CatalogsFeedsUpdateRequest) SetFormat(v CatalogsFormat)`

SetFormat sets Format field to given value.

### HasFormat

`func (o *CatalogsFeedsUpdateRequest) HasFormat() bool`

HasFormat returns a boolean if a field has been set.

### GetCredentials

`func (o *CatalogsFeedsUpdateRequest) GetCredentials() CatalogsFeedCredentials`

GetCredentials returns the Credentials field if non-nil, zero value otherwise.

### GetCredentialsOk

`func (o *CatalogsFeedsUpdateRequest) GetCredentialsOk() (*CatalogsFeedCredentials, bool)`

GetCredentialsOk returns a tuple with the Credentials field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCredentials

`func (o *CatalogsFeedsUpdateRequest) SetCredentials(v CatalogsFeedCredentials)`

SetCredentials sets Credentials field to given value.

### HasCredentials

`func (o *CatalogsFeedsUpdateRequest) HasCredentials() bool`

HasCredentials returns a boolean if a field has been set.

### SetCredentialsNil

`func (o *CatalogsFeedsUpdateRequest) SetCredentialsNil(b bool)`

 SetCredentialsNil sets the value for Credentials to be an explicit nil

### UnsetCredentials
`func (o *CatalogsFeedsUpdateRequest) UnsetCredentials()`

UnsetCredentials ensures that no value is present for Credentials, not even an explicit nil
### GetLocation

`func (o *CatalogsFeedsUpdateRequest) GetLocation() string`

GetLocation returns the Location field if non-nil, zero value otherwise.

### GetLocationOk

`func (o *CatalogsFeedsUpdateRequest) GetLocationOk() (*string, bool)`

GetLocationOk returns a tuple with the Location field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocation

`func (o *CatalogsFeedsUpdateRequest) SetLocation(v string)`

SetLocation sets Location field to given value.

### HasLocation

`func (o *CatalogsFeedsUpdateRequest) HasLocation() bool`

HasLocation returns a boolean if a field has been set.

### GetPreferredProcessingSchedule

`func (o *CatalogsFeedsUpdateRequest) GetPreferredProcessingSchedule() CatalogsFeedProcessingSchedule`

GetPreferredProcessingSchedule returns the PreferredProcessingSchedule field if non-nil, zero value otherwise.

### GetPreferredProcessingScheduleOk

`func (o *CatalogsFeedsUpdateRequest) GetPreferredProcessingScheduleOk() (*CatalogsFeedProcessingSchedule, bool)`

GetPreferredProcessingScheduleOk returns a tuple with the PreferredProcessingSchedule field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPreferredProcessingSchedule

`func (o *CatalogsFeedsUpdateRequest) SetPreferredProcessingSchedule(v CatalogsFeedProcessingSchedule)`

SetPreferredProcessingSchedule sets PreferredProcessingSchedule field to given value.

### HasPreferredProcessingSchedule

`func (o *CatalogsFeedsUpdateRequest) HasPreferredProcessingSchedule() bool`

HasPreferredProcessingSchedule returns a boolean if a field has been set.

### SetPreferredProcessingScheduleNil

`func (o *CatalogsFeedsUpdateRequest) SetPreferredProcessingScheduleNil(b bool)`

 SetPreferredProcessingScheduleNil sets the value for PreferredProcessingSchedule to be an explicit nil

### UnsetPreferredProcessingSchedule
`func (o *CatalogsFeedsUpdateRequest) UnsetPreferredProcessingSchedule()`

UnsetPreferredProcessingSchedule ensures that no value is present for PreferredProcessingSchedule, not even an explicit nil
### GetStatus

`func (o *CatalogsFeedsUpdateRequest) GetStatus() CatalogsStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *CatalogsFeedsUpdateRequest) GetStatusOk() (*CatalogsStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *CatalogsFeedsUpdateRequest) SetStatus(v CatalogsStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *CatalogsFeedsUpdateRequest) HasStatus() bool`

HasStatus returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


