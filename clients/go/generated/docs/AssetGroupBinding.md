# AssetGroupBinding

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **string** | Asset Group ID. | [optional] 
**AssetGroupName** | Pointer to **NullableString** | Asset Group name | [optional] 
**AssetGroupDescription** | Pointer to **NullableString** | Asset group description | [optional] 
**AssetGroupTypes** | Pointer to **[]string** | Asset group types | [optional] 
**AdAccountsIds** | Pointer to **[]string** | A list of ad account IDs under the asset group | [optional] 
**ProfilesIds** | Pointer to **[]string** | A list of profile IDs under asset group | [optional] 
**CreatedTime** | Pointer to **NullableInt32** | The creation time of the asset group | [optional] 
**UpdatedTime** | Pointer to **NullableInt32** | The last update time of the asset group | [optional] 
**Owner** | Pointer to [**NullableBusinessAccessUserSummary**](BusinessAccessUserSummary.md) | The data of the business that owns the asset group. | [optional] 
**CreatedBy** | Pointer to [**NullableBusinessAccessUserSummary**](BusinessAccessUserSummary.md) | The data of the user that created the asset group. | [optional] 

## Methods

### NewAssetGroupBinding

`func NewAssetGroupBinding() *AssetGroupBinding`

NewAssetGroupBinding instantiates a new AssetGroupBinding object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAssetGroupBindingWithDefaults

`func NewAssetGroupBindingWithDefaults() *AssetGroupBinding`

