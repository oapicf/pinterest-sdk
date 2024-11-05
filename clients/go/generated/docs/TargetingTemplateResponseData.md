# TargetingTemplateResponseData

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

## Methods

### NewTargetingTemplateResponseData

`func NewTargetingTemplateResponseData() *TargetingTemplateResponseData`

NewTargetingTemplateResponseData instantiates a new TargetingTemplateResponseData object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTargetingTemplateResponseDataWithDefaults

`func NewTargetingTemplateResponseDataWithDefaults() *TargetingTemplateResponseData`

NewTargetingTemplateResponseDataWithDefaults instantiates a new TargetingTemplateResponseData object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *TargetingTemplateResponseData) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *TargetingTemplateResponseData) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *TargetingTemplateResponseData) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *TargetingTemplateResponseData) HasName() bool`

HasName returns a boolean if a field has been set.

### GetAutoTargetingEnabled

`func (o *TargetingTemplateResponseData) GetAutoTargetingEnabled() bool`

GetAutoTargetingEnabled returns the AutoTargetingEnabled field if non-nil, zero value otherwise.

### GetAutoTargetingEnabledOk

`func (o *TargetingTemplateResponseData) GetAutoTargetingEnabledOk() (*bool, bool)`

GetAutoTargetingEnabledOk returns a tuple with the AutoTargetingEnabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAutoTargetingEnabled

`func (o *TargetingTemplateResponseData) SetAutoTargetingEnabled(v bool)`

SetAutoTargetingEnabled sets AutoTargetingEnabled field to given value.

### HasAutoTargetingEnabled

`func (o *TargetingTemplateResponseData) HasAutoTargetingEnabled() bool`

HasAutoTargetingEnabled returns a boolean if a field has been set.

### GetTargetingAttributes

`func (o *TargetingTemplateResponseData) GetTargetingAttributes() TargetingSpec`

GetTargetingAttributes returns the TargetingAttributes field if non-nil, zero value otherwise.

### GetTargetingAttributesOk

`func (o *TargetingTemplateResponseData) GetTargetingAttributesOk() (*TargetingSpec, bool)`

GetTargetingAttributesOk returns a tuple with the TargetingAttributes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTargetingAttributes

`func (o *TargetingTemplateResponseData) SetTargetingAttributes(v TargetingSpec)`

SetTargetingAttributes sets TargetingAttributes field to given value.

### HasTargetingAttributes

`func (o *TargetingTemplateResponseData) HasTargetingAttributes() bool`

HasTargetingAttributes returns a boolean if a field has been set.

### GetPlacementGroup

`func (o *TargetingTemplateResponseData) GetPlacementGroup() PlacementGroupType`

GetPlacementGroup returns the PlacementGroup field if non-nil, zero value otherwise.

### GetPlacementGroupOk

`func (o *TargetingTemplateResponseData) GetPlacementGroupOk() (*PlacementGroupType, bool)`

GetPlacementGroupOk returns a tuple with the PlacementGroup field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlacementGroup

`func (o *TargetingTemplateResponseData) SetPlacementGroup(v PlacementGroupType)`

SetPlacementGroup sets PlacementGroup field to given value.

### HasPlacementGroup

`func (o *TargetingTemplateResponseData) HasPlacementGroup() bool`

HasPlacementGroup returns a boolean if a field has been set.

### GetKeywords

`func (o *TargetingTemplateResponseData) GetKeywords() []TargetingTemplateKeyword`

GetKeywords returns the Keywords field if non-nil, zero value otherwise.

### GetKeywordsOk

`func (o *TargetingTemplateResponseData) GetKeywordsOk() (*[]TargetingTemplateKeyword, bool)`

GetKeywordsOk returns a tuple with the Keywords field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKeywords

`func (o *TargetingTemplateResponseData) SetKeywords(v []TargetingTemplateKeyword)`

SetKeywords sets Keywords field to given value.

### HasKeywords

`func (o *TargetingTemplateResponseData) HasKeywords() bool`

HasKeywords returns a boolean if a field has been set.

### GetTrackingUrls

`func (o *TargetingTemplateResponseData) GetTrackingUrls() TrackingUrls`

GetTrackingUrls returns the TrackingUrls field if non-nil, zero value otherwise.

### GetTrackingUrlsOk

`func (o *TargetingTemplateResponseData) GetTrackingUrlsOk() (*TrackingUrls, bool)`

GetTrackingUrlsOk returns a tuple with the TrackingUrls field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTrackingUrls

`func (o *TargetingTemplateResponseData) SetTrackingUrls(v TrackingUrls)`

SetTrackingUrls sets TrackingUrls field to given value.

### HasTrackingUrls

`func (o *TargetingTemplateResponseData) HasTrackingUrls() bool`

HasTrackingUrls returns a boolean if a field has been set.

### SetTrackingUrlsNil

`func (o *TargetingTemplateResponseData) SetTrackingUrlsNil(b bool)`

 SetTrackingUrlsNil sets the value for TrackingUrls to be an explicit nil

### UnsetTrackingUrls
`func (o *TargetingTemplateResponseData) UnsetTrackingUrls()`

UnsetTrackingUrls ensures that no value is present for TrackingUrls, not even an explicit nil
### GetId

`func (o *TargetingTemplateResponseData) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *TargetingTemplateResponseData) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *TargetingTemplateResponseData) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *TargetingTemplateResponseData) HasId() bool`

HasId returns a boolean if a field has been set.

### GetCreatedTime

`func (o *TargetingTemplateResponseData) GetCreatedTime() int32`

GetCreatedTime returns the CreatedTime field if non-nil, zero value otherwise.

### GetCreatedTimeOk

`func (o *TargetingTemplateResponseData) GetCreatedTimeOk() (*int32, bool)`

GetCreatedTimeOk returns a tuple with the CreatedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedTime

`func (o *TargetingTemplateResponseData) SetCreatedTime(v int32)`

SetCreatedTime sets CreatedTime field to given value.

### HasCreatedTime

`func (o *TargetingTemplateResponseData) HasCreatedTime() bool`

HasCreatedTime returns a boolean if a field has been set.

### GetUpdatedTime

`func (o *TargetingTemplateResponseData) GetUpdatedTime() int32`

GetUpdatedTime returns the UpdatedTime field if non-nil, zero value otherwise.

### GetUpdatedTimeOk

`func (o *TargetingTemplateResponseData) GetUpdatedTimeOk() (*int32, bool)`

GetUpdatedTimeOk returns a tuple with the UpdatedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedTime

`func (o *TargetingTemplateResponseData) SetUpdatedTime(v int32)`

SetUpdatedTime sets UpdatedTime field to given value.

### HasUpdatedTime

`func (o *TargetingTemplateResponseData) HasUpdatedTime() bool`

HasUpdatedTime returns a boolean if a field has been set.

### GetAdAccountId

`func (o *TargetingTemplateResponseData) GetAdAccountId() string`

GetAdAccountId returns the AdAccountId field if non-nil, zero value otherwise.

### GetAdAccountIdOk

`func (o *TargetingTemplateResponseData) GetAdAccountIdOk() (*string, bool)`

GetAdAccountIdOk returns a tuple with the AdAccountId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdAccountId

`func (o *TargetingTemplateResponseData) SetAdAccountId(v string)`

SetAdAccountId sets AdAccountId field to given value.

### HasAdAccountId

`func (o *TargetingTemplateResponseData) HasAdAccountId() bool`

HasAdAccountId returns a boolean if a field has been set.

### GetStatus

`func (o *TargetingTemplateResponseData) GetStatus() string`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *TargetingTemplateResponseData) GetStatusOk() (*string, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *TargetingTemplateResponseData) SetStatus(v string)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *TargetingTemplateResponseData) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetSizing

`func (o *TargetingTemplateResponseData) GetSizing() TargetingTemplateAudienceSizing`

GetSizing returns the Sizing field if non-nil, zero value otherwise.

### GetSizingOk

`func (o *TargetingTemplateResponseData) GetSizingOk() (*TargetingTemplateAudienceSizing, bool)`

GetSizingOk returns a tuple with the Sizing field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSizing

`func (o *TargetingTemplateResponseData) SetSizing(v TargetingTemplateAudienceSizing)`

SetSizing sets Sizing field to given value.

### HasSizing

`func (o *TargetingTemplateResponseData) HasSizing() bool`

HasSizing returns a boolean if a field has been set.

### SetSizingNil

`func (o *TargetingTemplateResponseData) SetSizingNil(b bool)`

 SetSizingNil sets the value for Sizing to be an explicit nil

### UnsetSizing
`func (o *TargetingTemplateResponseData) UnsetSizing()`

UnsetSizing ensures that no value is present for Sizing, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


