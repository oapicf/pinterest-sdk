# AssetGroupBinding

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountsIds** | **[]string** | A list of ad account IDs under the asset group | 
**AssetGroupDescription** | **NullableString** | Asset group description | 
**AssetGroupName** | **NullableString** | Asset Group name | 
**AssetGroupTypes** | **[]string** | Asset group types | 
**CatalogsIds** | **[]string** | A list of catalog IDs under asset group | 
**CreatedBy** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | The data of the user that created the asset group. | 
**CreatedTime** | **NullableInt32** | The creation time of the asset group | 
**Id** | **string** | Asset Group ID. | 
**Owner** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | The data of the business that owns the asset group. | 
**ProfilesIds** | **[]string** | A list of profile IDs under asset group | 
**UpdatedTime** | **NullableInt32** | The last update time of the asset group | 

## Methods

### NewAssetGroupBinding

`func NewAssetGroupBinding(adAccountsIds []string, assetGroupDescription NullableString, assetGroupName NullableString, assetGroupTypes []string, catalogsIds []string, createdBy BusinessAccessUserSummary, createdTime NullableInt32, id string, owner BusinessAccessUserSummary, profilesIds []string, updatedTime NullableInt32, ) *AssetGroupBinding`

NewAssetGroupBinding instantiates a new AssetGroupBinding object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAssetGroupBindingWithDefaults

`func NewAssetGroupBindingWithDefaults() *AssetGroupBinding`

NewAssetGroupBindingWithDefaults instantiates a new AssetGroupBinding object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

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


### SetAssetGroupDescriptionNil

`func (o *AssetGroupBinding) SetAssetGroupDescriptionNil(b bool)`

 SetAssetGroupDescriptionNil sets the value for AssetGroupDescription to be an explicit nil

### UnsetAssetGroupDescription
`func (o *AssetGroupBinding) UnsetAssetGroupDescription()`

UnsetAssetGroupDescription ensures that no value is present for AssetGroupDescription, not even an explicit nil
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


### SetAssetGroupNameNil

`func (o *AssetGroupBinding) SetAssetGroupNameNil(b bool)`

 SetAssetGroupNameNil sets the value for AssetGroupName to be an explicit nil

### UnsetAssetGroupName
`func (o *AssetGroupBinding) UnsetAssetGroupName()`

UnsetAssetGroupName ensures that no value is present for AssetGroupName, not even an explicit nil
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


### GetCatalogsIds

`func (o *AssetGroupBinding) GetCatalogsIds() []string`

GetCatalogsIds returns the CatalogsIds field if non-nil, zero value otherwise.

### GetCatalogsIdsOk

`func (o *AssetGroupBinding) GetCatalogsIdsOk() (*[]string, bool)`

GetCatalogsIdsOk returns a tuple with the CatalogsIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogsIds

`func (o *AssetGroupBinding) SetCatalogsIds(v []string)`

SetCatalogsIds sets CatalogsIds field to given value.


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


### SetCreatedTimeNil

`func (o *AssetGroupBinding) SetCreatedTimeNil(b bool)`

 SetCreatedTimeNil sets the value for CreatedTime to be an explicit nil

### UnsetCreatedTime
`func (o *AssetGroupBinding) UnsetCreatedTime()`

UnsetCreatedTime ensures that no value is present for CreatedTime, not even an explicit nil
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


### SetUpdatedTimeNil

`func (o *AssetGroupBinding) SetUpdatedTimeNil(b bool)`

 SetUpdatedTimeNil sets the value for UpdatedTime to be an explicit nil

### UnsetUpdatedTime
`func (o *AssetGroupBinding) UnsetUpdatedTime()`

UnsetUpdatedTime ensures that no value is present for UpdatedTime, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


