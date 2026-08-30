# CampaignAdPreviewCreate200ResponseInnerData

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
**Exceptions** | [**PinterestLibError**](PinterestLibError.md) |  | 

## Methods

### NewCampaignAdPreviewCreate200ResponseInnerData

`func NewCampaignAdPreviewCreate200ResponseInnerData(adAccountId string, adGroupId string, expiresAt int32, isActive bool, url string, userId int32, uuid string, exceptions PinterestLibError, ) *CampaignAdPreviewCreate200ResponseInnerData`

NewCampaignAdPreviewCreate200ResponseInnerData instantiates a new CampaignAdPreviewCreate200ResponseInnerData object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCampaignAdPreviewCreate200ResponseInnerDataWithDefaults

`func NewCampaignAdPreviewCreate200ResponseInnerDataWithDefaults() *CampaignAdPreviewCreate200ResponseInnerData`

NewCampaignAdPreviewCreate200ResponseInnerDataWithDefaults instantiates a new CampaignAdPreviewCreate200ResponseInnerData object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdAccountId

`func (o *CampaignAdPreviewCreate200ResponseInnerData) GetAdAccountId() string`

GetAdAccountId returns the AdAccountId field if non-nil, zero value otherwise.

### GetAdAccountIdOk

`func (o *CampaignAdPreviewCreate200ResponseInnerData) GetAdAccountIdOk() (*string, bool)`

GetAdAccountIdOk returns a tuple with the AdAccountId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdAccountId

`func (o *CampaignAdPreviewCreate200ResponseInnerData) SetAdAccountId(v string)`

SetAdAccountId sets AdAccountId field to given value.


### GetAdGroupId

`func (o *CampaignAdPreviewCreate200ResponseInnerData) GetAdGroupId() string`

GetAdGroupId returns the AdGroupId field if non-nil, zero value otherwise.

### GetAdGroupIdOk

`func (o *CampaignAdPreviewCreate200ResponseInnerData) GetAdGroupIdOk() (*string, bool)`

GetAdGroupIdOk returns a tuple with the AdGroupId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdGroupId

`func (o *CampaignAdPreviewCreate200ResponseInnerData) SetAdGroupId(v string)`

SetAdGroupId sets AdGroupId field to given value.


### GetClientId

`func (o *CampaignAdPreviewCreate200ResponseInnerData) GetClientId() int32`

GetClientId returns the ClientId field if non-nil, zero value otherwise.

### GetClientIdOk

`func (o *CampaignAdPreviewCreate200ResponseInnerData) GetClientIdOk() (*int32, bool)`

GetClientIdOk returns a tuple with the ClientId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClientId

`func (o *CampaignAdPreviewCreate200ResponseInnerData) SetClientId(v int32)`

SetClientId sets ClientId field to given value.

### HasClientId

`func (o *CampaignAdPreviewCreate200ResponseInnerData) HasClientId() bool`

HasClientId returns a boolean if a field has been set.

### GetExpiresAt

`func (o *CampaignAdPreviewCreate200ResponseInnerData) GetExpiresAt() int32`

GetExpiresAt returns the ExpiresAt field if non-nil, zero value otherwise.

### GetExpiresAtOk

`func (o *CampaignAdPreviewCreate200ResponseInnerData) GetExpiresAtOk() (*int32, bool)`

GetExpiresAtOk returns a tuple with the ExpiresAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExpiresAt

`func (o *CampaignAdPreviewCreate200ResponseInnerData) SetExpiresAt(v int32)`

SetExpiresAt sets ExpiresAt field to given value.


### GetIsActive

`func (o *CampaignAdPreviewCreate200ResponseInnerData) GetIsActive() bool`

GetIsActive returns the IsActive field if non-nil, zero value otherwise.

### GetIsActiveOk

`func (o *CampaignAdPreviewCreate200ResponseInnerData) GetIsActiveOk() (*bool, bool)`

GetIsActiveOk returns a tuple with the IsActive field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsActive

`func (o *CampaignAdPreviewCreate200ResponseInnerData) SetIsActive(v bool)`

SetIsActive sets IsActive field to given value.


### GetPinId

`func (o *CampaignAdPreviewCreate200ResponseInnerData) GetPinId() int32`

GetPinId returns the PinId field if non-nil, zero value otherwise.

### GetPinIdOk

