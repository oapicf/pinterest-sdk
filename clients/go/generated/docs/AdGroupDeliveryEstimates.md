# AdGroupDeliveryEstimates

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AutoTargetingEnabled** | Pointer to **bool** |  | [optional] 
**CreativeTypes** | Pointer to [**[]AdGroupAudienceSizingCreativeTypes**](AdGroupAudienceSizingCreativeTypes.md) | Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional] 
**Keywords** | Pointer to [**[]AdGroupDeliveryEstimatesKeywordsItems**](AdGroupDeliveryEstimatesKeywordsItems.md) | Array of keyword objects. If the keywords field is missing, all keywords will be targeted. | [optional] 
**MonthlyFrequencyCap** | Pointer to **int32** | Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. | [optional] 
**OptimizationGoalMetadata** | Pointer to [**OptimizationGoalMetadata**](OptimizationGoalMetadata.md) |  | [optional] 
**OptimizationType** | Pointer to [**OptimizationType**](OptimizationType.md) | Optimization type for ad group delivery. Defaults to WEB_CONVERSION for WEB_CONVERSION/AWARENESS objectives, CLICKTHROUGH otherwise. | [optional] 
**PlacementGroup** | Pointer to [**PlacementGroupType**](PlacementGroupType.md) |  | [optional] [default to ALL]
**ProductGroupIds** | Pointer to **[]string** | [Targeted product group IDs](/docs/redoc/#section/AdGroup-Audience-Sizing) **Note:** This can only be combined with shopping/catalog sales campaigns. | [optional] 
**TargetingSpec** | Pointer to [**TargetingSpecOptimal**](TargetingSpecOptimal.md) |  | [optional] 

## Methods

### NewAdGroupDeliveryEstimates

`func NewAdGroupDeliveryEstimates() *AdGroupDeliveryEstimates`

NewAdGroupDeliveryEstimates instantiates a new AdGroupDeliveryEstimates object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdGroupDeliveryEstimatesWithDefaults

`func NewAdGroupDeliveryEstimatesWithDefaults() *AdGroupDeliveryEstimates`

NewAdGroupDeliveryEstimatesWithDefaults instantiates a new AdGroupDeliveryEstimates object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAutoTargetingEnabled

`func (o *AdGroupDeliveryEstimates) GetAutoTargetingEnabled() bool`

GetAutoTargetingEnabled returns the AutoTargetingEnabled field if non-nil, zero value otherwise.

### GetAutoTargetingEnabledOk

`func (o *AdGroupDeliveryEstimates) GetAutoTargetingEnabledOk() (*bool, bool)`

GetAutoTargetingEnabledOk returns a tuple with the AutoTargetingEnabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAutoTargetingEnabled

`func (o *AdGroupDeliveryEstimates) SetAutoTargetingEnabled(v bool)`

SetAutoTargetingEnabled sets AutoTargetingEnabled field to given value.

### HasAutoTargetingEnabled

`func (o *AdGroupDeliveryEstimates) HasAutoTargetingEnabled() bool`

HasAutoTargetingEnabled returns a boolean if a field has been set.

### GetCreativeTypes

`func (o *AdGroupDeliveryEstimates) GetCreativeTypes() []AdGroupAudienceSizingCreativeTypes`

GetCreativeTypes returns the CreativeTypes field if non-nil, zero value otherwise.

### GetCreativeTypesOk

`func (o *AdGroupDeliveryEstimates) GetCreativeTypesOk() (*[]AdGroupAudienceSizingCreativeTypes, bool)`

GetCreativeTypesOk returns a tuple with the CreativeTypes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreativeTypes

`func (o *AdGroupDeliveryEstimates) SetCreativeTypes(v []AdGroupAudienceSizingCreativeTypes)`

SetCreativeTypes sets CreativeTypes field to given value.

### HasCreativeTypes

`func (o *AdGroupDeliveryEstimates) HasCreativeTypes() bool`

HasCreativeTypes returns a boolean if a field has been set.

### GetKeywords

`func (o *AdGroupDeliveryEstimates) GetKeywords() []AdGroupDeliveryEstimatesKeywordsItems`

GetKeywords returns the Keywords field if non-nil, zero value otherwise.

### GetKeywordsOk

`func (o *AdGroupDeliveryEstimates) GetKeywordsOk() (*[]AdGroupDeliveryEstimatesKeywordsItems, bool)`

GetKeywordsOk returns a tuple with the Keywords field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKeywords

`func (o *AdGroupDeliveryEstimates) SetKeywords(v []AdGroupDeliveryEstimatesKeywordsItems)`

SetKeywords sets Keywords field to given value.

### HasKeywords

`func (o *AdGroupDeliveryEstimates) HasKeywords() bool`

HasKeywords returns a boolean if a field has been set.

### SetKeywordsNil

`func (o *AdGroupDeliveryEstimates) SetKeywordsNil(b bool)`

 SetKeywordsNil sets the value for Keywords to be an explicit nil

### UnsetKeywords
`func (o *AdGroupDeliveryEstimates) UnsetKeywords()`

UnsetKeywords ensures that no value is present for Keywords, not even an explicit nil
### GetMonthlyFrequencyCap

`func (o *AdGroupDeliveryEstimates) GetMonthlyFrequencyCap() int32`

GetMonthlyFrequencyCap returns the MonthlyFrequencyCap field if non-nil, zero value otherwise.

### GetMonthlyFrequencyCapOk

`func (o *AdGroupDeliveryEstimates) GetMonthlyFrequencyCapOk() (*int32, bool)`

GetMonthlyFrequencyCapOk returns a tuple with the MonthlyFrequencyCap field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMonthlyFrequencyCap

`func (o *AdGroupDeliveryEstimates) SetMonthlyFrequencyCap(v int32)`

SetMonthlyFrequencyCap sets MonthlyFrequencyCap field to given value.

### HasMonthlyFrequencyCap

`func (o *AdGroupDeliveryEstimates) HasMonthlyFrequencyCap() bool`

HasMonthlyFrequencyCap returns a boolean if a field has been set.

### GetOptimizationGoalMetadata

`func (o *AdGroupDeliveryEstimates) GetOptimizationGoalMetadata() OptimizationGoalMetadata`

GetOptimizationGoalMetadata returns the OptimizationGoalMetadata field if non-nil, zero value otherwise.

### GetOptimizationGoalMetadataOk

`func (o *AdGroupDeliveryEstimates) GetOptimizationGoalMetadataOk() (*OptimizationGoalMetadata, bool)`

GetOptimizationGoalMetadataOk returns a tuple with the OptimizationGoalMetadata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptimizationGoalMetadata

`func (o *AdGroupDeliveryEstimates) SetOptimizationGoalMetadata(v OptimizationGoalMetadata)`

SetOptimizationGoalMetadata sets OptimizationGoalMetadata field to given value.

### HasOptimizationGoalMetadata

`func (o *AdGroupDeliveryEstimates) HasOptimizationGoalMetadata() bool`

HasOptimizationGoalMetadata returns a boolean if a field has been set.

### GetOptimizationType

`func (o *AdGroupDeliveryEstimates) GetOptimizationType() OptimizationType`

GetOptimizationType returns the OptimizationType field if non-nil, zero value otherwise.

### GetOptimizationTypeOk

`func (o *AdGroupDeliveryEstimates) GetOptimizationTypeOk() (*OptimizationType, bool)`

GetOptimizationTypeOk returns a tuple with the OptimizationType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptimizationType

`func (o *AdGroupDeliveryEstimates) SetOptimizationType(v OptimizationType)`

SetOptimizationType sets OptimizationType field to given value.

### HasOptimizationType

`func (o *AdGroupDeliveryEstimates) HasOptimizationType() bool`

HasOptimizationType returns a boolean if a field has been set.

### GetPlacementGroup

`func (o *AdGroupDeliveryEstimates) GetPlacementGroup() PlacementGroupType`

GetPlacementGroup returns the PlacementGroup field if non-nil, zero value otherwise.

### GetPlacementGroupOk

`func (o *AdGroupDeliveryEstimates) GetPlacementGroupOk() (*PlacementGroupType, bool)`

GetPlacementGroupOk returns a tuple with the PlacementGroup field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlacementGroup

`func (o *AdGroupDeliveryEstimates) SetPlacementGroup(v PlacementGroupType)`

SetPlacementGroup sets PlacementGroup field to given value.

### HasPlacementGroup

`func (o *AdGroupDeliveryEstimates) HasPlacementGroup() bool`

HasPlacementGroup returns a boolean if a field has been set.

### GetProductGroupIds

`func (o *AdGroupDeliveryEstimates) GetProductGroupIds() []string`

GetProductGroupIds returns the ProductGroupIds field if non-nil, zero value otherwise.

### GetProductGroupIdsOk

`func (o *AdGroupDeliveryEstimates) GetProductGroupIdsOk() (*[]string, bool)`

GetProductGroupIdsOk returns a tuple with the ProductGroupIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProductGroupIds

`func (o *AdGroupDeliveryEstimates) SetProductGroupIds(v []string)`

SetProductGroupIds sets ProductGroupIds field to given value.

### HasProductGroupIds

`func (o *AdGroupDeliveryEstimates) HasProductGroupIds() bool`

HasProductGroupIds returns a boolean if a field has been set.

### GetTargetingSpec

`func (o *AdGroupDeliveryEstimates) GetTargetingSpec() TargetingSpecOptimal`

GetTargetingSpec returns the TargetingSpec field if non-nil, zero value otherwise.

### GetTargetingSpecOk

`func (o *AdGroupDeliveryEstimates) GetTargetingSpecOk() (*TargetingSpecOptimal, bool)`

GetTargetingSpecOk returns a tuple with the TargetingSpec field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTargetingSpec

`func (o *AdGroupDeliveryEstimates) SetTargetingSpec(v TargetingSpecOptimal)`

SetTargetingSpec sets TargetingSpec field to given value.

### HasTargetingSpec

`func (o *AdGroupDeliveryEstimates) HasTargetingSpec() bool`

HasTargetingSpec returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


