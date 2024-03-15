# CatalogsRetailFeedsUpdateRequest

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
**DefaultAvailability** | Pointer to [**NullableProductAvailabilityType**](ProductAvailabilityType.md) |  | [optional] 

## Methods

### NewCatalogsRetailFeedsUpdateRequest

`func NewCatalogsRetailFeedsUpdateRequest(catalogType CatalogsType, ) *CatalogsRetailFeedsUpdateRequest`

NewCatalogsRetailFeedsUpdateRequest instantiates a new CatalogsRetailFeedsUpdateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsRetailFeedsUpdateRequestWithDefaults

`func NewCatalogsRetailFeedsUpdateRequestWithDefaults() *CatalogsRetailFeedsUpdateRequest`

NewCatalogsRetailFeedsUpdateRequestWithDefaults instantiates a new CatalogsRetailFeedsUpdateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDefaultCurrency

`func (o *CatalogsRetailFeedsUpdateRequest) GetDefaultCurrency() NullableCurrency`

GetDefaultCurrency returns the DefaultCurrency field if non-nil, zero value otherwise.

### GetDefaultCurrencyOk

`func (o *CatalogsRetailFeedsUpdateRequest) GetDefaultCurrencyOk() (*NullableCurrency, bool)`

GetDefaultCurrencyOk returns a tuple with the DefaultCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefaultCurrency

`func (o *CatalogsRetailFeedsUpdateRequest) SetDefaultCurrency(v NullableCurrency)`

SetDefaultCurrency sets DefaultCurrency field to given value.

### HasDefaultCurrency

`func (o *CatalogsRetailFeedsUpdateRequest) HasDefaultCurrency() bool`

HasDefaultCurrency returns a boolean if a field has been set.

### SetDefaultCurrencyNil

`func (o *CatalogsRetailFeedsUpdateRequest) SetDefaultCurrencyNil(b bool)`

 SetDefaultCurrencyNil sets the value for DefaultCurrency to be an explicit nil

### UnsetDefaultCurrency
`func (o *CatalogsRetailFeedsUpdateRequest) UnsetDefaultCurrency()`

UnsetDefaultCurrency ensures that no value is present for DefaultCurrency, not even an explicit nil
### GetName

`func (o *CatalogsRetailFeedsUpdateRequest) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CatalogsRetailFeedsUpdateRequest) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CatalogsRetailFeedsUpdateRequest) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CatalogsRetailFeedsUpdateRequest) HasName() bool`

HasName returns a boolean if a field has been set.

### GetFormat

`func (o *CatalogsRetailFeedsUpdateRequest) GetFormat() CatalogsFormat`

GetFormat returns the Format field if non-nil, zero value otherwise.

### GetFormatOk

`func (o *CatalogsRetailFeedsUpdateRequest) GetFormatOk() (*CatalogsFormat, bool)`

GetFormatOk returns a tuple with the Format field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFormat

`func (o *CatalogsRetailFeedsUpdateRequest) SetFormat(v CatalogsFormat)`

SetFormat sets Format field to given value.

### HasFormat

`func (o *CatalogsRetailFeedsUpdateRequest) HasFormat() bool`

HasFormat returns a boolean if a field has been set.

### GetCredentials

`func (o *CatalogsRetailFeedsUpdateRequest) GetCredentials() CatalogsFeedCredentials`

GetCredentials returns the Credentials field if non-nil, zero value otherwise.

### GetCredentialsOk

`func (o *CatalogsRetailFeedsUpdateRequest) GetCredentialsOk() (*CatalogsFeedCredentials, bool)`

GetCredentialsOk returns a tuple with the Credentials field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCredentials

`func (o *CatalogsRetailFeedsUpdateRequest) SetCredentials(v CatalogsFeedCredentials)`

SetCredentials sets Credentials field to given value.

### HasCredentials

`func (o *CatalogsRetailFeedsUpdateRequest) HasCredentials() bool`

HasCredentials returns a boolean if a field has been set.

### SetCredentialsNil

`func (o *CatalogsRetailFeedsUpdateRequest) SetCredentialsNil(b bool)`

 SetCredentialsNil sets the value for Credentials to be an explicit nil

### UnsetCredentials
`func (o *CatalogsRetailFeedsUpdateRequest) UnsetCredentials()`

UnsetCredentials ensures that no value is present for Credentials, not even an explicit nil
### GetLocation

`func (o *CatalogsRetailFeedsUpdateRequest) GetLocation() string`

