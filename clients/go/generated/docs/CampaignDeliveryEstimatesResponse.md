# CampaignDeliveryEstimatesResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Curves** | Pointer to [**[]CampaignPlanningCurveEstimate**](CampaignPlanningCurveEstimate.md) | Estimated curves. Each curve will pertain to a single estimation type. | [optional] 
**DerivedMetrics** | Pointer to [**CampaignDeliveryEstimatesDerivedMetrics**](CampaignDeliveryEstimatesDerivedMetrics.md) |  | [optional] 
**MaxPotentialSpend** | Pointer to **int32** | Maximum potential spend estimate. | [optional] 

## Methods

### NewCampaignDeliveryEstimatesResponse

`func NewCampaignDeliveryEstimatesResponse() *CampaignDeliveryEstimatesResponse`

NewCampaignDeliveryEstimatesResponse instantiates a new CampaignDeliveryEstimatesResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCampaignDeliveryEstimatesResponseWithDefaults

`func NewCampaignDeliveryEstimatesResponseWithDefaults() *CampaignDeliveryEstimatesResponse`

NewCampaignDeliveryEstimatesResponseWithDefaults instantiates a new CampaignDeliveryEstimatesResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCurves

`func (o *CampaignDeliveryEstimatesResponse) GetCurves() []CampaignPlanningCurveEstimate`

GetCurves returns the Curves field if non-nil, zero value otherwise.

### GetCurvesOk

`func (o *CampaignDeliveryEstimatesResponse) GetCurvesOk() (*[]CampaignPlanningCurveEstimate, bool)`

GetCurvesOk returns a tuple with the Curves field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurves

`func (o *CampaignDeliveryEstimatesResponse) SetCurves(v []CampaignPlanningCurveEstimate)`

SetCurves sets Curves field to given value.

### HasCurves

`func (o *CampaignDeliveryEstimatesResponse) HasCurves() bool`

HasCurves returns a boolean if a field has been set.

### GetDerivedMetrics

`func (o *CampaignDeliveryEstimatesResponse) GetDerivedMetrics() CampaignDeliveryEstimatesDerivedMetrics`

GetDerivedMetrics returns the DerivedMetrics field if non-nil, zero value otherwise.

### GetDerivedMetricsOk

`func (o *CampaignDeliveryEstimatesResponse) GetDerivedMetricsOk() (*CampaignDeliveryEstimatesDerivedMetrics, bool)`

GetDerivedMetricsOk returns a tuple with the DerivedMetrics field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDerivedMetrics

`func (o *CampaignDeliveryEstimatesResponse) SetDerivedMetrics(v CampaignDeliveryEstimatesDerivedMetrics)`

SetDerivedMetrics sets DerivedMetrics field to given value.

### HasDerivedMetrics

`func (o *CampaignDeliveryEstimatesResponse) HasDerivedMetrics() bool`

HasDerivedMetrics returns a boolean if a field has been set.

### GetMaxPotentialSpend

`func (o *CampaignDeliveryEstimatesResponse) GetMaxPotentialSpend() int32`

GetMaxPotentialSpend returns the MaxPotentialSpend field if non-nil, zero value otherwise.

### GetMaxPotentialSpendOk

`func (o *CampaignDeliveryEstimatesResponse) GetMaxPotentialSpendOk() (*int32, bool)`

GetMaxPotentialSpendOk returns a tuple with the MaxPotentialSpend field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxPotentialSpend

`func (o *CampaignDeliveryEstimatesResponse) SetMaxPotentialSpend(v int32)`

SetMaxPotentialSpend sets MaxPotentialSpend field to given value.

### HasMaxPotentialSpend

`func (o *CampaignDeliveryEstimatesResponse) HasMaxPotentialSpend() bool`

HasMaxPotentialSpend returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


