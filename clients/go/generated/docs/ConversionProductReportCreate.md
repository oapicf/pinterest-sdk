# ConversionProductReportCreate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdGroupIds** | Pointer to **[]string** |   List of ad group ids.   Only support ad_group_ids field when level of the report is AD_GROUP. | [optional] 
**CampaignIds** | Pointer to **[]string** |   List of campaign ids.   Only support campaign_ids field when level of the report is CAMPAIGN. | [optional] 
**CampaignObjectiveTypes** | Pointer to [**[]ConversionObjectiveType**](ConversionObjectiveType.md) | List of values for filtering. Default is [&#39;CONSIDERATION&#39;,&#39;AWARENESS&#39;,&#39;WEB_CONVERSION&#39;,&#39;VIDEO_COMPLETION&#39;]. | [optional] 
**ClickWindowDays** | Pointer to [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to _30]
**Columns** | [**[]ConversionProductReportingColumn**](ConversionProductReportingColumn.md) | Metric and entity columns | 
**ConversionProductAttributionType** | Pointer to [**ConversionProductAttributionType**](ConversionProductAttributionType.md) |   Required attribution type of the B/C/S report.   When the attribution type is BRAND_ATTRIBUTION, start_date for the report must be after 2025-04-01. | [optional] [default to DEFAULT]
**ConversionProductBreakdown** | Pointer to [**ConversionProductReportBreakdownType**](ConversionProductReportBreakdownType.md) | Report breakdown type. This is used to specify the breakdown of the report by brand, category, or SKU. | [optional] [default to PRODUCT_BRAND]
**ConversionReportTime** | Pointer to [**ConversionReportTimeType**](ConversionReportTimeType.md) | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION]
**EndDate** | **string** |   Metric report end date (UTC). Format: YYYY-MM-DD.   A max of 1 year is allowed between the start and end date for reports. | 
**Granularity** | [**ConversionProductReportGranularity**](ConversionProductReportGranularity.md) | Report granularity for time-based metric aggregation | 
**Level** | [**ConversionProductReportLevel**](ConversionProductReportLevel.md) | Level of the report | 
**ProductSkuIds** | Pointer to **[]string** |   List of SKU ids.   Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP. | [optional] 
**ReportName** | **string** | Name of the conversion product report | 
**StartDate** | **string** |   Metric report start date (UTC). Format: YYYY-MM-DD.   Start date must be after 2024-03-16. 7 day minimum time window for report is required. | 
**ViewWindowDays** | Pointer to [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to _30]

## Methods

### NewConversionProductReportCreate

`func NewConversionProductReportCreate(columns []ConversionProductReportingColumn, endDate string, granularity ConversionProductReportGranularity, level ConversionProductReportLevel, reportName string, startDate string, ) *ConversionProductReportCreate`

NewConversionProductReportCreate instantiates a new ConversionProductReportCreate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConversionProductReportCreateWithDefaults

`func NewConversionProductReportCreateWithDefaults() *ConversionProductReportCreate`

NewConversionProductReportCreateWithDefaults instantiates a new ConversionProductReportCreate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdGroupIds

`func (o *ConversionProductReportCreate) GetAdGroupIds() []string`

GetAdGroupIds returns the AdGroupIds field if non-nil, zero value otherwise.

### GetAdGroupIdsOk

`func (o *ConversionProductReportCreate) GetAdGroupIdsOk() (*[]string, bool)`

GetAdGroupIdsOk returns a tuple with the AdGroupIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdGroupIds

`func (o *ConversionProductReportCreate) SetAdGroupIds(v []string)`

SetAdGroupIds sets AdGroupIds field to given value.

### HasAdGroupIds

`func (o *ConversionProductReportCreate) HasAdGroupIds() bool`

HasAdGroupIds returns a boolean if a field has been set.

### GetCampaignIds

`func (o *ConversionProductReportCreate) GetCampaignIds() []string`

GetCampaignIds returns the CampaignIds field if non-nil, zero value otherwise.

### GetCampaignIdsOk

`func (o *ConversionProductReportCreate) GetCampaignIdsOk() (*[]string, bool)`

GetCampaignIdsOk returns a tuple with the CampaignIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCampaignIds

`func (o *ConversionProductReportCreate) SetCampaignIds(v []string)`

SetCampaignIds sets CampaignIds field to given value.

### HasCampaignIds

`func (o *ConversionProductReportCreate) HasCampaignIds() bool`

HasCampaignIds returns a boolean if a field has been set.

