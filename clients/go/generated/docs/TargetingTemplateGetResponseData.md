# TargetingTemplateGetResponseData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | Pointer to **string** | targeting template name | [optional] 
**AutoTargetingEnabled** | Pointer to **bool** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;. | [optional] [default to true]
**TargetingAttributes** | Pointer to [**TargetingSpec**](TargetingSpec.md) |  | [optional] 
**PlacementGroup** | Pointer to [**PlacementGroupType**](PlacementGroupType.md) |  | [optional] [default to ALL]
**Keywords** | Pointer to [**[]TargetingTemplateKeyword**](TargetingTemplateKeyword.md) |  | [optional] 
**TrackingUrls** | Pointer to [**NullableTrackingUrls**](TrackingUrls.md) |  | [optional] 
**Id** | Pointer to **string** | Targeting template ID. | [optional] 
**CreatedTime** | Pointer to **int32** | Targeting template created time. Unix timestamp in seconds. | [optional] 
**UpdatedTime** | Pointer to **int32** | Targeting template updated time.Unix timestamp in seconds. | [optional] 
**AdAccountId** | Pointer to **string** | The ID of the advertiser that this targeting template belongs to. | [optional] 
**Status** | Pointer to **string** | Indicate targeting template is active or Deleted | [optional] [default to "ACTIVE"]
**Sizing** | Pointer to [**NullableTargetingTemplateAudienceSizing**](TargetingTemplateAudienceSizing.md) |  | [optional] 
**Valid** | Pointer to **NullableBool** | Inform if the targeting template is valid (ex. would be false if has revoked audience) | [optional] 

## Methods

### NewTargetingTemplateGetResponseData

`func NewTargetingTemplateGetResponseData() *TargetingTemplateGetResponseData`

NewTargetingTemplateGetResponseData instantiates a new TargetingTemplateGetResponseData object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTargetingTemplateGetResponseDataWithDefaults

`func NewTargetingTemplateGetResponseDataWithDefaults() *TargetingTemplateGetResponseData`

