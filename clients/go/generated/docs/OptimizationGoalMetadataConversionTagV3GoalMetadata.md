# OptimizationGoalMetadataConversionTagV3GoalMetadata

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AttributionWindows** | Pointer to [**OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows**](OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows.md) |  | [optional] 
**ConversionEvent** | Pointer to **string** |  | [optional] 
**ConversionTagId** | Pointer to **string** |  | [optional] 
**CpaGoalValueInMicroCurrency** | Pointer to **string** |  | [optional] 
**IsRoasOptimized** | Pointer to **NullableBool** | ROAS optimization is not supported | [optional] 
**LearningModeType** | Pointer to **NullableString** | Conversion learning model type | [optional] 

## Methods

### NewOptimizationGoalMetadataConversionTagV3GoalMetadata

`func NewOptimizationGoalMetadataConversionTagV3GoalMetadata() *OptimizationGoalMetadataConversionTagV3GoalMetadata`

NewOptimizationGoalMetadataConversionTagV3GoalMetadata instantiates a new OptimizationGoalMetadataConversionTagV3GoalMetadata object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOptimizationGoalMetadataConversionTagV3GoalMetadataWithDefaults

`func NewOptimizationGoalMetadataConversionTagV3GoalMetadataWithDefaults() *OptimizationGoalMetadataConversionTagV3GoalMetadata`

NewOptimizationGoalMetadataConversionTagV3GoalMetadataWithDefaults instantiates a new OptimizationGoalMetadataConversionTagV3GoalMetadata object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAttributionWindows

`func (o *OptimizationGoalMetadataConversionTagV3GoalMetadata) GetAttributionWindows() OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows`

GetAttributionWindows returns the AttributionWindows field if non-nil, zero value otherwise.

### GetAttributionWindowsOk

`func (o *OptimizationGoalMetadataConversionTagV3GoalMetadata) GetAttributionWindowsOk() (*OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows, bool)`

GetAttributionWindowsOk returns a tuple with the AttributionWindows field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttributionWindows

`func (o *OptimizationGoalMetadataConversionTagV3GoalMetadata) SetAttributionWindows(v OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows)`

SetAttributionWindows sets AttributionWindows field to given value.

### HasAttributionWindows

`func (o *OptimizationGoalMetadataConversionTagV3GoalMetadata) HasAttributionWindows() bool`

HasAttributionWindows returns a boolean if a field has been set.

### GetConversionEvent

`func (o *OptimizationGoalMetadataConversionTagV3GoalMetadata) GetConversionEvent() string`

GetConversionEvent returns the ConversionEvent field if non-nil, zero value otherwise.

### GetConversionEventOk

`func (o *OptimizationGoalMetadataConversionTagV3GoalMetadata) GetConversionEventOk() (*string, bool)`

GetConversionEventOk returns a tuple with the ConversionEvent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConversionEvent

`func (o *OptimizationGoalMetadataConversionTagV3GoalMetadata) SetConversionEvent(v string)`

SetConversionEvent sets ConversionEvent field to given value.

### HasConversionEvent

`func (o *OptimizationGoalMetadataConversionTagV3GoalMetadata) HasConversionEvent() bool`

HasConversionEvent returns a boolean if a field has been set.

### GetConversionTagId

`func (o *OptimizationGoalMetadataConversionTagV3GoalMetadata) GetConversionTagId() string`

GetConversionTagId returns the ConversionTagId field if non-nil, zero value otherwise.

### GetConversionTagIdOk

`func (o *OptimizationGoalMetadataConversionTagV3GoalMetadata) GetConversionTagIdOk() (*string, bool)`

GetConversionTagIdOk returns a tuple with the ConversionTagId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConversionTagId

`func (o *OptimizationGoalMetadataConversionTagV3GoalMetadata) SetConversionTagId(v string)`

SetConversionTagId sets ConversionTagId field to given value.

### HasConversionTagId

`func (o *OptimizationGoalMetadataConversionTagV3GoalMetadata) HasConversionTagId() bool`