NewAssetGroupBindingWithDefaults instantiates a new AssetGroupBinding object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *AssetGroupBinding) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *AssetGroupBinding) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *AssetGroupBinding) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *AssetGroupBinding) HasId() bool`

HasId returns a boolean if a field has been set.

### GetAssetGroupName

`func (o *AssetGroupBinding) GetAssetGroupName() string`

GetAssetGroupName returns the AssetGroupName field if non-nil, zero value otherwise.

### GetAssetGroupNameOk

`func (o *AssetGroupBinding) GetAssetGroupNameOk() (*string, bool)`

GetAssetGroupNameOk returns a tuple with the AssetGroupName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssetGroupName

`func (o *AssetGroupBinding) SetAssetGroupName(v string)`

SetAssetGroupName sets AssetGroupName field to given value.

### HasAssetGroupName

`func (o *AssetGroupBinding) HasAssetGroupName() bool`

HasAssetGroupName returns a boolean if a field has been set.

### SetAssetGroupNameNil

`func (o *AssetGroupBinding) SetAssetGroupNameNil(b bool)`

 SetAssetGroupNameNil sets the value for AssetGroupName to be an explicit nil

### UnsetAssetGroupName
`func (o *AssetGroupBinding) UnsetAssetGroupName()`

UnsetAssetGroupName ensures that no value is present for AssetGroupName, not even an explicit nil
### GetAssetGroupDescription

`func (o *AssetGroupBinding) GetAssetGroupDescription() string`

GetAssetGroupDescription returns the AssetGroupDescription field if non-nil, zero value otherwise.

### GetAssetGroupDescriptionOk

`func (o *AssetGroupBinding) GetAssetGroupDescriptionOk() (*string, bool)`

GetAssetGroupDescriptionOk returns a tuple with the AssetGroupDescription field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssetGroupDescription

`func (o *AssetGroupBinding) SetAssetGroupDescription(v string)`

SetAssetGroupDescription sets AssetGroupDescription field to given value.

### HasAssetGroupDescription

`func (o *AssetGroupBinding) HasAssetGroupDescription() bool`

HasAssetGroupDescription returns a boolean if a field has been set.

### SetAssetGroupDescriptionNil

`func (o *AssetGroupBinding) SetAssetGroupDescriptionNil(b bool)`

 SetAssetGroupDescriptionNil sets the value for AssetGroupDescription to be an explicit nil

### UnsetAssetGroupDescription
`func (o *AssetGroupBinding) UnsetAssetGroupDescription()`

UnsetAssetGroupDescription ensures that no value is present for AssetGroupDescription, not even an explicit nil
### GetAssetGroupTypes

`func (o *AssetGroupBinding) GetAssetGroupTypes() []string`

GetAssetGroupTypes returns the AssetGroupTypes field if non-nil, zero value otherwise.

### GetAssetGroupTypesOk

`func (o *AssetGroupBinding) GetAssetGroupTypesOk() (*[]string, bool)`

GetAssetGroupTypesOk returns a tuple with the AssetGroupTypes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssetGroupTypes

`func (o *AssetGroupBinding) SetAssetGroupTypes(v []string)`

SetAssetGroupTypes sets AssetGroupTypes field to given value.

### HasAssetGroupTypes

`func (o *AssetGroupBinding) HasAssetGroupTypes() bool`

HasAssetGroupTypes returns a boolean if a field has been set.

### GetAdAccountsIds

`func (o *AssetGroupBinding) GetAdAccountsIds() []string`

GetAdAccountsIds returns the AdAccountsIds field if non-nil, zero value otherwise.

### GetAdAccountsIdsOk

`func (o *AssetGroupBinding) GetAdAccountsIdsOk() (*[]string, bool)`

GetAdAccountsIdsOk returns a tuple with the AdAccountsIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdAccountsIds

`func (o *AssetGroupBinding) SetAdAccountsIds(v []string)`

SetAdAccountsIds sets AdAccountsIds field to given value.

### HasAdAccountsIds

`func (o *AssetGroupBinding) HasAdAccountsIds() bool`

HasAdAccountsIds returns a boolean if a field has been set.

### SetAdAccountsIdsNil

`func (o *AssetGroupBinding) SetAdAccountsIdsNil(b bool)`

 SetAdAccountsIdsNil sets the value for AdAccountsIds to be an explicit nil

### UnsetAdAccountsIds
`func (o *AssetGroupBinding) UnsetAdAccountsIds()`

UnsetAdAccountsIds ensures that no value is present for AdAccountsIds, not even an explicit nil
### GetProfilesIds

`func (o *AssetGroupBinding) GetProfilesIds() []string`

GetProfilesIds returns the ProfilesIds field if non-nil, zero value otherwise.

### GetProfilesIdsOk

`func (o *AssetGroupBinding) GetProfilesIdsOk() (*[]string, bool)`

GetProfilesIdsOk returns a tuple with the ProfilesIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProfilesIds

`func (o *AssetGroupBinding) SetProfilesIds(v []string)`

SetProfilesIds sets ProfilesIds field to given value.

### HasProfilesIds

`func (o *AssetGroupBinding) HasProfilesIds() bool`

HasProfilesIds returns a boolean if a field has been set.

### SetProfilesIdsNil

`func (o *AssetGroupBinding) SetProfilesIdsNil(b bool)`

 SetProfilesIdsNil sets the value for ProfilesIds to be an explicit nil

### UnsetProfilesIds
`func (o *AssetGroupBinding) UnsetProfilesIds()`

UnsetProfilesIds ensures that no value is present for ProfilesIds, not even an explicit nil
### GetCreatedTime

`func (o *AssetGroupBinding) GetCreatedTime() int32`

GetCreatedTime returns the CreatedTime field if non-nil, zero value otherwise.

### GetCreatedTimeOk

`func (o *AssetGroupBinding) GetCreatedTimeOk() (*int32, bool)`

GetCreatedTimeOk returns a tuple with the CreatedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedTime

`func (o *AssetGroupBinding) SetCreatedTime(v int32)`

SetCreatedTime sets CreatedTime field to given value.

### HasCreatedTime

`func (o *AssetGroupBinding) HasCreatedTime() bool`

HasCreatedTime returns a boolean if a field has been set.

### SetCreatedTimeNil

`func (o *AssetGroupBinding) SetCreatedTimeNil(b bool)`

 SetCreatedTimeNil sets the value for CreatedTime to be an explicit nil

### UnsetCreatedTime
`func (o *AssetGroupBinding) UnsetCreatedTime()`

UnsetCreatedTime ensures that no value is present for CreatedTime, not even an explicit nil
### GetUpdatedTime

`func (o *AssetGroupBinding) GetUpdatedTime() int32`

GetUpdatedTime returns the UpdatedTime field if non-nil, zero value otherwise.

### GetUpdatedTimeOk

`func (o *AssetGroupBinding) GetUpdatedTimeOk() (*int32, bool)`

GetUpdatedTimeOk returns a tuple with the UpdatedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedTime

`func (o *AssetGroupBinding) SetUpdatedTime(v int32)`

SetUpdatedTime sets UpdatedTime field to given value.

### HasUpdatedTime

`func (o *AssetGroupBinding) HasUpdatedTime() bool`

HasUpdatedTime returns a boolean if a field has been set.

### SetUpdatedTimeNil

`func (o *AssetGroupBinding) SetUpdatedTimeNil(b bool)`

 SetUpdatedTimeNil sets the value for UpdatedTime to be an explicit nil

### UnsetUpdatedTime
`func (o *AssetGroupBinding) UnsetUpdatedTime()`

UnsetUpdatedTime ensures that no value is present for UpdatedTime, not even an explicit nil
### GetOwner

`func (o *AssetGroupBinding) GetOwner() BusinessAccessUserSummary`

GetOwner returns the Owner field if non-nil, zero value otherwise.

### GetOwnerOk

`func (o *AssetGroupBinding) GetOwnerOk() (*BusinessAccessUserSummary, bool)`

GetOwnerOk returns a tuple with the Owner field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOwner

`func (o *AssetGroupBinding) SetOwner(v BusinessAccessUserSummary)`

SetOwner sets Owner field to given value.

### HasOwner

`func (o *AssetGroupBinding) HasOwner() bool`

HasOwner returns a boolean if a field has been set.

### SetOwnerNil

`func (o *AssetGroupBinding) SetOwnerNil(b bool)`

 SetOwnerNil sets the value for Owner to be an explicit nil

### UnsetOwner
`func (o *AssetGroupBinding) UnsetOwner()`

UnsetOwner ensures that no value is present for Owner, not even an explicit nil
### GetCreatedBy

`func (o *AssetGroupBinding) GetCreatedBy() BusinessAccessUserSummary`

GetCreatedBy returns the CreatedBy field if non-nil, zero value otherwise.

### GetCreatedByOk

`func (o *AssetGroupBinding) GetCreatedByOk() (*BusinessAccessUserSummary, bool)`

GetCreatedByOk returns a tuple with the CreatedBy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedBy

`func (o *AssetGroupBinding) SetCreatedBy(v BusinessAccessUserSummary)`

SetCreatedBy sets CreatedBy field to given value.

### HasCreatedBy

`func (o *AssetGroupBinding) HasCreatedBy() bool`

HasCreatedBy returns a boolean if a field has been set.

### SetCreatedByNil

`func (o *AssetGroupBinding) SetCreatedByNil(b bool)`

 SetCreatedByNil sets the value for CreatedBy to be an explicit nil

### UnsetCreatedBy
`func (o *AssetGroupBinding) UnsetCreatedBy()`

UnsetCreatedBy ensures that no value is present for CreatedBy, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