NewTargetingTemplateGetResponseDataWithDefaults instantiates a new TargetingTemplateGetResponseData object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *TargetingTemplateGetResponseData) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *TargetingTemplateGetResponseData) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *TargetingTemplateGetResponseData) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *TargetingTemplateGetResponseData) HasName() bool`

HasName returns a boolean if a field has been set.

### GetAutoTargetingEnabled

`func (o *TargetingTemplateGetResponseData) GetAutoTargetingEnabled() bool`

GetAutoTargetingEnabled returns the AutoTargetingEnabled field if non-nil, zero value otherwise.

### GetAutoTargetingEnabledOk

`func (o *TargetingTemplateGetResponseData) GetAutoTargetingEnabledOk() (*bool, bool)`

GetAutoTargetingEnabledOk returns a tuple with the AutoTargetingEnabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAutoTargetingEnabled

`func (o *TargetingTemplateGetResponseData) SetAutoTargetingEnabled(v bool)`

SetAutoTargetingEnabled sets AutoTargetingEnabled field to given value.

### HasAutoTargetingEnabled

`func (o *TargetingTemplateGetResponseData) HasAutoTargetingEnabled() bool`

HasAutoTargetingEnabled returns a boolean if a field has been set.

### GetTargetingAttributes

`func (o *TargetingTemplateGetResponseData) GetTargetingAttributes() TargetingSpec`

GetTargetingAttributes returns the TargetingAttributes field if non-nil, zero value otherwise.

### GetTargetingAttributesOk

`func (o *TargetingTemplateGetResponseData) GetTargetingAttributesOk() (*TargetingSpec, bool)`

GetTargetingAttributesOk returns a tuple with the TargetingAttributes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTargetingAttributes

`func (o *TargetingTemplateGetResponseData) SetTargetingAttributes(v TargetingSpec)`

SetTargetingAttributes sets TargetingAttributes field to given value.

### HasTargetingAttributes

`func (o *TargetingTemplateGetResponseData) HasTargetingAttributes() bool`

HasTargetingAttributes returns a boolean if a field has been set.

### GetPlacementGroup

`func (o *TargetingTemplateGetResponseData) GetPlacementGroup() PlacementGroupType`

GetPlacementGroup returns the PlacementGroup field if non-nil, zero value otherwise.

### GetPlacementGroupOk

`func (o *TargetingTemplateGetResponseData) GetPlacementGroupOk() (*PlacementGroupType, bool)`

GetPlacementGroupOk returns a tuple with the PlacementGroup field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlacementGroup

`func (o *TargetingTemplateGetResponseData) SetPlacementGroup(v PlacementGroupType)`

SetPlacementGroup sets PlacementGroup field to given value.

### HasPlacementGroup

`func (o *TargetingTemplateGetResponseData) HasPlacementGroup() bool`

HasPlacementGroup returns a boolean if a field has been set.

### GetKeywords

`func (o *TargetingTemplateGetResponseData) GetKeywords() []TargetingTemplateKeyword`

GetKeywords returns the Keywords field if non-nil, zero value otherwise.

### GetKeywordsOk

`func (o *TargetingTemplateGetResponseData) GetKeywordsOk() (*[]TargetingTemplateKeyword, bool)`

GetKeywordsOk returns a tuple with the Keywords field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKeywords

`func (o *TargetingTemplateGetResponseData) SetKeywords(v []TargetingTemplateKeyword)`

SetKeywords sets Keywords field to given value.

### HasKeywords

`func (o *TargetingTemplateGetResponseData) HasKeywords() bool`

HasKeywords returns a boolean if a field has been set.

### GetTrackingUrls

`func (o *TargetingTemplateGetResponseData) GetTrackingUrls() TrackingUrls`

GetTrackingUrls returns the TrackingUrls field if non-nil, zero value otherwise.

### GetTrackingUrlsOk

`func (o *TargetingTemplateGetResponseData) GetTrackingUrlsOk() (*TrackingUrls, bool)`

GetTrackingUrlsOk returns a tuple with the TrackingUrls field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTrackingUrls

`func (o *TargetingTemplateGetResponseData) SetTrackingUrls(v TrackingUrls)`

SetTrackingUrls sets TrackingUrls field to given value.

### HasTrackingUrls

`func (o *TargetingTemplateGetResponseData) HasTrackingUrls() bool`

HasTrackingUrls returns a boolean if a field has been set.

### SetTrackingUrlsNil

`func (o *TargetingTemplateGetResponseData) SetTrackingUrlsNil(b bool)`

 SetTrackingUrlsNil sets the value for TrackingUrls to be an explicit nil

### UnsetTrackingUrls
`func (o *TargetingTemplateGetResponseData) UnsetTrackingUrls()`

UnsetTrackingUrls ensures that no value is present for TrackingUrls, not even an explicit nil
### GetId

`func (o *TargetingTemplateGetResponseData) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *TargetingTemplateGetResponseData) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *TargetingTemplateGetResponseData) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *TargetingTemplateGetResponseData) HasId() bool`

HasId returns a boolean if a field has been set.

### GetCreatedTime

`func (o *TargetingTemplateGetResponseData) GetCreatedTime() int32`

GetCreatedTime returns the CreatedTime field if non-nil, zero value otherwise.

### GetCreatedTimeOk

`func (o *TargetingTemplateGetResponseData) GetCreatedTimeOk() (*int32, bool)`

GetCreatedTimeOk returns a tuple with the CreatedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedTime

`func (o *TargetingTemplateGetResponseData) SetCreatedTime(v int32)`

SetCreatedTime sets CreatedTime field to given value.

### HasCreatedTime

`func (o *TargetingTemplateGetResponseData) HasCreatedTime() bool`

HasCreatedTime returns a boolean if a field has been set.

### GetUpdatedTime

`func (o *TargetingTemplateGetResponseData) GetUpdatedTime() int32`

GetUpdatedTime returns the UpdatedTime field if non-nil, zero value otherwise.

### GetUpdatedTimeOk

`func (o *TargetingTemplateGetResponseData) GetUpdatedTimeOk() (*int32, bool)`

GetUpdatedTimeOk returns a tuple with the UpdatedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedTime

`func (o *TargetingTemplateGetResponseData) SetUpdatedTime(v int32)`

SetUpdatedTime sets UpdatedTime field to given value.

### HasUpdatedTime

`func (o *TargetingTemplateGetResponseData) HasUpdatedTime() bool`

HasUpdatedTime returns a boolean if a field has been set.

### GetAdAccountId

`func (o *TargetingTemplateGetResponseData) GetAdAccountId() string`

GetAdAccountId returns the AdAccountId field if non-nil, zero value otherwise.

### GetAdAccountIdOk

`func (o *TargetingTemplateGetResponseData) GetAdAccountIdOk() (*string, bool)`

GetAdAccountIdOk returns a tuple with the AdAccountId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdAccountId

`func (o *TargetingTemplateGetResponseData) SetAdAccountId(v string)`

SetAdAccountId sets AdAccountId field to given value.

### HasAdAccountId

`func (o *TargetingTemplateGetResponseData) HasAdAccountId() bool`

HasAdAccountId returns a boolean if a field has been set.

### GetStatus

`func (o *TargetingTemplateGetResponseData) GetStatus() string`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *TargetingTemplateGetResponseData) GetStatusOk() (*string, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *TargetingTemplateGetResponseData) SetStatus(v string)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *TargetingTemplateGetResponseData) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetSizing

`func (o *TargetingTemplateGetResponseData) GetSizing() TargetingTemplateAudienceSizing`

GetSizing returns the Sizing field if non-nil, zero value otherwise.

### GetSizingOk

`func (o *TargetingTemplateGetResponseData) GetSizingOk() (*TargetingTemplateAudienceSizing, bool)`

GetSizingOk returns a tuple with the Sizing field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSizing

`func (o *TargetingTemplateGetResponseData) SetSizing(v TargetingTemplateAudienceSizing)`

SetSizing sets Sizing field to given value.

### HasSizing

`func (o *TargetingTemplateGetResponseData) HasSizing() bool`

HasSizing returns a boolean if a field has been set.

### SetSizingNil

`func (o *TargetingTemplateGetResponseData) SetSizingNil(b bool)`

 SetSizingNil sets the value for Sizing to be an explicit nil

### UnsetSizing
`func (o *TargetingTemplateGetResponseData) UnsetSizing()`

UnsetSizing ensures that no value is present for Sizing, not even an explicit nil
### GetValid

`func (o *TargetingTemplateGetResponseData) GetValid() bool`

GetValid returns the Valid field if non-nil, zero value otherwise.

### GetValidOk

`func (o *TargetingTemplateGetResponseData) GetValidOk() (*bool, bool)`

GetValidOk returns a tuple with the Valid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValid

`func (o *TargetingTemplateGetResponseData) SetValid(v bool)`

SetValid sets Valid field to given value.

### HasValid

`func (o *TargetingTemplateGetResponseData) HasValid() bool`

HasValid returns a boolean if a field has been set.

### SetValidNil

`func (o *TargetingTemplateGetResponseData) SetValidNil(b bool)`

 SetValidNil sets the value for Valid to be an explicit nil

### UnsetValid
`func (o *TargetingTemplateGetResponseData) UnsetValid()`

UnsetValid ensures that no value is present for Valid, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


