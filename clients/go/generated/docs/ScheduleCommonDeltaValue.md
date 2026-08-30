# ScheduleCommonDeltaValue

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AgeBucketMultipliers** | Pointer to [**NullableScheduleAgeBucketMultipliers**](ScheduleAgeBucketMultipliers.md) |  | [optional] 
**AppTypeMultipliers** | Pointer to [**NullableScheduleAppTypeMultipliers**](ScheduleAppTypeMultipliers.md) |  | [optional] 
**AudienceMultipliers** | Pointer to [**ScheduleAudienceMultipliers**](ScheduleAudienceMultipliers.md) |  | [optional] 
**GenderMultipliers** | Pointer to [**NullableScheduleBidOptionsGenderMultipliers**](ScheduleBidOptionsGenderMultipliers.md) |  | [optional] 
**PlacementMultipliers** | Pointer to [**NullableScheduleBidOptionsPlacementMultipliers**](ScheduleBidOptionsPlacementMultipliers.md) |  | [optional] 

## Methods

### NewScheduleCommonDeltaValue

`func NewScheduleCommonDeltaValue() *ScheduleCommonDeltaValue`

NewScheduleCommonDeltaValue instantiates a new ScheduleCommonDeltaValue object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewScheduleCommonDeltaValueWithDefaults

`func NewScheduleCommonDeltaValueWithDefaults() *ScheduleCommonDeltaValue`

NewScheduleCommonDeltaValueWithDefaults instantiates a new ScheduleCommonDeltaValue object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAgeBucketMultipliers

`func (o *ScheduleCommonDeltaValue) GetAgeBucketMultipliers() ScheduleAgeBucketMultipliers`

GetAgeBucketMultipliers returns the AgeBucketMultipliers field if non-nil, zero value otherwise.

### GetAgeBucketMultipliersOk

`func (o *ScheduleCommonDeltaValue) GetAgeBucketMultipliersOk() (*ScheduleAgeBucketMultipliers, bool)`

GetAgeBucketMultipliersOk returns a tuple with the AgeBucketMultipliers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAgeBucketMultipliers

`func (o *ScheduleCommonDeltaValue) SetAgeBucketMultipliers(v ScheduleAgeBucketMultipliers)`

SetAgeBucketMultipliers sets AgeBucketMultipliers field to given value.

### HasAgeBucketMultipliers

`func (o *ScheduleCommonDeltaValue) HasAgeBucketMultipliers() bool`

HasAgeBucketMultipliers returns a boolean if a field has been set.

### SetAgeBucketMultipliersNil

`func (o *ScheduleCommonDeltaValue) SetAgeBucketMultipliersNil(b bool)`

 SetAgeBucketMultipliersNil sets the value for AgeBucketMultipliers to be an explicit nil

### UnsetAgeBucketMultipliers
`func (o *ScheduleCommonDeltaValue) UnsetAgeBucketMultipliers()`

UnsetAgeBucketMultipliers ensures that no value is present for AgeBucketMultipliers, not even an explicit nil
### GetAppTypeMultipliers

`func (o *ScheduleCommonDeltaValue) GetAppTypeMultipliers() ScheduleAppTypeMultipliers`

GetAppTypeMultipliers returns the AppTypeMultipliers field if non-nil, zero value otherwise.

### GetAppTypeMultipliersOk

`func (o *ScheduleCommonDeltaValue) GetAppTypeMultipliersOk() (*ScheduleAppTypeMultipliers, bool)`

GetAppTypeMultipliersOk returns a tuple with the AppTypeMultipliers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAppTypeMultipliers

`func (o *ScheduleCommonDeltaValue) SetAppTypeMultipliers(v ScheduleAppTypeMultipliers)`

SetAppTypeMultipliers sets AppTypeMultipliers field to given value.

### HasAppTypeMultipliers

`func (o *ScheduleCommonDeltaValue) HasAppTypeMultipliers() bool`

HasAppTypeMultipliers returns a boolean if a field has been set.

### SetAppTypeMultipliersNil

