# CampaignAdPreview

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | **string** | Advertiser ID for this preview. | [readonly] 
**AdGroupId** | **string** | Ad group ID to create a preview record for. | 
**ClientId** | Pointer to **int32** | Client ID that created preview. | [optional] [readonly] 
**ExpiresAt** | **int32** | Unix timestamp in milliseconds for preview expiration. | [readonly] 
**IsActive** | **bool** | Whether preview link is active. | [readonly] 
**PinId** | Pointer to **int32** | Pin ID for pin promotion preview. | [optional] [readonly] 
**PinPromotionId** | Pointer to **int32** | Pin promotion ID for this preview. | [optional] [readonly] 
**PromotedProductGroupId** | Pointer to **int32** | Promoted product group ID for catalog previews. | [optional] [readonly] 
**Url** | **string** | Campaign ad preview URL. | [readonly] 
**UserId** | **int32** | User ID that created preview. | [readonly] 
**Uuid** | **string** | Pin promotion preview key. | [readonly] 

## Methods

### NewCampaignAdPreview

`func NewCampaignAdPreview(adAccountId string, adGroupId string, expiresAt int32, isActive bool, url string, userId int32, uuid string, ) *CampaignAdPreview`

NewCampaignAdPreview instantiates a new CampaignAdPreview object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCampaignAdPreviewWithDefaults

`func NewCampaignAdPreviewWithDefaults() *CampaignAdPreview`

NewCampaignAdPreviewWithDefaults instantiates a new CampaignAdPreview object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdAccountId

`func (o *CampaignAdPreview) GetAdAccountId() string`

GetAdAccountId returns the AdAccountId field if non-nil, zero value otherwise.

### GetAdAccountIdOk

`func (o *CampaignAdPreview) GetAdAccountIdOk() (*string, bool)`

GetAdAccountIdOk returns a tuple with the AdAccountId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdAccountId

`func (o *CampaignAdPreview) SetAdAccountId(v string)`

SetAdAccountId sets AdAccountId field to given value.


### GetAdGroupId

`func (o *CampaignAdPreview) GetAdGroupId() string`

GetAdGroupId returns the AdGroupId field if non-nil, zero value otherwise.

### GetAdGroupIdOk

`func (o *CampaignAdPreview) GetAdGroupIdOk() (*string, bool)`

GetAdGroupIdOk returns a tuple with the AdGroupId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdGroupId

`func (o *CampaignAdPreview) SetAdGroupId(v string)`

SetAdGroupId sets AdGroupId field to given value.


### GetClientId

`func (o *CampaignAdPreview) GetClientId() int32`

GetClientId returns the ClientId field if non-nil, zero value otherwise.

### GetClientIdOk

`func (o *CampaignAdPreview) GetClientIdOk() (*int32, bool)`

GetClientIdOk returns a tuple with the ClientId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClientId

`func (o *CampaignAdPreview) SetClientId(v int32)`

SetClientId sets ClientId field to given value.

### HasClientId

`func (o *CampaignAdPreview) HasClientId() bool`

HasClientId returns a boolean if a field has been set.

### GetExpiresAt

`func (o *CampaignAdPreview) GetExpiresAt() int32`

GetExpiresAt returns the ExpiresAt field if non-nil, zero value otherwise.

### GetExpiresAtOk

`func (o *CampaignAdPreview) GetExpiresAtOk() (*int32, bool)`

GetExpiresAtOk returns a tuple with the ExpiresAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExpiresAt

`func (o *CampaignAdPreview) SetExpiresAt(v int32)`

SetExpiresAt sets ExpiresAt field to given value.


### GetIsActive

`func (o *CampaignAdPreview) GetIsActive() bool`

GetIsActive returns the IsActive field if non-nil, zero value otherwise.

### GetIsActiveOk

`func (o *CampaignAdPreview) GetIsActiveOk() (*bool, bool)`

GetIsActiveOk returns a tuple with the IsActive field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsActive

`func (o *CampaignAdPreview) SetIsActive(v bool)`

SetIsActive sets IsActive field to given value.


### GetPinId

`func (o *CampaignAdPreview) GetPinId() int32`

GetPinId returns the PinId field if non-nil, zero value otherwise.

### GetPinIdOk

`func (o *CampaignAdPreview) GetPinIdOk() (*int32, bool)`

GetPinIdOk returns a tuple with the PinId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPinId

`func (o *CampaignAdPreview) SetPinId(v int32)`

SetPinId sets PinId field to given value.

### HasPinId

`func (o *CampaignAdPreview) HasPinId() bool`

HasPinId returns a boolean if a field has been set.

### GetPinPromotionId

`func (o *CampaignAdPreview) GetPinPromotionId() int32`

GetPinPromotionId returns the PinPromotionId field if non-nil, zero value otherwise.

### GetPinPromotionIdOk

`func (o *CampaignAdPreview) GetPinPromotionIdOk() (*int32, bool)`

GetPinPromotionIdOk returns a tuple with the PinPromotionId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPinPromotionId

`func (o *CampaignAdPreview) SetPinPromotionId(v int32)`

SetPinPromotionId sets PinPromotionId field to given value.

### HasPinPromotionId

`func (o *CampaignAdPreview) HasPinPromotionId() bool`

HasPinPromotionId returns a boolean if a field has been set.

### GetPromotedProductGroupId

`func (o *CampaignAdPreview) GetPromotedProductGroupId() int32`

GetPromotedProductGroupId returns the PromotedProductGroupId field if non-nil, zero value otherwise.

### GetPromotedProductGroupIdOk

`func (o *CampaignAdPreview) GetPromotedProductGroupIdOk() (*int32, bool)`

GetPromotedProductGroupIdOk returns a tuple with the PromotedProductGroupId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPromotedProductGroupId

`func (o *CampaignAdPreview) SetPromotedProductGroupId(v int32)`

SetPromotedProductGroupId sets PromotedProductGroupId field to given value.

### HasPromotedProductGroupId

`func (o *CampaignAdPreview) HasPromotedProductGroupId() bool`

HasPromotedProductGroupId returns a boolean if a field has been set.

### GetUrl

`func (o *CampaignAdPreview) GetUrl() string`

GetUrl returns the Url field if non-nil, zero value otherwise.

### GetUrlOk

`func (o *CampaignAdPreview) GetUrlOk() (*string, bool)`

GetUrlOk returns a tuple with the Url field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrl

`func (o *CampaignAdPreview) SetUrl(v string)`

SetUrl sets Url field to given value.


### GetUserId

`func (o *CampaignAdPreview) GetUserId() int32`

GetUserId returns the UserId field if non-nil, zero value otherwise.

### GetUserIdOk

`func (o *CampaignAdPreview) GetUserIdOk() (*int32, bool)`

GetUserIdOk returns a tuple with the UserId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserId

`func (o *CampaignAdPreview) SetUserId(v int32)`

SetUserId sets UserId field to given value.


### GetUuid

`func (o *CampaignAdPreview) GetUuid() string`

GetUuid returns the Uuid field if non-nil, zero value otherwise.

### GetUuidOk

`func (o *CampaignAdPreview) GetUuidOk() (*string, bool)`

GetUuidOk returns a tuple with the Uuid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUuid

`func (o *CampaignAdPreview) SetUuid(v string)`

SetUuid sets Uuid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


