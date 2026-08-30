# TargetingTemplate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | Pointer to **string** | The ID of the advertiser that this targeting template belongs to. | [optional] [readonly] 
**AutoTargetingEnabled** | Pointer to **bool** | Enable auto-targeting for ad group. Also known as [\&quot;expanded targeting\&quot;](https://help.pinterest.com/en/business/article/expanded-targeting). | [optional] [default to true]
**CreatedTime** | Pointer to **int32** | Targeting template created time. Unix timestamp in seconds. | [optional] [readonly] 
**Id** | Pointer to **string** | Targeting template ID. | [optional] [readonly] 
**Keywords** | Pointer to [**[]TargetingTemplateKeyword**](TargetingTemplateKeyword.md) |  | [optional] 
**Name** | **string** | targeting template name | 
**PlacementGroup** | Pointer to [**PlacementGroupType**](PlacementGroupType.md) |  | [optional] [default to ALL]
**Sizing** | Pointer to [**NullableTargetingTemplateAudienceSizing**](TargetingTemplateAudienceSizing.md) |  | [optional] [readonly] 
**Status** | Pointer to [**TargetingTemplateStatus**](TargetingTemplateStatus.md) | Indicate targeting template is active or Deleted | [optional] [readonly] 
**TargetingAttributes** | [**TargetingSpecOptimal**](TargetingSpecOptimal.md) | targeting profile attributes | 
**TrackingUrls** | Pointer to [**NullableTrackingUrls**](TrackingUrls.md) |  | [optional] 
**UpdatedTime** | Pointer to **int32** | Targeting template updated time.Unix timestamp in seconds. | [optional] [readonly] 
**Valid** | Pointer to **NullableBool** | Inform if the targeting template is valid (ex. would be false if has revoked audience) | [optional] [readonly] 

## Methods

### NewTargetingTemplate

`func NewTargetingTemplate(name string, targetingAttributes TargetingSpecOptimal, ) *TargetingTemplate`

NewTargetingTemplate instantiates a new TargetingTemplate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTargetingTemplateWithDefaults

`func NewTargetingTemplateWithDefaults() *TargetingTemplate`

NewTargetingTemplateWithDefaults instantiates a new TargetingTemplate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdAccountId

`func (o *TargetingTemplate) GetAdAccountId() string`

GetAdAccountId returns the AdAccountId field if non-nil, zero value otherwise.

### GetAdAccountIdOk

`func (o *TargetingTemplate) GetAdAccountIdOk() (*string, bool)`

GetAdAccountIdOk returns a tuple with the AdAccountId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdAccountId

`func (o *TargetingTemplate) SetAdAccountId(v string)`

SetAdAccountId sets AdAccountId field to given value.

### HasAdAccountId

`func (o *TargetingTemplate) HasAdAccountId() bool`

HasAdAccountId returns a boolean if a field has been set.

### GetAutoTargetingEnabled

`func (o *TargetingTemplate) GetAutoTargetingEnabled() bool`

GetAutoTargetingEnabled returns the AutoTargetingEnabled field if non-nil, zero value otherwise.

### GetAutoTargetingEnabledOk

`func (o *TargetingTemplate) GetAutoTargetingEnabledOk() (*bool, bool)`

GetAutoTargetingEnabledOk returns a tuple with the AutoTargetingEnabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAutoTargetingEnabled

`func (o *TargetingTemplate) SetAutoTargetingEnabled(v bool)`

SetAutoTargetingEnabled sets AutoTargetingEnabled field to given value.

### HasAutoTargetingEnabled

`func (o *TargetingTemplate) HasAutoTargetingEnabled() bool`

HasAutoTargetingEnabled returns a boolean if a field has been set.

### GetCreatedTime

`func (o *TargetingTemplate) GetCreatedTime() int32`

GetCreatedTime returns the CreatedTime field if non-nil, zero value otherwise.

### GetCreatedTimeOk

`func (o *TargetingTemplate) GetCreatedTimeOk() (*int32, bool)`

GetCreatedTimeOk returns a tuple with the CreatedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedTime

`func (o *TargetingTemplate) SetCreatedTime(v int32)`

SetCreatedTime sets CreatedTime field to given value.

### HasCreatedTime

`func (o *TargetingTemplate) HasCreatedTime() bool`

HasCreatedTime returns a boolean if a field has been set.

### GetId

`func (o *TargetingTemplate) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *TargetingTemplate) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *TargetingTemplate) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *TargetingTemplate) HasId() bool`

HasId returns a boolean if a field has been set.

### GetKeywords

`func (o *TargetingTemplate) GetKeywords() []TargetingTemplateKeyword`

GetKeywords returns the Keywords field if non-nil, zero value otherwise.

### GetKeywordsOk

`func (o *TargetingTemplate) GetKeywordsOk() (*[]TargetingTemplateKeyword, bool)`

GetKeywordsOk returns a tuple with the Keywords field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKeywords

`func (o *TargetingTemplate) SetKeywords(v []TargetingTemplateKeyword)`

SetKeywords sets Keywords field to given value.

### HasKeywords

`func (o *TargetingTemplate) HasKeywords() bool`

HasKeywords returns a boolean if a field has been set.

### GetName

`func (o *TargetingTemplate) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *TargetingTemplate) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *TargetingTemplate) SetName(v string)`

SetName sets Name field to given value.


### GetPlacementGroup

`func (o *TargetingTemplate) GetPlacementGroup() PlacementGroupType`

GetPlacementGroup returns the PlacementGroup field if non-nil, zero value otherwise.

### GetPlacementGroupOk

`func (o *TargetingTemplate) GetPlacementGroupOk() (*PlacementGroupType, bool)`

GetPlacementGroupOk returns a tuple with the PlacementGroup field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlacementGroup

`func (o *TargetingTemplate) SetPlacementGroup(v PlacementGroupType)`

SetPlacementGroup sets PlacementGroup field to given value.

### HasPlacementGroup

`func (o *TargetingTemplate) HasPlacementGroup() bool`

HasPlacementGroup returns a boolean if a field has been set.

### GetSizing

`func (o *TargetingTemplate) GetSizing() TargetingTemplateAudienceSizing`

GetSizing returns the Sizing field if non-nil, zero value otherwise.

### GetSizingOk

`func (o *TargetingTemplate) GetSizingOk() (*TargetingTemplateAudienceSizing, bool)`

GetSizingOk returns a tuple with the Sizing field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSizing

`func (o *TargetingTemplate) SetSizing(v TargetingTemplateAudienceSizing)`

SetSizing sets Sizing field to given value.

### HasSizing

`func (o *TargetingTemplate) HasSizing() bool`

HasSizing returns a boolean if a field has been set.

### SetSizingNil

`func (o *TargetingTemplate) SetSizingNil(b bool)`

 SetSizingNil sets the value for Sizing to be an explicit nil

### UnsetSizing
`func (o *TargetingTemplate) UnsetSizing()`

UnsetSizing ensures that no value is present for Sizing, not even an explicit nil
### GetStatus

`func (o *TargetingTemplate) GetStatus() TargetingTemplateStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *TargetingTemplate) GetStatusOk() (*TargetingTemplateStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *TargetingTemplate) SetStatus(v TargetingTemplateStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *TargetingTemplate) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetTargetingAttributes

`func (o *TargetingTemplate) GetTargetingAttributes() TargetingSpecOptimal`

GetTargetingAttributes returns the TargetingAttributes field if non-nil, zero value otherwise.

### GetTargetingAttributesOk

`func (o *TargetingTemplate) GetTargetingAttributesOk() (*TargetingSpecOptimal, bool)`

GetTargetingAttributesOk returns a tuple with the TargetingAttributes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTargetingAttributes

`func (o *TargetingTemplate) SetTargetingAttributes(v TargetingSpecOptimal)`

SetTargetingAttributes sets TargetingAttributes field to given value.


### GetTrackingUrls

`func (o *TargetingTemplate) GetTrackingUrls() TrackingUrls`

GetTrackingUrls returns the TrackingUrls field if non-nil, zero value otherwise.

### GetTrackingUrlsOk

`func (o *TargetingTemplate) GetTrackingUrlsOk() (*TrackingUrls, bool)`

GetTrackingUrlsOk returns a tuple with the TrackingUrls field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTrackingUrls

`func (o *TargetingTemplate) SetTrackingUrls(v TrackingUrls)`

SetTrackingUrls sets TrackingUrls field to given value.

### HasTrackingUrls

`func (o *TargetingTemplate) HasTrackingUrls() bool`

HasTrackingUrls returns a boolean if a field has been set.

### SetTrackingUrlsNil

`func (o *TargetingTemplate) SetTrackingUrlsNil(b bool)`

 SetTrackingUrlsNil sets the value for TrackingUrls to be an explicit nil

### UnsetTrackingUrls
`func (o *TargetingTemplate) UnsetTrackingUrls()`

UnsetTrackingUrls ensures that no value is present for TrackingUrls, not even an explicit nil
### GetUpdatedTime

`func (o *TargetingTemplate) GetUpdatedTime() int32`

GetUpdatedTime returns the UpdatedTime field if non-nil, zero value otherwise.

### GetUpdatedTimeOk

`func (o *TargetingTemplate) GetUpdatedTimeOk() (*int32, bool)`

GetUpdatedTimeOk returns a tuple with the UpdatedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedTime

`func (o *TargetingTemplate) SetUpdatedTime(v int32)`

SetUpdatedTime sets UpdatedTime field to given value.

### HasUpdatedTime

`func (o *TargetingTemplate) HasUpdatedTime() bool`

HasUpdatedTime returns a boolean if a field has been set.

### GetValid

`func (o *TargetingTemplate) GetValid() bool`

GetValid returns the Valid field if non-nil, zero value otherwise.

### GetValidOk

`func (o *TargetingTemplate) GetValidOk() (*bool, bool)`

GetValidOk returns a tuple with the Valid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValid

`func (o *TargetingTemplate) SetValid(v bool)`

SetValid sets Valid field to given value.

### HasValid

`func (o *TargetingTemplate) HasValid() bool`

HasValid returns a boolean if a field has been set.

### SetValidNil

`func (o *TargetingTemplate) SetValidNil(b bool)`

 SetValidNil sets the value for Valid to be an explicit nil

### UnsetValid
`func (o *TargetingTemplate) UnsetValid()`

UnsetValid ensures that no value is present for Valid, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