GetLocation returns the Location field if non-nil, zero value otherwise.

### GetLocationOk

`func (o *CatalogsRetailFeedsUpdateRequest) GetLocationOk() (*string, bool)`

GetLocationOk returns a tuple with the Location field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocation

`func (o *CatalogsRetailFeedsUpdateRequest) SetLocation(v string)`

SetLocation sets Location field to given value.

### HasLocation

`func (o *CatalogsRetailFeedsUpdateRequest) HasLocation() bool`

HasLocation returns a boolean if a field has been set.

### GetPreferredProcessingSchedule

`func (o *CatalogsRetailFeedsUpdateRequest) GetPreferredProcessingSchedule() CatalogsFeedProcessingSchedule`

GetPreferredProcessingSchedule returns the PreferredProcessingSchedule field if non-nil, zero value otherwise.

### GetPreferredProcessingScheduleOk

`func (o *CatalogsRetailFeedsUpdateRequest) GetPreferredProcessingScheduleOk() (*CatalogsFeedProcessingSchedule, bool)`

GetPreferredProcessingScheduleOk returns a tuple with the PreferredProcessingSchedule field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPreferredProcessingSchedule

`func (o *CatalogsRetailFeedsUpdateRequest) SetPreferredProcessingSchedule(v CatalogsFeedProcessingSchedule)`

SetPreferredProcessingSchedule sets PreferredProcessingSchedule field to given value.

### HasPreferredProcessingSchedule

`func (o *CatalogsRetailFeedsUpdateRequest) HasPreferredProcessingSchedule() bool`

HasPreferredProcessingSchedule returns a boolean if a field has been set.

### SetPreferredProcessingScheduleNil

`func (o *CatalogsRetailFeedsUpdateRequest) SetPreferredProcessingScheduleNil(b bool)`

 SetPreferredProcessingScheduleNil sets the value for PreferredProcessingSchedule to be an explicit nil

### UnsetPreferredProcessingSchedule
`func (o *CatalogsRetailFeedsUpdateRequest) UnsetPreferredProcessingSchedule()`

UnsetPreferredProcessingSchedule ensures that no value is present for PreferredProcessingSchedule, not even an explicit nil
### GetStatus

`func (o *CatalogsRetailFeedsUpdateRequest) GetStatus() CatalogsStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *CatalogsRetailFeedsUpdateRequest) GetStatusOk() (*CatalogsStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *CatalogsRetailFeedsUpdateRequest) SetStatus(v CatalogsStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *CatalogsRetailFeedsUpdateRequest) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetCatalogType

`func (o *CatalogsRetailFeedsUpdateRequest) GetCatalogType() CatalogsType`

GetCatalogType returns the CatalogType field if non-nil, zero value otherwise.

### GetCatalogTypeOk

`func (o *CatalogsRetailFeedsUpdateRequest) GetCatalogTypeOk() (*CatalogsType, bool)`

GetCatalogTypeOk returns a tuple with the CatalogType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogType

`func (o *CatalogsRetailFeedsUpdateRequest) SetCatalogType(v CatalogsType)`

SetCatalogType sets CatalogType field to given value.


### GetDefaultAvailability

`func (o *CatalogsRetailFeedsUpdateRequest) GetDefaultAvailability() ProductAvailabilityType`

GetDefaultAvailability returns the DefaultAvailability field if non-nil, zero value otherwise.

### GetDefaultAvailabilityOk

`func (o *CatalogsRetailFeedsUpdateRequest) GetDefaultAvailabilityOk() (*ProductAvailabilityType, bool)`

GetDefaultAvailabilityOk returns a tuple with the DefaultAvailability field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefaultAvailability

`func (o *CatalogsRetailFeedsUpdateRequest) SetDefaultAvailability(v ProductAvailabilityType)`

SetDefaultAvailability sets DefaultAvailability field to given value.

### HasDefaultAvailability

`func (o *CatalogsRetailFeedsUpdateRequest) HasDefaultAvailability() bool`

HasDefaultAvailability returns a boolean if a field has been set.

### SetDefaultAvailabilityNil

`func (o *CatalogsRetailFeedsUpdateRequest) SetDefaultAvailabilityNil(b bool)`

 SetDefaultAvailabilityNil sets the value for DefaultAvailability to be an explicit nil

### UnsetDefaultAvailability
`func (o *CatalogsRetailFeedsUpdateRequest) UnsetDefaultAvailability()`

UnsetDefaultAvailability ensures that no value is present for DefaultAvailability, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


