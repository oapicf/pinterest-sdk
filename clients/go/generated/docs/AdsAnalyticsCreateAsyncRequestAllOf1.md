# AdsAnalyticsCreateAsyncRequestAllOf1

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Columns** | [**[]ReportingColumnAsync**](ReportingColumnAsync.md) | Metric and entity columns | 
**Level** | [**MetricsReportingLevel**](MetricsReportingLevel.md) | Level of the report | 
**ReportFormat** | Pointer to [**DataOutputFormat**](DataOutputFormat.md) | Specification for formatting report data | [optional] [default to "JSON"]

## Methods

### NewAdsAnalyticsCreateAsyncRequestAllOf1

`func NewAdsAnalyticsCreateAsyncRequestAllOf1(columns []ReportingColumnAsync, level MetricsReportingLevel, ) *AdsAnalyticsCreateAsyncRequestAllOf1`

NewAdsAnalyticsCreateAsyncRequestAllOf1 instantiates a new AdsAnalyticsCreateAsyncRequestAllOf1 object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdsAnalyticsCreateAsyncRequestAllOf1WithDefaults

`func NewAdsAnalyticsCreateAsyncRequestAllOf1WithDefaults() *AdsAnalyticsCreateAsyncRequestAllOf1`

NewAdsAnalyticsCreateAsyncRequestAllOf1WithDefaults instantiates a new AdsAnalyticsCreateAsyncRequestAllOf1 object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetColumns

`func (o *AdsAnalyticsCreateAsyncRequestAllOf1) GetColumns() []ReportingColumnAsync`

GetColumns returns the Columns field if non-nil, zero value otherwise.

### GetColumnsOk

`func (o *AdsAnalyticsCreateAsyncRequestAllOf1) GetColumnsOk() (*[]ReportingColumnAsync, bool)`

GetColumnsOk returns a tuple with the Columns field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetColumns

`func (o *AdsAnalyticsCreateAsyncRequestAllOf1) SetColumns(v []ReportingColumnAsync)`

SetColumns sets Columns field to given value.


### GetLevel

`func (o *AdsAnalyticsCreateAsyncRequestAllOf1) GetLevel() MetricsReportingLevel`

GetLevel returns the Level field if non-nil, zero value otherwise.

### GetLevelOk

`func (o *AdsAnalyticsCreateAsyncRequestAllOf1) GetLevelOk() (*MetricsReportingLevel, bool)`

GetLevelOk returns a tuple with the Level field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLevel

`func (o *AdsAnalyticsCreateAsyncRequestAllOf1) SetLevel(v MetricsReportingLevel)`

SetLevel sets Level field to given value.


### GetReportFormat

`func (o *AdsAnalyticsCreateAsyncRequestAllOf1) GetReportFormat() DataOutputFormat`

GetReportFormat returns the ReportFormat field if non-nil, zero value otherwise.

### GetReportFormatOk

`func (o *AdsAnalyticsCreateAsyncRequestAllOf1) GetReportFormatOk() (*DataOutputFormat, bool)`

GetReportFormatOk returns a tuple with the ReportFormat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReportFormat

`func (o *AdsAnalyticsCreateAsyncRequestAllOf1) SetReportFormat(v DataOutputFormat)`

SetReportFormat sets ReportFormat field to given value.

### HasReportFormat

`func (o *AdsAnalyticsCreateAsyncRequestAllOf1) HasReportFormat() bool`

HasReportFormat returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


