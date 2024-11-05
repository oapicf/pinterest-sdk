# TargetingTemplateCreate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **string** | Name of targeting template. | 
**AutoTargetingEnabled** | Pointer to **bool** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;. | [optional] [default to true]
**TargetingAttributes** | [**TargetingSpec**](TargetingSpec.md) |  | 
**PlacementGroup** | Pointer to [**PlacementGroupType**](PlacementGroupType.md) |  | [optional] [default to ALL]
**Keywords** | Pointer to [**[]TargetingTemplateKeyword**](TargetingTemplateKeyword.md) |  | [optional] 
**TrackingUrls** | Pointer to [**NullableTrackingUrls**](TrackingUrls.md) |  | [optional] 

## Methods

### NewTargetingTemplateCreate

`func NewTargetingTemplateCreate(name string, targetingAttributes TargetingSpec, ) *TargetingTemplateCreate`

NewTargetingTemplateCreate instantiates a new TargetingTemplateCreate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTargetingTemplateCreateWithDefaults

`func NewTargetingTemplateCreateWithDefaults() *TargetingTemplateCreate`

NewTargetingTemplateCreateWithDefaults instantiates a new TargetingTemplateCreate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *TargetingTemplateCreate) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *TargetingTemplateCreate) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *TargetingTemplateCreate) SetName(v string)`

SetName sets Name field to given value.


### GetAutoTargetingEnabled

`func (o *TargetingTemplateCreate) GetAutoTargetingEnabled() bool`

GetAutoTargetingEnabled returns the AutoTargetingEnabled field if non-nil, zero value otherwise.

### GetAutoTargetingEnabledOk

`func (o *TargetingTemplateCreate) GetAutoTargetingEnabledOk() (*bool, bool)`

GetAutoTargetingEnabledOk returns a tuple with the AutoTargetingEnabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAutoTargetingEnabled

`func (o *TargetingTemplateCreate) SetAutoTargetingEnabled(v bool)`

SetAutoTargetingEnabled sets AutoTargetingEnabled field to given value.

### HasAutoTargetingEnabled

`func (o *TargetingTemplateCreate) HasAutoTargetingEnabled() bool`

HasAutoTargetingEnabled returns a boolean if a field has been set.

### GetTargetingAttributes

`func (o *TargetingTemplateCreate) GetTargetingAttributes() TargetingSpec`

GetTargetingAttributes returns the TargetingAttributes field if non-nil, zero value otherwise.

### GetTargetingAttributesOk

`func (o *TargetingTemplateCreate) GetTargetingAttributesOk() (*TargetingSpec, bool)`

GetTargetingAttributesOk returns a tuple with the TargetingAttributes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTargetingAttributes

`func (o *TargetingTemplateCreate) SetTargetingAttributes(v TargetingSpec)`

SetTargetingAttributes sets TargetingAttributes field to given value.


### GetPlacementGroup

`func (o *TargetingTemplateCreate) GetPlacementGroup() PlacementGroupType`

GetPlacementGroup returns the PlacementGroup field if non-nil, zero value otherwise.

### GetPlacementGroupOk

`func (o *TargetingTemplateCreate) GetPlacementGroupOk() (*PlacementGroupType, bool)`

GetPlacementGroupOk returns a tuple with the PlacementGroup field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlacementGroup

`func (o *TargetingTemplateCreate) SetPlacementGroup(v PlacementGroupType)`

SetPlacementGroup sets PlacementGroup field to given value.

### HasPlacementGroup

`func (o *TargetingTemplateCreate) HasPlacementGroup() bool`

HasPlacementGroup returns a boolean if a field has been set.

### GetKeywords

`func (o *TargetingTemplateCreate) GetKeywords() []TargetingTemplateKeyword`

GetKeywords returns the Keywords field if non-nil, zero value otherwise.

### GetKeywordsOk

`func (o *TargetingTemplateCreate) GetKeywordsOk() (*[]TargetingTemplateKeyword, bool)`

GetKeywordsOk returns a tuple with the Keywords field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKeywords

`func (o *TargetingTemplateCreate) SetKeywords(v []TargetingTemplateKeyword)`

SetKeywords sets Keywords field to given value.

### HasKeywords

`func (o *TargetingTemplateCreate) HasKeywords() bool`

HasKeywords returns a boolean if a field has been set.

### GetTrackingUrls

`func (o *TargetingTemplateCreate) GetTrackingUrls() TrackingUrls`

GetTrackingUrls returns the TrackingUrls field if non-nil, zero value otherwise.

### GetTrackingUrlsOk

`func (o *TargetingTemplateCreate) GetTrackingUrlsOk() (*TrackingUrls, bool)`

GetTrackingUrlsOk returns a tuple with the TrackingUrls field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTrackingUrls

`func (o *TargetingTemplateCreate) SetTrackingUrls(v TrackingUrls)`

SetTrackingUrls sets TrackingUrls field to given value.

### HasTrackingUrls

`func (o *TargetingTemplateCreate) HasTrackingUrls() bool`

HasTrackingUrls returns a boolean if a field has been set.

### SetTrackingUrlsNil

`func (o *TargetingTemplateCreate) SetTrackingUrlsNil(b bool)`

 SetTrackingUrlsNil sets the value for TrackingUrls to be an explicit nil

### UnsetTrackingUrls
`func (o *TargetingTemplateCreate) UnsetTrackingUrls()`

UnsetTrackingUrls ensures that no value is present for TrackingUrls, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