### GetCampaignObjectiveTypes

`func (o *ConversionProductReportCreate) GetCampaignObjectiveTypes() []ConversionObjectiveType`

GetCampaignObjectiveTypes returns the CampaignObjectiveTypes field if non-nil, zero value otherwise.

### GetCampaignObjectiveTypesOk

`func (o *ConversionProductReportCreate) GetCampaignObjectiveTypesOk() (*[]ConversionObjectiveType, bool)`

GetCampaignObjectiveTypesOk returns a tuple with the CampaignObjectiveTypes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCampaignObjectiveTypes

`func (o *ConversionProductReportCreate) SetCampaignObjectiveTypes(v []ConversionObjectiveType)`

SetCampaignObjectiveTypes sets CampaignObjectiveTypes field to given value.

### HasCampaignObjectiveTypes

`func (o *ConversionProductReportCreate) HasCampaignObjectiveTypes() bool`

HasCampaignObjectiveTypes returns a boolean if a field has been set.

### GetClickWindowDays

`func (o *ConversionProductReportCreate) GetClickWindowDays() ConversionAttributionWindowDays`

GetClickWindowDays returns the ClickWindowDays field if non-nil, zero value otherwise.

### GetClickWindowDaysOk

`func (o *ConversionProductReportCreate) GetClickWindowDaysOk() (*ConversionAttributionWindowDays, bool)`

GetClickWindowDaysOk returns a tuple with the ClickWindowDays field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClickWindowDays

`func (o *ConversionProductReportCreate) SetClickWindowDays(v ConversionAttributionWindowDays)`

SetClickWindowDays sets ClickWindowDays field to given value.

### HasClickWindowDays

`func (o *ConversionProductReportCreate) HasClickWindowDays() bool`

HasClickWindowDays returns a boolean if a field has been set.

### GetColumns

`func (o *ConversionProductReportCreate) GetColumns() []ConversionProductReportingColumn`

GetColumns returns the Columns field if non-nil, zero value otherwise.

### GetColumnsOk

`func (o *ConversionProductReportCreate) GetColumnsOk() (*[]ConversionProductReportingColumn, bool)`

GetColumnsOk returns a tuple with the Columns field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetColumns

`func (o *ConversionProductReportCreate) SetColumns(v []ConversionProductReportingColumn)`

SetColumns sets Columns field to given value.


### GetConversionProductAttributionType

`func (o *ConversionProductReportCreate) GetConversionProductAttributionType() ConversionProductAttributionType`

GetConversionProductAttributionType returns the ConversionProductAttributionType field if non-nil, zero value otherwise.

### GetConversionProductAttributionTypeOk

`func (o *ConversionProductReportCreate) GetConversionProductAttributionTypeOk() (*ConversionProductAttributionType, bool)`

GetConversionProductAttributionTypeOk returns a tuple with the ConversionProductAttributionType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConversionProductAttributionType

`func (o *ConversionProductReportCreate) SetConversionProductAttributionType(v ConversionProductAttributionType)`

SetConversionProductAttributionType sets ConversionProductAttributionType field to given value.

### HasConversionProductAttributionType

`func (o *ConversionProductReportCreate) HasConversionProductAttributionType() bool`

HasConversionProductAttributionType returns a boolean if a field has been set.

### GetConversionProductBreakdown

`func (o *ConversionProductReportCreate) GetConversionProductBreakdown() ConversionProductReportBreakdownType`

GetConversionProductBreakdown returns the ConversionProductBreakdown field if non-nil, zero value otherwise.

### GetConversionProductBreakdownOk

`func (o *ConversionProductReportCreate) GetConversionProductBreakdownOk() (*ConversionProductReportBreakdownType, bool)`

GetConversionProductBreakdownOk returns a tuple with the ConversionProductBreakdown field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConversionProductBreakdown

`func (o *ConversionProductReportCreate) SetConversionProductBreakdown(v ConversionProductReportBreakdownType)`

SetConversionProductBreakdown sets ConversionProductBreakdown field to given value.

### HasConversionProductBreakdown

`func (o *ConversionProductReportCreate) HasConversionProductBreakdown() bool`

HasConversionProductBreakdown returns a boolean if a field has been set.

### GetConversionReportTime

`func (o *ConversionProductReportCreate) GetConversionReportTime() ConversionReportTimeType`

GetConversionReportTime returns the ConversionReportTime field if non-nil, zero value otherwise.

### GetConversionReportTimeOk

