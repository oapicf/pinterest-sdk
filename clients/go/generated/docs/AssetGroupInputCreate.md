# AssetGroupInputCreate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssetGroup** | Pointer to [**AssetGroupBinding**](AssetGroupBinding.md) |  | [optional] 
**AssetGroupDescription** | **string** | Asset group description. | 
**AssetGroupName** | **string** | Asset Group name. | 
**AssetGroupTypes** | [**[]AssetGroupType**](AssetGroupType.md) | Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group. | 

## Methods

### NewAssetGroupInputCreate

`func NewAssetGroupInputCreate(assetGroupDescription string, assetGroupName string, assetGroupTypes []AssetGroupType, ) *AssetGroupInputCreate`

NewAssetGroupInputCreate instantiates a new AssetGroupInputCreate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAssetGroupInputCreateWithDefaults

`func NewAssetGroupInputCreateWithDefaults() *AssetGroupInputCreate`

NewAssetGroupInputCreateWithDefaults instantiates a new AssetGroupInputCreate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAssetGroup

`func (o *AssetGroupInputCreate) GetAssetGroup() AssetGroupBinding`

GetAssetGroup returns the AssetGroup field if non-nil, zero value otherwise.

### GetAssetGroupOk

`func (o *AssetGroupInputCreate) GetAssetGroupOk() (*AssetGroupBinding, bool)`

GetAssetGroupOk returns a tuple with the AssetGroup field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssetGroup

`func (o *AssetGroupInputCreate) SetAssetGroup(v AssetGroupBinding)`

SetAssetGroup sets AssetGroup field to given value.

### HasAssetGroup

`func (o *AssetGroupInputCreate) HasAssetGroup() bool`

HasAssetGroup returns a boolean if a field has been set.

### GetAssetGroupDescription

`func (o *AssetGroupInputCreate) GetAssetGroupDescription() string`

GetAssetGroupDescription returns the AssetGroupDescription field if non-nil, zero value otherwise.

### GetAssetGroupDescriptionOk

`func (o *AssetGroupInputCreate) GetAssetGroupDescriptionOk() (*string, bool)`

GetAssetGroupDescriptionOk returns a tuple with the AssetGroupDescription field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssetGroupDescription

`func (o *AssetGroupInputCreate) SetAssetGroupDescription(v string)`

SetAssetGroupDescription sets AssetGroupDescription field to given value.


### GetAssetGroupName

`func (o *AssetGroupInputCreate) GetAssetGroupName() string`

GetAssetGroupName returns the AssetGroupName field if non-nil, zero value otherwise.

### GetAssetGroupNameOk

`func (o *AssetGroupInputCreate) GetAssetGroupNameOk() (*string, bool)`

GetAssetGroupNameOk returns a tuple with the AssetGroupName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssetGroupName

`func (o *AssetGroupInputCreate) SetAssetGroupName(v string)`

SetAssetGroupName sets AssetGroupName field to given value.


### GetAssetGroupTypes

`func (o *AssetGroupInputCreate) GetAssetGroupTypes() []AssetGroupType`

GetAssetGroupTypes returns the AssetGroupTypes field if non-nil, zero value otherwise.

### GetAssetGroupTypesOk

`func (o *AssetGroupInputCreate) GetAssetGroupTypesOk() (*[]AssetGroupType, bool)`

GetAssetGroupTypesOk returns a tuple with the AssetGroupTypes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssetGroupTypes

`func (o *AssetGroupInputCreate) SetAssetGroupTypes(v []AssetGroupType)`

SetAssetGroupTypes sets AssetGroupTypes field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


