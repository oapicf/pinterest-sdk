# BusinessMemberAssetsSummary

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccounts** | Pointer to [**[]BusinessMemberAssetsSummaryAdAccountsInner**](BusinessMemberAssetsSummaryAdAccountsInner.md) | List of ad account IDs and respective permission levels. | [optional] 
**Profiles** | Pointer to [**[]BusinessMemberAssetsSummaryProfilesInner**](BusinessMemberAssetsSummaryProfilesInner.md) | List of profile IDs and respective permission levels. | [optional] 

## Methods

### NewBusinessMemberAssetsSummary

`func NewBusinessMemberAssetsSummary() *BusinessMemberAssetsSummary`

NewBusinessMemberAssetsSummary instantiates a new BusinessMemberAssetsSummary object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBusinessMemberAssetsSummaryWithDefaults

`func NewBusinessMemberAssetsSummaryWithDefaults() *BusinessMemberAssetsSummary`

NewBusinessMemberAssetsSummaryWithDefaults instantiates a new BusinessMemberAssetsSummary object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdAccounts

`func (o *BusinessMemberAssetsSummary) GetAdAccounts() []BusinessMemberAssetsSummaryAdAccountsInner`

GetAdAccounts returns the AdAccounts field if non-nil, zero value otherwise.

### GetAdAccountsOk

`func (o *BusinessMemberAssetsSummary) GetAdAccountsOk() (*[]BusinessMemberAssetsSummaryAdAccountsInner, bool)`

GetAdAccountsOk returns a tuple with the AdAccounts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdAccounts

`func (o *BusinessMemberAssetsSummary) SetAdAccounts(v []BusinessMemberAssetsSummaryAdAccountsInner)`

SetAdAccounts sets AdAccounts field to given value.

### HasAdAccounts

`func (o *BusinessMemberAssetsSummary) HasAdAccounts() bool`

HasAdAccounts returns a boolean if a field has been set.

### GetProfiles

`func (o *BusinessMemberAssetsSummary) GetProfiles() []BusinessMemberAssetsSummaryProfilesInner`

GetProfiles returns the Profiles field if non-nil, zero value otherwise.

### GetProfilesOk

`func (o *BusinessMemberAssetsSummary) GetProfilesOk() (*[]BusinessMemberAssetsSummaryProfilesInner, bool)`

GetProfilesOk returns a tuple with the Profiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProfiles

`func (o *BusinessMemberAssetsSummary) SetProfiles(v []BusinessMemberAssetsSummaryProfilesInner)`

SetProfiles sets Profiles field to given value.

### HasProfiles

`func (o *BusinessMemberAssetsSummary) HasProfiles() bool`

HasProfiles returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


