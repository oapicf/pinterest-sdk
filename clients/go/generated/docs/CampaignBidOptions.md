# CampaignBidOptions

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AgeBucketMultipliers** | Pointer to [**NullableAgeBucketMultipliers**](AgeBucketMultipliers.md) | Age bucket multipliers for bid adjustments. | [optional] 
**AppTypeMultipliers** | Pointer to [**NullableAppTypeMultipliers**](AppTypeMultipliers.md) | App type multipliers for bid adjustments. | [optional] 
**AudienceMultipliers** | Pointer to [**CampaignAudienceMultipliers**](CampaignAudienceMultipliers.md) | Audience multipliers for bid adjustments. | [optional] 
**FreqBidMultiplierTimeWindow** | Pointer to [**NullableFreqBidMultiplierTimeWindow**](FreqBidMultiplierTimeWindow.md) | The time window for frequency bid multipliers. | [optional] 
**FrequencyMultipliers** | Pointer to [**NullableFrequencyMultipliers**](FrequencyMultipliers.md) | Frequency multipliers for bid adjustments. | [optional] 
**GenderMultipliers** | Pointer to [**NullableGenderMultipliers**](GenderMultipliers.md) | Gender multipliers for bid adjustments. | [optional] 
**PlacementMultipliers** | Pointer to [**NullablePlacementMultipliers**](PlacementMultipliers.md) | Placement multipliers for bid adjustments. | [optional] 

## Methods

### NewCampaignBidOptions

`func NewCampaignBidOptions() *CampaignBidOptions`

NewCampaignBidOptions instantiates a new CampaignBidOptions object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCampaignBidOptionsWithDefaults

`func NewCampaignBidOptionsWithDefaults() *CampaignBidOptions`

NewCampaignBidOptionsWithDefaults instantiates a new CampaignBidOptions object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAgeBucketMultipliers

`func (o *CampaignBidOptions) GetAgeBucketMultipliers() AgeBucketMultipliers`

GetAgeBucketMultipliers returns the AgeBucketMultipliers field if non-nil, zero value otherwise.

### GetAgeBucketMultipliersOk

`func (o *CampaignBidOptions) GetAgeBucketMultipliersOk() (*AgeBucketMultipliers, bool)`

GetAgeBucketMultipliersOk returns a tuple with the AgeBucketMultipliers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAgeBucketMultipliers

`func (o *CampaignBidOptions) SetAgeBucketMultipliers(v AgeBucketMultipliers)`

SetAgeBucketMultipliers sets AgeBucketMultipliers field to given value.

### HasAgeBucketMultipliers

`func (o *CampaignBidOptions) HasAgeBucketMultipliers() bool`

HasAgeBucketMultipliers returns a boolean if a field has been set.

### SetAgeBucketMultipliersNil

`func (o *CampaignBidOptions) SetAgeBucketMultipliersNil(b bool)`

 SetAgeBucketMultipliersNil sets the value for AgeBucketMultipliers to be an explicit nil

### UnsetAgeBucketMultipliers
`func (o *CampaignBidOptions) UnsetAgeBucketMultipliers()`

UnsetAgeBucketMultipliers ensures that no value is present for AgeBucketMultipliers, not even an explicit nil
### GetAppTypeMultipliers

`func (o *CampaignBidOptions) GetAppTypeMultipliers() AppTypeMultipliers`

GetAppTypeMultipliers returns the AppTypeMultipliers field if non-nil, zero value otherwise.

### GetAppTypeMultipliersOk

`func (o *CampaignBidOptions) GetAppTypeMultipliersOk() (*AppTypeMultipliers, bool)`

GetAppTypeMultipliersOk returns a tuple with the AppTypeMultipliers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAppTypeMultipliers

`func (o *CampaignBidOptions) SetAppTypeMultipliers(v AppTypeMultipliers)`

SetAppTypeMultipliers sets AppTypeMultipliers field to given value.

### HasAppTypeMultipliers

`func (o *CampaignBidOptions) HasAppTypeMultipliers() bool`

HasAppTypeMultipliers returns a boolean if a field has been set.

### SetAppTypeMultipliersNil

`func (o *CampaignBidOptions) SetAppTypeMultipliersNil(b bool)`

 SetAppTypeMultipliersNil sets the value for AppTypeMultipliers to be an explicit nil

### UnsetAppTypeMultipliers
`func (o *CampaignBidOptions) UnsetAppTypeMultipliers()`

UnsetAppTypeMultipliers ensures that no value is present for AppTypeMultipliers, not even an explicit nil
### GetAudienceMultipliers

`func (o *CampaignBidOptions) GetAudienceMultipliers() CampaignAudienceMultipliers`

GetAudienceMultipliers returns the AudienceMultipliers field if non-nil, zero value otherwise.

### GetAudienceMultipliersOk

`func (o *CampaignBidOptions) GetAudienceMultipliersOk() (*CampaignAudienceMultipliers, bool)`

GetAudienceMultipliersOk returns a tuple with the AudienceMultipliers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAudienceMultipliers

`func (o *CampaignBidOptions) SetAudienceMultipliers(v CampaignAudienceMultipliers)`

SetAudienceMultipliers sets AudienceMultipliers field to given value.

### HasAudienceMultipliers

`func (o *CampaignBidOptions) HasAudienceMultipliers() bool`

HasAudienceMultipliers returns a boolean if a field has been set.

### GetFreqBidMultiplierTimeWindow

