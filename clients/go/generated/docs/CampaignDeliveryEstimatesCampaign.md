# CampaignDeliveryEstimatesCampaign

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdGroups** | [**[]AdGroupDeliveryEstimates**](AdGroupDeliveryEstimates.md) |  | 
**BudgetDurationType** | [**BudgetDurationType**](BudgetDurationType.md) | Duration type of the budget | 
**DailySpendCap** | Pointer to **int32** | Campaign daily spend cap. When the budget_duration_type is FIXED_DAILY or FLEXIBLE_DAILY, this field is required. | [optional] 
**EndDate** | Pointer to **string** | End date of the date range for an ad campaign, pattern YYYY-MM-DD. Required when budget_duration_type is LIFETIME. | [optional] 
**LifetimeSpendCap** | Pointer to **int32** | Campaign total spending cap. When the budget_duration_type is LIFETIME, this field is required. The end date field is also required for lifetime spending. | [optional] 
**ObjectiveType** | [**DeliveryEstimateObjectiveType**](DeliveryEstimateObjectiveType.md) |  | 
**StartDate** | **string** | Start date of the date range for an ad campaign, pattern YYYY-MM-DD. | 

## Methods

### NewCampaignDeliveryEstimatesCampaign

`func NewCampaignDeliveryEstimatesCampaign(adGroups []AdGroupDeliveryEstimates, budgetDurationType BudgetDurationType, objectiveType DeliveryEstimateObjectiveType, startDate string, ) *CampaignDeliveryEstimatesCampaign`

NewCampaignDeliveryEstimatesCampaign instantiates a new CampaignDeliveryEstimatesCampaign object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCampaignDeliveryEstimatesCampaignWithDefaults

`func NewCampaignDeliveryEstimatesCampaignWithDefaults() *CampaignDeliveryEstimatesCampaign`

NewCampaignDeliveryEstimatesCampaignWithDefaults instantiates a new CampaignDeliveryEstimatesCampaign object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdGroups

`func (o *CampaignDeliveryEstimatesCampaign) GetAdGroups() []AdGroupDeliveryEstimates`

GetAdGroups returns the AdGroups field if non-nil, zero value otherwise.

### GetAdGroupsOk

`func (o *CampaignDeliveryEstimatesCampaign) GetAdGroupsOk() (*[]AdGroupDeliveryEstimates, bool)`

GetAdGroupsOk returns a tuple with the AdGroups field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdGroups

`func (o *CampaignDeliveryEstimatesCampaign) SetAdGroups(v []AdGroupDeliveryEstimates)`

SetAdGroups sets AdGroups field to given value.


### GetBudgetDurationType

`func (o *CampaignDeliveryEstimatesCampaign) GetBudgetDurationType() BudgetDurationType`

GetBudgetDurationType returns the BudgetDurationType field if non-nil, zero value otherwise.

### GetBudgetDurationTypeOk

`func (o *CampaignDeliveryEstimatesCampaign) GetBudgetDurationTypeOk() (*BudgetDurationType, bool)`

GetBudgetDurationTypeOk returns a tuple with the BudgetDurationType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBudgetDurationType

`func (o *CampaignDeliveryEstimatesCampaign) SetBudgetDurationType(v BudgetDurationType)`

SetBudgetDurationType sets BudgetDurationType field to given value.


### GetDailySpendCap

`func (o *CampaignDeliveryEstimatesCampaign) GetDailySpendCap() int32`

GetDailySpendCap returns the DailySpendCap field if non-nil, zero value otherwise.

### GetDailySpendCapOk

`func (o *CampaignDeliveryEstimatesCampaign) GetDailySpendCapOk() (*int32, bool)`

GetDailySpendCapOk returns a tuple with the DailySpendCap field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDailySpendCap

`func (o *CampaignDeliveryEstimatesCampaign) SetDailySpendCap(v int32)`

SetDailySpendCap sets DailySpendCap field to given value.

### HasDailySpendCap

`func (o *CampaignDeliveryEstimatesCampaign) HasDailySpendCap() bool`

HasDailySpendCap returns a boolean if a field has been set.

### GetEndDate

`func (o *CampaignDeliveryEstimatesCampaign) GetEndDate() string`

GetEndDate returns the EndDate field if non-nil, zero value otherwise.

### GetEndDateOk

`func (o *CampaignDeliveryEstimatesCampaign) GetEndDateOk() (*string, bool)`

GetEndDateOk returns a tuple with the EndDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndDate

`func (o *CampaignDeliveryEstimatesCampaign) SetEndDate(v string)`

SetEndDate sets EndDate field to given value.

### HasEndDate

`func (o *CampaignDeliveryEstimatesCampaign) HasEndDate() bool`

HasEndDate returns a boolean if a field has been set.

### GetLifetimeSpendCap

`func (o *CampaignDeliveryEstimatesCampaign) GetLifetimeSpendCap() int32`

GetLifetimeSpendCap returns the LifetimeSpendCap field if non-nil, zero value otherwise.

### GetLifetimeSpendCapOk

`func (o *CampaignDeliveryEstimatesCampaign) GetLifetimeSpendCapOk() (*int32, bool)`

GetLifetimeSpendCapOk returns a tuple with the LifetimeSpendCap field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLifetimeSpendCap

`func (o *CampaignDeliveryEstimatesCampaign) SetLifetimeSpendCap(v int32)`

SetLifetimeSpendCap sets LifetimeSpendCap field to given value.

### HasLifetimeSpendCap

`func (o *CampaignDeliveryEstimatesCampaign) HasLifetimeSpendCap() bool`

HasLifetimeSpendCap returns a boolean if a field has been set.

### GetObjectiveType

`func (o *CampaignDeliveryEstimatesCampaign) GetObjectiveType() DeliveryEstimateObjectiveType`

GetObjectiveType returns the ObjectiveType field if non-nil, zero value otherwise.

### GetObjectiveTypeOk

`func (o *CampaignDeliveryEstimatesCampaign) GetObjectiveTypeOk() (*DeliveryEstimateObjectiveType, bool)`

GetObjectiveTypeOk returns a tuple with the ObjectiveType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObjectiveType

`func (o *CampaignDeliveryEstimatesCampaign) SetObjectiveType(v DeliveryEstimateObjectiveType)`

SetObjectiveType sets ObjectiveType field to given value.


### GetStartDate

`func (o *CampaignDeliveryEstimatesCampaign) GetStartDate() string`

GetStartDate returns the StartDate field if non-nil, zero value otherwise.

### GetStartDateOk

`func (o *CampaignDeliveryEstimatesCampaign) GetStartDateOk() (*string, bool)`

GetStartDateOk returns a tuple with the StartDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStartDate

`func (o *CampaignDeliveryEstimatesCampaign) SetStartDate(v string)`

SetStartDate sets StartDate field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


