# TemplateResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **string** | Template ID | [optional] 
**AdAccountId** | Pointer to **string** | ID of the Ad Account that owns the template | [optional] 
**AdAccountIds** | Pointer to **[]string** | IDs of the Ad Accounts that have access to this template | [optional] 
**UserId** | Pointer to **string** | ID of the user who created the template | [optional] 
**Name** | Pointer to **NullableString** | Template Name | [optional] 
**ReportStartRelativeDaysInPast** | Pointer to **float32** | The number of days prior to the day the report will be delivered at which the report will start | [optional] 
**ReportEndRelativeDaysInPast** | Pointer to **float32** | The number of days prior to the day the report will be delivered at which the report will end | [optional] 
**DateRange** | Pointer to [**TemplateResponseDateRange**](TemplateResponseDateRange.md) |  | [optional] 
**ReportLevel** | Pointer to [**MetricsReportingLevel**](MetricsReportingLevel.md) |  | [optional] 
**ReportFormat** | Pointer to [**DataOutputFormat**](DataOutputFormat.md) |  | [optional] 
**Columns** | Pointer to **[]string** | A list of columns to be included in the report | [optional] 
**Granularity** | Pointer to [**Granularity**](Granularity.md) |  | [optional] 
**ViewWindowDays** | Pointer to **float32** | The length of the sliding window over which view conversions will be attributed | [optional] 
**ClickWindowDays** | Pointer to **float32** | The length of the sliding window over which click conversions will be attributed | [optional] 
**EngagementWindowDays** | Pointer to **float32** | The length of the sliding window over which engagement conversions will be attributed | [optional] 
**ConversionReportTimeType** | Pointer to **string** | Conversion report time type | [optional] 
**FiltersJson** | Pointer to **NullableString** | A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:&lt;br&gt; \&quot;field\&quot;: The column name&lt;br&gt; \&quot;operator\&quot;: The operator. Allowed operators: [\&quot;&#x3D;\&quot;, \&quot;!&#x3D;\&quot;, \&quot;in\&quot;, \&quot;not_in\&quot;, \&quot;~\&quot;, \&quot;&gt;\&quot;, \&quot;&lt;\&quot;, \&quot;contains_substring\&quot;]&lt;br&gt; \&quot;value\&quot;: A single value or a list of values | [optional] 
**IsOwnedByUser** | Pointer to **bool** | A boolean value that indicates if the user owns the template | [optional] 
**IsScheduled** | Pointer to **bool** | A boolean value that indicates if this template has been used to create a scheduled report | [optional] 
**CreationSource** | Pointer to **string** | The surface used to create this template | [optional] 
**IsDeleted** | Pointer to **NullableBool** | A boolean that indicates if the template has been deleted | [optional] 
**UpdatedTime** | Pointer to **float32** | Time of last update in seconds since Unix epoch | [optional] 
**CustomColumnIds** | Pointer to **[]string** | A list of custom column IDs | [optional] 
**Type** | Pointer to **string** | Reporting template type | [optional] 
**IngestionSources** | Pointer to **[]string** | The filter on the conversion ingestion source method for conversion metrics | [optional] 

## Methods

### NewTemplateResponse

`func NewTemplateResponse() *TemplateResponse`

NewTemplateResponse instantiates a new TemplateResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTemplateResponseWithDefaults

`func NewTemplateResponseWithDefaults() *TemplateResponse`

NewTemplateResponseWithDefaults instantiates a new TemplateResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *TemplateResponse) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *TemplateResponse) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *TemplateResponse) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *TemplateResponse) HasId() bool`

HasId returns a boolean if a field has been set.

### GetAdAccountId

`func (o *TemplateResponse) GetAdAccountId() string`

GetAdAccountId returns the AdAccountId field if non-nil, zero value otherwise.

### GetAdAccountIdOk

`func (o *TemplateResponse) GetAdAccountIdOk() (*string, bool)`

GetAdAccountIdOk returns a tuple with the AdAccountId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdAccountId

`func (o *TemplateResponse) SetAdAccountId(v string)`

SetAdAccountId sets AdAccountId field to given value.

### HasAdAccountId

`func (o *TemplateResponse) HasAdAccountId() bool`

HasAdAccountId returns a boolean if a field has been set.

### GetAdAccountIds

`func (o *TemplateResponse) GetAdAccountIds() []string`

GetAdAccountIds returns the AdAccountIds field if non-nil, zero value otherwise.

### GetAdAccountIdsOk

`func (o *TemplateResponse) GetAdAccountIdsOk() (*[]string, bool)`

GetAdAccountIdsOk returns a tuple with the AdAccountIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdAccountIds

`func (o *TemplateResponse) SetAdAccountIds(v []string)`

SetAdAccountIds sets AdAccountIds field to given value.

### HasAdAccountIds

`func (o *TemplateResponse) HasAdAccountIds() bool`

HasAdAccountIds returns a boolean if a field has been set.

### GetUserId

`func (o *TemplateResponse) GetUserId() string`

GetUserId returns the UserId field if non-nil, zero value otherwise.

### GetUserIdOk

`func (o *TemplateResponse) GetUserIdOk() (*string, bool)`

GetUserIdOk returns a tuple with the UserId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserId

`func (o *TemplateResponse) SetUserId(v string)`

SetUserId sets UserId field to given value.

### HasUserId

`func (o *TemplateResponse) HasUserId() bool`

HasUserId returns a boolean if a field has been set.

### GetName

`func (o *TemplateResponse) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *TemplateResponse) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *TemplateResponse) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *TemplateResponse) HasName() bool`

HasName returns a boolean if a field has been set.

### SetNameNil

`func (o *TemplateResponse) SetNameNil(b bool)`

 SetNameNil sets the value for Name to be an explicit nil

### UnsetName
`func (o *TemplateResponse) UnsetName()`

UnsetName ensures that no value is present for Name, not even an explicit nil
### GetReportStartRelativeDaysInPast

`func (o *TemplateResponse) GetReportStartRelativeDaysInPast() float32`

GetReportStartRelativeDaysInPast returns the ReportStartRelativeDaysInPast field if non-nil, zero value otherwise.

### GetReportStartRelativeDaysInPastOk

`func (o *TemplateResponse) GetReportStartRelativeDaysInPastOk() (*float32, bool)`

GetReportStartRelativeDaysInPastOk returns a tuple with the ReportStartRelativeDaysInPast field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReportStartRelativeDaysInPast

`func (o *TemplateResponse) SetReportStartRelativeDaysInPast(v float32)`

SetReportStartRelativeDaysInPast sets ReportStartRelativeDaysInPast field to given value.

### HasReportStartRelativeDaysInPast

`func (o *TemplateResponse) HasReportStartRelativeDaysInPast() bool`

HasReportStartRelativeDaysInPast returns a boolean if a field has been set.

### GetReportEndRelativeDaysInPast

`func (o *TemplateResponse) GetReportEndRelativeDaysInPast() float32`

GetReportEndRelativeDaysInPast returns the ReportEndRelativeDaysInPast field if non-nil, zero value otherwise.

### GetReportEndRelativeDaysInPastOk

`func (o *TemplateResponse) GetReportEndRelativeDaysInPastOk() (*float32, bool)`

GetReportEndRelativeDaysInPastOk returns a tuple with the ReportEndRelativeDaysInPast field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReportEndRelativeDaysInPast

`func (o *TemplateResponse) SetReportEndRelativeDaysInPast(v float32)`

SetReportEndRelativeDaysInPast sets ReportEndRelativeDaysInPast field to given value.

### HasReportEndRelativeDaysInPast

`func (o *TemplateResponse) HasReportEndRelativeDaysInPast() bool`

HasReportEndRelativeDaysInPast returns a boolean if a field has been set.

### GetDateRange

`func (o *TemplateResponse) GetDateRange() TemplateResponseDateRange`

GetDateRange returns the DateRange field if non-nil, zero value otherwise.

### GetDateRangeOk

`func (o *TemplateResponse) GetDateRangeOk() (*TemplateResponseDateRange, bool)`

GetDateRangeOk returns a tuple with the DateRange field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDateRange

`func (o *TemplateResponse) SetDateRange(v TemplateResponseDateRange)`

SetDateRange sets DateRange field to given value.

### HasDateRange

`func (o *TemplateResponse) HasDateRange() bool`

HasDateRange returns a boolean if a field has been set.

### GetReportLevel

`func (o *TemplateResponse) GetReportLevel() MetricsReportingLevel`

GetReportLevel returns the ReportLevel field if non-nil, zero value otherwise.

### GetReportLevelOk

`func (o *TemplateResponse) GetReportLevelOk() (*MetricsReportingLevel, bool)`

GetReportLevelOk returns a tuple with the ReportLevel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReportLevel

`func (o *TemplateResponse) SetReportLevel(v MetricsReportingLevel)`

SetReportLevel sets ReportLevel field to given value.

### HasReportLevel

`func (o *TemplateResponse) HasReportLevel() bool`

HasReportLevel returns a boolean if a field has been set.

### GetReportFormat

`func (o *TemplateResponse) GetReportFormat() DataOutputFormat`

GetReportFormat returns the ReportFormat field if non-nil, zero value otherwise.

### GetReportFormatOk

`func (o *TemplateResponse) GetReportFormatOk() (*DataOutputFormat, bool)`

GetReportFormatOk returns a tuple with the ReportFormat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReportFormat

`func (o *TemplateResponse) SetReportFormat(v DataOutputFormat)`

SetReportFormat sets ReportFormat field to given value.

### HasReportFormat

`func (o *TemplateResponse) HasReportFormat() bool`

HasReportFormat returns a boolean if a field has been set.

### GetColumns

`func (o *TemplateResponse) GetColumns() []string`

GetColumns returns the Columns field if non-nil, zero value otherwise.

### GetColumnsOk

`func (o *TemplateResponse) GetColumnsOk() (*[]string, bool)`

GetColumnsOk returns a tuple with the Columns field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetColumns

`func (o *TemplateResponse) SetColumns(v []string)`

SetColumns sets Columns field to given value.

### HasColumns

`func (o *TemplateResponse) HasColumns() bool`

HasColumns returns a boolean if a field has been set.

### GetGranularity

`func (o *TemplateResponse) GetGranularity() Granularity`

GetGranularity returns the Granularity field if non-nil, zero value otherwise.

### GetGranularityOk

`func (o *TemplateResponse) GetGranularityOk() (*Granularity, bool)`

GetGranularityOk returns a tuple with the Granularity field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGranularity

`func (o *TemplateResponse) SetGranularity(v Granularity)`

SetGranularity sets Granularity field to given value.

### HasGranularity

`func (o *TemplateResponse) HasGranularity() bool`

HasGranularity returns a boolean if a field has been set.

### GetViewWindowDays

`func (o *TemplateResponse) GetViewWindowDays() float32`

GetViewWindowDays returns the ViewWindowDays field if non-nil, zero value otherwise.

### GetViewWindowDaysOk

`func (o *TemplateResponse) GetViewWindowDaysOk() (*float32, bool)`

GetViewWindowDaysOk returns a tuple with the ViewWindowDays field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetViewWindowDays

`func (o *TemplateResponse) SetViewWindowDays(v float32)`

SetViewWindowDays sets ViewWindowDays field to given value.

### HasViewWindowDays

`func (o *TemplateResponse) HasViewWindowDays() bool`

HasViewWindowDays returns a boolean if a field has been set.

### GetClickWindowDays

`func (o *TemplateResponse) GetClickWindowDays() float32`

GetClickWindowDays returns the ClickWindowDays field if non-nil, zero value otherwise.

### GetClickWindowDaysOk

`func (o *TemplateResponse) GetClickWindowDaysOk() (*float32, bool)`

GetClickWindowDaysOk returns a tuple with the ClickWindowDays field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClickWindowDays

`func (o *TemplateResponse) SetClickWindowDays(v float32)`

SetClickWindowDays sets ClickWindowDays field to given value.

### HasClickWindowDays

`func (o *TemplateResponse) HasClickWindowDays() bool`

HasClickWindowDays returns a boolean if a field has been set.

### GetEngagementWindowDays

`func (o *TemplateResponse) GetEngagementWindowDays() float32`

GetEngagementWindowDays returns the EngagementWindowDays field if non-nil, zero value otherwise.

### GetEngagementWindowDaysOk

`func (o *TemplateResponse) GetEngagementWindowDaysOk() (*float32, bool)`

GetEngagementWindowDaysOk returns a tuple with the EngagementWindowDays field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEngagementWindowDays

`func (o *TemplateResponse) SetEngagementWindowDays(v float32)`

SetEngagementWindowDays sets EngagementWindowDays field to given value.

### HasEngagementWindowDays

`func (o *TemplateResponse) HasEngagementWindowDays() bool`

HasEngagementWindowDays returns a boolean if a field has been set.

### GetConversionReportTimeType

`func (o *TemplateResponse) GetConversionReportTimeType() string`

GetConversionReportTimeType returns the ConversionReportTimeType field if non-nil, zero value otherwise.

### GetConversionReportTimeTypeOk

`func (o *TemplateResponse) GetConversionReportTimeTypeOk() (*string, bool)`

GetConversionReportTimeTypeOk returns a tuple with the ConversionReportTimeType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConversionReportTimeType

`func (o *TemplateResponse) SetConversionReportTimeType(v string)`

SetConversionReportTimeType sets ConversionReportTimeType field to given value.

### HasConversionReportTimeType

`func (o *TemplateResponse) HasConversionReportTimeType() bool`

HasConversionReportTimeType returns a boolean if a field has been set.

### GetFiltersJson

`func (o *TemplateResponse) GetFiltersJson() string`

GetFiltersJson returns the FiltersJson field if non-nil, zero value otherwise.

### GetFiltersJsonOk

`func (o *TemplateResponse) GetFiltersJsonOk() (*string, bool)`

GetFiltersJsonOk returns a tuple with the FiltersJson field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFiltersJson

`func (o *TemplateResponse) SetFiltersJson(v string)`

SetFiltersJson sets FiltersJson field to given value.

### HasFiltersJson

`func (o *TemplateResponse) HasFiltersJson() bool`

HasFiltersJson returns a boolean if a field has been set.

### SetFiltersJsonNil

`func (o *TemplateResponse) SetFiltersJsonNil(b bool)`

 SetFiltersJsonNil sets the value for FiltersJson to be an explicit nil

### UnsetFiltersJson
`func (o *TemplateResponse) UnsetFiltersJson()`

UnsetFiltersJson ensures that no value is present for FiltersJson, not even an explicit nil
### GetIsOwnedByUser

`func (o *TemplateResponse) GetIsOwnedByUser() bool`

GetIsOwnedByUser returns the IsOwnedByUser field if non-nil, zero value otherwise.

### GetIsOwnedByUserOk

`func (o *TemplateResponse) GetIsOwnedByUserOk() (*bool, bool)`

GetIsOwnedByUserOk returns a tuple with the IsOwnedByUser field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsOwnedByUser

`func (o *TemplateResponse) SetIsOwnedByUser(v bool)`

SetIsOwnedByUser sets IsOwnedByUser field to given value.

### HasIsOwnedByUser

`func (o *TemplateResponse) HasIsOwnedByUser() bool`

HasIsOwnedByUser returns a boolean if a field has been set.

### GetIsScheduled

`func (o *TemplateResponse) GetIsScheduled() bool`

GetIsScheduled returns the IsScheduled field if non-nil, zero value otherwise.

### GetIsScheduledOk

`func (o *TemplateResponse) GetIsScheduledOk() (*bool, bool)`

GetIsScheduledOk returns a tuple with the IsScheduled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsScheduled

`func (o *TemplateResponse) SetIsScheduled(v bool)`

SetIsScheduled sets IsScheduled field to given value.

### HasIsScheduled

`func (o *TemplateResponse) HasIsScheduled() bool`

HasIsScheduled returns a boolean if a field has been set.

### GetCreationSource

`func (o *TemplateResponse) GetCreationSource() string`

GetCreationSource returns the CreationSource field if non-nil, zero value otherwise.

### GetCreationSourceOk

`func (o *TemplateResponse) GetCreationSourceOk() (*string, bool)`

GetCreationSourceOk returns a tuple with the CreationSource field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreationSource

`func (o *TemplateResponse) SetCreationSource(v string)`

SetCreationSource sets CreationSource field to given value.

### HasCreationSource

`func (o *TemplateResponse) HasCreationSource() bool`

HasCreationSource returns a boolean if a field has been set.

### GetIsDeleted

`func (o *TemplateResponse) GetIsDeleted() bool`

GetIsDeleted returns the IsDeleted field if non-nil, zero value otherwise.

### GetIsDeletedOk

`func (o *TemplateResponse) GetIsDeletedOk() (*bool, bool)`

GetIsDeletedOk returns a tuple with the IsDeleted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsDeleted

`func (o *TemplateResponse) SetIsDeleted(v bool)`

SetIsDeleted sets IsDeleted field to given value.

### HasIsDeleted

`func (o *TemplateResponse) HasIsDeleted() bool`

HasIsDeleted returns a boolean if a field has been set.

### SetIsDeletedNil

`func (o *TemplateResponse) SetIsDeletedNil(b bool)`

 SetIsDeletedNil sets the value for IsDeleted to be an explicit nil

### UnsetIsDeleted
`func (o *TemplateResponse) UnsetIsDeleted()`

UnsetIsDeleted ensures that no value is present for IsDeleted, not even an explicit nil
### GetUpdatedTime

`func (o *TemplateResponse) GetUpdatedTime() float32`

GetUpdatedTime returns the UpdatedTime field if non-nil, zero value otherwise.

### GetUpdatedTimeOk

`func (o *TemplateResponse) GetUpdatedTimeOk() (*float32, bool)`

GetUpdatedTimeOk returns a tuple with the UpdatedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedTime

`func (o *TemplateResponse) SetUpdatedTime(v float32)`

SetUpdatedTime sets UpdatedTime field to given value.

### HasUpdatedTime

`func (o *TemplateResponse) HasUpdatedTime() bool`

HasUpdatedTime returns a boolean if a field has been set.

### GetCustomColumnIds

`func (o *TemplateResponse) GetCustomColumnIds() []string`

GetCustomColumnIds returns the CustomColumnIds field if non-nil, zero value otherwise.

### GetCustomColumnIdsOk

`func (o *TemplateResponse) GetCustomColumnIdsOk() (*[]string, bool)`

GetCustomColumnIdsOk returns a tuple with the CustomColumnIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomColumnIds

`func (o *TemplateResponse) SetCustomColumnIds(v []string)`

SetCustomColumnIds sets CustomColumnIds field to given value.

### HasCustomColumnIds

`func (o *TemplateResponse) HasCustomColumnIds() bool`

HasCustomColumnIds returns a boolean if a field has been set.

### SetCustomColumnIdsNil

`func (o *TemplateResponse) SetCustomColumnIdsNil(b bool)`

 SetCustomColumnIdsNil sets the value for CustomColumnIds to be an explicit nil

### UnsetCustomColumnIds
`func (o *TemplateResponse) UnsetCustomColumnIds()`

UnsetCustomColumnIds ensures that no value is present for CustomColumnIds, not even an explicit nil
### GetType

`func (o *TemplateResponse) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *TemplateResponse) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *TemplateResponse) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *TemplateResponse) HasType() bool`

HasType returns a boolean if a field has been set.

### GetIngestionSources

`func (o *TemplateResponse) GetIngestionSources() []string`

GetIngestionSources returns the IngestionSources field if non-nil, zero value otherwise.

### GetIngestionSourcesOk

`func (o *TemplateResponse) GetIngestionSourcesOk() (*[]string, bool)`

GetIngestionSourcesOk returns a tuple with the IngestionSources field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIngestionSources

`func (o *TemplateResponse) SetIngestionSources(v []string)`

SetIngestionSources sets IngestionSources field to given value.

### HasIngestionSources

`func (o *TemplateResponse) HasIngestionSources() bool`

HasIngestionSources returns a boolean if a field has been set.

### SetIngestionSourcesNil

`func (o *TemplateResponse) SetIngestionSourcesNil(b bool)`

 SetIngestionSourcesNil sets the value for IngestionSources to be an explicit nil

### UnsetIngestionSources
`func (o *TemplateResponse) UnsetIngestionSources()`

UnsetIngestionSources ensures that no value is present for IngestionSources, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


