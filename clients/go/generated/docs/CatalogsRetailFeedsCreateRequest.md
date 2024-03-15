# CatalogsRetailFeedsCreateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DefaultCurrency** | Pointer to [**NullableNullableCurrency**](NullableCurrency.md) |  | [optional] 
**Name** | **string** | A human-friendly name associated to a given feed. | 
**Format** | [**CatalogsFormat**](CatalogsFormat.md) |  | 
**DefaultLocale** | [**CatalogsFeedsCreateRequestDefaultLocale**](CatalogsFeedsCreateRequestDefaultLocale.md) |  | 
**Credentials** | Pointer to [**NullableCatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional] 
**Location** | **string** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**PreferredProcessingSchedule** | Pointer to [**NullableCatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional] 
**CatalogType** | [**CatalogsType**](CatalogsType.md) |  | 
**DefaultCountry** | [**Country**](Country.md) |  | 
**DefaultAvailability** | Pointer to [**NullableProductAvailabilityType**](ProductAvailabilityType.md) |  | [optional] 

## Methods

### NewCatalogsRetailFeedsCreateRequest

`func NewCatalogsRetailFeedsCreateRequest(name string, format CatalogsFormat, defaultLocale CatalogsFeedsCreateRequestDefaultLocale, location string, catalogType CatalogsType, defaultCountry Country, ) *CatalogsRetailFeedsCreateRequest`

NewCatalogsRetailFeedsCreateRequest instantiates a new CatalogsRetailFeedsCreateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsRetailFeedsCreateRequestWithDefaults

`func NewCatalogsRetailFeedsCreateRequestWithDefaults() *CatalogsRetailFeedsCreateRequest`

NewCatalogsRetailFeedsCreateRequestWithDefaults instantiates a new CatalogsRetailFeedsCreateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDefaultCurrency

`func (o *CatalogsRetailFeedsCreateRequest) GetDefaultCurrency() NullableCurrency`

GetDefaultCurrency returns the DefaultCurrency field if non-nil, zero value otherwise.

### GetDefaultCurrencyOk

`func (o *CatalogsRetailFeedsCreateRequest) GetDefaultCurrencyOk() (*NullableCurrency, bool)`

GetDefaultCurrencyOk returns a tuple with the DefaultCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefaultCurrency

`func (o *CatalogsRetailFeedsCreateRequest) SetDefaultCurrency(v NullableCurrency)`

SetDefaultCurrency sets DefaultCurrency field to given value.

### HasDefaultCurrency

`func (o *CatalogsRetailFeedsCreateRequest) HasDefaultCurrency() bool`

HasDefaultCurrency returns a boolean if a field has been set.

### SetDefaultCurrencyNil

`func (o *CatalogsRetailFeedsCreateRequest) SetDefaultCurrencyNil(b bool)`

 SetDefaultCurrencyNil sets the value for DefaultCurrency to be an explicit nil

### UnsetDefaultCurrency
`func (o *CatalogsRetailFeedsCreateRequest) UnsetDefaultCurrency()`

UnsetDefaultCurrency ensures that no value is present for DefaultCurrency, not even an explicit nil
### GetName

`func (o *CatalogsRetailFeedsCreateRequest) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CatalogsRetailFeedsCreateRequest) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CatalogsRetailFeedsCreateRequest) SetName(v string)`

SetName sets Name field to given value.


### GetFormat

`func (o *CatalogsRetailFeedsCreateRequest) GetFormat() CatalogsFormat`

GetFormat returns the Format field if non-nil, zero value otherwise.

### GetFormatOk

`func (o *CatalogsRetailFeedsCreateRequest) GetFormatOk() (*CatalogsFormat, bool)`

GetFormatOk returns a tuple with the Format field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFormat

`func (o *CatalogsRetailFeedsCreateRequest) SetFormat(v CatalogsFormat)`

SetFormat sets Format field to given value.


### GetDefaultLocale

`func (o *CatalogsRetailFeedsCreateRequest) GetDefaultLocale() CatalogsFeedsCreateRequestDefaultLocale`

GetDefaultLocale returns the DefaultLocale field if non-nil, zero value otherwise.

### GetDefaultLocaleOk

`func (o *CatalogsRetailFeedsCreateRequest) GetDefaultLocaleOk() (*CatalogsFeedsCreateRequestDefaultLocale, bool)`

GetDefaultLocaleOk returns a tuple with the DefaultLocale field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefaultLocale

`func (o *CatalogsRetailFeedsCreateRequest) SetDefaultLocale(v CatalogsFeedsCreateRequestDefaultLocale)`

SetDefaultLocale sets DefaultLocale field to given value.


### GetCredentials

`func (o *CatalogsRetailFeedsCreateRequest) GetCredentials() CatalogsFeedCredentials`

GetCredentials returns the Credentials field if non-nil, zero value otherwise.

### GetCredentialsOk

`func (o *CatalogsRetailFeedsCreateRequest) GetCredentialsOk() (*CatalogsFeedCredentials, bool)`

GetCredentialsOk returns a tuple with the Credentials field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCredentials

`func (o *CatalogsRetailFeedsCreateRequest) SetCredentials(v CatalogsFeedCredentials)`

SetCredentials sets Credentials field to given value.