HasConversionTagId returns a boolean if a field has been set.

### GetCpaGoalValueInMicroCurrency

`func (o *OptimizationGoalMetadataConversionTagV3GoalMetadata) GetCpaGoalValueInMicroCurrency() string`

GetCpaGoalValueInMicroCurrency returns the CpaGoalValueInMicroCurrency field if non-nil, zero value otherwise.

### GetCpaGoalValueInMicroCurrencyOk

`func (o *OptimizationGoalMetadataConversionTagV3GoalMetadata) GetCpaGoalValueInMicroCurrencyOk() (*string, bool)`

GetCpaGoalValueInMicroCurrencyOk returns a tuple with the CpaGoalValueInMicroCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCpaGoalValueInMicroCurrency

`func (o *OptimizationGoalMetadataConversionTagV3GoalMetadata) SetCpaGoalValueInMicroCurrency(v string)`

SetCpaGoalValueInMicroCurrency sets CpaGoalValueInMicroCurrency field to given value.

### HasCpaGoalValueInMicroCurrency

`func (o *OptimizationGoalMetadataConversionTagV3GoalMetadata) HasCpaGoalValueInMicroCurrency() bool`

HasCpaGoalValueInMicroCurrency returns a boolean if a field has been set.

### GetIsRoasOptimized

`func (o *OptimizationGoalMetadataConversionTagV3GoalMetadata) GetIsRoasOptimized() bool`

GetIsRoasOptimized returns the IsRoasOptimized field if non-nil, zero value otherwise.

### GetIsRoasOptimizedOk

`func (o *OptimizationGoalMetadataConversionTagV3GoalMetadata) GetIsRoasOptimizedOk() (*bool, bool)`

GetIsRoasOptimizedOk returns a tuple with the IsRoasOptimized field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsRoasOptimized

`func (o *OptimizationGoalMetadataConversionTagV3GoalMetadata) SetIsRoasOptimized(v bool)`

SetIsRoasOptimized sets IsRoasOptimized field to given value.

### HasIsRoasOptimized

`func (o *OptimizationGoalMetadataConversionTagV3GoalMetadata) HasIsRoasOptimized() bool`

HasIsRoasOptimized returns a boolean if a field has been set.

### SetIsRoasOptimizedNil

`func (o *OptimizationGoalMetadataConversionTagV3GoalMetadata) SetIsRoasOptimizedNil(b bool)`

 SetIsRoasOptimizedNil sets the value for IsRoasOptimized to be an explicit nil

### UnsetIsRoasOptimized
`func (o *OptimizationGoalMetadataConversionTagV3GoalMetadata) UnsetIsRoasOptimized()`

UnsetIsRoasOptimized ensures that no value is present for IsRoasOptimized, not even an explicit nil
### GetLearningModeType

`func (o *OptimizationGoalMetadataConversionTagV3GoalMetadata) GetLearningModeType() string`

GetLearningModeType returns the LearningModeType field if non-nil, zero value otherwise.

### GetLearningModeTypeOk

`func (o *OptimizationGoalMetadataConversionTagV3GoalMetadata) GetLearningModeTypeOk() (*string, bool)`

GetLearningModeTypeOk returns a tuple with the LearningModeType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLearningModeType

`func (o *OptimizationGoalMetadataConversionTagV3GoalMetadata) SetLearningModeType(v string)`

SetLearningModeType sets LearningModeType field to given value.

### HasLearningModeType

`func (o *OptimizationGoalMetadataConversionTagV3GoalMetadata) HasLearningModeType() bool`

HasLearningModeType returns a boolean if a field has been set.

### SetLearningModeTypeNil

`func (o *OptimizationGoalMetadataConversionTagV3GoalMetadata) SetLearningModeTypeNil(b bool)`

 SetLearningModeTypeNil sets the value for LearningModeType to be an explicit nil

### UnsetLearningModeType
`func (o *OptimizationGoalMetadataConversionTagV3GoalMetadata) UnsetLearningModeType()`

UnsetLearningModeType ensures that no value is present for LearningModeType, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