`func (o *CampaignAdPreviewCreate200ResponseInnerData) GetPinIdOk() (*int32, bool)`

GetPinIdOk returns a tuple with the PinId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPinId

`func (o *CampaignAdPreviewCreate200ResponseInnerData) SetPinId(v int32)`

SetPinId sets PinId field to given value.

### HasPinId

`func (o *CampaignAdPreviewCreate200ResponseInnerData) HasPinId() bool`

HasPinId returns a boolean if a field has been set.

### GetPinPromotionId

`func (o *CampaignAdPreviewCreate200ResponseInnerData) GetPinPromotionId() int32`

GetPinPromotionId returns the PinPromotionId field if non-nil, zero value otherwise.

### GetPinPromotionIdOk

`func (o *CampaignAdPreviewCreate200ResponseInnerData) GetPinPromotionIdOk() (*int32, bool)`

GetPinPromotionIdOk returns a tuple with the PinPromotionId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPinPromotionId

`func (o *CampaignAdPreviewCreate200ResponseInnerData) SetPinPromotionId(v int32)`

SetPinPromotionId sets PinPromotionId field to given value.

### HasPinPromotionId

`func (o *CampaignAdPreviewCreate200ResponseInnerData) HasPinPromotionId() bool`

HasPinPromotionId returns a boolean if a field has been set.

### GetPromotedProductGroupId

`func (o *CampaignAdPreviewCreate200ResponseInnerData) GetPromotedProductGroupId() int32`

GetPromotedProductGroupId returns the PromotedProductGroupId field if non-nil, zero value otherwise.

### GetPromotedProductGroupIdOk

`func (o *CampaignAdPreviewCreate200ResponseInnerData) GetPromotedProductGroupIdOk() (*int32, bool)`

GetPromotedProductGroupIdOk returns a tuple with the PromotedProductGroupId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPromotedProductGroupId

`func (o *CampaignAdPreviewCreate200ResponseInnerData) SetPromotedProductGroupId(v int32)`

SetPromotedProductGroupId sets PromotedProductGroupId field to given value.

### HasPromotedProductGroupId

`func (o *CampaignAdPreviewCreate200ResponseInnerData) HasPromotedProductGroupId() bool`

HasPromotedProductGroupId returns a boolean if a field has been set.

### GetUrl

`func (o *CampaignAdPreviewCreate200ResponseInnerData) GetUrl() string`

GetUrl returns the Url field if non-nil, zero value otherwise.

### GetUrlOk

`func (o *CampaignAdPreviewCreate200ResponseInnerData) GetUrlOk() (*string, bool)`

GetUrlOk returns a tuple with the Url field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrl

`func (o *CampaignAdPreviewCreate200ResponseInnerData) SetUrl(v string)`

SetUrl sets Url field to given value.


### GetUserId

`func (o *CampaignAdPreviewCreate200ResponseInnerData) GetUserId() int32`

GetUserId returns the UserId field if non-nil, zero value otherwise.

### GetUserIdOk

`func (o *CampaignAdPreviewCreate200ResponseInnerData) GetUserIdOk() (*int32, bool)`

GetUserIdOk returns a tuple with the UserId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserId

`func (o *CampaignAdPreviewCreate200ResponseInnerData) SetUserId(v int32)`

SetUserId sets UserId field to given value.


### GetUuid

`func (o *CampaignAdPreviewCreate200ResponseInnerData) GetUuid() string`

GetUuid returns the Uuid field if non-nil, zero value otherwise.

### GetUuidOk

`func (o *CampaignAdPreviewCreate200ResponseInnerData) GetUuidOk() (*string, bool)`

GetUuidOk returns a tuple with the Uuid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUuid

`func (o *CampaignAdPreviewCreate200ResponseInnerData) SetUuid(v string)`

SetUuid sets Uuid field to given value.


### GetExceptions

`func (o *CampaignAdPreviewCreate200ResponseInnerData) GetExceptions() PinterestLibError`

GetExceptions returns the Exceptions field if non-nil, zero value otherwise.

### GetExceptionsOk

`func (o *CampaignAdPreviewCreate200ResponseInnerData) GetExceptionsOk() (*PinterestLibError, bool)`

GetExceptionsOk returns a tuple with the Exceptions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExceptions

`func (o *CampaignAdPreviewCreate200ResponseInnerData) SetExceptions(v PinterestLibError)`

SetExceptions sets Exceptions field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