`func (o *CampaignBidOptions) GetFreqBidMultiplierTimeWindow() FreqBidMultiplierTimeWindow`

GetFreqBidMultiplierTimeWindow returns the FreqBidMultiplierTimeWindow field if non-nil, zero value otherwise.

### GetFreqBidMultiplierTimeWindowOk

`func (o *CampaignBidOptions) GetFreqBidMultiplierTimeWindowOk() (*FreqBidMultiplierTimeWindow, bool)`

GetFreqBidMultiplierTimeWindowOk returns a tuple with the FreqBidMultiplierTimeWindow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFreqBidMultiplierTimeWindow

`func (o *CampaignBidOptions) SetFreqBidMultiplierTimeWindow(v FreqBidMultiplierTimeWindow)`

SetFreqBidMultiplierTimeWindow sets FreqBidMultiplierTimeWindow field to given value.

### HasFreqBidMultiplierTimeWindow

`func (o *CampaignBidOptions) HasFreqBidMultiplierTimeWindow() bool`

HasFreqBidMultiplierTimeWindow returns a boolean if a field has been set.

### SetFreqBidMultiplierTimeWindowNil

`func (o *CampaignBidOptions) SetFreqBidMultiplierTimeWindowNil(b bool)`

 SetFreqBidMultiplierTimeWindowNil sets the value for FreqBidMultiplierTimeWindow to be an explicit nil

### UnsetFreqBidMultiplierTimeWindow
`func (o *CampaignBidOptions) UnsetFreqBidMultiplierTimeWindow()`

UnsetFreqBidMultiplierTimeWindow ensures that no value is present for FreqBidMultiplierTimeWindow, not even an explicit nil
### GetFrequencyMultipliers

`func (o *CampaignBidOptions) GetFrequencyMultipliers() FrequencyMultipliers`

GetFrequencyMultipliers returns the FrequencyMultipliers field if non-nil, zero value otherwise.

### GetFrequencyMultipliersOk

`func (o *CampaignBidOptions) GetFrequencyMultipliersOk() (*FrequencyMultipliers, bool)`

GetFrequencyMultipliersOk returns a tuple with the FrequencyMultipliers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFrequencyMultipliers

`func (o *CampaignBidOptions) SetFrequencyMultipliers(v FrequencyMultipliers)`

SetFrequencyMultipliers sets FrequencyMultipliers field to given value.

### HasFrequencyMultipliers

`func (o *CampaignBidOptions) HasFrequencyMultipliers() bool`

HasFrequencyMultipliers returns a boolean if a field has been set.

### SetFrequencyMultipliersNil

`func (o *CampaignBidOptions) SetFrequencyMultipliersNil(b bool)`

 SetFrequencyMultipliersNil sets the value for FrequencyMultipliers to be an explicit nil

### UnsetFrequencyMultipliers
`func (o *CampaignBidOptions) UnsetFrequencyMultipliers()`

UnsetFrequencyMultipliers ensures that no value is present for FrequencyMultipliers, not even an explicit nil
### GetGenderMultipliers

`func (o *CampaignBidOptions) GetGenderMultipliers() GenderMultipliers`

GetGenderMultipliers returns the GenderMultipliers field if non-nil, zero value otherwise.

### GetGenderMultipliersOk

`func (o *CampaignBidOptions) GetGenderMultipliersOk() (*GenderMultipliers, bool)`

GetGenderMultipliersOk returns a tuple with the GenderMultipliers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGenderMultipliers

`func (o *CampaignBidOptions) SetGenderMultipliers(v GenderMultipliers)`

SetGenderMultipliers sets GenderMultipliers field to given value.

### HasGenderMultipliers

`func (o *CampaignBidOptions) HasGenderMultipliers() bool`

HasGenderMultipliers returns a boolean if a field has been set.

### SetGenderMultipliersNil

`func (o *CampaignBidOptions) SetGenderMultipliersNil(b bool)`

 SetGenderMultipliersNil sets the value for GenderMultipliers to be an explicit nil

### UnsetGenderMultipliers
`func (o *CampaignBidOptions) UnsetGenderMultipliers()`

UnsetGenderMultipliers ensures that no value is present for GenderMultipliers, not even an explicit nil
### GetPlacementMultipliers

`func (o *CampaignBidOptions) GetPlacementMultipliers() PlacementMultipliers`

GetPlacementMultipliers returns the PlacementMultipliers field if non-nil, zero value otherwise.

### GetPlacementMultipliersOk

`func (o *CampaignBidOptions) GetPlacementMultipliersOk() (*PlacementMultipliers, bool)`

GetPlacementMultipliersOk returns a tuple with the PlacementMultipliers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlacementMultipliers

`func (o *CampaignBidOptions) SetPlacementMultipliers(v PlacementMultipliers)`

SetPlacementMultipliers sets PlacementMultipliers field to given value.

### HasPlacementMultipliers

`func (o *CampaignBidOptions) HasPlacementMultipliers() bool`

HasPlacementMultipliers returns a boolean if a field has been set.

### SetPlacementMultipliersNil

`func (o *CampaignBidOptions) SetPlacementMultipliersNil(b bool)`

 SetPlacementMultipliersNil sets the value for PlacementMultipliers to be an explicit nil

### UnsetPlacementMultipliers
`func (o *CampaignBidOptions) UnsetPlacementMultipliers()`

UnsetPlacementMultipliers ensures that no value is present for PlacementMultipliers, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


