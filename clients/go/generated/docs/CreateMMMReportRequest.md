# CreateMMMReportRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ReportName** | **string** | Name of the Marketing Mix Modeling (MMM) report | 
**StartDate** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD | 
**EndDate** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD | 
**Granularity** | **string** | DAY - metrics are broken down daily.&lt;br&gt; WEEK - metrics are broken down weekly. | 
**Level** | **string** | Level of the report | 
**TargetingTypes** | [**[]MMMReportingTargetingType**](MMMReportingTargetingType.md) | List of targeting types | 
**Columns** | [**[]MMMReportingColumn**](MMMReportingColumn.md) | Metric and entity columns | 
**Countries** | Pointer to [**[]TargetingAdvertiserCountry**](TargetingAdvertiserCountry.md) | A List of countries for filtering | [optional] 

## Methods

### NewCreateMMMReportRequest

`func NewCreateMMMReportRequest(reportName string, startDate string, endDate string, granularity string, level string, targetingTypes []MMMReportingTargetingType, columns []MMMReportingColumn, ) *CreateMMMReportRequest`

NewCreateMMMReportRequest instantiates a new CreateMMMReportRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateMMMReportRequestWithDefaults

`func NewCreateMMMReportRequestWithDefaults() *CreateMMMReportRequest`

NewCreateMMMReportRequestWithDefaults instantiates a new CreateMMMReportRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetReportName

`func (o *CreateMMMReportRequest) GetReportName() string`

GetReportName returns the ReportName field if non-nil, zero value otherwise.

### GetReportNameOk

`func (o *CreateMMMReportRequest) GetReportNameOk() (*string, bool)`

GetReportNameOk returns a tuple with the ReportName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReportName

`func (o *CreateMMMReportRequest) SetReportName(v string)`

SetReportName sets ReportName field to given value.


### GetStartDate

`func (o *CreateMMMReportRequest) GetStartDate() string`

GetStartDate returns the StartDate field if non-nil, zero value otherwise.

### GetStartDateOk

`func (o *CreateMMMReportRequest) GetStartDateOk() (*string, bool)`

GetStartDateOk returns a tuple with the StartDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStartDate

`func (o *CreateMMMReportRequest) SetStartDate(v string)`

SetStartDate sets StartDate field to given value.


### GetEndDate

`func (o *CreateMMMReportRequest) GetEndDate() string`

GetEndDate returns the EndDate field if non-nil, zero value otherwise.

### GetEndDateOk

`func (o *CreateMMMReportRequest) GetEndDateOk() (*string, bool)`

GetEndDateOk returns a tuple with the EndDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndDate

`func (o *CreateMMMReportRequest) SetEndDate(v string)`

SetEndDate sets EndDate field to given value.


### GetGranularity

`func (o *CreateMMMReportRequest) GetGranularity() string`

GetGranularity returns the Granularity field if non-nil, zero value otherwise.

### GetGranularityOk

`func (o *CreateMMMReportRequest) GetGranularityOk() (*string, bool)`

GetGranularityOk returns a tuple with the Granularity field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGranularity

`func (o *CreateMMMReportRequest) SetGranularity(v string)`

SetGranularity sets Granularity field to given value.


### GetLevel

`func (o *CreateMMMReportRequest) GetLevel() string`

GetLevel returns the Level field if non-nil, zero value otherwise.

### GetLevelOk

`func (o *CreateMMMReportRequest) GetLevelOk() (*string, bool)`

GetLevelOk returns a tuple with the Level field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLevel

`func (o *CreateMMMReportRequest) SetLevel(v string)`

SetLevel sets Level field to given value.


### GetTargetingTypes

`func (o *CreateMMMReportRequest) GetTargetingTypes() []MMMReportingTargetingType`

GetTargetingTypes returns the TargetingTypes field if non-nil, zero value otherwise.

### GetTargetingTypesOk

`func (o *CreateMMMReportRequest) GetTargetingTypesOk() (*[]MMMReportingTargetingType, bool)`

GetTargetingTypesOk returns a tuple with the TargetingTypes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTargetingTypes

`func (o *CreateMMMReportRequest) SetTargetingTypes(v []MMMReportingTargetingType)`

SetTargetingTypes sets TargetingTypes field to given value.


### GetColumns

`func (o *CreateMMMReportRequest) GetColumns() []MMMReportingColumn`

GetColumns returns the Columns field if non-nil, zero value otherwise.

### GetColumnsOk

`func (o *CreateMMMReportRequest) GetColumnsOk() (*[]MMMReportingColumn, bool)`

GetColumnsOk returns a tuple with the Columns field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetColumns

`func (o *CreateMMMReportRequest) SetColumns(v []MMMReportingColumn)`

SetColumns sets Columns field to given value.


### GetCountries

`func (o *CreateMMMReportRequest) GetCountries() []TargetingAdvertiserCountry`

GetCountries returns the Countries field if non-nil, zero value otherwise.

### GetCountriesOk

`func (o *CreateMMMReportRequest) GetCountriesOk() (*[]TargetingAdvertiserCountry, bool)`

GetCountriesOk returns a tuple with the Countries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountries

`func (o *CreateMMMReportRequest) SetCountries(v []TargetingAdvertiserCountry)`

SetCountries sets Countries field to given value.

### HasCountries

`func (o *CreateMMMReportRequest) HasCountries() bool`

HasCountries returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


