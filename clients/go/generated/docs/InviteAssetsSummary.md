# InviteAssetsSummary

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccounts** | Pointer to [**[]InviteAssetsSummaryAdAccountsInner**](InviteAssetsSummaryAdAccountsInner.md) | List of ad account IDs and respective permission levels that will be assigned. | [optional] 
**Profiles** | Pointer to [**[]InviteAssetsSummaryProfilesInner**](InviteAssetsSummaryProfilesInner.md) | List of profile IDs and respective permission levels that will be assigned. | [optional] 

## Methods

### NewInviteAssetsSummary

`func NewInviteAssetsSummary() *InviteAssetsSummary`

NewInviteAssetsSummary instantiates a new InviteAssetsSummary object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewInviteAssetsSummaryWithDefaults

`func NewInviteAssetsSummaryWithDefaults() *InviteAssetsSummary`

NewInviteAssetsSummaryWithDefaults instantiates a new InviteAssetsSummary object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdAccounts

`func (o *InviteAssetsSummary) GetAdAccounts() []InviteAssetsSummaryAdAccountsInner`

GetAdAccounts returns the AdAccounts field if non-nil, zero value otherwise.

### GetAdAccountsOk

`func (o *InviteAssetsSummary) GetAdAccountsOk() (*[]InviteAssetsSummaryAdAccountsInner, bool)`

GetAdAccountsOk returns a tuple with the AdAccounts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdAccounts

`func (o *InviteAssetsSummary) SetAdAccounts(v []InviteAssetsSummaryAdAccountsInner)`

SetAdAccounts sets AdAccounts field to given value.

### HasAdAccounts

`func (o *InviteAssetsSummary) HasAdAccounts() bool`

HasAdAccounts returns a boolean if a field has been set.

### GetProfiles

`func (o *InviteAssetsSummary) GetProfiles() []InviteAssetsSummaryProfilesInner`

GetProfiles returns the Profiles field if non-nil, zero value otherwise.

### GetProfilesOk

`func (o *InviteAssetsSummary) GetProfilesOk() (*[]InviteAssetsSummaryProfilesInner, bool)`

GetProfilesOk returns a tuple with the Profiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProfiles

`func (o *InviteAssetsSummary) SetProfiles(v []InviteAssetsSummaryProfilesInner)`

SetProfiles sets Profiles field to given value.

### HasProfiles

`func (o *InviteAssetsSummary) HasProfiles() bool`

HasProfiles returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


