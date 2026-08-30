# BulkCampaignDeliveryEstimatesItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdgroupAudienceSizes** | Pointer to [**[]CampaignPlanningAdGroupAudienceSize**](CampaignPlanningAdGroupAudienceSize.md) | Range audience sizes for each ad group, in the same order as the ad groups in the request. | [optional] 
**ConversionRate** | Pointer to **float32** | Conversion rate estimate. Used to translate impressions into conversions for oCPM ads, adapted based on the input conversion event and attribution windows. | [optional] 
**ConversionRates** | Pointer to [**[]CampaignPlanningConversionRate**](CampaignPlanningConversionRate.md) | Conversion rate estimates. Used to translate impressions into conversions for oCPM ads based on different conversion event and attribution windows settings. | [optional] 
**Curves** | Pointer to [**[]CampaignPlanningCurveEstimate**](CampaignPlanningCurveEstimate.md) | Estimated curves. Each curve will pertain to a single estimation type. | [optional] 
**DerivedMetrics** | Pointer to [**CampaignDeliveryEstimatesDerivedMetrics**](CampaignDeliveryEstimatesDerivedMetrics.md) |  | [optional] 
**Errors** | Pointer to [**[]CampaignPlanningResponseError**](CampaignPlanningResponseError.md) | Errors encountered during estimation for this campaign. | [optional] 
**EstimateId** | Pointer to **string** | UUID used to track delivery estimates when they are generated as part of a saved campaign. | [optional] 
**MaxPotentialSpend** | Pointer to **int32** | Maximum potential spend estimate. | [optional] 

## Methods

### NewBulkCampaignDeliveryEstimatesItem

`func NewBulkCampaignDeliveryEstimatesItem() *BulkCampaignDeliveryEstimatesItem`

NewBulkCampaignDeliveryEstimatesItem instantiates a new BulkCampaignDeliveryEstimatesItem object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBulkCampaignDeliveryEstimatesItemWithDefaults

`func NewBulkCampaignDeliveryEstimatesItemWithDefaults() *BulkCampaignDeliveryEstimatesItem`

NewBulkCampaignDeliveryEstimatesItemWithDefaults instantiates a new BulkCampaignDeliveryEstimatesItem object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdgroupAudienceSizes

`func (o *BulkCampaignDeliveryEstimatesItem) GetAdgroupAudienceSizes() []CampaignPlanningAdGroupAudienceSize`

GetAdgroupAudienceSizes returns the AdgroupAudienceSizes field if non-nil, zero value otherwise.

### GetAdgroupAudienceSizesOk

`func (o *BulkCampaignDeliveryEstimatesItem) GetAdgroupAudienceSizesOk() (*[]CampaignPlanningAdGroupAudienceSize, bool)`

GetAdgroupAudienceSizesOk returns a tuple with the AdgroupAudienceSizes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdgroupAudienceSizes

`func (o *BulkCampaignDeliveryEstimatesItem) SetAdgroupAudienceSizes(v []CampaignPlanningAdGroupAudienceSize)`

SetAdgroupAudienceSizes sets AdgroupAudienceSizes field to given value.

### HasAdgroupAudienceSizes

`func (o *BulkCampaignDeliveryEstimatesItem) HasAdgroupAudienceSizes() bool`

HasAdgroupAudienceSizes returns a boolean if a field has been set.

### GetConversionRate

`func (o *BulkCampaignDeliveryEstimatesItem) GetConversionRate() float32`

GetConversionRate returns the ConversionRate field if non-nil, zero value otherwise.

### GetConversionRateOk

`func (o *BulkCampaignDeliveryEstimatesItem) GetConversionRateOk() (*float32, bool)`

GetConversionRateOk returns a tuple with the ConversionRate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConversionRate

`func (o *BulkCampaignDeliveryEstimatesItem) SetConversionRate(v float32)`

SetConversionRate sets ConversionRate field to given value.

### HasConversionRate

`func (o *BulkCampaignDeliveryEstimatesItem) HasConversionRate() bool`

HasConversionRate returns a boolean if a field has been set.

### GetConversionRates

`func (o *BulkCampaignDeliveryEstimatesItem) GetConversionRates() []CampaignPlanningConversionRate`

GetConversionRates returns the ConversionRates field if non-nil, zero value otherwise.

### GetConversionRatesOk

`func (o *BulkCampaignDeliveryEstimatesItem) GetConversionRatesOk() (*[]CampaignPlanningConversionRate, bool)`

