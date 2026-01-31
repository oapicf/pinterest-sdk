# ConversionProductReportRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdGroupIds** | Pointer to **[]string** | List of ad group ids. &lt;br&gt;Only support ad_group_ids field when level of the report is AD_GROUP. | [optional] 
**CampaignIds** | Pointer to **[]string** | List of campaign ids. &lt;br&gt;Only support campaign_ids field when level of the report is CAMPAIGN. | [optional] 
**CampaignObjectiveTypes** | Pointer to [**[]ObjectiveType**](ObjectiveType.md) | List of values for filtering. Default is [&#39;CONSIDERATION&#39;,&#39;AWARENESS&#39;,&#39;WEB_CONVERSION&#39;,&#39;VIDEO_COMPLETION&#39;]. | [optional] 
**ClickWindowDays** | Pointer to [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to _30]
**Columns** | [**[]ConversionProductReportingColumn**](ConversionProductReportingColumn.md) | Metric and entity columns | 
**ConversionProductAttributionType** | Pointer to **string** |  | [optional] 
**ConversionProductBreakdown** | Pointer to **string** |  | [optional] 
**ConversionReportTime** | Pointer to [**ConversionReportTimeType**](ConversionReportTimeType.md) | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION]
**EndDate** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD.&lt;br&gt; A max of 1 year is allowed between the start and end date for reports. | 
**Granularity** | **string** | TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; WEEK - metrics are broken down weekly.&lt;br&gt; MONTH - metrics are broken down monthly. | 
**Level** | **string** | Level of the report | 
**ProductSkuIds** | Pointer to **[]string** | List of SKU ids. &lt;br&gt;Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP. | [optional] 
**ReportName** | **string** | Name of the conversion product report. | 
**StartDate** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD.&lt;br&gt; Start date must be after 2024-03-16. 7 day minimum time window for report is required. | 
**ViewWindowDays** | Pointer to [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; day. | [optional] [default to _30]

## Methods

### NewConversionProductReportRequest

`func NewConversionProductReportRequest(columns []ConversionProductReportingColumn, endDate string, granularity string, level string, reportName string, startDate string, ) *ConversionProductReportRequest`

NewConversionProductReportRequest instantiates a new ConversionProductReportRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConversionProductReportRequestWithDefaults

`func NewConversionProductReportRequestWithDefaults() *ConversionProductReportRequest`

NewConversionProductReportRequestWithDefaults instantiates a new ConversionProductReportRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdGroupIds

`func (o *ConversionProductReportRequest) GetAdGroupIds() []string`

GetAdGroupIds returns the AdGroupIds field if non-nil, zero value otherwise.

### GetAdGroupIdsOk

`func (o *ConversionProductReportRequest) GetAdGroupIdsOk() (*[]string, bool)`

GetAdGroupIdsOk returns a tuple with the AdGroupIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdGroupIds

`func (o *ConversionProductReportRequest) SetAdGroupIds(v []string)`

SetAdGroupIds sets AdGroupIds field to given value.

### HasAdGroupIds

`func (o *ConversionProductReportRequest) HasAdGroupIds() bool`

HasAdGroupIds returns a boolean if a field has been set.

### GetCampaignIds

`func (o *ConversionProductReportRequest) GetCampaignIds() []string`

GetCampaignIds returns the CampaignIds field if non-nil, zero value otherwise.

### GetCampaignIdsOk

`func (o *ConversionProductReportRequest) GetCampaignIdsOk() (*[]string, bool)`

GetCampaignIdsOk returns a tuple with the CampaignIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCampaignIds

`func (o *ConversionProductReportRequest) SetCampaignIds(v []string)`

SetCampaignIds sets CampaignIds field to given value.

### HasCampaignIds

`func (o *ConversionProductReportRequest) HasCampaignIds() bool`

HasCampaignIds returns a boolean if a field has been set.

### GetCampaignObjectiveTypes

`func (o *ConversionProductReportRequest) GetCampaignObjectiveTypes() []ObjectiveType`

GetCampaignObjectiveTypes returns the CampaignObjectiveTypes field if non-nil, zero value otherwise.

### GetCampaignObjectiveTypesOk

`func (o *ConversionProductReportRequest) GetCampaignObjectiveTypesOk() (*[]ObjectiveType, bool)`

GetCampaignObjectiveTypesOk returns a tuple with the CampaignObjectiveTypes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCampaignObjectiveTypes

`func (o *ConversionProductReportRequest) SetCampaignObjectiveTypes(v []ObjectiveType)`

SetCampaignObjectiveTypes sets CampaignObjectiveTypes field to given value.

### HasCampaignObjectiveTypes

`func (o *ConversionProductReportRequest) HasCampaignObjectiveTypes() bool`

HasCampaignObjectiveTypes returns a boolean if a field has been set.

### GetClickWindowDays

`func (o *ConversionProductReportRequest) GetClickWindowDays() ConversionAttributionWindowDays`

GetClickWindowDays returns the ClickWindowDays field if non-nil, zero value otherwise.

### GetClickWindowDaysOk

`func (o *ConversionProductReportRequest) GetClickWindowDaysOk() (*ConversionAttributionWindowDays, bool)`

GetClickWindowDaysOk returns a tuple with the ClickWindowDays field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClickWindowDays

`func (o *ConversionProductReportRequest) SetClickWindowDays(v ConversionAttributionWindowDays)`

SetClickWindowDays sets ClickWindowDays field to given value.

### HasClickWindowDays

`func (o *ConversionProductReportRequest) HasClickWindowDays() bool`

HasClickWindowDays returns a boolean if a field has been set.

### GetColumns

`func (o *ConversionProductReportRequest) GetColumns() []ConversionProductReportingColumn`

GetColumns returns the Columns field if non-nil, zero value otherwise.

### GetColumnsOk

`func (o *ConversionProductReportRequest) GetColumnsOk() (*[]ConversionProductReportingColumn, bool)`

GetColumnsOk returns a tuple with the Columns field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetColumns

`func (o *ConversionProductReportRequest) SetColumns(v []ConversionProductReportingColumn)`

SetColumns sets Columns field to given value.


### GetConversionProductAttributionType

`func (o *ConversionProductReportRequest) GetConversionProductAttributionType() string`

GetConversionProductAttributionType returns the ConversionProductAttributionType field if non-nil, zero value otherwise.

### GetConversionProductAttributionTypeOk

`func (o *ConversionProductReportRequest) GetConversionProductAttributionTypeOk() (*string, bool)`

GetConversionProductAttributionTypeOk returns a tuple with the ConversionProductAttributionType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConversionProductAttributionType

`func (o *ConversionProductReportRequest) SetConversionProductAttributionType(v string)`

SetConversionProductAttributionType sets ConversionProductAttributionType field to given value.

### HasConversionProductAttributionType

`func (o *ConversionProductReportRequest) HasConversionProductAttributionType() bool`

HasConversionProductAttributionType returns a boolean if a field has been set.

### GetConversionProductBreakdown

`func (o *ConversionProductReportRequest) GetConversionProductBreakdown() string`

GetConversionProductBreakdown returns the ConversionProductBreakdown field if non-nil, zero value otherwise.

### GetConversionProductBreakdownOk

`func (o *ConversionProductReportRequest) GetConversionProductBreakdownOk() (*string, bool)`

GetConversionProductBreakdownOk returns a tuple with the ConversionProductBreakdown field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConversionProductBreakdown

`func (o *ConversionProductReportRequest) SetConversionProductBreakdown(v string)`

SetConversionProductBreakdown sets ConversionProductBreakdown field to given value.

### HasConversionProductBreakdown

`func (o *ConversionProductReportRequest) HasConversionProductBreakdown() bool`

HasConversionProductBreakdown returns a boolean if a field has been set.

### GetConversionReportTime

`func (o *ConversionProductReportRequest) GetConversionReportTime() ConversionReportTimeType`

GetConversionReportTime returns the ConversionReportTime field if non-nil, zero value otherwise.

### GetConversionReportTimeOk

`func (o *ConversionProductReportRequest) GetConversionReportTimeOk() (*ConversionReportTimeType, bool)`

GetConversionReportTimeOk returns a tuple with the ConversionReportTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConversionReportTime

`func (o *ConversionProductReportRequest) SetConversionReportTime(v ConversionReportTimeType)`

SetConversionReportTime sets ConversionReportTime field to given value.

### HasConversionReportTime

`func (o *ConversionProductReportRequest) HasConversionReportTime() bool`

HasConversionReportTime returns a boolean if a field has been set.

### GetEndDate

`func (o *ConversionProductReportRequest) GetEndDate() string`

GetEndDate returns the EndDate field if non-nil, zero value otherwise.

### GetEndDateOk

`func (o *ConversionProductReportRequest) GetEndDateOk() (*string, bool)`

GetEndDateOk returns a tuple with the EndDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndDate

`func (o *ConversionProductReportRequest) SetEndDate(v string)`

SetEndDate sets EndDate field to given value.


### GetGranularity

`func (o *ConversionProductReportRequest) GetGranularity() string`

GetGranularity returns the Granularity field if non-nil, zero value otherwise.

### GetGranularityOk

`func (o *ConversionProductReportRequest) GetGranularityOk() (*string, bool)`

GetGranularityOk returns a tuple with the Granularity field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGranularity

`func (o *ConversionProductReportRequest) SetGranularity(v string)`

SetGranularity sets Granularity field to given value.


### GetLevel

`func (o *ConversionProductReportRequest) GetLevel() string`

GetLevel returns the Level field if non-nil, zero value otherwise.

### GetLevelOk

`func (o *ConversionProductReportRequest) GetLevelOk() (*string, bool)`

GetLevelOk returns a tuple with the Level field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLevel

`func (o *ConversionProductReportRequest) SetLevel(v string)`

SetLevel sets Level field to given value.


### GetProductSkuIds

`func (o *ConversionProductReportRequest) GetProductSkuIds() []string`

GetProductSkuIds returns the ProductSkuIds field if non-nil, zero value otherwise.

### GetProductSkuIdsOk

`func (o *ConversionProductReportRequest) GetProductSkuIdsOk() (*[]string, bool)`

GetProductSkuIdsOk returns a tuple with the ProductSkuIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProductSkuIds

`func (o *ConversionProductReportRequest) SetProductSkuIds(v []string)`

SetProductSkuIds sets ProductSkuIds field to given value.

### HasProductSkuIds

`func (o *ConversionProductReportRequest) HasProductSkuIds() bool`

HasProductSkuIds returns a boolean if a field has been set.

### GetReportName

`func (o *ConversionProductReportRequest) GetReportName() string`

GetReportName returns the ReportName field if non-nil, zero value otherwise.

### GetReportNameOk

`func (o *ConversionProductReportRequest) GetReportNameOk() (*string, bool)`

GetReportNameOk returns a tuple with the ReportName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReportName

`func (o *ConversionProductReportRequest) SetReportName(v string)`

SetReportName sets ReportName field to given value.


### GetStartDate

`func (o *ConversionProductReportRequest) GetStartDate() string`

GetStartDate returns the StartDate field if non-nil, zero value otherwise.

### GetStartDateOk

`func (o *ConversionProductReportRequest) GetStartDateOk() (*string, bool)`

GetStartDateOk returns a tuple with the StartDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStartDate

`func (o *ConversionProductReportRequest) SetStartDate(v string)`

SetStartDate sets StartDate field to given value.


### GetViewWindowDays

`func (o *ConversionProductReportRequest) GetViewWindowDays() ConversionAttributionWindowDays`

GetViewWindowDays returns the ViewWindowDays field if non-nil, zero value otherwise.

### GetViewWindowDaysOk

`func (o *ConversionProductReportRequest) GetViewWindowDaysOk() (*ConversionAttributionWindowDays, bool)`

GetViewWindowDaysOk returns a tuple with the ViewWindowDays field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetViewWindowDays

`func (o *ConversionProductReportRequest) SetViewWindowDays(v ConversionAttributionWindowDays)`

SetViewWindowDays sets ViewWindowDays field to given value.

### HasViewWindowDays

`func (o *ConversionProductReportRequest) HasViewWindowDays() bool`

HasViewWindowDays returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


