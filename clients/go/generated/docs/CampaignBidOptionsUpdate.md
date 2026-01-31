# CampaignBidOptionsUpdate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AppTypeMultipliers** | Pointer to [**NullableAppTypeMultipliers**](AppTypeMultipliers.md) |  | [optional] 
**AudienceMultipliers** | Pointer to [**CampaignAudienceMultipliers**](CampaignAudienceMultipliers.md) |  | [optional] 
**PlacementMultipliers** | Pointer to [**NullablePlacementMultipliers**](PlacementMultipliers.md) |  | [optional] 
**UpdateMask** | **[]string** | List of fields to update, only the fields in the list will be updated. | 

## Methods

### NewCampaignBidOptionsUpdate

`func NewCampaignBidOptionsUpdate(updateMask []string, ) *CampaignBidOptionsUpdate`

NewCampaignBidOptionsUpdate instantiates a new CampaignBidOptionsUpdate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCampaignBidOptionsUpdateWithDefaults

`func NewCampaignBidOptionsUpdateWithDefaults() *CampaignBidOptionsUpdate`

NewCampaignBidOptionsUpdateWithDefaults instantiates a new CampaignBidOptionsUpdate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAppTypeMultipliers

`func (o *CampaignBidOptionsUpdate) GetAppTypeMultipliers() AppTypeMultipliers`

GetAppTypeMultipliers returns the AppTypeMultipliers field if non-nil, zero value otherwise.

### GetAppTypeMultipliersOk

`func (o *CampaignBidOptionsUpdate) GetAppTypeMultipliersOk() (*AppTypeMultipliers, bool)`

GetAppTypeMultipliersOk returns a tuple with the AppTypeMultipliers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAppTypeMultipliers

`func (o *CampaignBidOptionsUpdate) SetAppTypeMultipliers(v AppTypeMultipliers)`

SetAppTypeMultipliers sets AppTypeMultipliers field to given value.

### HasAppTypeMultipliers

`func (o *CampaignBidOptionsUpdate) HasAppTypeMultipliers() bool`

HasAppTypeMultipliers returns a boolean if a field has been set.

### SetAppTypeMultipliersNil

`func (o *CampaignBidOptionsUpdate) SetAppTypeMultipliersNil(b bool)`

 SetAppTypeMultipliersNil sets the value for AppTypeMultipliers to be an explicit nil

### UnsetAppTypeMultipliers
`func (o *CampaignBidOptionsUpdate) UnsetAppTypeMultipliers()`

UnsetAppTypeMultipliers ensures that no value is present for AppTypeMultipliers, not even an explicit nil
### GetAudienceMultipliers

`func (o *CampaignBidOptionsUpdate) GetAudienceMultipliers() CampaignAudienceMultipliers`

GetAudienceMultipliers returns the AudienceMultipliers field if non-nil, zero value otherwise.

### GetAudienceMultipliersOk

`func (o *CampaignBidOptionsUpdate) GetAudienceMultipliersOk() (*CampaignAudienceMultipliers, bool)`

GetAudienceMultipliersOk returns a tuple with the AudienceMultipliers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAudienceMultipliers

`func (o *CampaignBidOptionsUpdate) SetAudienceMultipliers(v CampaignAudienceMultipliers)`

SetAudienceMultipliers sets AudienceMultipliers field to given value.

### HasAudienceMultipliers

`func (o *CampaignBidOptionsUpdate) HasAudienceMultipliers() bool`

HasAudienceMultipliers returns a boolean if a field has been set.

### GetPlacementMultipliers

`func (o *CampaignBidOptionsUpdate) GetPlacementMultipliers() PlacementMultipliers`

GetPlacementMultipliers returns the PlacementMultipliers field if non-nil, zero value otherwise.

### GetPlacementMultipliersOk

`func (o *CampaignBidOptionsUpdate) GetPlacementMultipliersOk() (*PlacementMultipliers, bool)`

GetPlacementMultipliersOk returns a tuple with the PlacementMultipliers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlacementMultipliers

`func (o *CampaignBidOptionsUpdate) SetPlacementMultipliers(v PlacementMultipliers)`

SetPlacementMultipliers sets PlacementMultipliers field to given value.

### HasPlacementMultipliers

`func (o *CampaignBidOptionsUpdate) HasPlacementMultipliers() bool`

HasPlacementMultipliers returns a boolean if a field has been set.

### SetPlacementMultipliersNil

`func (o *CampaignBidOptionsUpdate) SetPlacementMultipliersNil(b bool)`

 SetPlacementMultipliersNil sets the value for PlacementMultipliers to be an explicit nil

### UnsetPlacementMultipliers
`func (o *CampaignBidOptionsUpdate) UnsetPlacementMultipliers()`

UnsetPlacementMultipliers ensures that no value is present for PlacementMultipliers, not even an explicit nil
### GetUpdateMask

`func (o *CampaignBidOptionsUpdate) GetUpdateMask() []string`

GetUpdateMask returns the UpdateMask field if non-nil, zero value otherwise.

### GetUpdateMaskOk

`func (o *CampaignBidOptionsUpdate) GetUpdateMaskOk() (*[]string, bool)`

GetUpdateMaskOk returns a tuple with the UpdateMask field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdateMask

`func (o *CampaignBidOptionsUpdate) SetUpdateMask(v []string)`

SetUpdateMask sets UpdateMask field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


