# CatalogsVerticalFeedsCreateRequest

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
**CatalogId** | Pointer to **NullableString** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple hotel feeds but this will change in the future. | [optional] 

## Methods

### NewCatalogsVerticalFeedsCreateRequest

`func NewCatalogsVerticalFeedsCreateRequest(name string, format CatalogsFormat, defaultLocale CatalogsFeedsCreateRequestDefaultLocale, location string, catalogType CatalogsType, defaultCountry Country, ) *CatalogsVerticalFeedsCreateRequest`

NewCatalogsVerticalFeedsCreateRequest instantiates a new CatalogsVerticalFeedsCreateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsVerticalFeedsCreateRequestWithDefaults

`func NewCatalogsVerticalFeedsCreateRequestWithDefaults() *CatalogsVerticalFeedsCreateRequest`

NewCatalogsVerticalFeedsCreateRequestWithDefaults instantiates a new CatalogsVerticalFeedsCreateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDefaultCurrency

`func (o *CatalogsVerticalFeedsCreateRequest) GetDefaultCurrency() NullableCurrency`

GetDefaultCurrency returns the DefaultCurrency field if non-nil, zero value otherwise.

### GetDefaultCurrencyOk

`func (o *CatalogsVerticalFeedsCreateRequest) GetDefaultCurrencyOk() (*NullableCurrency, bool)`

GetDefaultCurrencyOk returns a tuple with the DefaultCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefaultCurrency

`func (o *CatalogsVerticalFeedsCreateRequest) SetDefaultCurrency(v NullableCurrency)`

SetDefaultCurrency sets DefaultCurrency field to given value.

### HasDefaultCurrency

`func (o *CatalogsVerticalFeedsCreateRequest) HasDefaultCurrency() bool`

HasDefaultCurrency returns a boolean if a field has been set.

### SetDefaultCurrencyNil

`func (o *CatalogsVerticalFeedsCreateRequest) SetDefaultCurrencyNil(b bool)`

 SetDefaultCurrencyNil sets the value for DefaultCurrency to be an explicit nil

### UnsetDefaultCurrency
`func (o *CatalogsVerticalFeedsCreateRequest) UnsetDefaultCurrency()`

UnsetDefaultCurrency ensures that no value is present for DefaultCurrency, not even an explicit nil
### GetName

`func (o *CatalogsVerticalFeedsCreateRequest) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CatalogsVerticalFeedsCreateRequest) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CatalogsVerticalFeedsCreateRequest) SetName(v string)`

SetName sets Name field to given value.


### GetFormat

`func (o *CatalogsVerticalFeedsCreateRequest) GetFormat() CatalogsFormat`

GetFormat returns the Format field if non-nil, zero value otherwise.

### GetFormatOk

`func (o *CatalogsVerticalFeedsCreateRequest) GetFormatOk() (*CatalogsFormat, bool)`

GetFormatOk returns a tuple with the Format field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFormat

`func (o *CatalogsVerticalFeedsCreateRequest) SetFormat(v CatalogsFormat)`

SetFormat sets Format field to given value.


### GetDefaultLocale

`func (o *CatalogsVerticalFeedsCreateRequest) GetDefaultLocale() CatalogsFeedsCreateRequestDefaultLocale`

GetDefaultLocale returns the DefaultLocale field if non-nil, zero value otherwise.

### GetDefaultLocaleOk

`func (o *CatalogsVerticalFeedsCreateRequest) GetDefaultLocaleOk() (*CatalogsFeedsCreateRequestDefaultLocale, bool)`

GetDefaultLocaleOk returns a tuple with the DefaultLocale field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefaultLocale

`func (o *CatalogsVerticalFeedsCreateRequest) SetDefaultLocale(v CatalogsFeedsCreateRequestDefaultLocale)`

SetDefaultLocale sets DefaultLocale field to given value.


### GetCredentials

`func (o *CatalogsVerticalFeedsCreateRequest) GetCredentials() CatalogsFeedCredentials`

GetCredentials returns the Credentials field if non-nil, zero value otherwise.

### GetCredentialsOk

`func (o *CatalogsVerticalFeedsCreateRequest) GetCredentialsOk() (*CatalogsFeedCredentials, bool)`

GetCredentialsOk returns a tuple with the Credentials field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCredentials

`func (o *CatalogsVerticalFeedsCreateRequest) SetCredentials(v CatalogsFeedCredentials)`

SetCredentials sets Credentials field to given value.

### HasCredentials

`func (o *CatalogsVerticalFeedsCreateRequest) HasCredentials() bool`

HasCredentials returns a boolean if a field has been set.

### SetCredentialsNil

`func (o *CatalogsVerticalFeedsCreateRequest) SetCredentialsNil(b bool)`

 SetCredentialsNil sets the value for Credentials to be an explicit nil

### UnsetCredentials
`func (o *CatalogsVerticalFeedsCreateRequest) UnsetCredentials()`

UnsetCredentials ensures that no value is present for Credentials, not even an explicit nil
### GetLocation

`func (o *CatalogsVerticalFeedsCreateRequest) GetLocation() string`

GetLocation returns the Location field if non-nil, zero value otherwise.

### GetLocationOk

`func (o *CatalogsVerticalFeedsCreateRequest) GetLocationOk() (*string, bool)`

GetLocationOk returns a tuple with the Location field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocation

`func (o *CatalogsVerticalFeedsCreateRequest) SetLocation(v string)`

