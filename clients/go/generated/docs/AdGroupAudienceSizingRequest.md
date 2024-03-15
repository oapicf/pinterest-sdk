# AdGroupAudienceSizingRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AutoTargetingEnabled** | Pointer to **bool** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;. | [optional] [default to true]
**PlacementGroup** | Pointer to [**PlacementGroupType**](PlacementGroupType.md) | &lt;a href&#x3D;\&quot;/docs/redoc/#section/Placement-group\&quot;&gt;Placement group&lt;/a&gt;. | [optional] [default to ALL]
**CreativeTypes** | Pointer to **[]string** | Pin creative types filter. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional] 
**TargetingSpec** | Pointer to [**TargetingSpec**](TargetingSpec.md) |  | [optional] 
**ProductGroupIds** | Pointer to **[]string** | Targeted product group IDs. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; This can only be combined with shopping/catalog sales campaigns. For more information, &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/shopping-ads#section-14571\&quot; target&#x3D;\&quot;_blank\&quot;&gt;click here&lt;/a&gt;. SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored. | [optional] 
**Keywords** | Pointer to [**[]AdGroupAudienceSizingRequestKeywordsInner**](AdGroupAudienceSizingRequestKeywordsInner.md) | Array of keyword objects. If the keywords field is missing, all keywords will be targeted. | [optional] 

## Methods

### NewAdGroupAudienceSizingRequest

`func NewAdGroupAudienceSizingRequest() *AdGroupAudienceSizingRequest`

NewAdGroupAudienceSizingRequest instantiates a new AdGroupAudienceSizingRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdGroupAudienceSizingRequestWithDefaults

`func NewAdGroupAudienceSizingRequestWithDefaults() *AdGroupAudienceSizingRequest`

NewAdGroupAudienceSizingRequestWithDefaults instantiates a new AdGroupAudienceSizingRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAutoTargetingEnabled

`func (o *AdGroupAudienceSizingRequest) GetAutoTargetingEnabled() bool`

GetAutoTargetingEnabled returns the AutoTargetingEnabled field if non-nil, zero value otherwise.

### GetAutoTargetingEnabledOk

`func (o *AdGroupAudienceSizingRequest) GetAutoTargetingEnabledOk() (*bool, bool)`

GetAutoTargetingEnabledOk returns a tuple with the AutoTargetingEnabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAutoTargetingEnabled

`func (o *AdGroupAudienceSizingRequest) SetAutoTargetingEnabled(v bool)`

SetAutoTargetingEnabled sets AutoTargetingEnabled field to given value.

### HasAutoTargetingEnabled

`func (o *AdGroupAudienceSizingRequest) HasAutoTargetingEnabled() bool`

HasAutoTargetingEnabled returns a boolean if a field has been set.

### GetPlacementGroup

`func (o *AdGroupAudienceSizingRequest) GetPlacementGroup() PlacementGroupType`

GetPlacementGroup returns the PlacementGroup field if non-nil, zero value otherwise.

### GetPlacementGroupOk

`func (o *AdGroupAudienceSizingRequest) GetPlacementGroupOk() (*PlacementGroupType, bool)`

GetPlacementGroupOk returns a tuple with the PlacementGroup field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlacementGroup

`func (o *AdGroupAudienceSizingRequest) SetPlacementGroup(v PlacementGroupType)`

SetPlacementGroup sets PlacementGroup field to given value.

### HasPlacementGroup

`func (o *AdGroupAudienceSizingRequest) HasPlacementGroup() bool`

HasPlacementGroup returns a boolean if a field has been set.

### GetCreativeTypes

`func (o *AdGroupAudienceSizingRequest) GetCreativeTypes() []string`

GetCreativeTypes returns the CreativeTypes field if non-nil, zero value otherwise.

### GetCreativeTypesOk

`func (o *AdGroupAudienceSizingRequest) GetCreativeTypesOk() (*[]string, bool)`

GetCreativeTypesOk returns a tuple with the CreativeTypes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreativeTypes

