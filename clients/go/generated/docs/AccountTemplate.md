# AccountTemplate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | Pointer to **string** | ID of the Ad Account that owns the template | [optional] [readonly] 
**AdAccountIds** | Pointer to **[]string** | IDs of the Ad Accounts that have access to this template | [optional] 
**AdeColumns** | Pointer to **[]string** | A list of ADE columns | [optional] 
**AttributionType** | Pointer to **interface{}** | Attribution type for Brand/Category/SKU reports | [optional] 
**ClickWindowDays** | Pointer to **float32** | The length of the sliding window over which click conversions will be attributed | [optional] 
**Columns** | Pointer to [**[]ReportingColumn**](ReportingColumn.md) | A list of columns to be included in the report | [optional] 
**ConversionReportTimeType** | Pointer to [**ConversionReportTimeType**](ConversionReportTimeType.md) | Conversion report time type | [optional] 
**CreationSource** | Pointer to [**CreationSource**](CreationSource.md) | The surface used to create this template | [optional] 
**CustomColumnIds** | Pointer to **[]string** | A list of custom column IDs | [optional] 
**DisplayMetadata** | Pointer to **string** | Additional metadata about this reporting template | [optional] 
**EngagementWindowDays** | Pointer to **float32** | The length of the sliding window over which engagement conversions will be attributed | [optional] 
**FiltersJson** | Pointer to **NullableString** | A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:\\ \&quot;field\&quot;: The column name\\ \&quot;operator\&quot;: The operator. Allowed operators: [\&quot;&#x3D;\&quot;, \&quot;!&#x3D;\&quot;, \&quot;in\&quot;, \&quot;not_in\&quot;, \&quot;~\&quot;, \&quot;&gt;\&quot;, \&quot;&lt;\&quot;, \&quot;contains_substring\&quot;]\\ \&quot;value\&quot;: A single value or a list of values | [optional] 
**Granularity** | Pointer to [**Granularity**](Granularity.md) |  | [optional] 
**Id** | **string** | Template ID | [readonly] 
**IngestionSources** | Pointer to [**[]IngestionSource**](IngestionSource.md) | The filter on the conversion ingestion source method for conversion metrics | [optional] 
**IsDefault** | Pointer to **bool** | A boolean representing if this is the default view that loads for this template type | [optional] 
**IsDeleted** | Pointer to **NullableBool** | A boolean that indicates if the template has been deleted | [optional] 
**IsOwnedByUser** | Pointer to **bool** | A boolean value that indicates if the user owns the template | [optional] 
**IsScheduled** | Pointer to **bool** | A boolean value that indicates if this template has been used to create a scheduled report | [optional] 
**Name** | Pointer to **NullableString** | Template Name | [optional] 
**ReportEndRelativeDaysInPast** | Pointer to **float32** | The number of days prior to the day the report will be delivered at which the report will end | [optional] 
**ReportFormat** | Pointer to [**DataOutputFormat**](DataOutputFormat.md) |  | [optional] 
**ReportLevel** | Pointer to [**MetricsReportingLevel**](MetricsReportingLevel.md) |  | [optional] 
**ReportStartRelativeDaysInPast** | Pointer to **float32** | The number of days prior to the day the report will be delivered at which the report will start | [optional] 
**ReportingTimeZone** | Pointer to [**ReportingTimeZone**](ReportingTimeZone.md) | Timezone for reporting data | [optional] 
**SortBy** | Pointer to **interface{}** | Unified metric sort configuration | [optional] 
**Type** | Pointer to **string** | Type of the template | [optional] 
**UpdatedTime** | Pointer to **float32** | Time of last update in seconds since Unix epoch | [optional] [readonly] 
**UserId** | Pointer to **string** | ID of the user who created the template | [optional] 
**ViewWindowDays** | Pointer to **float32** | The length of the sliding window over which view conversions will be attributed | [optional] 

## Methods

### NewAccountTemplate

`func NewAccountTemplate(id string, ) *AccountTemplate`

NewAccountTemplate instantiates a new AccountTemplate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAccountTemplateWithDefaults

`func NewAccountTemplateWithDefaults() *AccountTemplate`

NewAccountTemplateWithDefaults instantiates a new AccountTemplate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdAccountId

`func (o *AccountTemplate) GetAdAccountId() string`

GetAdAccountId returns the AdAccountId field if non-nil, zero value otherwise.

### GetAdAccountIdOk

`func (o *AccountTemplate) GetAdAccountIdOk() (*string, bool)`

GetAdAccountIdOk returns a tuple with the AdAccountId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdAccountId

`func (o *AccountTemplate) SetAdAccountId(v string)`

SetAdAccountId sets AdAccountId field to given value.

### HasAdAccountId

`func (o *AccountTemplate) HasAdAccountId() bool`

HasAdAccountId returns a boolean if a field has been set.

### GetAdAccountIds

`func (o *AccountTemplate) GetAdAccountIds() []string`

GetAdAccountIds returns the AdAccountIds field if non-nil, zero value otherwise.

### GetAdAccountIdsOk

`func (o *AccountTemplate) GetAdAccountIdsOk() (*[]string, bool)`

GetAdAccountIdsOk returns a tuple with the AdAccountIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdAccountIds

`func (o *AccountTemplate) SetAdAccountIds(v []string)`

SetAdAccountIds sets AdAccountIds field to given value.

### HasAdAccountIds

`func (o *AccountTemplate) HasAdAccountIds() bool`

HasAdAccountIds returns a boolean if a field has been set.

### GetAdeColumns

`func (o *AccountTemplate) GetAdeColumns() []string`

GetAdeColumns returns the AdeColumns field if non-nil, zero value otherwise.

### GetAdeColumnsOk

`func (o *AccountTemplate) GetAdeColumnsOk() (*[]string, bool)`

GetAdeColumnsOk returns a tuple with the AdeColumns field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdeColumns

`func (o *AccountTemplate) SetAdeColumns(v []string)`

SetAdeColumns sets AdeColumns field to given value.

### HasAdeColumns

`func (o *AccountTemplate) HasAdeColumns() bool`

HasAdeColumns returns a boolean if a field has been set.

### GetAttributionType

`func (o *AccountTemplate) GetAttributionType() interface{}`

GetAttributionType returns the AttributionType field if non-nil, zero value otherwise.

### GetAttributionTypeOk

`func (o *AccountTemplate) GetAttributionTypeOk() (*interface{}, bool)`

GetAttributionTypeOk returns a tuple with the AttributionType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttributionType

`func (o *AccountTemplate) SetAttributionType(v interface{})`

SetAttributionType sets AttributionType field to given value.

### HasAttributionType

`func (o *AccountTemplate) HasAttributionType() bool`

HasAttributionType returns a boolean if a field has been set.

### SetAttributionTypeNil

`func (o *AccountTemplate) SetAttributionTypeNil(b bool)`

 SetAttributionTypeNil sets the value for AttributionType to be an explicit nil

### UnsetAttributionType
`func (o *AccountTemplate) UnsetAttributionType()`

UnsetAttributionType ensures that no value is present for AttributionType, not even an explicit nil
### GetClickWindowDays

`func (o *AccountTemplate) GetClickWindowDays() float32`

GetClickWindowDays returns the ClickWindowDays field if non-nil, zero value otherwise.

### GetClickWindowDaysOk

`func (o *AccountTemplate) GetClickWindowDaysOk() (*float32, bool)`

GetClickWindowDaysOk returns a tuple with the ClickWindowDays field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClickWindowDays

`func (o *AccountTemplate) SetClickWindowDays(v float32)`

SetClickWindowDays sets ClickWindowDays field to given value.

### HasClickWindowDays

`func (o *AccountTemplate) HasClickWindowDays() bool`

HasClickWindowDays returns a boolean if a field has been set.

### GetColumns

`func (o *AccountTemplate) GetColumns() []ReportingColumn`

GetColumns returns the Columns field if non-nil, zero value otherwise.

### GetColumnsOk

`func (o *AccountTemplate) GetColumnsOk() (*[]ReportingColumn, bool)`

GetColumnsOk returns a tuple with the Columns field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetColumns

`func (o *AccountTemplate) SetColumns(v []ReportingColumn)`

SetColumns sets Columns field to given value.

### HasColumns

`func (o *AccountTemplate) HasColumns() bool`

HasColumns returns a boolean if a field has been set.

### GetConversionReportTimeType

`func (o *AccountTemplate) GetConversionReportTimeType() ConversionReportTimeType`

GetConversionReportTimeType returns the ConversionReportTimeType field if non-nil, zero value otherwise.

### GetConversionReportTimeTypeOk

`func (o *AccountTemplate) GetConversionReportTimeTypeOk() (*ConversionReportTimeType, bool)`

GetConversionReportTimeTypeOk returns a tuple with the ConversionReportTimeType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConversionReportTimeType

`func (o *AccountTemplate) SetConversionReportTimeType(v ConversionReportTimeType)`

SetConversionReportTimeType sets ConversionReportTimeType field to given value.

### HasConversionReportTimeType

`func (o *AccountTemplate) HasConversionReportTimeType() bool`

HasConversionReportTimeType returns a boolean if a field has been set.

### GetCreationSource

`func (o *AccountTemplate) GetCreationSource() CreationSource`

GetCreationSource returns the CreationSource field if non-nil, zero value otherwise.

### GetCreationSourceOk

`func (o *AccountTemplate) GetCreationSourceOk() (*CreationSource, bool)`

GetCreationSourceOk returns a tuple with the CreationSource field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreationSource

`func (o *AccountTemplate) SetCreationSource(v CreationSource)`

SetCreationSource sets CreationSource field to given value.

### HasCreationSource

`func (o *AccountTemplate) HasCreationSource() bool`

HasCreationSource returns a boolean if a field has been set.

### GetCustomColumnIds

`func (o *AccountTemplate) GetCustomColumnIds() []string`

GetCustomColumnIds returns the CustomColumnIds field if non-nil, zero value otherwise.

### GetCustomColumnIdsOk

`func (o *AccountTemplate) GetCustomColumnIdsOk() (*[]string, bool)`

GetCustomColumnIdsOk returns a tuple with the CustomColumnIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomColumnIds

`func (o *AccountTemplate) SetCustomColumnIds(v []string)`

SetCustomColumnIds sets CustomColumnIds field to given value.

### HasCustomColumnIds

`func (o *AccountTemplate) HasCustomColumnIds() bool`

HasCustomColumnIds returns a boolean if a field has been set.

### SetCustomColumnIdsNil

`func (o *AccountTemplate) SetCustomColumnIdsNil(b bool)`

 SetCustomColumnIdsNil sets the value for CustomColumnIds to be an explicit nil

### UnsetCustomColumnIds
`func (o *AccountTemplate) UnsetCustomColumnIds()`

UnsetCustomColumnIds ensures that no value is present for CustomColumnIds, not even an explicit nil
### GetDisplayMetadata

`func (o *AccountTemplate) GetDisplayMetadata() string`

GetDisplayMetadata returns the DisplayMetadata field if non-nil, zero value otherwise.

### GetDisplayMetadataOk

`func (o *AccountTemplate) GetDisplayMetadataOk() (*string, bool)`

GetDisplayMetadataOk returns a tuple with the DisplayMetadata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisplayMetadata

`func (o *AccountTemplate) SetDisplayMetadata(v string)`

SetDisplayMetadata sets DisplayMetadata field to given value.

### HasDisplayMetadata

`func (o *AccountTemplate) HasDisplayMetadata() bool`

HasDisplayMetadata returns a boolean if a field has been set.

### GetEngagementWindowDays

`func (o *AccountTemplate) GetEngagementWindowDays() float32`

GetEngagementWindowDays returns the EngagementWindowDays field if non-nil, zero value otherwise.

### GetEngagementWindowDaysOk

`func (o *AccountTemplate) GetEngagementWindowDaysOk() (*float32, bool)`

GetEngagementWindowDaysOk returns a tuple with the EngagementWindowDays field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEngagementWindowDays

`func (o *AccountTemplate) SetEngagementWindowDays(v float32)`

SetEngagementWindowDays sets EngagementWindowDays field to given value.

### HasEngagementWindowDays

`func (o *AccountTemplate) HasEngagementWindowDays() bool`

HasEngagementWindowDays returns a boolean if a field has been set.

### GetFiltersJson

`func (o *AccountTemplate) GetFiltersJson() string`

GetFiltersJson returns the FiltersJson field if non-nil, zero value otherwise.

### GetFiltersJsonOk

`func (o *AccountTemplate) GetFiltersJsonOk() (*string, bool)`

GetFiltersJsonOk returns a tuple with the FiltersJson field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFiltersJson

`func (o *AccountTemplate) SetFiltersJson(v string)`

SetFiltersJson sets FiltersJson field to given value.

### HasFiltersJson

`func (o *AccountTemplate) HasFiltersJson() bool`

HasFiltersJson returns a boolean if a field has been set.

### SetFiltersJsonNil

`func (o *AccountTemplate) SetFiltersJsonNil(b bool)`

 SetFiltersJsonNil sets the value for FiltersJson to be an explicit nil

### UnsetFiltersJson
`func (o *AccountTemplate) UnsetFiltersJson()`

UnsetFiltersJson ensures that no value is present for FiltersJson, not even an explicit nil
### GetGranularity

`func (o *AccountTemplate) GetGranularity() Granularity`

GetGranularity returns the Granularity field if non-nil, zero value otherwise.

### GetGranularityOk

`func (o *AccountTemplate) GetGranularityOk() (*Granularity, bool)`

GetGranularityOk returns a tuple with the Granularity field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGranularity

`func (o *AccountTemplate) SetGranularity(v Granularity)`

SetGranularity sets Granularity field to given value.

### HasGranularity

`func (o *AccountTemplate) HasGranularity() bool`

HasGranularity returns a boolean if a field has been set.

### GetId

`func (o *AccountTemplate) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *AccountTemplate) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *AccountTemplate) SetId(v string)`

SetId sets Id field to given value.


### GetIngestionSources

`func (o *AccountTemplate) GetIngestionSources() []IngestionSource`

GetIngestionSources returns the IngestionSources field if non-nil, zero value otherwise.

### GetIngestionSourcesOk

`func (o *AccountTemplate) GetIngestionSourcesOk() (*[]IngestionSource, bool)`

GetIngestionSourcesOk returns a tuple with the IngestionSources field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIngestionSources

`func (o *AccountTemplate) SetIngestionSources(v []IngestionSource)`

SetIngestionSources sets IngestionSources field to given value.

### HasIngestionSources

`func (o *AccountTemplate) HasIngestionSources() bool`

HasIngestionSources returns a boolean if a field has been set.

### SetIngestionSourcesNil

`func (o *AccountTemplate) SetIngestionSourcesNil(b bool)`

 SetIngestionSourcesNil sets the value for IngestionSources to be an explicit nil

### UnsetIngestionSources
`func (o *AccountTemplate) UnsetIngestionSources()`

UnsetIngestionSources ensures that no value is present for IngestionSources, not even an explicit nil
### GetIsDefault

`func (o *AccountTemplate) GetIsDefault() bool`

GetIsDefault returns the IsDefault field if non-nil, zero value otherwise.

### GetIsDefaultOk

`func (o *AccountTemplate) GetIsDefaultOk() (*bool, bool)`

GetIsDefaultOk returns a tuple with the IsDefault field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsDefault

`func (o *AccountTemplate) SetIsDefault(v bool)`

SetIsDefault sets IsDefault field to given value.

### HasIsDefault

`func (o *AccountTemplate) HasIsDefault() bool`

HasIsDefault returns a boolean if a field has been set.

### GetIsDeleted

`func (o *AccountTemplate) GetIsDeleted() bool`

GetIsDeleted returns the IsDeleted field if non-nil, zero value otherwise.

### GetIsDeletedOk

`func (o *AccountTemplate) GetIsDeletedOk() (*bool, bool)`

GetIsDeletedOk returns a tuple with the IsDeleted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsDeleted

`func (o *AccountTemplate) SetIsDeleted(v bool)`

SetIsDeleted sets IsDeleted field to given value.

### HasIsDeleted

`func (o *AccountTemplate) HasIsDeleted() bool`

HasIsDeleted returns a boolean if a field has been set.

### SetIsDeletedNil

`func (o *AccountTemplate) SetIsDeletedNil(b bool)`

 SetIsDeletedNil sets the value for IsDeleted to be an explicit nil

### UnsetIsDeleted
`func (o *AccountTemplate) UnsetIsDeleted()`

UnsetIsDeleted ensures that no value is present for IsDeleted, not even an explicit nil
### GetIsOwnedByUser

`func (o *AccountTemplate) GetIsOwnedByUser() bool`

GetIsOwnedByUser returns the IsOwnedByUser field if non-nil, zero value otherwise.

### GetIsOwnedByUserOk

`func (o *AccountTemplate) GetIsOwnedByUserOk() (*bool, bool)`

GetIsOwnedByUserOk returns a tuple with the IsOwnedByUser field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsOwnedByUser

`func (o *AccountTemplate) SetIsOwnedByUser(v bool)`

SetIsOwnedByUser sets IsOwnedByUser field to given value.

### HasIsOwnedByUser

`func (o *AccountTemplate) HasIsOwnedByUser() bool`

HasIsOwnedByUser returns a boolean if a field has been set.

### GetIsScheduled

`func (o *AccountTemplate) GetIsScheduled() bool`

GetIsScheduled returns the IsScheduled field if non-nil, zero value otherwise.

### GetIsScheduledOk

`func (o *AccountTemplate) GetIsScheduledOk() (*bool, bool)`

GetIsScheduledOk returns a tuple with the IsScheduled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsScheduled

`func (o *AccountTemplate) SetIsScheduled(v bool)`

SetIsScheduled sets IsScheduled field to given value.

### HasIsScheduled

`func (o *AccountTemplate) HasIsScheduled() bool`

HasIsScheduled returns a boolean if a field has been set.

### GetName

`func (o *AccountTemplate) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *AccountTemplate) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *AccountTemplate) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *AccountTemplate) HasName() bool`

HasName returns a boolean if a field has been set.

### SetNameNil

`func (o *AccountTemplate) SetNameNil(b bool)`

 SetNameNil sets the value for Name to be an explicit nil

### UnsetName
`func (o *AccountTemplate) UnsetName()`

UnsetName ensures that no value is present for Name, not even an explicit nil
### GetReportEndRelativeDaysInPast

`func (o *AccountTemplate) GetReportEndRelativeDaysInPast() float32`

GetReportEndRelativeDaysInPast returns the ReportEndRelativeDaysInPast field if non-nil, zero value otherwise.

### GetReportEndRelativeDaysInPastOk

`func (o *AccountTemplate) GetReportEndRelativeDaysInPastOk() (*float32, bool)`

GetReportEndRelativeDaysInPastOk returns a tuple with the ReportEndRelativeDaysInPast field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReportEndRelativeDaysInPast

`func (o *AccountTemplate) SetReportEndRelativeDaysInPast(v float32)`

SetReportEndRelativeDaysInPast sets ReportEndRelativeDaysInPast field to given value.

### HasReportEndRelativeDaysInPast

`func (o *AccountTemplate) HasReportEndRelativeDaysInPast() bool`

HasReportEndRelativeDaysInPast returns a boolean if a field has been set.

### GetReportFormat

`func (o *AccountTemplate) GetReportFormat() DataOutputFormat`

GetReportFormat returns the ReportFormat field if non-nil, zero value otherwise.

### GetReportFormatOk

`func (o *AccountTemplate) GetReportFormatOk() (*DataOutputFormat, bool)`

GetReportFormatOk returns a tuple with the ReportFormat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReportFormat

`func (o *AccountTemplate) SetReportFormat(v DataOutputFormat)`

SetReportFormat sets ReportFormat field to given value.

### HasReportFormat

`func (o *AccountTemplate) HasReportFormat() bool`

HasReportFormat returns a boolean if a field has been set.

### GetReportLevel

`func (o *AccountTemplate) GetReportLevel() MetricsReportingLevel`

GetReportLevel returns the ReportLevel field if non-nil, zero value otherwise.

### GetReportLevelOk

`func (o *AccountTemplate) GetReportLevelOk() (*MetricsReportingLevel, bool)`

GetReportLevelOk returns a tuple with the ReportLevel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReportLevel

`func (o *AccountTemplate) SetReportLevel(v MetricsReportingLevel)`

SetReportLevel sets ReportLevel field to given value.

### HasReportLevel

`func (o *AccountTemplate) HasReportLevel() bool`

HasReportLevel returns a boolean if a field has been set.

### GetReportStartRelativeDaysInPast

`func (o *AccountTemplate) GetReportStartRelativeDaysInPast() float32`

GetReportStartRelativeDaysInPast returns the ReportStartRelativeDaysInPast field if non-nil, zero value otherwise.

### GetReportStartRelativeDaysInPastOk

`func (o *AccountTemplate) GetReportStartRelativeDaysInPastOk() (*float32, bool)`

GetReportStartRelativeDaysInPastOk returns a tuple with the ReportStartRelativeDaysInPast field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReportStartRelativeDaysInPast

`func (o *AccountTemplate) SetReportStartRelativeDaysInPast(v float32)`

SetReportStartRelativeDaysInPast sets ReportStartRelativeDaysInPast field to given value.

### HasReportStartRelativeDaysInPast

`func (o *AccountTemplate) HasReportStartRelativeDaysInPast() bool`

HasReportStartRelativeDaysInPast returns a boolean if a field has been set.

### GetReportingTimeZone

`func (o *AccountTemplate) GetReportingTimeZone() ReportingTimeZone`

GetReportingTimeZone returns the ReportingTimeZone field if non-nil, zero value otherwise.

### GetReportingTimeZoneOk

`func (o *AccountTemplate) GetReportingTimeZoneOk() (*ReportingTimeZone, bool)`

GetReportingTimeZoneOk returns a tuple with the ReportingTimeZone field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReportingTimeZone

`func (o *AccountTemplate) SetReportingTimeZone(v ReportingTimeZone)`

SetReportingTimeZone sets ReportingTimeZone field to given value.

### HasReportingTimeZone

`func (o *AccountTemplate) HasReportingTimeZone() bool`

HasReportingTimeZone returns a boolean if a field has been set.

### GetSortBy

`func (o *AccountTemplate) GetSortBy() interface{}`

GetSortBy returns the SortBy field if non-nil, zero value otherwise.

### GetSortByOk

`func (o *AccountTemplate) GetSortByOk() (*interface{}, bool)`

GetSortByOk returns a tuple with the SortBy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSortBy

`func (o *AccountTemplate) SetSortBy(v interface{})`

SetSortBy sets SortBy field to given value.

### HasSortBy

`func (o *AccountTemplate) HasSortBy() bool`

HasSortBy returns a boolean if a field has been set.

### SetSortByNil

`func (o *AccountTemplate) SetSortByNil(b bool)`

 SetSortByNil sets the value for SortBy to be an explicit nil

### UnsetSortBy
`func (o *AccountTemplate) UnsetSortBy()`

UnsetSortBy ensures that no value is present for SortBy, not even an explicit nil
### GetType

`func (o *AccountTemplate) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *AccountTemplate) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *AccountTemplate) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *AccountTemplate) HasType() bool`

HasType returns a boolean if a field has been set.

### GetUpdatedTime

`func (o *AccountTemplate) GetUpdatedTime() float32`

GetUpdatedTime returns the UpdatedTime field if non-nil, zero value otherwise.

### GetUpdatedTimeOk

`func (o *AccountTemplate) GetUpdatedTimeOk() (*float32, bool)`

GetUpdatedTimeOk returns a tuple with the UpdatedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedTime

`func (o *AccountTemplate) SetUpdatedTime(v float32)`

SetUpdatedTime sets UpdatedTime field to given value.

### HasUpdatedTime

`func (o *AccountTemplate) HasUpdatedTime() bool`

HasUpdatedTime returns a boolean if a field has been set.

### GetUserId

`func (o *AccountTemplate) GetUserId() string`

GetUserId returns the UserId field if non-nil, zero value otherwise.

### GetUserIdOk

`func (o *AccountTemplate) GetUserIdOk() (*string, bool)`

GetUserIdOk returns a tuple with the UserId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserId

`func (o *AccountTemplate) SetUserId(v string)`

SetUserId sets UserId field to given value.

### HasUserId

`func (o *AccountTemplate) HasUserId() bool`

HasUserId returns a boolean if a field has been set.

### GetViewWindowDays

`func (o *AccountTemplate) GetViewWindowDays() float32`

GetViewWindowDays returns the ViewWindowDays field if non-nil, zero value otherwise.

### GetViewWindowDaysOk

`func (o *AccountTemplate) GetViewWindowDaysOk() (*float32, bool)`

GetViewWindowDaysOk returns a tuple with the ViewWindowDays field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetViewWindowDays

`func (o *AccountTemplate) SetViewWindowDays(v float32)`

SetViewWindowDays sets ViewWindowDays field to given value.

### HasViewWindowDays

`func (o *AccountTemplate) HasViewWindowDays() bool`

HasViewWindowDays returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


