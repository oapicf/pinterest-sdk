# BulkUpsertRequestCreate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Campaigns** | Pointer to [**[]CampaignCreateRequest**](CampaignCreateRequest.md) |  | [optional] 
**AdGroups** | Pointer to [**[]AdGroupCreateRequest**](AdGroupCreateRequest.md) |  | [optional] 
**Ads** | Pointer to [**[]AdCreateRequest**](AdCreateRequest.md) |  | [optional] 
**ProductGroups** | Pointer to [**[]ProductGroupPromotionCreateRequest**](ProductGroupPromotionCreateRequest.md) |  | [optional] 
**Keywords** | Pointer to [**[]KeywordsRequest**](KeywordsRequest.md) |  | [optional] 

## Methods

### NewBulkUpsertRequestCreate

`func NewBulkUpsertRequestCreate() *BulkUpsertRequestCreate`

NewBulkUpsertRequestCreate instantiates a new BulkUpsertRequestCreate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBulkUpsertRequestCreateWithDefaults

`func NewBulkUpsertRequestCreateWithDefaults() *BulkUpsertRequestCreate`

NewBulkUpsertRequestCreateWithDefaults instantiates a new BulkUpsertRequestCreate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCampaigns

`func (o *BulkUpsertRequestCreate) GetCampaigns() []CampaignCreateRequest`

GetCampaigns returns the Campaigns field if non-nil, zero value otherwise.

### GetCampaignsOk

`func (o *BulkUpsertRequestCreate) GetCampaignsOk() (*[]CampaignCreateRequest, bool)`

GetCampaignsOk returns a tuple with the Campaigns field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCampaigns

`func (o *BulkUpsertRequestCreate) SetCampaigns(v []CampaignCreateRequest)`

SetCampaigns sets Campaigns field to given value.

### HasCampaigns

`func (o *BulkUpsertRequestCreate) HasCampaigns() bool`

HasCampaigns returns a boolean if a field has been set.

### GetAdGroups

`func (o *BulkUpsertRequestCreate) GetAdGroups() []AdGroupCreateRequest`

GetAdGroups returns the AdGroups field if non-nil, zero value otherwise.

### GetAdGroupsOk

`func (o *BulkUpsertRequestCreate) GetAdGroupsOk() (*[]AdGroupCreateRequest, bool)`

GetAdGroupsOk returns a tuple with the AdGroups field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdGroups

`func (o *BulkUpsertRequestCreate) SetAdGroups(v []AdGroupCreateRequest)`

SetAdGroups sets AdGroups field to given value.

### HasAdGroups

`func (o *BulkUpsertRequestCreate) HasAdGroups() bool`

HasAdGroups returns a boolean if a field has been set.

### GetAds

`func (o *BulkUpsertRequestCreate) GetAds() []AdCreateRequest`

GetAds returns the Ads field if non-nil, zero value otherwise.

### GetAdsOk

`func (o *BulkUpsertRequestCreate) GetAdsOk() (*[]AdCreateRequest, bool)`

GetAdsOk returns a tuple with the Ads field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAds

`func (o *BulkUpsertRequestCreate) SetAds(v []AdCreateRequest)`

SetAds sets Ads field to given value.

### HasAds

`func (o *BulkUpsertRequestCreate) HasAds() bool`

HasAds returns a boolean if a field has been set.

### GetProductGroups

`func (o *BulkUpsertRequestCreate) GetProductGroups() []ProductGroupPromotionCreateRequest`

GetProductGroups returns the ProductGroups field if non-nil, zero value otherwise.

### GetProductGroupsOk

`func (o *BulkUpsertRequestCreate) GetProductGroupsOk() (*[]ProductGroupPromotionCreateRequest, bool)`

GetProductGroupsOk returns a tuple with the ProductGroups field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProductGroups

`func (o *BulkUpsertRequestCreate) SetProductGroups(v []ProductGroupPromotionCreateRequest)`

SetProductGroups sets ProductGroups field to given value.

### HasProductGroups

`func (o *BulkUpsertRequestCreate) HasProductGroups() bool`

HasProductGroups returns a boolean if a field has been set.

### GetKeywords

`func (o *BulkUpsertRequestCreate) GetKeywords() []KeywordsRequest`

GetKeywords returns the Keywords field if non-nil, zero value otherwise.

### GetKeywordsOk

`func (o *BulkUpsertRequestCreate) GetKeywordsOk() (*[]KeywordsRequest, bool)`

GetKeywordsOk returns a tuple with the Keywords field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKeywords

`func (o *BulkUpsertRequestCreate) SetKeywords(v []KeywordsRequest)`

SetKeywords sets Keywords field to given value.

### HasKeywords

`func (o *BulkUpsertRequestCreate) HasKeywords() bool`

HasKeywords returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


