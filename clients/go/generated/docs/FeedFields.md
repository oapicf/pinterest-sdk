# FeedFields

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DefaultCountry** | [**Country**](Country.md) |  | 
**DefaultAvailability** | [**NullableProductAvailabilityType**](ProductAvailabilityType.md) |  | 
**DefaultCurrency** | [**NullableNullableCurrency**](NullableCurrency.md) |  | 
**Name** | **NullableString** | A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. | 
**Format** | [**CatalogsFormat**](CatalogsFormat.md) |  | 
**DefaultLocale** | **string** | The locale used within a feed for product descriptions. | 
**Credentials** | [**NullableCatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | 
**Location** | **string** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**PreferredProcessingSchedule** | [**NullableCatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | 
**Status** | [**CatalogsStatus**](CatalogsStatus.md) |  | 

## Methods

### NewFeedFields

`func NewFeedFields(defaultCountry Country, defaultAvailability NullableProductAvailabilityType, defaultCurrency NullableNullableCurrency, name NullableString, format CatalogsFormat, defaultLocale string, credentials NullableCatalogsFeedCredentials, location string, preferredProcessingSchedule NullableCatalogsFeedProcessingSchedule, status CatalogsStatus, ) *FeedFields`

NewFeedFields instantiates a new FeedFields object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFeedFieldsWithDefaults

`func NewFeedFieldsWithDefaults() *FeedFields`

NewFeedFieldsWithDefaults instantiates a new FeedFields object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDefaultCountry

`func (o *FeedFields) GetDefaultCountry() Country`

GetDefaultCountry returns the DefaultCountry field if non-nil, zero value otherwise.

### GetDefaultCountryOk

`func (o *FeedFields) GetDefaultCountryOk() (*Country, bool)`

GetDefaultCountryOk returns a tuple with the DefaultCountry field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefaultCountry

`func (o *FeedFields) SetDefaultCountry(v Country)`

SetDefaultCountry sets DefaultCountry field to given value.


### GetDefaultAvailability

`func (o *FeedFields) GetDefaultAvailability() ProductAvailabilityType`

GetDefaultAvailability returns the DefaultAvailability field if non-nil, zero value otherwise.

### GetDefaultAvailabilityOk

`func (o *FeedFields) GetDefaultAvailabilityOk() (*ProductAvailabilityType, bool)`

GetDefaultAvailabilityOk returns a tuple with the DefaultAvailability field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefaultAvailability

`func (o *FeedFields) SetDefaultAvailability(v ProductAvailabilityType)`

SetDefaultAvailability sets DefaultAvailability field to given value.


### SetDefaultAvailabilityNil

`func (o *FeedFields) SetDefaultAvailabilityNil(b bool)`

 SetDefaultAvailabilityNil sets the value for DefaultAvailability to be an explicit nil

### UnsetDefaultAvailability
`func (o *FeedFields) UnsetDefaultAvailability()`

UnsetDefaultAvailability ensures that no value is present for DefaultAvailability, not even an explicit nil
### GetDefaultCurrency

`func (o *FeedFields) GetDefaultCurrency() NullableCurrency`

GetDefaultCurrency returns the DefaultCurrency field if non-nil, zero value otherwise.

### GetDefaultCurrencyOk

`func (o *FeedFields) GetDefaultCurrencyOk() (*NullableCurrency, bool)`

GetDefaultCurrencyOk returns a tuple with the DefaultCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefaultCurrency

`func (o *FeedFields) SetDefaultCurrency(v NullableCurrency)`

SetDefaultCurrency sets DefaultCurrency field to given value.


### SetDefaultCurrencyNil

`func (o *FeedFields) SetDefaultCurrencyNil(b bool)`

 SetDefaultCurrencyNil sets the value for DefaultCurrency to be an explicit nil

### UnsetDefaultCurrency
`func (o *FeedFields) UnsetDefaultCurrency()`

UnsetDefaultCurrency ensures that no value is present for DefaultCurrency, not even an explicit nil
### GetName

`func (o *FeedFields) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *FeedFields) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *FeedFields) SetName(v string)`

SetName sets Name field to given value.


### SetNameNil

`func (o *FeedFields) SetNameNil(b bool)`

 SetNameNil sets the value for Name to be an explicit nil

### UnsetName
`func (o *FeedFields) UnsetName()`

UnsetName ensures that no value is present for Name, not even an explicit nil
### GetFormat

`func (o *FeedFields) GetFormat() CatalogsFormat`

GetFormat returns the Format field if non-nil, zero value otherwise.

### GetFormatOk

`func (o *FeedFields) GetFormatOk() (*CatalogsFormat, bool)`

GetFormatOk returns a tuple with the Format field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFormat

`func (o *FeedFields) SetFormat(v CatalogsFormat)`

SetFormat sets Format field to given value.


### GetDefaultLocale

`func (o *FeedFields) GetDefaultLocale() string`

GetDefaultLocale returns the DefaultLocale field if non-nil, zero value otherwise.

### GetDefaultLocaleOk

`func (o *FeedFields) GetDefaultLocaleOk() (*string, bool)`

GetDefaultLocaleOk returns a tuple with the DefaultLocale field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefaultLocale

`func (o *FeedFields) SetDefaultLocale(v string)`

SetDefaultLocale sets DefaultLocale field to given value.


### GetCredentials

`func (o *FeedFields) GetCredentials() CatalogsFeedCredentials`

GetCredentials returns the Credentials field if non-nil, zero value otherwise.

### GetCredentialsOk

`func (o *FeedFields) GetCredentialsOk() (*CatalogsFeedCredentials, bool)`

GetCredentialsOk returns a tuple with the Credentials field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCredentials

`func (o *FeedFields) SetCredentials(v CatalogsFeedCredentials)`

SetCredentials sets Credentials field to given value.


### SetCredentialsNil

`func (o *FeedFields) SetCredentialsNil(b bool)`

 SetCredentialsNil sets the value for Credentials to be an explicit nil

### UnsetCredentials
`func (o *FeedFields) UnsetCredentials()`

UnsetCredentials ensures that no value is present for Credentials, not even an explicit nil
### GetLocation

`func (o *FeedFields) GetLocation() string`

GetLocation returns the Location field if non-nil, zero value otherwise.

### GetLocationOk

`func (o *FeedFields) GetLocationOk() (*string, bool)`

GetLocationOk returns a tuple with the Location field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocation

`func (o *FeedFields) SetLocation(v string)`

SetLocation sets Location field to given value.


### GetPreferredProcessingSchedule

`func (o *FeedFields) GetPreferredProcessingSchedule() CatalogsFeedProcessingSchedule`

GetPreferredProcessingSchedule returns the PreferredProcessingSchedule field if non-nil, zero value otherwise.

### GetPreferredProcessingScheduleOk

`func (o *FeedFields) GetPreferredProcessingScheduleOk() (*CatalogsFeedProcessingSchedule, bool)`

GetPreferredProcessingScheduleOk returns a tuple with the PreferredProcessingSchedule field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPreferredProcessingSchedule

`func (o *FeedFields) SetPreferredProcessingSchedule(v CatalogsFeedProcessingSchedule)`

SetPreferredProcessingSchedule sets PreferredProcessingSchedule field to given value.


### SetPreferredProcessingScheduleNil

`func (o *FeedFields) SetPreferredProcessingScheduleNil(b bool)`

 SetPreferredProcessingScheduleNil sets the value for PreferredProcessingSchedule to be an explicit nil

### UnsetPreferredProcessingSchedule
`func (o *FeedFields) UnsetPreferredProcessingSchedule()`

UnsetPreferredProcessingSchedule ensures that no value is present for PreferredProcessingSchedule, not even an explicit nil
### GetStatus

`func (o *FeedFields) GetStatus() CatalogsStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *FeedFields) GetStatusOk() (*CatalogsStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *FeedFields) SetStatus(v CatalogsStatus)`

SetStatus sets Status field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


