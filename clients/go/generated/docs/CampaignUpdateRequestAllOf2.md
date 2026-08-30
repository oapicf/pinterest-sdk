# CampaignUpdateRequestAllOf2

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BidOptions** | Pointer to [**NullableCampaignBidOptionsUpdate**](CampaignBidOptionsUpdate.md) |  | [optional] 
**IntendedPromotionType** | Pointer to [**IntendedPromotionType**](IntendedPromotionType.md) |  | [optional] 
**IsLtvOptimized** | Pointer to **bool** | Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers. | [optional] 
**IsPerformancePlus** | Pointer to **bool** | Enable Pinterest Performance+ for your campaign. To learn more, see &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\&quot;&gt;Pinterest Performance+ Setup&lt;/a&gt;. This field is immutable, except only for campaigns in draft status which may update this field. | [optional] 
**IsTopOfSearch** | Pointer to **bool** | Enable Top Of Search for your campaign. This field is immutable, except only for campaigns in draft status which may update this field. | [optional] 
**ObjectiveType** | Pointer to [**NullableObjectiveType**](ObjectiveType.md) |  | [optional] 

## Methods

### NewCampaignUpdateRequestAllOf2

`func NewCampaignUpdateRequestAllOf2() *CampaignUpdateRequestAllOf2`

NewCampaignUpdateRequestAllOf2 instantiates a new CampaignUpdateRequestAllOf2 object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCampaignUpdateRequestAllOf2WithDefaults

`func NewCampaignUpdateRequestAllOf2WithDefaults() *CampaignUpdateRequestAllOf2`

NewCampaignUpdateRequestAllOf2WithDefaults instantiates a new CampaignUpdateRequestAllOf2 object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBidOptions

`func (o *CampaignUpdateRequestAllOf2) GetBidOptions() CampaignBidOptionsUpdate`

GetBidOptions returns the BidOptions field if non-nil, zero value otherwise.

### GetBidOptionsOk

`func (o *CampaignUpdateRequestAllOf2) GetBidOptionsOk() (*CampaignBidOptionsUpdate, bool)`

GetBidOptionsOk returns a tuple with the BidOptions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBidOptions

`func (o *CampaignUpdateRequestAllOf2) SetBidOptions(v CampaignBidOptionsUpdate)`

SetBidOptions sets BidOptions field to given value.

### HasBidOptions

`func (o *CampaignUpdateRequestAllOf2) HasBidOptions() bool`

HasBidOptions returns a boolean if a field has been set.

### SetBidOptionsNil

`func (o *CampaignUpdateRequestAllOf2) SetBidOptionsNil(b bool)`

 SetBidOptionsNil sets the value for BidOptions to be an explicit nil

### UnsetBidOptions
`func (o *CampaignUpdateRequestAllOf2) UnsetBidOptions()`

UnsetBidOptions ensures that no value is present for BidOptions, not even an explicit nil
### GetIntendedPromotionType

`func (o *CampaignUpdateRequestAllOf2) GetIntendedPromotionType() IntendedPromotionType`

GetIntendedPromotionType returns the IntendedPromotionType field if non-nil, zero value otherwise.

### GetIntendedPromotionTypeOk

`func (o *CampaignUpdateRequestAllOf2) GetIntendedPromotionTypeOk() (*IntendedPromotionType, bool)`

GetIntendedPromotionTypeOk returns a tuple with the IntendedPromotionType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntendedPromotionType

`func (o *CampaignUpdateRequestAllOf2) SetIntendedPromotionType(v IntendedPromotionType)`

SetIntendedPromotionType sets IntendedPromotionType field to given value.

### HasIntendedPromotionType

`func (o *CampaignUpdateRequestAllOf2) HasIntendedPromotionType() bool`

HasIntendedPromotionType returns a boolean if a field has been set.

### GetIsLtvOptimized

`func (o *CampaignUpdateRequestAllOf2) GetIsLtvOptimized() bool`

GetIsLtvOptimized returns the IsLtvOptimized field if non-nil, zero value otherwise.

### GetIsLtvOptimizedOk

`func (o *CampaignUpdateRequestAllOf2) GetIsLtvOptimizedOk() (*bool, bool)`

GetIsLtvOptimizedOk returns a tuple with the IsLtvOptimized field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsLtvOptimized

`func (o *CampaignUpdateRequestAllOf2) SetIsLtvOptimized(v bool)`

SetIsLtvOptimized sets IsLtvOptimized field to given value.

### HasIsLtvOptimized

`func (o *CampaignUpdateRequestAllOf2) HasIsLtvOptimized() bool`

HasIsLtvOptimized returns a boolean if a field has been set.

### GetIsPerformancePlus

`func (o *CampaignUpdateRequestAllOf2) GetIsPerformancePlus() bool`

GetIsPerformancePlus returns the IsPerformancePlus field if non-nil, zero value otherwise.

### GetIsPerformancePlusOk

`func (o *CampaignUpdateRequestAllOf2) GetIsPerformancePlusOk() (*bool, bool)`

GetIsPerformancePlusOk returns a tuple with the IsPerformancePlus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsPerformancePlus

`func (o *CampaignUpdateRequestAllOf2) SetIsPerformancePlus(v bool)`

SetIsPerformancePlus sets IsPerformancePlus field to given value.

### HasIsPerformancePlus

`func (o *CampaignUpdateRequestAllOf2) HasIsPerformancePlus() bool`

HasIsPerformancePlus returns a boolean if a field has been set.

### GetIsTopOfSearch

`func (o *CampaignUpdateRequestAllOf2) GetIsTopOfSearch() bool`

GetIsTopOfSearch returns the IsTopOfSearch field if non-nil, zero value otherwise.

### GetIsTopOfSearchOk

`func (o *CampaignUpdateRequestAllOf2) GetIsTopOfSearchOk() (*bool, bool)`

GetIsTopOfSearchOk returns a tuple with the IsTopOfSearch field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsTopOfSearch

`func (o *CampaignUpdateRequestAllOf2) SetIsTopOfSearch(v bool)`

SetIsTopOfSearch sets IsTopOfSearch field to given value.

### HasIsTopOfSearch

`func (o *CampaignUpdateRequestAllOf2) HasIsTopOfSearch() bool`

HasIsTopOfSearch returns a boolean if a field has been set.

### GetObjectiveType

`func (o *CampaignUpdateRequestAllOf2) GetObjectiveType() ObjectiveType`

GetObjectiveType returns the ObjectiveType field if non-nil, zero value otherwise.

### GetObjectiveTypeOk

`func (o *CampaignUpdateRequestAllOf2) GetObjectiveTypeOk() (*ObjectiveType, bool)`

GetObjectiveTypeOk returns a tuple with the ObjectiveType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObjectiveType

`func (o *CampaignUpdateRequestAllOf2) SetObjectiveType(v ObjectiveType)`

SetObjectiveType sets ObjectiveType field to given value.

### HasObjectiveType

`func (o *CampaignUpdateRequestAllOf2) HasObjectiveType() bool`

HasObjectiveType returns a boolean if a field has been set.

### SetObjectiveTypeNil

`func (o *CampaignUpdateRequestAllOf2) SetObjectiveTypeNil(b bool)`

 SetObjectiveTypeNil sets the value for ObjectiveType to be an explicit nil

### UnsetObjectiveType
`func (o *CampaignUpdateRequestAllOf2) UnsetObjectiveType()`

UnsetObjectiveType ensures that no value is present for ObjectiveType, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


