# CampaignPlanningExperimentBudgetRecommendation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BudgetRecommendation** | Pointer to **int32** | Recommended budget for this experiment version. | [optional] 
**LifetimeDaysRecommendation** | Pointer to **int32** | Recommended lifetime days for this experiment. | [optional] 
**PointEstimations** | Pointer to [**[]CampaignPlanningBudgetRecommendationPoint**](CampaignPlanningBudgetRecommendationPoint.md) | Point estimations for this experiment version. | [optional] 
**VersionId** | Pointer to **string** | Version identifier for the experiment. | [optional] 

## Methods

### NewCampaignPlanningExperimentBudgetRecommendation

`func NewCampaignPlanningExperimentBudgetRecommendation() *CampaignPlanningExperimentBudgetRecommendation`

NewCampaignPlanningExperimentBudgetRecommendation instantiates a new CampaignPlanningExperimentBudgetRecommendation object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCampaignPlanningExperimentBudgetRecommendationWithDefaults

`func NewCampaignPlanningExperimentBudgetRecommendationWithDefaults() *CampaignPlanningExperimentBudgetRecommendation`

NewCampaignPlanningExperimentBudgetRecommendationWithDefaults instantiates a new CampaignPlanningExperimentBudgetRecommendation object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBudgetRecommendation

`func (o *CampaignPlanningExperimentBudgetRecommendation) GetBudgetRecommendation() int32`

GetBudgetRecommendation returns the BudgetRecommendation field if non-nil, zero value otherwise.

### GetBudgetRecommendationOk

`func (o *CampaignPlanningExperimentBudgetRecommendation) GetBudgetRecommendationOk() (*int32, bool)`

GetBudgetRecommendationOk returns a tuple with the BudgetRecommendation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBudgetRecommendation

`func (o *CampaignPlanningExperimentBudgetRecommendation) SetBudgetRecommendation(v int32)`

SetBudgetRecommendation sets BudgetRecommendation field to given value.

### HasBudgetRecommendation

`func (o *CampaignPlanningExperimentBudgetRecommendation) HasBudgetRecommendation() bool`

HasBudgetRecommendation returns a boolean if a field has been set.

### GetLifetimeDaysRecommendation

`func (o *CampaignPlanningExperimentBudgetRecommendation) GetLifetimeDaysRecommendation() int32`

GetLifetimeDaysRecommendation returns the LifetimeDaysRecommendation field if non-nil, zero value otherwise.

### GetLifetimeDaysRecommendationOk

`func (o *CampaignPlanningExperimentBudgetRecommendation) GetLifetimeDaysRecommendationOk() (*int32, bool)`

GetLifetimeDaysRecommendationOk returns a tuple with the LifetimeDaysRecommendation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLifetimeDaysRecommendation

`func (o *CampaignPlanningExperimentBudgetRecommendation) SetLifetimeDaysRecommendation(v int32)`

SetLifetimeDaysRecommendation sets LifetimeDaysRecommendation field to given value.

### HasLifetimeDaysRecommendation

`func (o *CampaignPlanningExperimentBudgetRecommendation) HasLifetimeDaysRecommendation() bool`

HasLifetimeDaysRecommendation returns a boolean if a field has been set.

### GetPointEstimations

`func (o *CampaignPlanningExperimentBudgetRecommendation) GetPointEstimations() []CampaignPlanningBudgetRecommendationPoint`

GetPointEstimations returns the PointEstimations field if non-nil, zero value otherwise.

### GetPointEstimationsOk

`func (o *CampaignPlanningExperimentBudgetRecommendation) GetPointEstimationsOk() (*[]CampaignPlanningBudgetRecommendationPoint, bool)`

GetPointEstimationsOk returns a tuple with the PointEstimations field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPointEstimations

`func (o *CampaignPlanningExperimentBudgetRecommendation) SetPointEstimations(v []CampaignPlanningBudgetRecommendationPoint)`

SetPointEstimations sets PointEstimations field to given value.

### HasPointEstimations

`func (o *CampaignPlanningExperimentBudgetRecommendation) HasPointEstimations() bool`

HasPointEstimations returns a boolean if a field has been set.

### GetVersionId

`func (o *CampaignPlanningExperimentBudgetRecommendation) GetVersionId() string`

GetVersionId returns the VersionId field if non-nil, zero value otherwise.

### GetVersionIdOk

`func (o *CampaignPlanningExperimentBudgetRecommendation) GetVersionIdOk() (*string, bool)`

GetVersionIdOk returns a tuple with the VersionId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersionId

`func (o *CampaignPlanningExperimentBudgetRecommendation) SetVersionId(v string)`

SetVersionId sets VersionId field to given value.

### HasVersionId

`func (o *CampaignPlanningExperimentBudgetRecommendation) HasVersionId() bool`

HasVersionId returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


