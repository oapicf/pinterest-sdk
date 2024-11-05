# CatalogsCreativeAssetsFeed

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CreatedAt** | **time.Time** |  | 
**Id** | **string** |  | 
**UpdatedAt** | **time.Time** |  | 
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
**CatalogId** | **NullableString** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. | 

## Methods

### NewCatalogsCreativeAssetsFeed

`func NewCatalogsCreativeAssetsFeed(createdAt time.Time, id string, updatedAt time.Time, name NullableString, format CatalogsFormat, catalogType CatalogsType, credentials NullableCatalogsFeedCredentials, location string, preferredProcessingSchedule NullableCatalogsFeedProcessingSchedule, status CatalogsStatus, defaultCurrency NullableNullableCurrency, defaultLocale string, defaultCountry Country, catalogId NullableString, ) *CatalogsCreativeAssetsFeed`

NewCatalogsCreativeAssetsFeed instantiates a new CatalogsCreativeAssetsFeed object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsCreativeAssetsFeedWithDefaults

`func NewCatalogsCreativeAssetsFeedWithDefaults() *CatalogsCreativeAssetsFeed`

NewCatalogsCreativeAssetsFeedWithDefaults instantiates a new CatalogsCreativeAssetsFeed object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCreatedAt

`func (o *CatalogsCreativeAssetsFeed) GetCreatedAt() time.Time`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *CatalogsCreativeAssetsFeed) GetCreatedAtOk() (*time.Time, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *CatalogsCreativeAssetsFeed) SetCreatedAt(v time.Time)`

SetCreatedAt sets CreatedAt field to given value.


### GetId

`func (o *CatalogsCreativeAssetsFeed) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CatalogsCreativeAssetsFeed) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CatalogsCreativeAssetsFeed) SetId(v string)`

SetId sets Id field to given value.


### GetUpdatedAt

`func (o *CatalogsCreativeAssetsFeed) GetUpdatedAt() time.Time`

GetUpdatedAt returns the UpdatedAt field if non-nil, zero value otherwise.

### GetUpdatedAtOk

`func (o *CatalogsCreativeAssetsFeed) GetUpdatedAtOk() (*time.Time, bool)`

GetUpdatedAtOk returns a tuple with the UpdatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedAt

`func (o *CatalogsCreativeAssetsFeed) SetUpdatedAt(v time.Time)`

SetUpdatedAt sets UpdatedAt field to given value.


### GetName

`func (o *CatalogsCreativeAssetsFeed) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CatalogsCreativeAssetsFeed) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CatalogsCreativeAssetsFeed) SetName(v string)`

SetName sets Name field to given value.


### SetNameNil

`func (o *CatalogsCreativeAssetsFeed) SetNameNil(b bool)`

 SetNameNil sets the value for Name to be an explicit nil

### UnsetName
`func (o *CatalogsCreativeAssetsFeed) UnsetName()`

UnsetName ensures that no value is present for Name, not even an explicit nil
### GetFormat

`func (o *CatalogsCreativeAssetsFeed) GetFormat() CatalogsFormat`

GetFormat returns the Format field if non-nil, zero value otherwise.

### GetFormatOk

`func (o *CatalogsCreativeAssetsFeed) GetFormatOk() (*CatalogsFormat, bool)`

GetFormatOk returns a tuple with the Format field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFormat

`func (o *CatalogsCreativeAssetsFeed) SetFormat(v CatalogsFormat)`

SetFormat sets Format field to given value.


### GetCatalogType

`func (o *CatalogsCreativeAssetsFeed) GetCatalogType() CatalogsType`

GetCatalogType returns the CatalogType field if non-nil, zero value otherwise.

### GetCatalogTypeOk

`func (o *CatalogsCreativeAssetsFeed) GetCatalogTypeOk() (*CatalogsType, bool)`

GetCatalogTypeOk returns a tuple with the CatalogType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogType

`func (o *CatalogsCreativeAssetsFeed) SetCatalogType(v CatalogsType)`

SetCatalogType sets CatalogType field to given value.


### GetCredentials

`func (o *CatalogsCreativeAssetsFeed) GetCredentials() CatalogsFeedCredentials`

GetCredentials returns the Credentials field if non-nil, zero value otherwise.

### GetCredentialsOk

`func (o *CatalogsCreativeAssetsFeed) GetCredentialsOk() (*CatalogsFeedCredentials, bool)`

GetCredentialsOk returns a tuple with the Credentials field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCredentials

`func (o *CatalogsCreativeAssetsFeed) SetCredentials(v CatalogsFeedCredentials)`

SetCredentials sets Credentials field to given value.


### SetCredentialsNil

`func (o *CatalogsCreativeAssetsFeed) SetCredentialsNil(b bool)`

 SetCredentialsNil sets the value for Credentials to be an explicit nil

### UnsetCredentials
`func (o *CatalogsCreativeAssetsFeed) UnsetCredentials()`

UnsetCredentials ensures that no value is present for Credentials, not even an explicit nil
### GetLocation

`func (o *CatalogsCreativeAssetsFeed) GetLocation() string`

GetLocation returns the Location field if non-nil, zero value otherwise.

### GetLocationOk

`func (o *CatalogsCreativeAssetsFeed) GetLocationOk() (*string, bool)`

GetLocationOk returns a tuple with the Location field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocation

`func (o *CatalogsCreativeAssetsFeed) SetLocation(v string)`

SetLocation sets Location field to given value.


### GetPreferredProcessingSchedule

`func (o *CatalogsCreativeAssetsFeed) GetPreferredProcessingSchedule() CatalogsFeedProcessingSchedule`

GetPreferredProcessingSchedule returns the PreferredProcessingSchedule field if non-nil, zero value otherwise.

### GetPreferredProcessingScheduleOk

`func (o *CatalogsCreativeAssetsFeed) GetPreferredProcessingScheduleOk() (*CatalogsFeedProcessingSchedule, bool)`

GetPreferredProcessingScheduleOk returns a tuple with the PreferredProcessingSchedule field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPreferredProcessingSchedule

`func (o *CatalogsCreativeAssetsFeed) SetPreferredProcessingSchedule(v CatalogsFeedProcessingSchedule)`

SetPreferredProcessingSchedule sets PreferredProcessingSchedule field to given value.


### SetPreferredProcessingScheduleNil

`func (o *CatalogsCreativeAssetsFeed) SetPreferredProcessingScheduleNil(b bool)`

 SetPreferredProcessingScheduleNil sets the value for PreferredProcessingSchedule to be an explicit nil

### UnsetPreferredProcessingSchedule
`func (o *CatalogsCreativeAssetsFeed) UnsetPreferredProcessingSchedule()`

UnsetPreferredProcessingSchedule ensures that no value is present for PreferredProcessingSchedule, not even an explicit nil
### GetStatus

`func (o *CatalogsCreativeAssetsFeed) GetStatus() CatalogsStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *CatalogsCreativeAssetsFeed) GetStatusOk() (*CatalogsStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *CatalogsCreativeAssetsFeed) SetStatus(v CatalogsStatus)`

SetStatus sets Status field to given value.


### GetDefaultCurrency

`func (o *CatalogsCreativeAssetsFeed) GetDefaultCurrency() NullableCurrency`

GetDefaultCurrency returns the DefaultCurrency field if non-nil, zero value otherwise.

### GetDefaultCurrencyOk

`func (o *CatalogsCreativeAssetsFeed) GetDefaultCurrencyOk() (*NullableCurrency, bool)`

GetDefaultCurrencyOk returns a tuple with the DefaultCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefaultCurrency

`func (o *CatalogsCreativeAssetsFeed) SetDefaultCurrency(v NullableCurrency)`

SetDefaultCurrency sets DefaultCurrency field to given value.


### SetDefaultCurrencyNil

`func (o *CatalogsCreativeAssetsFeed) SetDefaultCurrencyNil(b bool)`

 SetDefaultCurrencyNil sets the value for DefaultCurrency to be an explicit nil

### UnsetDefaultCurrency
`func (o *CatalogsCreativeAssetsFeed) UnsetDefaultCurrency()`

UnsetDefaultCurrency ensures that no value is present for DefaultCurrency, not even an explicit nil
### GetDefaultLocale

`func (o *CatalogsCreativeAssetsFeed) GetDefaultLocale() string`

GetDefaultLocale returns the DefaultLocale field if non-nil, zero value otherwise.

### GetDefaultLocaleOk

`func (o *CatalogsCreativeAssetsFeed) GetDefaultLocaleOk() (*string, bool)`

GetDefaultLocaleOk returns a tuple with the DefaultLocale field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefaultLocale

`func (o *CatalogsCreativeAssetsFeed) SetDefaultLocale(v string)`

SetDefaultLocale sets DefaultLocale field to given value.


### GetDefaultCountry

`func (o *CatalogsCreativeAssetsFeed) GetDefaultCountry() Country`

GetDefaultCountry returns the DefaultCountry field if non-nil, zero value otherwise.

### GetDefaultCountryOk

`func (o *CatalogsCreativeAssetsFeed) GetDefaultCountryOk() (*Country, bool)`

GetDefaultCountryOk returns a tuple with the DefaultCountry field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefaultCountry

`func (o *CatalogsCreativeAssetsFeed) SetDefaultCountry(v Country)`

SetDefaultCountry sets DefaultCountry field to given value.


### GetCatalogId

`func (o *CatalogsCreativeAssetsFeed) GetCatalogId() string`

GetCatalogId returns the CatalogId field if non-nil, zero value otherwise.

### GetCatalogIdOk

`func (o *CatalogsCreativeAssetsFeed) GetCatalogIdOk() (*string, bool)`

GetCatalogIdOk returns a tuple with the CatalogId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogId

`func (o *CatalogsCreativeAssetsFeed) SetCatalogId(v string)`

SetCatalogId sets CatalogId field to given value.


### SetCatalogIdNil

`func (o *CatalogsCreativeAssetsFeed) SetCatalogIdNil(b bool)`

 SetCatalogIdNil sets the value for CatalogId to be an explicit nil

### UnsetCatalogId
`func (o *CatalogsCreativeAssetsFeed) UnsetCatalogId()`

UnsetCatalogId ensures that no value is present for CatalogId, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


