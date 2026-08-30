# CampaignPlanningCurveEstimate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EstimationType** | Pointer to [**CampaignPlanningEstimationType**](CampaignPlanningEstimationType.md) | Estimation type for campaign planning estimated curve | [optional] 
**Points** | Pointer to [**[]CampaignPlanningPointEstimate**](CampaignPlanningPointEstimate.md) | The estimation points that make up the estimated curve. | [optional] 

## Methods

### NewCampaignPlanningCurveEstimate

`func NewCampaignPlanningCurveEstimate() *CampaignPlanningCurveEstimate`

NewCampaignPlanningCurveEstimate instantiates a new CampaignPlanningCurveEstimate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCampaignPlanningCurveEstimateWithDefaults

`func NewCampaignPlanningCurveEstimateWithDefaults() *CampaignPlanningCurveEstimate`

NewCampaignPlanningCurveEstimateWithDefaults instantiates a new CampaignPlanningCurveEstimate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEstimationType

`func (o *CampaignPlanningCurveEstimate) GetEstimationType() CampaignPlanningEstimationType`

GetEstimationType returns the EstimationType field if non-nil, zero value otherwise.

### GetEstimationTypeOk

`func (o *CampaignPlanningCurveEstimate) GetEstimationTypeOk() (*CampaignPlanningEstimationType, bool)`

GetEstimationTypeOk returns a tuple with the EstimationType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEstimationType

`func (o *CampaignPlanningCurveEstimate) SetEstimationType(v CampaignPlanningEstimationType)`

SetEstimationType sets EstimationType field to given value.

### HasEstimationType

`func (o *CampaignPlanningCurveEstimate) HasEstimationType() bool`

HasEstimationType returns a boolean if a field has been set.

### GetPoints

`func (o *CampaignPlanningCurveEstimate) GetPoints() []CampaignPlanningPointEstimate`

GetPoints returns the Points field if non-nil, zero value otherwise.

### GetPointsOk

`func (o *CampaignPlanningCurveEstimate) GetPointsOk() (*[]CampaignPlanningPointEstimate, bool)`

GetPointsOk returns a tuple with the Points field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPoints

`func (o *CampaignPlanningCurveEstimate) SetPoints(v []CampaignPlanningPointEstimate)`

SetPoints sets Points field to given value.

### HasPoints

`func (o *CampaignPlanningCurveEstimate) HasPoints() bool`

HasPoints returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


