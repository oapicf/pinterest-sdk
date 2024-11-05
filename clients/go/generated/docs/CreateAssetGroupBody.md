# CreateAssetGroupBody

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssetGroupName** | **string** | Asset Group name | 
**AssetGroupDescription** | **string** | Asset group description | 
**AssetGroupTypes** | [**[]AssetGroupType**](AssetGroupType.md) | Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group. | 

## Methods

### NewCreateAssetGroupBody

`func NewCreateAssetGroupBody(assetGroupName string, assetGroupDescription string, assetGroupTypes []AssetGroupType, ) *CreateAssetGroupBody`

NewCreateAssetGroupBody instantiates a new CreateAssetGroupBody object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateAssetGroupBodyWithDefaults

`func NewCreateAssetGroupBodyWithDefaults() *CreateAssetGroupBody`

NewCreateAssetGroupBodyWithDefaults instantiates a new CreateAssetGroupBody object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAssetGroupName

`func (o *CreateAssetGroupBody) GetAssetGroupName() string`

GetAssetGroupName returns the AssetGroupName field if non-nil, zero value otherwise.

### GetAssetGroupNameOk

`func (o *CreateAssetGroupBody) GetAssetGroupNameOk() (*string, bool)`

GetAssetGroupNameOk returns a tuple with the AssetGroupName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssetGroupName

`func (o *CreateAssetGroupBody) SetAssetGroupName(v string)`

SetAssetGroupName sets AssetGroupName field to given value.


### GetAssetGroupDescription

`func (o *CreateAssetGroupBody) GetAssetGroupDescription() string`

GetAssetGroupDescription returns the AssetGroupDescription field if non-nil, zero value otherwise.

### GetAssetGroupDescriptionOk

`func (o *CreateAssetGroupBody) GetAssetGroupDescriptionOk() (*string, bool)`

GetAssetGroupDescriptionOk returns a tuple with the AssetGroupDescription field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssetGroupDescription

`func (o *CreateAssetGroupBody) SetAssetGroupDescription(v string)`

SetAssetGroupDescription sets AssetGroupDescription field to given value.


### GetAssetGroupTypes

`func (o *CreateAssetGroupBody) GetAssetGroupTypes() []AssetGroupType`

GetAssetGroupTypes returns the AssetGroupTypes field if non-nil, zero value otherwise.

### GetAssetGroupTypesOk

`func (o *CreateAssetGroupBody) GetAssetGroupTypesOk() (*[]AssetGroupType, bool)`

GetAssetGroupTypesOk returns a tuple with the AssetGroupTypes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssetGroupTypes

`func (o *CreateAssetGroupBody) SetAssetGroupTypes(v []AssetGroupType)`

SetAssetGroupTypes sets AssetGroupTypes field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


