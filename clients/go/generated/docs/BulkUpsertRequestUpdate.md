# BulkUpsertRequestUpdate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Campaigns** | Pointer to [**[]CampaignUpdateRequest**](CampaignUpdateRequest.md) |  | [optional] 
**AdGroups** | Pointer to [**[]AdGroupUpdateRequest**](AdGroupUpdateRequest.md) |  | [optional] 
**Ads** | Pointer to [**[]AdUpdateRequest**](AdUpdateRequest.md) |  | [optional] 
**ProductGroups** | Pointer to [**[]ProductGroupPromotionUpdateRequest**](ProductGroupPromotionUpdateRequest.md) |  | [optional] 
**Keywords** | Pointer to [**[]KeywordUpdate**](KeywordUpdate.md) |  | [optional] 

## Methods

### NewBulkUpsertRequestUpdate

`func NewBulkUpsertRequestUpdate() *BulkUpsertRequestUpdate`

NewBulkUpsertRequestUpdate instantiates a new BulkUpsertRequestUpdate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBulkUpsertRequestUpdateWithDefaults

`func NewBulkUpsertRequestUpdateWithDefaults() *BulkUpsertRequestUpdate`

NewBulkUpsertRequestUpdateWithDefaults instantiates a new BulkUpsertRequestUpdate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCampaigns

`func (o *BulkUpsertRequestUpdate) GetCampaigns() []CampaignUpdateRequest`

GetCampaigns returns the Campaigns field if non-nil, zero value otherwise.

### GetCampaignsOk

`func (o *BulkUpsertRequestUpdate) GetCampaignsOk() (*[]CampaignUpdateRequest, bool)`

GetCampaignsOk returns a tuple with the Campaigns field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCampaigns

`func (o *BulkUpsertRequestUpdate) SetCampaigns(v []CampaignUpdateRequest)`

SetCampaigns sets Campaigns field to given value.

### HasCampaigns

`func (o *BulkUpsertRequestUpdate) HasCampaigns() bool`

HasCampaigns returns a boolean if a field has been set.

### GetAdGroups

`func (o *BulkUpsertRequestUpdate) GetAdGroups() []AdGroupUpdateRequest`

GetAdGroups returns the AdGroups field if non-nil, zero value otherwise.

### GetAdGroupsOk

`func (o *BulkUpsertRequestUpdate) GetAdGroupsOk() (*[]AdGroupUpdateRequest, bool)`

GetAdGroupsOk returns a tuple with the AdGroups field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdGroups

`func (o *BulkUpsertRequestUpdate) SetAdGroups(v []AdGroupUpdateRequest)`

SetAdGroups sets AdGroups field to given value.

### HasAdGroups

`func (o *BulkUpsertRequestUpdate) HasAdGroups() bool`

HasAdGroups returns a boolean if a field has been set.

### GetAds

`func (o *BulkUpsertRequestUpdate) GetAds() []AdUpdateRequest`

GetAds returns the Ads field if non-nil, zero value otherwise.

### GetAdsOk

`func (o *BulkUpsertRequestUpdate) GetAdsOk() (*[]AdUpdateRequest, bool)`

GetAdsOk returns a tuple with the Ads field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAds

`func (o *BulkUpsertRequestUpdate) SetAds(v []AdUpdateRequest)`

SetAds sets Ads field to given value.

### HasAds

`func (o *BulkUpsertRequestUpdate) HasAds() bool`

HasAds returns a boolean if a field has been set.

### GetProductGroups

`func (o *BulkUpsertRequestUpdate) GetProductGroups() []ProductGroupPromotionUpdateRequest`

GetProductGroups returns the ProductGroups field if non-nil, zero value otherwise.

### GetProductGroupsOk

`func (o *BulkUpsertRequestUpdate) GetProductGroupsOk() (*[]ProductGroupPromotionUpdateRequest, bool)`

GetProductGroupsOk returns a tuple with the ProductGroups field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProductGroups

`func (o *BulkUpsertRequestUpdate) SetProductGroups(v []ProductGroupPromotionUpdateRequest)`

SetProductGroups sets ProductGroups field to given value.

### HasProductGroups

`func (o *BulkUpsertRequestUpdate) HasProductGroups() bool`

HasProductGroups returns a boolean if a field has been set.

### GetKeywords

`func (o *BulkUpsertRequestUpdate) GetKeywords() []KeywordUpdate`

GetKeywords returns the Keywords field if non-nil, zero value otherwise.

### GetKeywordsOk

`func (o *BulkUpsertRequestUpdate) GetKeywordsOk() (*[]KeywordUpdate, bool)`

GetKeywordsOk returns a tuple with the Keywords field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKeywords

`func (o *BulkUpsertRequestUpdate) SetKeywords(v []KeywordUpdate)`

SetKeywords sets Keywords field to given value.

### HasKeywords

`func (o *BulkUpsertRequestUpdate) HasKeywords() bool`

HasKeywords returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