SetLocation sets Location field to given value.


### GetPreferredProcessingSchedule

`func (o *CatalogsVerticalFeedsCreateRequest) GetPreferredProcessingSchedule() CatalogsFeedProcessingSchedule`

GetPreferredProcessingSchedule returns the PreferredProcessingSchedule field if non-nil, zero value otherwise.

### GetPreferredProcessingScheduleOk

`func (o *CatalogsVerticalFeedsCreateRequest) GetPreferredProcessingScheduleOk() (*CatalogsFeedProcessingSchedule, bool)`

GetPreferredProcessingScheduleOk returns a tuple with the PreferredProcessingSchedule field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPreferredProcessingSchedule

`func (o *CatalogsVerticalFeedsCreateRequest) SetPreferredProcessingSchedule(v CatalogsFeedProcessingSchedule)`

SetPreferredProcessingSchedule sets PreferredProcessingSchedule field to given value.

### HasPreferredProcessingSchedule

`func (o *CatalogsVerticalFeedsCreateRequest) HasPreferredProcessingSchedule() bool`

HasPreferredProcessingSchedule returns a boolean if a field has been set.

### SetPreferredProcessingScheduleNil

`func (o *CatalogsVerticalFeedsCreateRequest) SetPreferredProcessingScheduleNil(b bool)`

 SetPreferredProcessingScheduleNil sets the value for PreferredProcessingSchedule to be an explicit nil

### UnsetPreferredProcessingSchedule
`func (o *CatalogsVerticalFeedsCreateRequest) UnsetPreferredProcessingSchedule()`

UnsetPreferredProcessingSchedule ensures that no value is present for PreferredProcessingSchedule, not even an explicit nil
### GetCatalogType

`func (o *CatalogsVerticalFeedsCreateRequest) GetCatalogType() CatalogsType`

GetCatalogType returns the CatalogType field if non-nil, zero value otherwise.

### GetCatalogTypeOk

`func (o *CatalogsVerticalFeedsCreateRequest) GetCatalogTypeOk() (*CatalogsType, bool)`

GetCatalogTypeOk returns a tuple with the CatalogType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogType

`func (o *CatalogsVerticalFeedsCreateRequest) SetCatalogType(v CatalogsType)`

SetCatalogType sets CatalogType field to given value.


### GetDefaultCountry

`func (o *CatalogsVerticalFeedsCreateRequest) GetDefaultCountry() Country`

GetDefaultCountry returns the DefaultCountry field if non-nil, zero value otherwise.

### GetDefaultCountryOk

`func (o *CatalogsVerticalFeedsCreateRequest) GetDefaultCountryOk() (*Country, bool)`

GetDefaultCountryOk returns a tuple with the DefaultCountry field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefaultCountry

`func (o *CatalogsVerticalFeedsCreateRequest) SetDefaultCountry(v Country)`

SetDefaultCountry sets DefaultCountry field to given value.


### GetDefaultAvailability

`func (o *CatalogsVerticalFeedsCreateRequest) GetDefaultAvailability() ProductAvailabilityType`

GetDefaultAvailability returns the DefaultAvailability field if non-nil, zero value otherwise.

### GetDefaultAvailabilityOk

`func (o *CatalogsVerticalFeedsCreateRequest) GetDefaultAvailabilityOk() (*ProductAvailabilityType, bool)`

GetDefaultAvailabilityOk returns a tuple with the DefaultAvailability field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefaultAvailability

`func (o *CatalogsVerticalFeedsCreateRequest) SetDefaultAvailability(v ProductAvailabilityType)`

SetDefaultAvailability sets DefaultAvailability field to given value.

### HasDefaultAvailability

`func (o *CatalogsVerticalFeedsCreateRequest) HasDefaultAvailability() bool`

HasDefaultAvailability returns a boolean if a field has been set.

### SetDefaultAvailabilityNil

`func (o *CatalogsVerticalFeedsCreateRequest) SetDefaultAvailabilityNil(b bool)`

 SetDefaultAvailabilityNil sets the value for DefaultAvailability to be an explicit nil

### UnsetDefaultAvailability
`func (o *CatalogsVerticalFeedsCreateRequest) UnsetDefaultAvailability()`

UnsetDefaultAvailability ensures that no value is present for DefaultAvailability, not even an explicit nil
### GetCatalogId

`func (o *CatalogsVerticalFeedsCreateRequest) GetCatalogId() string`

GetCatalogId returns the CatalogId field if non-nil, zero value otherwise.

### GetCatalogIdOk

`func (o *CatalogsVerticalFeedsCreateRequest) GetCatalogIdOk() (*string, bool)`

GetCatalogIdOk returns a tuple with the CatalogId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogId

`func (o *CatalogsVerticalFeedsCreateRequest) SetCatalogId(v string)`

SetCatalogId sets CatalogId field to given value.

### HasCatalogId

`func (o *CatalogsVerticalFeedsCreateRequest) HasCatalogId() bool`

HasCatalogId returns a boolean if a field has been set.

### SetCatalogIdNil

`func (o *CatalogsVerticalFeedsCreateRequest) SetCatalogIdNil(b bool)`

 SetCatalogIdNil sets the value for CatalogId to be an explicit nil

### UnsetCatalogId
`func (o *CatalogsVerticalFeedsCreateRequest) UnsetCatalogId()`

UnsetCatalogId ensures that no value is present for CatalogId, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