`func (o *AdGroupAudienceSizingRequest) SetCreativeTypes(v []string)`

SetCreativeTypes sets CreativeTypes field to given value.

### HasCreativeTypes

`func (o *AdGroupAudienceSizingRequest) HasCreativeTypes() bool`

HasCreativeTypes returns a boolean if a field has been set.

### SetCreativeTypesNil

`func (o *AdGroupAudienceSizingRequest) SetCreativeTypesNil(b bool)`

 SetCreativeTypesNil sets the value for CreativeTypes to be an explicit nil

### UnsetCreativeTypes
`func (o *AdGroupAudienceSizingRequest) UnsetCreativeTypes()`

UnsetCreativeTypes ensures that no value is present for CreativeTypes, not even an explicit nil
### GetTargetingSpec

`func (o *AdGroupAudienceSizingRequest) GetTargetingSpec() TargetingSpec`

GetTargetingSpec returns the TargetingSpec field if non-nil, zero value otherwise.

### GetTargetingSpecOk

`func (o *AdGroupAudienceSizingRequest) GetTargetingSpecOk() (*TargetingSpec, bool)`

GetTargetingSpecOk returns a tuple with the TargetingSpec field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTargetingSpec

`func (o *AdGroupAudienceSizingRequest) SetTargetingSpec(v TargetingSpec)`

SetTargetingSpec sets TargetingSpec field to given value.

### HasTargetingSpec

`func (o *AdGroupAudienceSizingRequest) HasTargetingSpec() bool`

HasTargetingSpec returns a boolean if a field has been set.

### GetProductGroupIds

`func (o *AdGroupAudienceSizingRequest) GetProductGroupIds() []string`

GetProductGroupIds returns the ProductGroupIds field if non-nil, zero value otherwise.

### GetProductGroupIdsOk

`func (o *AdGroupAudienceSizingRequest) GetProductGroupIdsOk() (*[]string, bool)`

GetProductGroupIdsOk returns a tuple with the ProductGroupIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProductGroupIds

`func (o *AdGroupAudienceSizingRequest) SetProductGroupIds(v []string)`

SetProductGroupIds sets ProductGroupIds field to given value.

### HasProductGroupIds

`func (o *AdGroupAudienceSizingRequest) HasProductGroupIds() bool`

HasProductGroupIds returns a boolean if a field has been set.

### SetProductGroupIdsNil

`func (o *AdGroupAudienceSizingRequest) SetProductGroupIdsNil(b bool)`

 SetProductGroupIdsNil sets the value for ProductGroupIds to be an explicit nil

### UnsetProductGroupIds
`func (o *AdGroupAudienceSizingRequest) UnsetProductGroupIds()`

UnsetProductGroupIds ensures that no value is present for ProductGroupIds, not even an explicit nil
### GetKeywords

`func (o *AdGroupAudienceSizingRequest) GetKeywords() []AdGroupAudienceSizingRequestKeywordsInner`

GetKeywords returns the Keywords field if non-nil, zero value otherwise.

### GetKeywordsOk

`func (o *AdGroupAudienceSizingRequest) GetKeywordsOk() (*[]AdGroupAudienceSizingRequestKeywordsInner, bool)`

GetKeywordsOk returns a tuple with the Keywords field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKeywords

`func (o *AdGroupAudienceSizingRequest) SetKeywords(v []AdGroupAudienceSizingRequestKeywordsInner)`

SetKeywords sets Keywords field to given value.

### HasKeywords

`func (o *AdGroupAudienceSizingRequest) HasKeywords() bool`

HasKeywords returns a boolean if a field has been set.

### SetKeywordsNil

`func (o *AdGroupAudienceSizingRequest) SetKeywordsNil(b bool)`

 SetKeywordsNil sets the value for Keywords to be an explicit nil

### UnsetKeywords
`func (o *AdGroupAudienceSizingRequest) UnsetKeywords()`

UnsetKeywords ensures that no value is present for Keywords, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