### HasCredentials

`func (o *CatalogsRetailFeedsCreateRequest) HasCredentials() bool`

HasCredentials returns a boolean if a field has been set.

### SetCredentialsNil

`func (o *CatalogsRetailFeedsCreateRequest) SetCredentialsNil(b bool)`

 SetCredentialsNil sets the value for Credentials to be an explicit nil

### UnsetCredentials
`func (o *CatalogsRetailFeedsCreateRequest) UnsetCredentials()`

UnsetCredentials ensures that no value is present for Credentials, not even an explicit nil
### GetLocation

`func (o *CatalogsRetailFeedsCreateRequest) GetLocation() string`

GetLocation returns the Location field if non-nil, zero value otherwise.

### GetLocationOk

`func (o *CatalogsRetailFeedsCreateRequest) GetLocationOk() (*string, bool)`

GetLocationOk returns a tuple with the Location field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocation

`func (o *CatalogsRetailFeedsCreateRequest) SetLocation(v string)`

SetLocation sets Location field to given value.


### GetPreferredProcessingSchedule

`func (o *CatalogsRetailFeedsCreateRequest) GetPreferredProcessingSchedule() CatalogsFeedProcessingSchedule`

GetPreferredProcessingSchedule returns the PreferredProcessingSchedule field if non-nil, zero value otherwise.

### GetPreferredProcessingScheduleOk

`func (o *CatalogsRetailFeedsCreateRequest) GetPreferredProcessingScheduleOk() (*CatalogsFeedProcessingSchedule, bool)`

GetPreferredProcessingScheduleOk returns a tuple with the PreferredProcessingSchedule field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPreferredProcessingSchedule

`func (o *CatalogsRetailFeedsCreateRequest) SetPreferredProcessingSchedule(v CatalogsFeedProcessingSchedule)`

SetPreferredProcessingSchedule sets PreferredProcessingSchedule field to given value.

### HasPreferredProcessingSchedule

`func (o *CatalogsRetailFeedsCreateRequest) HasPreferredProcessingSchedule() bool`

HasPreferredProcessingSchedule returns a boolean if a field has been set.

### SetPreferredProcessingScheduleNil

`func (o *CatalogsRetailFeedsCreateRequest) SetPreferredProcessingScheduleNil(b bool)`

 SetPreferredProcessingScheduleNil sets the value for PreferredProcessingSchedule to be an explicit nil

### UnsetPreferredProcessingSchedule
`func (o *CatalogsRetailFeedsCreateRequest) UnsetPreferredProcessingSchedule()`

UnsetPreferredProcessingSchedule ensures that no value is present for PreferredProcessingSchedule, not even an explicit nil
### GetCatalogType

`func (o *CatalogsRetailFeedsCreateRequest) GetCatalogType() CatalogsType`

GetCatalogType returns the CatalogType field if non-nil, zero value otherwise.

### GetCatalogTypeOk

`func (o *CatalogsRetailFeedsCreateRequest) GetCatalogTypeOk() (*CatalogsType, bool)`

GetCatalogTypeOk returns a tuple with the CatalogType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogType

`func (o *CatalogsRetailFeedsCreateRequest) SetCatalogType(v CatalogsType)`

SetCatalogType sets CatalogType field to given value.


### GetDefaultCountry

`func (o *CatalogsRetailFeedsCreateRequest) GetDefaultCountry() Country`

GetDefaultCountry returns the DefaultCountry field if non-nil, zero value otherwise.

### GetDefaultCountryOk

`func (o *CatalogsRetailFeedsCreateRequest) GetDefaultCountryOk() (*Country, bool)`

GetDefaultCountryOk returns a tuple with the DefaultCountry field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefaultCountry

`func (o *CatalogsRetailFeedsCreateRequest) SetDefaultCountry(v Country)`

SetDefaultCountry sets DefaultCountry field to given value.


### GetDefaultAvailability

`func (o *CatalogsRetailFeedsCreateRequest) GetDefaultAvailability() ProductAvailabilityType`

GetDefaultAvailability returns the DefaultAvailability field if non-nil, zero value otherwise.

### GetDefaultAvailabilityOk

`func (o *CatalogsRetailFeedsCreateRequest) GetDefaultAvailabilityOk() (*ProductAvailabilityType, bool)`

GetDefaultAvailabilityOk returns a tuple with the DefaultAvailability field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefaultAvailability

`func (o *CatalogsRetailFeedsCreateRequest) SetDefaultAvailability(v ProductAvailabilityType)`

SetDefaultAvailability sets DefaultAvailability field to given value.

### HasDefaultAvailability

`func (o *CatalogsRetailFeedsCreateRequest) HasDefaultAvailability() bool`

HasDefaultAvailability returns a boolean if a field has been set.

### SetDefaultAvailabilityNil

`func (o *CatalogsRetailFeedsCreateRequest) SetDefaultAvailabilityNil(b bool)`

 SetDefaultAvailabilityNil sets the value for DefaultAvailability to be an explicit nil

### UnsetDefaultAvailability
`func (o *CatalogsRetailFeedsCreateRequest) UnsetDefaultAvailability()`

UnsetDefaultAvailability ensures that no value is present for DefaultAvailability, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