`func (o *ConversionProductReportCreate) GetConversionReportTimeOk() (*ConversionReportTimeType, bool)`

GetConversionReportTimeOk returns a tuple with the ConversionReportTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConversionReportTime

`func (o *ConversionProductReportCreate) SetConversionReportTime(v ConversionReportTimeType)`

SetConversionReportTime sets ConversionReportTime field to given value.

### HasConversionReportTime

`func (o *ConversionProductReportCreate) HasConversionReportTime() bool`

HasConversionReportTime returns a boolean if a field has been set.

### GetEndDate

`func (o *ConversionProductReportCreate) GetEndDate() string`

GetEndDate returns the EndDate field if non-nil, zero value otherwise.

### GetEndDateOk

`func (o *ConversionProductReportCreate) GetEndDateOk() (*string, bool)`

GetEndDateOk returns a tuple with the EndDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndDate

`func (o *ConversionProductReportCreate) SetEndDate(v string)`

SetEndDate sets EndDate field to given value.


### GetGranularity

`func (o *ConversionProductReportCreate) GetGranularity() ConversionProductReportGranularity`

GetGranularity returns the Granularity field if non-nil, zero value otherwise.

### GetGranularityOk

`func (o *ConversionProductReportCreate) GetGranularityOk() (*ConversionProductReportGranularity, bool)`

GetGranularityOk returns a tuple with the Granularity field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGranularity

`func (o *ConversionProductReportCreate) SetGranularity(v ConversionProductReportGranularity)`

SetGranularity sets Granularity field to given value.


### GetLevel

`func (o *ConversionProductReportCreate) GetLevel() ConversionProductReportLevel`

GetLevel returns the Level field if non-nil, zero value otherwise.

### GetLevelOk

`func (o *ConversionProductReportCreate) GetLevelOk() (*ConversionProductReportLevel, bool)`

GetLevelOk returns a tuple with the Level field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLevel

`func (o *ConversionProductReportCreate) SetLevel(v ConversionProductReportLevel)`

SetLevel sets Level field to given value.


### GetProductSkuIds

`func (o *ConversionProductReportCreate) GetProductSkuIds() []string`

GetProductSkuIds returns the ProductSkuIds field if non-nil, zero value otherwise.

### GetProductSkuIdsOk

`func (o *ConversionProductReportCreate) GetProductSkuIdsOk() (*[]string, bool)`

GetProductSkuIdsOk returns a tuple with the ProductSkuIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProductSkuIds

`func (o *ConversionProductReportCreate) SetProductSkuIds(v []string)`

SetProductSkuIds sets ProductSkuIds field to given value.

### HasProductSkuIds

`func (o *ConversionProductReportCreate) HasProductSkuIds() bool`

HasProductSkuIds returns a boolean if a field has been set.

### GetReportName

`func (o *ConversionProductReportCreate) GetReportName() string`

GetReportName returns the ReportName field if non-nil, zero value otherwise.

### GetReportNameOk

`func (o *ConversionProductReportCreate) GetReportNameOk() (*string, bool)`

GetReportNameOk returns a tuple with the ReportName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReportName

`func (o *ConversionProductReportCreate) SetReportName(v string)`

SetReportName sets ReportName field to given value.


### GetStartDate

`func (o *ConversionProductReportCreate) GetStartDate() string`

GetStartDate returns the StartDate field if non-nil, zero value otherwise.

### GetStartDateOk

`func (o *ConversionProductReportCreate) GetStartDateOk() (*string, bool)`

GetStartDateOk returns a tuple with the StartDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStartDate

`func (o *ConversionProductReportCreate) SetStartDate(v string)`

SetStartDate sets StartDate field to given value.


### GetViewWindowDays

`func (o *ConversionProductReportCreate) GetViewWindowDays() ConversionAttributionWindowDays`

GetViewWindowDays returns the ViewWindowDays field if non-nil, zero value otherwise.

### GetViewWindowDaysOk

`func (o *ConversionProductReportCreate) GetViewWindowDaysOk() (*ConversionAttributionWindowDays, bool)`

GetViewWindowDaysOk returns a tuple with the ViewWindowDays field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetViewWindowDays

`func (o *ConversionProductReportCreate) SetViewWindowDays(v ConversionAttributionWindowDays)`

SetViewWindowDays sets ViewWindowDays field to given value.

### HasViewWindowDays

`func (o *ConversionProductReportCreate) HasViewWindowDays() bool`

HasViewWindowDays returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


