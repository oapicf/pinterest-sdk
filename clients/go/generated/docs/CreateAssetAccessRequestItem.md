# CreateAssetAccessRequestItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssetIdToPermissions** | [**map[string][]Permissions**](array.md) | An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. | 
**PartnerId** | **string** | Unique identifier of a business partner to request asset access to. | 

## Methods

### NewCreateAssetAccessRequestItem

`func NewCreateAssetAccessRequestItem(assetIdToPermissions map[string][]Permissions, partnerId string, ) *CreateAssetAccessRequestItem`

NewCreateAssetAccessRequestItem instantiates a new CreateAssetAccessRequestItem object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateAssetAccessRequestItemWithDefaults

`func NewCreateAssetAccessRequestItemWithDefaults() *CreateAssetAccessRequestItem`

NewCreateAssetAccessRequestItemWithDefaults instantiates a new CreateAssetAccessRequestItem object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAssetIdToPermissions

`func (o *CreateAssetAccessRequestItem) GetAssetIdToPermissions() map[string][]Permissions`

GetAssetIdToPermissions returns the AssetIdToPermissions field if non-nil, zero value otherwise.

### GetAssetIdToPermissionsOk

`func (o *CreateAssetAccessRequestItem) GetAssetIdToPermissionsOk() (*map[string][]Permissions, bool)`

GetAssetIdToPermissionsOk returns a tuple with the AssetIdToPermissions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssetIdToPermissions

`func (o *CreateAssetAccessRequestItem) SetAssetIdToPermissions(v map[string][]Permissions)`

SetAssetIdToPermissions sets AssetIdToPermissions field to given value.


### GetPartnerId

`func (o *CreateAssetAccessRequestItem) GetPartnerId() string`

GetPartnerId returns the PartnerId field if non-nil, zero value otherwise.

### GetPartnerIdOk

`func (o *CreateAssetAccessRequestItem) GetPartnerIdOk() (*string, bool)`

GetPartnerIdOk returns a tuple with the PartnerId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPartnerId

`func (o *CreateAssetAccessRequestItem) SetPartnerId(v string)`

SetPartnerId sets PartnerId field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


