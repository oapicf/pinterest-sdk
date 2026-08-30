# CampaignPlanningBudgetRecommendation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BudgetRecommendation** | Pointer to **int32** | The recommended budget amount. | [optional] 
**ExperimentCampaignBudgetRecommendation** | Pointer to [**[]CampaignPlanningExperimentBudgetRecommendation**](CampaignPlanningExperimentBudgetRecommendation.md) | List of experimental budget recommendations. | [optional] 
**LifetimeDaysRecommendation** | Pointer to **int32** | Recommended number of days for the campaign lifetime. | [optional] 
**PointEstimations** | Pointer to [**[]CampaignPlanningBudgetRecommendationPoint**](CampaignPlanningBudgetRecommendationPoint.md) | List of point estimations for different budget scenarios. | [optional] 

## Methods

### NewCampaignPlanningBudgetRecommendation

`func NewCampaignPlanningBudgetRecommendation() *CampaignPlanningBudgetRecommendation`

NewCampaignPlanningBudgetRecommendation instantiates a new CampaignPlanningBudgetRecommendation object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCampaignPlanningBudgetRecommendationWithDefaults

`func NewCampaignPlanningBudgetRecommendationWithDefaults() *CampaignPlanningBudgetRecommendation`

NewCampaignPlanningBudgetRecommendationWithDefaults instantiates a new CampaignPlanningBudgetRecommendation object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBudgetRecommendation

`func (o *CampaignPlanningBudgetRecommendation) GetBudgetRecommendation() int32`

GetBudgetRecommendation returns the BudgetRecommendation field if non-nil, zero value otherwise.

### GetBudgetRecommendationOk

`func (o *CampaignPlanningBudgetRecommendation) GetBudgetRecommendationOk() (*int32, bool)`

GetBudgetRecommendationOk returns a tuple with the BudgetRecommendation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBudgetRecommendation

`func (o *CampaignPlanningBudgetRecommendation) SetBudgetRecommendation(v int32)`

SetBudgetRecommendation sets BudgetRecommendation field to given value.

### HasBudgetRecommendation

`func (o *CampaignPlanningBudgetRecommendation) HasBudgetRecommendation() bool`

HasBudgetRecommendation returns a boolean if a field has been set.

### GetExperimentCampaignBudgetRecommendation

`func (o *CampaignPlanningBudgetRecommendation) GetExperimentCampaignBudgetRecommendation() []CampaignPlanningExperimentBudgetRecommendation`

GetExperimentCampaignBudgetRecommendation returns the ExperimentCampaignBudgetRecommendation field if non-nil, zero value otherwise.

### GetExperimentCampaignBudgetRecommendationOk

`func (o *CampaignPlanningBudgetRecommendation) GetExperimentCampaignBudgetRecommendationOk() (*[]CampaignPlanningExperimentBudgetRecommendation, bool)`

GetExperimentCampaignBudgetRecommendationOk returns a tuple with the ExperimentCampaignBudgetRecommendation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExperimentCampaignBudgetRecommendation

`func (o *CampaignPlanningBudgetRecommendation) SetExperimentCampaignBudgetRecommendation(v []CampaignPlanningExperimentBudgetRecommendation)`

SetExperimentCampaignBudgetRecommendation sets ExperimentCampaignBudgetRecommendation field to given value.

### HasExperimentCampaignBudgetRecommendation

`func (o *CampaignPlanningBudgetRecommendation) HasExperimentCampaignBudgetRecommendation() bool`

HasExperimentCampaignBudgetRecommendation returns a boolean if a field has been set.

### GetLifetimeDaysRecommendation

`func (o *CampaignPlanningBudgetRecommendation) GetLifetimeDaysRecommendation() int32`

GetLifetimeDaysRecommendation returns the LifetimeDaysRecommendation field if non-nil, zero value otherwise.

### GetLifetimeDaysRecommendationOk

`func (o *CampaignPlanningBudgetRecommendation) GetLifetimeDaysRecommendationOk() (*int32, bool)`

GetLifetimeDaysRecommendationOk returns a tuple with the LifetimeDaysRecommendation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLifetimeDaysRecommendation

`func (o *CampaignPlanningBudgetRecommendation) SetLifetimeDaysRecommendation(v int32)`

SetLifetimeDaysRecommendation sets LifetimeDaysRecommendation field to given value.

### HasLifetimeDaysRecommendation

`func (o *CampaignPlanningBudgetRecommendation) HasLifetimeDaysRecommendation() bool`

HasLifetimeDaysRecommendation returns a boolean if a field has been set.

### GetPointEstimations

`func (o *CampaignPlanningBudgetRecommendation) GetPointEstimations() []CampaignPlanningBudgetRecommendationPoint`

GetPointEstimations returns the PointEstimations field if non-nil, zero value otherwise.

### GetPointEstimationsOk

`func (o *CampaignPlanningBudgetRecommendation) GetPointEstimationsOk() (*[]CampaignPlanningBudgetRecommendationPoint, bool)`

GetPointEstimationsOk returns a tuple with the PointEstimations field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPointEstimations

`func (o *CampaignPlanningBudgetRecommendation) SetPointEstimations(v []CampaignPlanningBudgetRecommendationPoint)`

SetPointEstimations sets PointEstimations field to given value.

### HasPointEstimations

`func (o *CampaignPlanningBudgetRecommendation) HasPointEstimations() bool`

HasPointEstimations returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


