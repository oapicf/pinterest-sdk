# AdGroupAudienceSizingCreate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AutoTargetingEnabled** | Pointer to **bool** | Enable auto-targeting for ad group. Default value is True. Also known as [Pinterest Performance+ targeting](https://help.pinterest.com/en/business/article/performance-plus-targeting). | [optional] [default to true]
**CreativeTypes** | Pointer to [**[]AdGroupAudienceSizingCreativeTypes**](AdGroupAudienceSizingCreativeTypes.md) | Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional] 
**Keywords** | Pointer to [**[]AdGroupAudienceSizingKeyword**](AdGroupAudienceSizingKeyword.md) | Array of keyword objects. If the keywords field is missing, all keywords will be targeted. | [optional] 
**PlacementGroup** | Pointer to [**AdgroupPlacementGroupType**](AdgroupPlacementGroupType.md) | [Placement group](/docs/redoc/#section/Placement-group). | [optional] [default to ALL]
**ProductGroupIds** | Pointer to **[]string** | Targeted product group IDs. **Note:** This can only be combined with shopping/catalog sales campaigns. For more information, [click here](https://help.pinterest.com/en/business/article/shopping-ads#section-14571). SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored. | [optional] 
**TargetingSpec** | Pointer to [**TargetingSpecOptimal**](TargetingSpecOptimal.md) |  | [optional] 

## Methods

### NewAdGroupAudienceSizingCreate

`func NewAdGroupAudienceSizingCreate() *AdGroupAudienceSizingCreate`

NewAdGroupAudienceSizingCreate instantiates a new AdGroupAudienceSizingCreate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdGroupAudienceSizingCreateWithDefaults

`func NewAdGroupAudienceSizingCreateWithDefaults() *AdGroupAudienceSizingCreate`

NewAdGroupAudienceSizingCreateWithDefaults instantiates a new AdGroupAudienceSizingCreate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAutoTargetingEnabled

`func (o *AdGroupAudienceSizingCreate) GetAutoTargetingEnabled() bool`

GetAutoTargetingEnabled returns the AutoTargetingEnabled field if non-nil, zero value otherwise.

### GetAutoTargetingEnabledOk

`func (o *AdGroupAudienceSizingCreate) GetAutoTargetingEnabledOk() (*bool, bool)`

GetAutoTargetingEnabledOk returns a tuple with the AutoTargetingEnabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAutoTargetingEnabled

`func (o *AdGroupAudienceSizingCreate) SetAutoTargetingEnabled(v bool)`

SetAutoTargetingEnabled sets AutoTargetingEnabled field to given value.

### HasAutoTargetingEnabled

`func (o *AdGroupAudienceSizingCreate) HasAutoTargetingEnabled() bool`

HasAutoTargetingEnabled returns a boolean if a field has been set.

### GetCreativeTypes

`func (o *AdGroupAudienceSizingCreate) GetCreativeTypes() []AdGroupAudienceSizingCreativeTypes`

GetCreativeTypes returns the CreativeTypes field if non-nil, zero value otherwise.

### GetCreativeTypesOk

`func (o *AdGroupAudienceSizingCreate) GetCreativeTypesOk() (*[]AdGroupAudienceSizingCreativeTypes, bool)`

GetCreativeTypesOk returns a tuple with the CreativeTypes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreativeTypes

`func (o *AdGroupAudienceSizingCreate) SetCreativeTypes(v []AdGroupAudienceSizingCreativeTypes)`

SetCreativeTypes sets CreativeTypes field to given value.

### HasCreativeTypes

`func (o *AdGroupAudienceSizingCreate) HasCreativeTypes() bool`

HasCreativeTypes returns a boolean if a field has been set.

### SetCreativeTypesNil

`func (o *AdGroupAudienceSizingCreate) SetCreativeTypesNil(b bool)`

 SetCreativeTypesNil sets the value for CreativeTypes to be an explicit nil

### UnsetCreativeTypes
`func (o *AdGroupAudienceSizingCreate) UnsetCreativeTypes()`

UnsetCreativeTypes ensures that no value is present for CreativeTypes, not even an explicit nil
### GetKeywords

`func (o *AdGroupAudienceSizingCreate) GetKeywords() []AdGroupAudienceSizingKeyword`

GetKeywords returns the Keywords field if non-nil, zero value otherwise.

### GetKeywordsOk

`func (o *AdGroupAudienceSizingCreate) GetKeywordsOk() (*[]AdGroupAudienceSizingKeyword, bool)`

GetKeywordsOk returns a tuple with the Keywords field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKeywords

`func (o *AdGroupAudienceSizingCreate) SetKeywords(v []AdGroupAudienceSizingKeyword)`

SetKeywords sets Keywords field to given value.

### HasKeywords

`func (o *AdGroupAudienceSizingCreate) HasKeywords() bool`

HasKeywords returns a boolean if a field has been set.

### SetKeywordsNil

`func (o *AdGroupAudienceSizingCreate) SetKeywordsNil(b bool)`

 SetKeywordsNil sets the value for Keywords to be an explicit nil

### UnsetKeywords
`func (o *AdGroupAudienceSizingCreate) UnsetKeywords()`

UnsetKeywords ensures that no value is present for Keywords, not even an explicit nil
### GetPlacementGroup

`func (o *AdGroupAudienceSizingCreate) GetPlacementGroup() AdgroupPlacementGroupType`

GetPlacementGroup returns the PlacementGroup field if non-nil, zero value otherwise.

### GetPlacementGroupOk

`func (o *AdGroupAudienceSizingCreate) GetPlacementGroupOk() (*AdgroupPlacementGroupType, bool)`

GetPlacementGroupOk returns a tuple with the PlacementGroup field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlacementGroup

`func (o *AdGroupAudienceSizingCreate) SetPlacementGroup(v AdgroupPlacementGroupType)`

SetPlacementGroup sets PlacementGroup field to given value.

### HasPlacementGroup

`func (o *AdGroupAudienceSizingCreate) HasPlacementGroup() bool`

HasPlacementGroup returns a boolean if a field has been set.

### GetProductGroupIds

`func (o *AdGroupAudienceSizingCreate) GetProductGroupIds() []string`

GetProductGroupIds returns the ProductGroupIds field if non-nil, zero value otherwise.

### GetProductGroupIdsOk

`func (o *AdGroupAudienceSizingCreate) GetProductGroupIdsOk() (*[]string, bool)`

GetProductGroupIdsOk returns a tuple with the ProductGroupIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProductGroupIds

`func (o *AdGroupAudienceSizingCreate) SetProductGroupIds(v []string)`

SetProductGroupIds sets ProductGroupIds field to given value.

### HasProductGroupIds

`func (o *AdGroupAudienceSizingCreate) HasProductGroupIds() bool`

HasProductGroupIds returns a boolean if a field has been set.

### SetProductGroupIdsNil

`func (o *AdGroupAudienceSizingCreate) SetProductGroupIdsNil(b bool)`

 SetProductGroupIdsNil sets the value for ProductGroupIds to be an explicit nil

### UnsetProductGroupIds
`func (o *AdGroupAudienceSizingCreate) UnsetProductGroupIds()`

UnsetProductGroupIds ensures that no value is present for ProductGroupIds, not even an explicit nil
### GetTargetingSpec

`func (o *AdGroupAudienceSizingCreate) GetTargetingSpec() TargetingSpecOptimal`

GetTargetingSpec returns the TargetingSpec field if non-nil, zero value otherwise.

### GetTargetingSpecOk

`func (o *AdGroupAudienceSizingCreate) GetTargetingSpecOk() (*TargetingSpecOptimal, bool)`

GetTargetingSpecOk returns a tuple with the TargetingSpec field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTargetingSpec

`func (o *AdGroupAudienceSizingCreate) SetTargetingSpec(v TargetingSpecOptimal)`

SetTargetingSpec sets TargetingSpec field to given value.

### HasTargetingSpec

`func (o *AdGroupAudienceSizingCreate) HasTargetingSpec() bool`

HasTargetingSpec returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