`func (o *ScheduleCommonDeltaValue) SetAppTypeMultipliersNil(b bool)`

 SetAppTypeMultipliersNil sets the value for AppTypeMultipliers to be an explicit nil

### UnsetAppTypeMultipliers
`func (o *ScheduleCommonDeltaValue) UnsetAppTypeMultipliers()`

UnsetAppTypeMultipliers ensures that no value is present for AppTypeMultipliers, not even an explicit nil
### GetAudienceMultipliers

`func (o *ScheduleCommonDeltaValue) GetAudienceMultipliers() ScheduleAudienceMultipliers`

GetAudienceMultipliers returns the AudienceMultipliers field if non-nil, zero value otherwise.

### GetAudienceMultipliersOk

`func (o *ScheduleCommonDeltaValue) GetAudienceMultipliersOk() (*ScheduleAudienceMultipliers, bool)`

GetAudienceMultipliersOk returns a tuple with the AudienceMultipliers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAudienceMultipliers

`func (o *ScheduleCommonDeltaValue) SetAudienceMultipliers(v ScheduleAudienceMultipliers)`

SetAudienceMultipliers sets AudienceMultipliers field to given value.

### HasAudienceMultipliers

`func (o *ScheduleCommonDeltaValue) HasAudienceMultipliers() bool`

HasAudienceMultipliers returns a boolean if a field has been set.

### GetGenderMultipliers

`func (o *ScheduleCommonDeltaValue) GetGenderMultipliers() ScheduleBidOptionsGenderMultipliers`

GetGenderMultipliers returns the GenderMultipliers field if non-nil, zero value otherwise.

### GetGenderMultipliersOk

`func (o *ScheduleCommonDeltaValue) GetGenderMultipliersOk() (*ScheduleBidOptionsGenderMultipliers, bool)`

GetGenderMultipliersOk returns a tuple with the GenderMultipliers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGenderMultipliers

`func (o *ScheduleCommonDeltaValue) SetGenderMultipliers(v ScheduleBidOptionsGenderMultipliers)`

SetGenderMultipliers sets GenderMultipliers field to given value.

### HasGenderMultipliers

`func (o *ScheduleCommonDeltaValue) HasGenderMultipliers() bool`

HasGenderMultipliers returns a boolean if a field has been set.

### SetGenderMultipliersNil

`func (o *ScheduleCommonDeltaValue) SetGenderMultipliersNil(b bool)`

 SetGenderMultipliersNil sets the value for GenderMultipliers to be an explicit nil

### UnsetGenderMultipliers
`func (o *ScheduleCommonDeltaValue) UnsetGenderMultipliers()`

UnsetGenderMultipliers ensures that no value is present for GenderMultipliers, not even an explicit nil
### GetPlacementMultipliers

`func (o *ScheduleCommonDeltaValue) GetPlacementMultipliers() ScheduleBidOptionsPlacementMultipliers`

GetPlacementMultipliers returns the PlacementMultipliers field if non-nil, zero value otherwise.

### GetPlacementMultipliersOk

`func (o *ScheduleCommonDeltaValue) GetPlacementMultipliersOk() (*ScheduleBidOptionsPlacementMultipliers, bool)`

GetPlacementMultipliersOk returns a tuple with the PlacementMultipliers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlacementMultipliers

`func (o *ScheduleCommonDeltaValue) SetPlacementMultipliers(v ScheduleBidOptionsPlacementMultipliers)`

SetPlacementMultipliers sets PlacementMultipliers field to given value.

### HasPlacementMultipliers

`func (o *ScheduleCommonDeltaValue) HasPlacementMultipliers() bool`

HasPlacementMultipliers returns a boolean if a field has been set.

### SetPlacementMultipliersNil

`func (o *ScheduleCommonDeltaValue) SetPlacementMultipliersNil(b bool)`

 SetPlacementMultipliersNil sets the value for PlacementMultipliers to be an explicit nil

### UnsetPlacementMultipliers
`func (o *ScheduleCommonDeltaValue) UnsetPlacementMultipliers()`

UnsetPlacementMultipliers ensures that no value is present for PlacementMultipliers, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


