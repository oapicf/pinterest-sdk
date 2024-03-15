# CatalogsFeed

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CreatedAt** | Pointer to **time.Time** |  | [optional] 
**Id** | Pointer to **string** |  | [optional] 
**UpdatedAt** | Pointer to **time.Time** |  | [optional] 
**Name** | **NullableString** | A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. | 
**Format** | [**CatalogsFormat**](CatalogsFormat.md) |  | 
**CatalogType** | [**CatalogsType**](CatalogsType.md) |  | 
**Credentials** | [**NullableCatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | 
**Location** | **string** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**PreferredProcessingSchedule** | [**NullableCatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | 
**Status** | [**CatalogsStatus**](CatalogsStatus.md) |  | 
**DefaultCurrency** | [**NullableNullableCurrency**](NullableCurrency.md) |  | 
**DefaultLocale** | **string** | The locale used within a feed for product descriptions. | 
**DefaultCountry** | [**Country**](Country.md) |  | 
**DefaultAvailability** | [**NullableProductAvailabilityType**](ProductAvailabilityType.md) |  | 
**CatalogId** | **NullableString** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. | 

## Methods

### NewCatalogsFeed

`func NewCatalogsFeed(name NullableString, format CatalogsFormat, catalogType CatalogsType, credentials NullableCatalogsFeedCredentials, location string, preferredProcessingSchedule NullableCatalogsFeedProcessingSchedule, status CatalogsStatus, defaultCurrency NullableNullableCurrency, defaultLocale string, defaultCountry Country, defaultAvailability NullableProductAvailabilityType, catalogId NullableString, ) *CatalogsFeed`

NewCatalogsFeed instantiates a new CatalogsFeed object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsFeedWithDefaults

`func NewCatalogsFeedWithDefaults() *CatalogsFeed`

NewCatalogsFeedWithDefaults instantiates a new CatalogsFeed object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCreatedAt

`func (o *CatalogsFeed) GetCreatedAt() time.Time`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *CatalogsFeed) GetCreatedAtOk() (*time.Time, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *CatalogsFeed) SetCreatedAt(v time.Time)`

SetCreatedAt sets CreatedAt field to given value.

### HasCreatedAt

`func (o *CatalogsFeed) HasCreatedAt() bool`

HasCreatedAt returns a boolean if a field has been set.

### GetId

`func (o *CatalogsFeed) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CatalogsFeed) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CatalogsFeed) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *CatalogsFeed) HasId() bool`

HasId returns a boolean if a field has been set.

### GetUpdatedAt

`func (o *CatalogsFeed) GetUpdatedAt() time.Time`

GetUpdatedAt returns the UpdatedAt field if non-nil, zero value otherwise.

### GetUpdatedAtOk

`func (o *CatalogsFeed) GetUpdatedAtOk() (*time.Time, bool)`

GetUpdatedAtOk returns a tuple with the UpdatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedAt

`func (o *CatalogsFeed) SetUpdatedAt(v time.Time)`

SetUpdatedAt sets UpdatedAt field to given value.

### HasUpdatedAt

`func (o *CatalogsFeed) HasUpdatedAt() bool`

HasUpdatedAt returns a boolean if a field has been set.

### GetName

`func (o *CatalogsFeed) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CatalogsFeed) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CatalogsFeed) SetName(v string)`

SetName sets Name field to given value.


### SetNameNil

`func (o *CatalogsFeed) SetNameNil(b bool)`

 SetNameNil sets the value for Name to be an explicit nil

### UnsetName
`func (o *CatalogsFeed) UnsetName()`

UnsetName ensures that no value is present for Name, not even an explicit nil
### GetFormat

`func (o *CatalogsFeed) GetFormat() CatalogsFormat`

GetFormat returns the Format field if non-nil, zero value otherwise.

### GetFormatOk

`func (o *CatalogsFeed) GetFormatOk() (*CatalogsFormat, bool)`

GetFormatOk returns a tuple with the Format field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFormat

`func (o *CatalogsFeed) SetFormat(v CatalogsFormat)`

SetFormat sets Format field to given value.


### GetCatalogType

`func (o *CatalogsFeed) GetCatalogType() CatalogsType`

GetCatalogType returns the CatalogType field if non-nil, zero value otherwise.

### GetCatalogTypeOk

`func (o *CatalogsFeed) GetCatalogTypeOk() (*CatalogsType, bool)`

GetCatalogTypeOk returns a tuple with the CatalogType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogType

`func (o *CatalogsFeed) SetCatalogType(v CatalogsType)`

SetCatalogType sets CatalogType field to given value.


### GetCredentials

`func (o *CatalogsFeed) GetCredentials() CatalogsFeedCredentials`

GetCredentials returns the Credentials field if non-nil, zero value otherwise.

### GetCredentialsOk

`func (o *CatalogsFeed) GetCredentialsOk() (*CatalogsFeedCredentials, bool)`

GetCredentialsOk returns a tuple with the Credentials field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCredentials

`func (o *CatalogsFeed) SetCredentials(v CatalogsFeedCredentials)`

SetCredentials sets Credentials field to given value.


### SetCredentialsNil

`func (o *CatalogsFeed) SetCredentialsNil(b bool)`

 SetCredentialsNil sets the value for Credentials to be an explicit nil

### UnsetCredentials
`func (o *CatalogsFeed) UnsetCredentials()`

UnsetCredentials ensures that no value is present for Credentials, not even an explicit nil
### GetLocation

`func (o *CatalogsFeed) GetLocation() string`

GetLocation returns the Location field if non-nil, zero value otherwise.

### GetLocationOk

`func (o *CatalogsFeed) GetLocationOk() (*string, bool)`

GetLocationOk returns a tuple with the Location field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocation

`func (o *CatalogsFeed) SetLocation(v string)`

SetLocation sets Location field to given value.


### GetPreferredProcessingSchedule

`func (o *CatalogsFeed) GetPreferredProcessingSchedule() CatalogsFeedProcessingSchedule`

GetPreferredProcessingSchedule returns the PreferredProcessingSchedule field if non-nil, zero value otherwise.

### GetPreferredProcessingScheduleOk

`func (o *CatalogsFeed) GetPreferredProcessingScheduleOk() (*CatalogsFeedProcessingSchedule, bool)`

GetPreferredProcessingScheduleOk returns a tuple with the PreferredProcessingSchedule field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPreferredProcessingSchedule

`func (o *CatalogsFeed) SetPreferredProcessingSchedule(v CatalogsFeedProcessingSchedule)`

SetPreferredProcessingSchedule sets PreferredProcessingSchedule field to given value.


### SetPreferredProcessingScheduleNil

`func (o *CatalogsFeed) SetPreferredProcessingScheduleNil(b bool)`

 SetPreferredProcessingScheduleNil sets the value for PreferredProcessingSchedule to be an explicit nil

### UnsetPreferredProcessingSchedule
`func (o *CatalogsFeed) UnsetPreferredProcessingSchedule()`

UnsetPreferredProcessingSchedule ensures that no value is present for PreferredProcessingSchedule, not even an explicit nil
### GetStatus

`func (o *CatalogsFeed) GetStatus() CatalogsStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *CatalogsFeed) GetStatusOk() (*CatalogsStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *CatalogsFeed) SetStatus(v CatalogsStatus)`

SetStatus sets Status field to given value.


### GetDefaultCurrency

`func (o *CatalogsFeed) GetDefaultCurrency() NullableCurrency`

GetDefaultCurrency returns the DefaultCurrency field if non-nil, zero value otherwise.

### GetDefaultCurrencyOk

`func (o *CatalogsFeed) GetDefaultCurrencyOk() (*NullableCurrency, bool)`

GetDefaultCurrencyOk returns a tuple with the DefaultCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefaultCurrency

`func (o *CatalogsFeed) SetDefaultCurrency(v NullableCurrency)`

SetDefaultCurrency sets DefaultCurrency field to given value.


### SetDefaultCurrencyNil

`func (o *CatalogsFeed) SetDefaultCurrencyNil(b bool)`

 SetDefaultCurrencyNil sets the value for DefaultCurrency to be an explicit nil

### UnsetDefaultCurrency
`func (o *CatalogsFeed) UnsetDefaultCurrency()`

UnsetDefaultCurrency ensures that no value is present for DefaultCurrency, not even an explicit nil
### GetDefaultLocale

`func (o *CatalogsFeed) GetDefaultLocale() string`

GetDefaultLocale returns the DefaultLocale field if non-nil, zero value otherwise.

### GetDefaultLocaleOk

`func (o *CatalogsFeed) GetDefaultLocaleOk() (*string, bool)`

GetDefaultLocaleOk returns a tuple with the DefaultLocale field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefaultLocale

`func (o *CatalogsFeed) SetDefaultLocale(v string)`

SetDefaultLocale sets DefaultLocale field to given value.


### GetDefaultCountry

`func (o *CatalogsFeed) GetDefaultCountry() Country`

GetDefaultCountry returns the DefaultCountry field if non-nil, zero value otherwise.

### GetDefaultCountryOk

`func (o *CatalogsFeed) GetDefaultCountryOk() (*Country, bool)`

GetDefaultCountryOk returns a tuple with the DefaultCountry field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefaultCountry

`func (o *CatalogsFeed) SetDefaultCountry(v Country)`

SetDefaultCountry sets DefaultCountry field to given value.


### GetDefaultAvailability

`func (o *CatalogsFeed) GetDefaultAvailability() ProductAvailabilityType`

GetDefaultAvailability returns the DefaultAvailability field if non-nil, zero value otherwise.

### GetDefaultAvailabilityOk

`func (o *CatalogsFeed) GetDefaultAvailabilityOk() (*ProductAvailabilityType, bool)`

GetDefaultAvailabilityOk returns a tuple with the DefaultAvailability field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefaultAvailability

`func (o *CatalogsFeed) SetDefaultAvailability(v ProductAvailabilityType)`

SetDefaultAvailability sets DefaultAvailability field to given value.


### SetDefaultAvailabilityNil

`func (o *CatalogsFeed) SetDefaultAvailabilityNil(b bool)`

 SetDefaultAvailabilityNil sets the value for DefaultAvailability to be an explicit nil

### UnsetDefaultAvailability
`func (o *CatalogsFeed) UnsetDefaultAvailability()`

UnsetDefaultAvailability ensures that no value is present for DefaultAvailability, not even an explicit nil
### GetCatalogId

`func (o *CatalogsFeed) GetCatalogId() string`

GetCatalogId returns the CatalogId field if non-nil, zero value otherwise.

### GetCatalogIdOk

`func (o *CatalogsFeed) GetCatalogIdOk() (*string, bool)`

GetCatalogIdOk returns a tuple with the CatalogId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogId

`func (o *CatalogsFeed) SetCatalogId(v string)`

SetCatalogId sets CatalogId field to given value.


### SetCatalogIdNil

`func (o *CatalogsFeed) SetCatalogIdNil(b bool)`

 SetCatalogIdNil sets the value for CatalogId to be an explicit nil

### UnsetCatalogId
`func (o *CatalogsFeed) UnsetCatalogId()`

UnsetCatalogId ensures that no value is present for CatalogId, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