GetConversionRatesOk returns a tuple with the ConversionRates field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConversionRates

`func (o *BulkCampaignDeliveryEstimatesItem) SetConversionRates(v []CampaignPlanningConversionRate)`

SetConversionRates sets ConversionRates field to given value.

### HasConversionRates

`func (o *BulkCampaignDeliveryEstimatesItem) HasConversionRates() bool`

HasConversionRates returns a boolean if a field has been set.

### GetCurves

`func (o *BulkCampaignDeliveryEstimatesItem) GetCurves() []CampaignPlanningCurveEstimate`

GetCurves returns the Curves field if non-nil, zero value otherwise.

### GetCurvesOk

`func (o *BulkCampaignDeliveryEstimatesItem) GetCurvesOk() (*[]CampaignPlanningCurveEstimate, bool)`

GetCurvesOk returns a tuple with the Curves field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurves

`func (o *BulkCampaignDeliveryEstimatesItem) SetCurves(v []CampaignPlanningCurveEstimate)`

SetCurves sets Curves field to given value.

### HasCurves

`func (o *BulkCampaignDeliveryEstimatesItem) HasCurves() bool`

HasCurves returns a boolean if a field has been set.

### GetDerivedMetrics

`func (o *BulkCampaignDeliveryEstimatesItem) GetDerivedMetrics() CampaignDeliveryEstimatesDerivedMetrics`

GetDerivedMetrics returns the DerivedMetrics field if non-nil, zero value otherwise.

### GetDerivedMetricsOk

`func (o *BulkCampaignDeliveryEstimatesItem) GetDerivedMetricsOk() (*CampaignDeliveryEstimatesDerivedMetrics, bool)`

GetDerivedMetricsOk returns a tuple with the DerivedMetrics field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDerivedMetrics

`func (o *BulkCampaignDeliveryEstimatesItem) SetDerivedMetrics(v CampaignDeliveryEstimatesDerivedMetrics)`

SetDerivedMetrics sets DerivedMetrics field to given value.

### HasDerivedMetrics

`func (o *BulkCampaignDeliveryEstimatesItem) HasDerivedMetrics() bool`

HasDerivedMetrics returns a boolean if a field has been set.

### GetErrors

`func (o *BulkCampaignDeliveryEstimatesItem) GetErrors() []CampaignPlanningResponseError`

GetErrors returns the Errors field if non-nil, zero value otherwise.

### GetErrorsOk

`func (o *BulkCampaignDeliveryEstimatesItem) GetErrorsOk() (*[]CampaignPlanningResponseError, bool)`

GetErrorsOk returns a tuple with the Errors field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetErrors

`func (o *BulkCampaignDeliveryEstimatesItem) SetErrors(v []CampaignPlanningResponseError)`

SetErrors sets Errors field to given value.

### HasErrors

`func (o *BulkCampaignDeliveryEstimatesItem) HasErrors() bool`

HasErrors returns a boolean if a field has been set.

### GetEstimateId

`func (o *BulkCampaignDeliveryEstimatesItem) GetEstimateId() string`

GetEstimateId returns the EstimateId field if non-nil, zero value otherwise.

### GetEstimateIdOk

`func (o *BulkCampaignDeliveryEstimatesItem) GetEstimateIdOk() (*string, bool)`

GetEstimateIdOk returns a tuple with the EstimateId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEstimateId

`func (o *BulkCampaignDeliveryEstimatesItem) SetEstimateId(v string)`

SetEstimateId sets EstimateId field to given value.

### HasEstimateId

`func (o *BulkCampaignDeliveryEstimatesItem) HasEstimateId() bool`

HasEstimateId returns a boolean if a field has been set.

### GetMaxPotentialSpend

`func (o *BulkCampaignDeliveryEstimatesItem) GetMaxPotentialSpend() int32`

GetMaxPotentialSpend returns the MaxPotentialSpend field if non-nil, zero value otherwise.

### GetMaxPotentialSpendOk

`func (o *BulkCampaignDeliveryEstimatesItem) GetMaxPotentialSpendOk() (*int32, bool)`

GetMaxPotentialSpendOk returns a tuple with the MaxPotentialSpend field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxPotentialSpend

`func (o *BulkCampaignDeliveryEstimatesItem) SetMaxPotentialSpend(v int32)`

SetMaxPotentialSpend sets MaxPotentialSpend field to given value.

### HasMaxPotentialSpend

`func (o *BulkCampaignDeliveryEstimatesItem) HasMaxPotentialSpend() bool`

HasMaxPotentialSpend returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


