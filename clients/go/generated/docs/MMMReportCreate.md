# MMMReportCreate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdvertiserIds** | Pointer to **[]string** | Advertiser IDs for multi-advertiser report | [optional] 
**Columns** | [**[]MMMReportingColumn**](MMMReportingColumn.md) | Metric and entity columns | 
**Countries** | Pointer to [**[]TargetingAdvertiserCountry**](TargetingAdvertiserCountry.md) | A List of countries for filtering | [optional] 
**CustomColumnIds** | Pointer to **[]string** | List of custom column IDs | [optional] 
**EndDate** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD | 
**Granularity** | [**MMMReportGranularity**](MMMReportGranularity.md) |   DAY - metrics are broken down daily.    WEEK - metrics are broken down weekly. | 
**Level** | [**MMMReportLevel**](MMMReportLevel.md) | Level of the report | 
**ReportName** | **string** | Name of the Marketing Mix Modeling (MMM) report | 
**StartDate** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD | 
**TargetingTypes** | [**[]MMMReportingTargetingType**](MMMReportingTargetingType.md) | List of targeting types | 

## Methods

### NewMMMReportCreate

`func NewMMMReportCreate(columns []MMMReportingColumn, endDate string, granularity MMMReportGranularity, level MMMReportLevel, reportName string, startDate string, targetingTypes []MMMReportingTargetingType, ) *MMMReportCreate`

NewMMMReportCreate instantiates a new MMMReportCreate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMMMReportCreateWithDefaults

`func NewMMMReportCreateWithDefaults() *MMMReportCreate`

NewMMMReportCreateWithDefaults instantiates a new MMMReportCreate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdvertiserIds

`func (o *MMMReportCreate) GetAdvertiserIds() []string`

GetAdvertiserIds returns the AdvertiserIds field if non-nil, zero value otherwise.

### GetAdvertiserIdsOk

`func (o *MMMReportCreate) GetAdvertiserIdsOk() (*[]string, bool)`

GetAdvertiserIdsOk returns a tuple with the AdvertiserIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdvertiserIds

`func (o *MMMReportCreate) SetAdvertiserIds(v []string)`

SetAdvertiserIds sets AdvertiserIds field to given value.

### HasAdvertiserIds

`func (o *MMMReportCreate) HasAdvertiserIds() bool`

HasAdvertiserIds returns a boolean if a field has been set.

### GetColumns

`func (o *MMMReportCreate) GetColumns() []MMMReportingColumn`

GetColumns returns the Columns field if non-nil, zero value otherwise.

### GetColumnsOk

`func (o *MMMReportCreate) GetColumnsOk() (*[]MMMReportingColumn, bool)`

GetColumnsOk returns a tuple with the Columns field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetColumns

`func (o *MMMReportCreate) SetColumns(v []MMMReportingColumn)`

SetColumns sets Columns field to given value.


### GetCountries

`func (o *MMMReportCreate) GetCountries() []TargetingAdvertiserCountry`

GetCountries returns the Countries field if non-nil, zero value otherwise.

### GetCountriesOk

`func (o *MMMReportCreate) GetCountriesOk() (*[]TargetingAdvertiserCountry, bool)`

GetCountriesOk returns a tuple with the Countries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountries

`func (o *MMMReportCreate) SetCountries(v []TargetingAdvertiserCountry)`

SetCountries sets Countries field to given value.

### HasCountries

`func (o *MMMReportCreate) HasCountries() bool`

HasCountries returns a boolean if a field has been set.

### GetCustomColumnIds

`func (o *MMMReportCreate) GetCustomColumnIds() []string`

GetCustomColumnIds returns the CustomColumnIds field if non-nil, zero value otherwise.

### GetCustomColumnIdsOk

`func (o *MMMReportCreate) GetCustomColumnIdsOk() (*[]string, bool)`

GetCustomColumnIdsOk returns a tuple with the CustomColumnIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomColumnIds

`func (o *MMMReportCreate) SetCustomColumnIds(v []string)`

SetCustomColumnIds sets CustomColumnIds field to given value.

### HasCustomColumnIds

`func (o *MMMReportCreate) HasCustomColumnIds() bool`

HasCustomColumnIds returns a boolean if a field has been set.

### GetEndDate

`func (o *MMMReportCreate) GetEndDate() string`

GetEndDate returns the EndDate field if non-nil, zero value otherwise.

### GetEndDateOk

`func (o *MMMReportCreate) GetEndDateOk() (*string, bool)`

GetEndDateOk returns a tuple with the EndDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndDate

`func (o *MMMReportCreate) SetEndDate(v string)`

SetEndDate sets EndDate field to given value.


### GetGranularity

`func (o *MMMReportCreate) GetGranularity() MMMReportGranularity`

GetGranularity returns the Granularity field if non-nil, zero value otherwise.

### GetGranularityOk

`func (o *MMMReportCreate) GetGranularityOk() (*MMMReportGranularity, bool)`

GetGranularityOk returns a tuple with the Granularity field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGranularity

`func (o *MMMReportCreate) SetGranularity(v MMMReportGranularity)`

SetGranularity sets Granularity field to given value.


### GetLevel

`func (o *MMMReportCreate) GetLevel() MMMReportLevel`

GetLevel returns the Level field if non-nil, zero value otherwise.

### GetLevelOk

`func (o *MMMReportCreate) GetLevelOk() (*MMMReportLevel, bool)`

GetLevelOk returns a tuple with the Level field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLevel

`func (o *MMMReportCreate) SetLevel(v MMMReportLevel)`

SetLevel sets Level field to given value.


### GetReportName

`func (o *MMMReportCreate) GetReportName() string`

GetReportName returns the ReportName field if non-nil, zero value otherwise.

### GetReportNameOk

`func (o *MMMReportCreate) GetReportNameOk() (*string, bool)`

GetReportNameOk returns a tuple with the ReportName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReportName

`func (o *MMMReportCreate) SetReportName(v string)`

SetReportName sets ReportName field to given value.


### GetStartDate

`func (o *MMMReportCreate) GetStartDate() string`

GetStartDate returns the StartDate field if non-nil, zero value otherwise.

### GetStartDateOk

`func (o *MMMReportCreate) GetStartDateOk() (*string, bool)`

GetStartDateOk returns a tuple with the StartDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStartDate

`func (o *MMMReportCreate) SetStartDate(v string)`

SetStartDate sets StartDate field to given value.


### GetTargetingTypes

`func (o *MMMReportCreate) GetTargetingTypes() []MMMReportingTargetingType`

GetTargetingTypes returns the TargetingTypes field if non-nil, zero value otherwise.

### GetTargetingTypesOk

`func (o *MMMReportCreate) GetTargetingTypesOk() (*[]MMMReportingTargetingType, bool)`

GetTargetingTypesOk returns a tuple with the TargetingTypes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTargetingTypes

`func (o *MMMReportCreate) SetTargetingTypes(v []MMMReportingTargetingType)`

SetTargetingTypes sets TargetingTypes field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


