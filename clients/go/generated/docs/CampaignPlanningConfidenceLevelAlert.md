# CampaignPlanningConfidenceLevelAlert

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Description** | Pointer to **string** | Human-readable context for debugging. Not intended for display to end users. | [optional] 
**Reason** | Pointer to [**CampaignPlanningConfidenceLevelAlertReason**](CampaignPlanningConfidenceLevelAlertReason.md) | Reason for the confidence level alert. | [optional] 
**Severity** | Pointer to [**CampaignPlanningConfidenceLevelAlertSeverity**](CampaignPlanningConfidenceLevelAlertSeverity.md) | Severity of the confidence level alert. | [optional] 

## Methods

### NewCampaignPlanningConfidenceLevelAlert

`func NewCampaignPlanningConfidenceLevelAlert() *CampaignPlanningConfidenceLevelAlert`

NewCampaignPlanningConfidenceLevelAlert instantiates a new CampaignPlanningConfidenceLevelAlert object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCampaignPlanningConfidenceLevelAlertWithDefaults

`func NewCampaignPlanningConfidenceLevelAlertWithDefaults() *CampaignPlanningConfidenceLevelAlert`

NewCampaignPlanningConfidenceLevelAlertWithDefaults instantiates a new CampaignPlanningConfidenceLevelAlert object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDescription

`func (o *CampaignPlanningConfidenceLevelAlert) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CampaignPlanningConfidenceLevelAlert) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CampaignPlanningConfidenceLevelAlert) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *CampaignPlanningConfidenceLevelAlert) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetReason

`func (o *CampaignPlanningConfidenceLevelAlert) GetReason() CampaignPlanningConfidenceLevelAlertReason`

GetReason returns the Reason field if non-nil, zero value otherwise.

### GetReasonOk

`func (o *CampaignPlanningConfidenceLevelAlert) GetReasonOk() (*CampaignPlanningConfidenceLevelAlertReason, bool)`

GetReasonOk returns a tuple with the Reason field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReason

`func (o *CampaignPlanningConfidenceLevelAlert) SetReason(v CampaignPlanningConfidenceLevelAlertReason)`

SetReason sets Reason field to given value.

### HasReason

`func (o *CampaignPlanningConfidenceLevelAlert) HasReason() bool`

HasReason returns a boolean if a field has been set.

### GetSeverity

`func (o *CampaignPlanningConfidenceLevelAlert) GetSeverity() CampaignPlanningConfidenceLevelAlertSeverity`

GetSeverity returns the Severity field if non-nil, zero value otherwise.

### GetSeverityOk

`func (o *CampaignPlanningConfidenceLevelAlert) GetSeverityOk() (*CampaignPlanningConfidenceLevelAlertSeverity, bool)`

GetSeverityOk returns a tuple with the Severity field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSeverity

`func (o *CampaignPlanningConfidenceLevelAlert) SetSeverity(v CampaignPlanningConfidenceLevelAlertSeverity)`

SetSeverity sets Severity field to given value.

### HasSeverity

`func (o *CampaignPlanningConfidenceLevelAlert) HasSeverity() bool`

HasSeverity returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


